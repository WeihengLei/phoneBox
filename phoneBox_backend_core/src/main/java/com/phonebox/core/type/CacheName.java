package com.phonebox.core.type;

public enum CacheName {

    forever(-1),
    cache10sec(10),
    cache1m(60),
    cache3m(180),
    cache5m(300),
    cache10m(600),
    cache15m(900),
    cache30m(1800),

    cache1h(3600),
    cache2h(7200),
    cache6h(21600),
    cache12h(43200),

    cache1d(86400),
    cache2d(172800),
    cache3d(259200);

    CacheName(int value) {
    }
}