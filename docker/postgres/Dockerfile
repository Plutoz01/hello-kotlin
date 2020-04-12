FROM postgres
WORKDIR /docker-entrypoint-initdb.d
ADD init-schema.sql /docker-entrypoint-initdb.d
EXPOSE 5432