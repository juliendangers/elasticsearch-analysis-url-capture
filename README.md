elasticsearch-analysis-url-capture
==================================

an elasticsearch token filter which only keeps url

this plugin is now useless with ES 1.4.x
----------------------------------------

**simply create a custom analyzer, with an uax_url_email tokenizer, and a keep_types tokenFilter which only keeps "*< URL >*" type. This way you will have URLs and IPs :)**

For master elasticsearch versions, look at master branch.

For 1.2.x elasticsearch versions, look at es-1.2 branch.

Versions
--------

|Elasticsearch|Plugin|
|-------------|------|
|master|2.0.0-SNAPSHOT|
|1.4|1.4.0|
|1.3|1.3.0|
|1.2|1.2.1|

Installation
------------

In order to install the plugin, simply run: 

`bin/plugin --install analysis-url-capture --url "https://github.com/juliendangers/elasticsearch-analysis-url-capture/raw/master/dist/elasticsearch-analysis-url-capture-2.0.0-SNAPSHOT.zip"`

