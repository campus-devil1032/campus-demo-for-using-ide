package org.example.exam1;

interface IDBConnect {
    public void connect();

    public void open();

    public void select();
}

class MysqlConn implements IDBConnect {

    @Override
    public void connect() {
    }

    @Override
    public void open() {
    }

    @Override
    public void select() {
    }
}

class OracleConn implements IDBConnect {

    @Override
    public void connect() {
    }

    @Override
    public void open() {
    }

    @Override
    public void select() {
    }
}