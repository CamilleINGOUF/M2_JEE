var divtab = $('#tableau')
$.ajax({
    type: 'GET',
    dataType: "json",
    url: "http://localhost:8080/NetflixCatalog/Netflix",
    success: function(result) 
    {
        for(var i in result.series)
        {
            var obj = result.series[i];
            divtab.append(obj.name+" | "+obj.seasons+" | "+obj.totalEpisodes+"<br/>");
        }
    }
});