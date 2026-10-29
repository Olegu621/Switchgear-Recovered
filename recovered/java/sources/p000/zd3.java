            package p000;

            import android.content.Context;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteDatabaseLockedException;
            import android.database.sqlite.SQLiteException;
            import android.os.SystemClock;
            import com.google.android.gms.internal.measurement.zzby;
            import com.google.android.gms.internal.measurement.zzpk;
            import com.google.android.gms.internal.measurement.zzql;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class zd3 extends zzby {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f20107a = 0;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ sq3 f20108b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zd3(ae3 ae3Var, Context context) {
/* 10 */            super(context, "google_app_measurement.db", null, 1);
/* 4 */             this.f20108b = ae3Var;
                }

                /* JADX INFO: renamed from: c */
                private final void m10341c(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                }

                /* JADX INFO: renamed from: f */
                private final void m10342f(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                }

                /* JADX INFO: renamed from: g */
                private final void m10343g(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                }

                /* JADX INFO: renamed from: h */
                private final void m10344h(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final SQLiteDatabase getWritableDatabase() {
/* 1 */             int i = this.f20107a;
/* 3 */             sq3 sq3Var = this.f20108b;
                    switch (i) {
                        case 0:
/* 83 */                    ae3 ae3Var = (ae3) sq3Var;
/* 87 */                    ij3 ij3Var = (ij3) ae3Var.f16749a;
/* 91 */                    ij3 ij3Var2 = (ij3) ae3Var.f16749a;
/* 93 */                    ij3Var.getClass();
/* 96 */                    C0193bu c0193bu = ae3Var.f216e;
/* 104 */                   if (c0193bu.f2605b != 0) {
/* 113 */                       ((xt0) ((InterfaceC2475xv) c0193bu.f2606c)).getClass();
/* 128 */                       if (SystemClock.elapsedRealtime() - c0193bu.f2605b < 3600000) {
/* 216 */                           throw new SQLiteException("Database open failed");
                                }
                            }
                            try {
/* 130 */                       return super.getWritableDatabase();
                            } catch (SQLiteException unused) {
/* 141 */                       ((xt0) ((InterfaceC2475xv) c0193bu.f2606c)).getClass();
/* 148 */                       c0193bu.f2605b = SystemClock.elapsedRealtime();
/* 150 */                       uh3 uh3Var = ij3Var2.f9655f;
/* 152 */                       ij3.m4555l(uh3Var);
/* 159 */                       uh3Var.f17538f.m8510a("Opening the database failed, dropping and recreating it");
/* 174 */                       if (!ij3Var2.f9645a.getDatabasePath("google_app_measurement.db").delete()) {
/* 176 */                           uh3 uh3Var2 = ij3Var2.f9655f;
/* 178 */                           ij3.m4555l(uh3Var2);
/* 185 */                           uh3Var2.f17538f.m8511b("google_app_measurement.db", "Failed to delete corrupted db file");
                                }
                                try {
/* 188 */                           SQLiteDatabase writableDatabase = super.getWritableDatabase();
/* 192 */                           c0193bu.f2605b = 0L;
/* 194 */                           return writableDatabase;
                                } catch (SQLiteException e) {
/* 196 */                           uh3 uh3Var3 = ij3Var2.f9655f;
/* 198 */                           ij3.m4555l(uh3Var3);
/* 205 */                           uh3Var3.f17538f.m8511b(e, "Failed to open freshly created database");
/* 208 */                           throw e;
                                }
                            }
                        default:
/* 8 */                     lh3 lh3Var = (lh3) sq3Var;
                            try {
/* 10 */                        return super.getWritableDatabase();
                            } catch (SQLiteDatabaseLockedException e2) {
/* 82 */                        throw e2;
                            } catch (SQLiteException unused2) {
/* 17 */                        ij3 ij3Var3 = (ij3) lh3Var.f16749a;
/* 19 */                        uh3 uh3Var4 = ij3Var3.f9655f;
/* 21 */                        ij3.m4555l(uh3Var4);
/* 28 */                        uh3Var4.f17538f.m8510a("Opening the local database failed, dropping and recreating it");
/* 43 */                        if (!ij3Var3.f9645a.getDatabasePath("google_app_measurement_local.db").delete()) {
/* 45 */                            uh3 uh3Var5 = ij3Var3.f9655f;
/* 47 */                            ij3.m4555l(uh3Var5);
/* 54 */                            uh3Var5.f17538f.m8511b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                                }
                                try {
/* 57 */                            return super.getWritableDatabase();
                                } catch (SQLiteException e3) {
/* 67 */                            uh3 uh3Var6 = ((ij3) lh3Var.f16749a).f9655f;
/* 69 */                            ij3.m4555l(uh3Var6);
/* 76 */                            uh3Var6.f17538f.m8511b(e3, "Failed to open local database. Events will bypass local storage");
/* 79 */                            return null;
                                }
                            }
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onCreate(SQLiteDatabase sQLiteDatabase) {
/* 1 */             int i = this.f20107a;
/* 3 */             sq3 sq3Var = this.f20108b;
                    switch (i) {
                        case 0:
/* 29 */                    uh3 uh3Var = ((ij3) ((ae3) sq3Var).f16749a).f9655f;
/* 31 */                    ij3.m4555l(uh3Var);
/* 34 */                    b40.m1216G(uh3Var, sQLiteDatabase);
                            break;
                        default:
/* 14 */                    uh3 uh3Var2 = ((ij3) ((lh3) sq3Var).f16749a).f9655f;
/* 16 */                    ij3.m4555l(uh3Var2);
/* 19 */                    b40.m1216G(uh3Var2, sQLiteDatabase);
                            break;
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
/* 1 */             int i3 = this.f20107a;
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
/* 1 */             int i = this.f20107a;
/* 3 */             sq3 sq3Var = this.f20108b;
                    switch (i) {
                        case 0:
/* 37 */                    ij3 ij3Var = (ij3) ((ae3) sq3Var).f16749a;
/* 39 */                    uh3 uh3Var = ij3Var.f9655f;
/* 41 */                    ij3.m4555l(uh3Var);
/* 52 */                    b40.m1215F(uh3Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", ae3.f211f);
/* 55 */                    uh3 uh3Var2 = ij3Var.f9655f;
/* 57 */                    ij3.m4555l(uh3Var2);
/* 67 */                    b40.m1215F(uh3Var2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
/* 70 */                    ij3.m4555l(uh3Var2);
/* 79 */                    b40.m1215F(uh3Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
/* 82 */                    ij3.m4555l(uh3Var2);
/* 93 */                    b40.m1215F(uh3Var2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", ae3.f213v);
/* 96 */                    ij3.m4555l(uh3Var2);
/* 107 */                   b40.m1215F(uh3Var2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", ae3.f214w);
/* 110 */                   ij3.m4555l(uh3Var2);
/* 121 */                   b40.m1215F(uh3Var2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", ae3.f205V);
/* 124 */                   ij3.m4555l(uh3Var2);
/* 134 */                   b40.m1215F(uh3Var2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
/* 137 */                   ij3.m4555l(uh3Var2);
/* 148 */                   b40.m1215F(uh3Var2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", ae3.f204U);
/* 151 */                   ij3.m4555l(uh3Var2);
/* 162 */                   b40.m1215F(uh3Var2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", ae3.f206W);
/* 165 */                   ij3.m4555l(uh3Var2);
/* 176 */                   b40.m1215F(uh3Var2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", ae3.f207X);
/* 179 */                   ij3.m4555l(uh3Var2);
/* 189 */                   b40.m1215F(uh3Var2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
/* 192 */                   ij3.m4555l(uh3Var2);
/* 203 */                   b40.m1215F(uh3Var2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", ae3.f208Y);
/* 206 */                   ij3.m4555l(uh3Var2);
/* 216 */                   b40.m1215F(uh3Var2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
/* 219 */                   ij3.m4555l(uh3Var2);
/* 228 */                   b40.m1215F(uh3Var2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
/* 231 */                   ij3.m4555l(uh3Var2);
/* 242 */                   b40.m1215F(uh3Var2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", ae3.f209Z);
/* 245 */                   zzql.zza();
/* 248 */                   ij3.m4555l(uh3Var2);
/* 259 */                   b40.m1215F(uh3Var2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", ae3.f210a0);
/* 262 */                   ij3.m4555l(uh3Var2);
/* 273 */                   b40.m1215F(uh3Var2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", ae3.f212i);
/* 276 */                   zzpk.zza();
/* 279 */                   ij3.m4555l(uh3Var2);
/* 289 */                   b40.m1215F(uh3Var2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                            break;
                        default:
/* 14 */                    uh3 uh3Var3 = ((ij3) ((lh3) sq3Var).f16749a).f9655f;
/* 16 */                    ij3.m4555l(uh3Var3);
/* 28 */                    b40.m1215F(uh3Var3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", lh3.f13294e);
                            break;
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
/* 1 */             int i3 = this.f20107a;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public zd3(lh3 lh3Var, Context context) {
/* 15 */            super(context, "google_app_measurement_local.db", null, 1);
/* 14 */            this.f20108b = lh3Var;
                }
            }
