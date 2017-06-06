$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/greeting"
    }).then(function(data) {

        $('#greeting-urlUnencoded').attr("href", data.url);
        $('#greeting-urlEncoded').attr("href", data.urlEncoded);
        $('#greeting-urlEncodedDecoded').attr("href", decodeURIComponent(data.urlEncoded));

    });
});