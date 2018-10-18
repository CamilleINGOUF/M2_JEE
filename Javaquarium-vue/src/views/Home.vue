<template>
  <div class="home">
    <Fishes/>
  </div>
</template>

<script>
// @ is an alias to /src
import Fishes from '@/components/Fishes/Fishes'

export default {
  name: 'home',
  components: {
    Fishes
  }
}
</script>
