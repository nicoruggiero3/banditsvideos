function vLightbox(YoutubeID){
    document.getElementById(YoutubeID).innerHTML = '<iframe width="420" height="315" src="https://www.youtube.com/embed/' + YoutubeID + '?rel=0&autoplay=1" frameborder="0" allowfullscreen style="float:right; margin-left:20px;"></iframe>';
}
