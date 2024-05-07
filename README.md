## Name DB in postgres
   ```
ejercicioDB
   ``` 

## Create table in DB

   ```
CREATE TABLE Producto (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(20),
    tipo VARCHAR(10),
    cantidad NUMERIC,
    precio DECIMAL(4,2)
);
   ```
