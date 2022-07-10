#!/usr/bin/bash

cd ../src/main/resources || exit

rm -rf ./database-secrets.yml

touch ./database-secrets.yml

yq e -n '.mongodb-connection.host = null | .mongodb-connection.port = null | .mongodb-connection.database = null' > ./database-secrets.yml
