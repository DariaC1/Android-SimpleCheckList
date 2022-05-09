package com.example.orwima_cacic_zavrsniprj;

import android.provider.BaseColumns;

public class ListItem {
    private ListItem() {
    }

    public static final class ListItem implements BaseColumns {
        public static final String TABLE_NAME = "checkList";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_TIMESTAMP = "timestamp";
    }
}