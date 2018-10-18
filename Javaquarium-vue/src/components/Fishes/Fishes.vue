<template>
  <v-app id="inspire">
    <v-toolbar color="indigo" dark fixed app>
      <v-toolbar-title>Javaquarium</v-toolbar-title>
    </v-toolbar>
    <v-content>
      <v-container fluid fill-height>
        <v-layout
          justify-center
          align-center
        >
          <template>
            <div>
              <v-toolbar flat color="white">
                <v-spacer></v-spacer>
                <v-dialog v-model="dialog" max-width="500px">
                  <v-btn slot="activator" color="primary" dark class="mb-2">Nouveau poisson</v-btn>
                  <v-card>
                    <v-card-title>
                      <span class="headline">{{ formTitle }}</span>
                    </v-card-title>

                    <v-card-text>
                      <v-container grid-list-md>
                        <v-layout wrap>
                          <v-flex xs12 sm6 md4>
                            <v-text-field v-model="editedItem.name" label="Nom"></v-text-field>
                          </v-flex>
                          <v-flex xs12 sm6 md4>
                            <v-text-field v-model="editedItem.desc" label="Description"></v-text-field>
                          </v-flex>
                          <v-flex xs12 sm6 md4>
                            <v-text-field v-model="editedItem.colour" label="Couleur"></v-text-field>
                          </v-flex>
                          <v-flex xs12 sm6 md4>
                            <v-text-field v-model="editedItem.dimension" label="Dimension"></v-text-field>
                          </v-flex>
                          <v-flex xs12 sm6 md4>
                            <v-text-field v-model="editedItem.price" label="Prix"></v-text-field>
                          </v-flex>
                        </v-layout>
                      </v-container>
                    </v-card-text>

                    <v-card-actions>
                      <v-spacer></v-spacer>
                      <v-btn color="blue darken-1" flat @click.native="close">Cancel</v-btn>
                      <v-btn color="blue darken-1" flat @click.native="save">Save</v-btn>
                    </v-card-actions>
                  </v-card>
                </v-dialog>
              </v-toolbar>
              <v-data-table
                :headers="headers"
                :items="fishes"
                hide-actions
                class="elevation-1"
              >
                <template slot="items" slot-scope="props">
                  <td>{{ props.item.name }}</td>
                  <td class="text-xs-right">{{ props.item.desc }}</td>
                  <td class="text-xs-right">{{ props.item.colour }}</td>
                  <td class="text-xs-right">{{ props.item.dimension }}</td>
                  <td class="text-xs-right">{{ props.item.price }}</td>
                  <td class="justify-center layout px-0">
                    <v-icon
                      small
                      class="mr-2"
                      @click="editItem(props.item)"
                    >
                      edit
                    </v-icon>
                    <v-icon
                      small
                      @click="deleteItem(props.item)"
                    >
                      delete
                    </v-icon>
                  </td>
                </template>
                <template slot="no-data">
                  <v-btn color="primary" @click="initialize">Reset</v-btn>
                </template>
              </v-data-table>
            </div>
          </template>
        </v-layout>
      </v-container>
    </v-content>
  </v-app>
</template>

<script>
  export default {
    data: () => ({
      dialog: false,
      headers: [
        { text: 'Nom', value: 'name' },
        { text: 'Description', value: 'desc' },
        { text: 'Couleur', value: 'colour' },
        { text: 'Dimension', value: 'dimension' },
        { text: 'Prix', value: 'price'}
      ],
      fishes: [],
      editedIndex: -1,
      editedItem: {
        name: '',
        desc: '',
        colour: '',
        dimension: '',
        price: 0
      },
      defaultItem: {
        name: '',
        desc: '',
        colour: '',
        dimension: '',
        price: 0
      }
    }),

    computed: {
      formTitle () {
        return this.editedIndex === -1 ? 'Nouveau poisson' : 'Edition poisson'
      }
    },

    watch: {
      dialog (val) {
        val || this.close()
      }
    },

    created () {
      this.initialize()
    },
    

    methods: {
      initialize () {
        this.axios.get('http://localhost:8090/fishes').then( res => {
          this.fishes = res.data.fishes
        })
      },

      editItem (item) {
        this.editedIndex = this.fishes.indexOf(item)
        this.editedItem = Object.assign({}, item)
        this.dialog = true
      },

      deleteItem (item) {
        const index = this.fishes.indexOf(item)
        confirm('Are you sure you want to delete this item?') && 
        this.fishes.splice(index, 1) &&
        this.axios.delete('http://localhost:8090/fishes/delete/'+item.id).then( res => {
          console.log(res)
        })
      },

      close () {
        this.dialog = false
        setTimeout(() => {
          this.editedItem = Object.assign({}, this.defaultItem)
          this.editedIndex = -1
        }, 300)
      },

      save () {
        if (this.editedIndex > -1) {
          Object.assign(this.fishes[this.editedIndex], this.editedItem)
        } else {
          this.fishes.push(this.editedItem)
          console.log(this.editedItem)
          this.axios.post('http://localhost:8090/fishes',this.editedItem).then( res => {
            console.log(res)
          })
        }
        this.close()
      }
    }
  }
</script>