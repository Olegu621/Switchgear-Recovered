            package com.google.gson.internal.sql;

            import com.google.gson.TypeAdapterFactory;
            import com.google.gson.internal.bind.DefaultDateTypeAdapter;
            import java.sql.Timestamp;
            import java.util.Date;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class SqlTypesSupport {
                public static final DefaultDateTypeAdapter.DateType<? extends Date> DATE_DATE_TYPE;
                public static final TypeAdapterFactory DATE_FACTORY;
                public static final boolean SUPPORTS_SQL_TYPES;
                public static final DefaultDateTypeAdapter.DateType<? extends Date> TIMESTAMP_DATE_TYPE;
                public static final TypeAdapterFactory TIMESTAMP_FACTORY;
                public static final TypeAdapterFactory TIME_FACTORY;

                static {
                    boolean z;
                    try {
/* 3 */                 Class.forName("java.sql.Date");
/* 6 */                 z = true;
                    } catch (ClassNotFoundException unused) {
/* 8 */                 z = false;
                    }
/* 9 */             SUPPORTS_SQL_TYPES = z;
/* 11 */            if (z) {
/* 20 */                DATE_DATE_TYPE = new DefaultDateTypeAdapter.DateType<java.sql.Date>(java.sql.Date.class) { // from class: com.google.gson.internal.sql.SqlTypesSupport.1
                            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
                            public java.sql.Date deserialize(Date date) {
/* 7 */                         return new java.sql.Date(date.getTime());
                            }
                        };
/* 29 */                TIMESTAMP_DATE_TYPE = new DefaultDateTypeAdapter.DateType<Timestamp>(Timestamp.class) { // from class: com.google.gson.internal.sql.SqlTypesSupport.2
                            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
                            public Timestamp deserialize(Date date) {
/* 7 */                         return new Timestamp(date.getTime());
                            }
                        };
/* 33 */                DATE_FACTORY = SqlDateTypeAdapter.FACTORY;
/* 37 */                TIME_FACTORY = SqlTimeTypeAdapter.FACTORY;
/* 41 */                TIMESTAMP_FACTORY = SqlTimestampTypeAdapter.FACTORY;
/* 55 */                return;
                    }
/* 45 */            DATE_DATE_TYPE = null;
/* 47 */            TIMESTAMP_DATE_TYPE = null;
/* 49 */            DATE_FACTORY = null;
/* 51 */            TIME_FACTORY = null;
/* 53 */            TIMESTAMP_FACTORY = null;
                }

                private SqlTypesSupport() {
                }
            }
