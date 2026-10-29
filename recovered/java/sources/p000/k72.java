            package p000;

            import android.content.Context;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteOpenHelper;
            import java.util.Arrays;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class k72 extends SQLiteOpenHelper {

                /* JADX INFO: renamed from: c */
                public static final String f12632c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

                /* JADX INFO: renamed from: d */
                public static final int f12633d = 5;

                /* JADX INFO: renamed from: e */
                public static final List f12634e = Arrays.asList(new j72(0), new j72(1), new j72(2), new j72(3), new j72(4));

                /* JADX INFO: renamed from: a */
                public final int f12635a;

                /* JADX INFO: renamed from: b */
                public boolean f12636b;

                public k72(Context context, String str, int i) {
/* 2 */             super(context, str, (SQLiteDatabase.CursorFactory) null, i);
/* 6 */             this.f12636b = false;
/* 8 */             this.f12635a = i;
                }

                /* JADX INFO: renamed from: c */
                public static void m5999c(SQLiteDatabase sQLiteDatabase, int i, int i2) {
/* 1 */             List list = f12634e;
/* 7 */             if (i2 > list.size()) {
/* 159 */               throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
                    }
/* 9 */             while (i < i2) {
                        switch (((j72) list.get(i)).f12132a) {
                            case 0:
/* 88 */                        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
/* 93 */                        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
/* 98 */                        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
/* 103 */                       sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
/* 108 */                       sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                                break;
                            case 1:
/* 72 */                        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
/* 77 */                        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
/* 82 */                        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
                                break;
                            case 2:
/* 66 */                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                                break;
                            case 3:
/* 50 */                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
/* 55 */                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
/* 60 */                        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                                break;
                            default:
/* 24 */                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
/* 29 */                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
/* 34 */                        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
/* 39 */                        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
/* 44 */                        sQLiteDatabase.execSQL(f12632c);
                                break;
                        }
/* 111 */               i++;
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
/* 2 */             this.f12636b = true;
/* 13 */            sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
/* 16 */            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onCreate(SQLiteDatabase sQLiteDatabase) {
/* 3 */             if (!this.f12636b) {
/* 5 */                 onConfigure(sQLiteDatabase);
                    }
/* 11 */            m5999c(sQLiteDatabase, 0, this.f12635a);
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
/* 3 */             sQLiteDatabase.execSQL("DROP TABLE events");
/* 8 */             sQLiteDatabase.execSQL("DROP TABLE event_metadata");
/* 13 */            sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
/* 18 */            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
/* 23 */            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
/* 28 */            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
/* 33 */            if (!this.f12636b) {
/* 35 */                onConfigure(sQLiteDatabase);
                    }
/* 39 */            m5999c(sQLiteDatabase, 0, i2);
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onOpen(SQLiteDatabase sQLiteDatabase) {
/* 3 */             if (this.f12636b) {
/* 8 */                 return;
                    }
/* 5 */             onConfigure(sQLiteDatabase);
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
/* 3 */             if (!this.f12636b) {
/* 5 */                 onConfigure(sQLiteDatabase);
                    }
/* 8 */             m5999c(sQLiteDatabase, i, i2);
                }
            }
