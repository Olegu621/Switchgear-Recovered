            package p000;

            import android.content.ContentValues;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteException;
            import android.os.Bundle;
            import android.os.Parcelable;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import com.google.android.gms.internal.measurement.zzhr;
            import com.google.android.gms.internal.measurement.zzhs;
            import com.google.android.gms.internal.measurement.zzhw;
            import com.google.android.gms.internal.measurement.zzhz;
            import com.google.android.gms.internal.measurement.zzib;
            import com.google.android.gms.internal.measurement.zzic;
            import com.google.android.gms.internal.measurement.zzid;
            import com.google.android.gms.internal.measurement.zziu;
            import com.google.android.gms.internal.measurement.zzpn;
            import com.google.android.gms.internal.measurement.zzql;
            import com.google.android.gms.measurement.internal.zzah;
            import com.google.android.gms.measurement.internal.zzbg;
            import com.google.android.gms.measurement.internal.zzog;
            import com.google.android.gms.measurement.internal.zzon;
            import com.google.android.gms.measurement.internal.zzpk;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Objects;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ae3 extends wo3 {

                /* JADX INFO: renamed from: d */
                public final zd3 f215d;

                /* JADX INFO: renamed from: e */
                public final C0193bu f216e;

                /* JADX INFO: renamed from: f */
                public static final String[] f211f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

                /* JADX INFO: renamed from: i */
                public static final String[] f212i = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

                /* JADX INFO: renamed from: v */
                public static final String[] f213v = {FirebaseAnalytics.Param.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

                /* JADX INFO: renamed from: w */
                public static final String[] f214w = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};

                /* JADX INFO: renamed from: U */
                public static final String[] f204U = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

                /* JADX INFO: renamed from: V */
                public static final String[] f205V = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

                /* JADX INFO: renamed from: W */
                public static final String[] f206W = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

                /* JADX INFO: renamed from: X */
                public static final String[] f207X = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

                /* JADX INFO: renamed from: Y */
                public static final String[] f208Y = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

                /* JADX INFO: renamed from: Z */
                public static final String[] f209Z = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

                /* JADX INFO: renamed from: a0 */
                public static final String[] f210a0 = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

                public ae3(mp3 mp3Var) {
/* 1 */             super(mp3Var);
/* 15 */            this.f216e = new C0193bu(((ij3) this.f16749a).f9640V);
/* 21 */            ((ij3) this.f16749a).getClass();
/* 35 */            this.f215d = new zd3(this, ((ij3) this.f16749a).f9645a);
                }

                /* JADX INFO: renamed from: e0 */
                public static final String m212e0(List list) {
                    return list.isEmpty() ? HttpUrl.FRAGMENT_ENCODE_SET : fm0.m3784j(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
                }

                /* JADX INFO: renamed from: m0 */
                public static final void m213m0(ContentValues contentValues, Object obj) {
/* 3 */             kb1.m6058k(FirebaseAnalytics.Param.VALUE);
/* 6 */             kb1.m6061n(obj);
/* 11 */            if (obj instanceof String) {
/* 15 */                contentValues.put(FirebaseAnalytics.Param.VALUE, (String) obj);
/* 18 */                return;
                    }
/* 21 */            if (obj instanceof Long) {
/* 25 */                contentValues.put(FirebaseAnalytics.Param.VALUE, (Long) obj);
                    } else if (obj instanceof Double) {
/* 35 */                contentValues.put(FirebaseAnalytics.Param.VALUE, (Double) obj);
                    } else {
/* 41 */                C1951n4.m6859j("Invalid value type");
                    }
                }

                /* JADX INFO: renamed from: A0 */
                public final void m214A0(String str, String str2) {
/* 1 */             kb1.m6058k(str);
/* 4 */             kb1.m6058k(str2);
/* 7 */             mo1375y();
/* 10 */            m9593A();
                    try {
/* 25 */                m261q0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
                    } catch (SQLiteException e) {
/* 32 */                ij3 ij3Var = (ij3) this.f16749a;
/* 34 */                uh3 uh3Var = ij3Var.f9655f;
/* 36 */                ij3.m4555l(uh3Var);
/* 53 */                uh3Var.f17538f.m8513d("Error deleting conditional property", uh3.m9013H(str), ij3Var.f9639U.m6658c(str2), e);
                    }
                }

                /* JADX INFO: renamed from: B0 */
                public final List m215B0(String str, String str2, String str3) {
/* 1 */             kb1.m6058k(str);
/* 4 */             mo1375y();
/* 7 */             m9593A();
/* 13 */            ArrayList arrayList = new ArrayList(3);
/* 16 */            arrayList.add(str);
/* 23 */            StringBuilder sb = new StringBuilder("app_id=?");
/* 30 */            if (!TextUtils.isEmpty(str2)) {
/* 32 */                arrayList.add(str2);
/* 37 */                sb.append(" and origin=?");
                    }
/* 44 */            if (!TextUtils.isEmpty(str3)) {
/* 56 */                arrayList.add(String.valueOf(str3).concat("*"));
/* 61 */                sb.append(" and name glob ?");
                    }
/* 80 */            return m217C0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
                }

                @Override // p000.wo3
                /* JADX INFO: renamed from: C */
                public final void mo216C() {
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
                /* JADX INFO: renamed from: C0 */
                public final List m217C0(String str, String[] strArr) {
/* 5 */             ij3 ij3Var = (ij3) this.f16749a;
/* 7 */             mo1375y();
/* 10 */            m9593A();
/* 15 */            ?? arrayList = new ArrayList();
/* 20 */            Cursor cursorQuery = null;
                    try {
                        try {
/* 21 */                    SQLiteDatabase sQLiteDatabaseM261q0 = m261q0();
/* 53 */                    String[] strArr2 = {"app_id", FirebaseAnalytics.Param.ORIGIN, "name", FirebaseAnalytics.Param.VALUE, "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
/* 59 */                    ij3Var.getClass();
/* 68 */                    cursorQuery = sQLiteDatabaseM261q0.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
/* 76 */                    if (cursorQuery.moveToFirst()) {
/* 249 */                       do {
/* 84 */                            if (arrayList.size() >= 1000) {
/* 86 */                                uh3 uh3Var = ij3Var.f9655f;
/* 88 */                                ij3.m4555l(uh3Var);
/* 99 */                                uh3Var.f17538f.m8511b(1000, "Read more than the max allowed conditional properties, ignoring extra");
                                        break;
                                    }
/* 111 */                           String string = cursorQuery.getString(0);
/* 116 */                           String string2 = cursorQuery.getString(1);
/* 121 */                           String string3 = cursorQuery.getString(2);
/* 126 */                           Object objM233M = m233M(cursorQuery, 3);
/* 140 */                           boolean z = cursorQuery.getInt(4) != 0;
/* 143 */                           String string4 = cursorQuery.getString(5);
/* 148 */                           long j = cursorQuery.getLong(6);
/* 154 */                           ci3 ci3Var = this.f15676b.f13923i;
/* 156 */                           mp3.m6728S(ci3Var);
/* 160 */                           byte[] blob = cursorQuery.getBlob(7);
/* 164 */                           Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
/* 172 */                           zzbg zzbgVar = (zzbg) ci3Var.m1691e0(blob, creator);
/* 176 */                           long j2 = cursorQuery.getLong(8);
/* 180 */                           mp3.m6728S(ci3Var);
/* 195 */                           zzbg zzbgVar2 = (zzbg) ci3Var.m1691e0(cursorQuery.getBlob(9), creator);
/* 199 */                           long j3 = cursorQuery.getLong(10);
/* 205 */                           long j4 = cursorQuery.getLong(11);
/* 209 */                           mp3.m6728S(ci3Var);
/* 242 */                           arrayList.add(new zzah(string, string2, new zzpk(j3, objM233M, string3, string2), j2, z, string4, zzbgVar, j, zzbgVar2, j4, (zzbg) ci3Var.m1691e0(cursorQuery.getBlob(12), creator)));
/* 249 */                       } while (cursorQuery.moveToNext());
                            }
                        } catch (SQLiteException e) {
/* 252 */                   uh3 uh3Var2 = ij3Var.f9655f;
/* 254 */                   ij3.m4555l(uh3Var2);
/* 261 */                   uh3Var2.f17538f.m8511b(e, "Error querying conditional user property value");
/* 264 */                   arrayList = Collections.EMPTY_LIST;
                        }
/* 271 */               return arrayList;
                    } finally {
/* 272 */               if (cursorQuery != null) {
/* 274 */                   cursorQuery.close();
                        }
                    }
                }

                /* JADX INFO: renamed from: D */
                public final long m218D(String str, zzib zzibVar, String str2, Map map, zl3 zl3Var, Long l) {
                    int iDelete;
/* 10 */            ij3 ij3Var = (ij3) this.f16749a;
/* 12 */            mo1375y();
/* 15 */            m9593A();
/* 18 */            kb1.m6061n(zzibVar);
/* 21 */            kb1.m6058k(str);
/* 24 */            mo1375y();
/* 27 */            m9593A();
/* 38 */            if (m256k0()) {
/* 42 */                mp3 mp3Var = this.f15676b;
/* 48 */                long jM4932a = mp3Var.f13938w.f17196f.m4932a();
/* 52 */                xt0 xt0Var = ij3Var.f9640V;
/* 54 */                uh3 uh3Var = ij3Var.f9655f;
/* 56 */                xt0Var.getClass();
/* 59 */                long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 83 */                if (Math.abs(jElapsedRealtime - jM4932a) > ((Long) vg3.f18087M.m9011a(null)).longValue()) {
/* 89 */                    mp3Var.f13938w.f17196f.m4933b(jElapsedRealtime);
/* 92 */                    mo1375y();
/* 95 */                    m9593A();
/* 102 */                   if (m256k0() && (iDelete = m261q0().delete("upload_queue", m250d0(), new String[0])) > 0) {
/* 121 */                       ij3.m4555l(uh3Var);
/* 132 */                       uh3Var.f17534Y.m8511b(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                            }
/* 135 */                   kb1.m6058k(str);
/* 138 */                   mo1375y();
/* 141 */                   m9593A();
                            try {
/* 148 */                       int iM7404H = ij3Var.f9651d.m7404H(str, vg3.f18063A);
/* 152 */                       if (iM7404H > 0) {
/* 168 */                           m261q0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iM7404H)});
                                }
                            } catch (SQLiteException e) {
/* 173 */                       ij3.m4555l(uh3Var);
/* 184 */                       uh3Var.f17538f.m8512c(uh3.m9013H(str), "Error deleting over the limit queued batches. appId", e);
                            }
                        }
                    }
/* 189 */           ArrayList arrayList = new ArrayList();
/* 204 */           for (Map.Entry entry : map.entrySet()) {
/* 216 */               String str3 = (String) entry.getKey();
/* 222 */               String str4 = (String) entry.getValue();
/* 245 */               StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
/* 248 */               sb.append(str3);
/* 253 */               sb.append("=");
/* 256 */               sb.append(str4);
/* 263 */               arrayList.add(sb.toString());
                    }
/* 267 */           byte[] bArrZzcc = zzibVar.zzcc();
/* 273 */           ContentValues contentValues = new ContentValues();
/* 278 */           contentValues.put("app_id", str);
/* 283 */           contentValues.put("measurement_batch", bArrZzcc);
/* 290 */           contentValues.put("upload_uri", str2);
/* 295 */           StringBuilder sb2 = new StringBuilder();
/* 298 */           Iterator it = arrayList.iterator();
/* 306 */           if (it.hasNext()) {
                        while (true) {
/* 314 */                   sb2.append((CharSequence) it.next());
/* 321 */                   if (!it.hasNext()) {
                                break;
                            }
/* 325 */                   sb2.append((CharSequence) "\r\n");
                        }
                    }
/* 335 */           contentValues.put("upload_headers", sb2.toString());
/* 348 */           contentValues.put("upload_type", Integer.valueOf(zl3Var.f20243a));
/* 351 */           xt0 xt0Var2 = ij3Var.f9640V;
/* 353 */           uh3 uh3Var2 = ij3Var.f9655f;
/* 355 */           xt0Var2.getClass();
/* 368 */           contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
/* 377 */           contentValues.put("retry_count", (Integer) 0);
/* 380 */           if (l != null) {
/* 384 */               contentValues.put("associated_row_id", l);
                    }
                    try {
/* 393 */               long jInsert = m261q0().insert("upload_queue", null, contentValues);
/* 399 */               if (jInsert != -1) {
/* 414 */                   return jInsert;
                        }
/* 401 */               ij3.m4555l(uh3Var2);
/* 408 */               uh3Var2.f17538f.m8511b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
/* 387 */               return -1L;
                    } catch (SQLiteException e2) {
/* 416 */               ij3.m4555l(uh3Var2);
/* 423 */               uh3Var2.f17538f.m8512c(str, "Error storing MeasurementBatch to upload_queue. appId", e2);
/* 387 */               return -1L;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:126:0x03ec  */
                /* JADX INFO: renamed from: D0 */
                public final di3 m219D0(String str) {
                    Cursor cursorQuery;
                    Boolean boolValueOf;
                    String string;
/* 7 */             ij3 ij3Var = (ij3) this.f16749a;
/* 9 */             kb1.m6058k(str);
/* 12 */            mo1375y();
/* 15 */            m9593A();
/* 18 */            Cursor cursor = null;
                    try {
/* 128 */               cursorQuery = m261q0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
                        try {
                            try {
/* 136 */                       if (cursorQuery.moveToFirst()) {
/* 142 */                           mp3 mp3Var = this.f15676b;
/* 146 */                           di3 di3Var = new di3(mp3Var.f13905W, str);
/* 149 */                           ij3 ij3Var2 = di3Var.f7242a;
/* 151 */                           ok3 ok3VarM6752d = mp3Var.m6752d(str);
/* 155 */                           nk3 nk3Var = nk3.ANALYTICS_STORAGE;
/* 162 */                           if (ok3VarM6752d.m7189i(nk3Var)) {
/* 168 */                               di3Var.m3095F(cursorQuery.getString(0));
                                    }
/* 175 */                           boolean z = true;
/* 180 */                           di3Var.m3097H(cursorQuery.getString(1));
/* 193 */                           if (mp3Var.m6752d(str).m7189i(nk3.AD_STORAGE)) {
/* 200 */                               di3Var.m3098I(cursorQuery.getString(2));
                                    }
/* 208 */                           di3Var.m3113e(cursorQuery.getLong(3));
/* 216 */                           di3Var.m3101L(cursorQuery.getLong(4));
/* 224 */                           di3Var.m3102M(cursorQuery.getLong(5));
/* 232 */                           di3Var.m3104O(cursorQuery.getString(6));
/* 240 */                           di3Var.m3107R(cursorQuery.getString(7));
/* 249 */                           di3Var.m3108S(cursorQuery.getLong(8));
/* 258 */                           di3Var.m3109a(cursorQuery.getLong(9));
/* 278 */                           di3Var.m3112d(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
/* 287 */                           di3Var.m3117i(cursorQuery.getLong(11));
/* 296 */                           di3Var.m3118j(cursorQuery.getLong(12));
/* 305 */                           di3Var.m3119k(cursorQuery.getLong(13));
/* 314 */                           di3Var.m3120l(cursorQuery.getLong(14));
/* 323 */                           di3Var.m3114f(cursorQuery.getLong(15));
/* 332 */                           di3Var.m3115g(cursorQuery.getLong(16));
/* 352 */                           di3Var.m3106Q(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
/* 361 */                           di3Var.m3100K(cursorQuery.getString(18));
/* 370 */                           di3Var.m3122n(cursorQuery.getLong(19));
/* 379 */                           di3Var.m3121m(cursorQuery.getLong(20));
/* 388 */                           di3Var.m3130v(cursorQuery.getString(21));
/* 407 */                           boolean z2 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
/* 408 */                           bj3 bj3Var = ij3Var2.f9659i;
/* 410 */                           ij3.m4555l(bj3Var);
/* 413 */                           bj3Var.mo1375y();
/* 426 */                           di3Var.f7239Q |= di3Var.f7257p != z2;
/* 428 */                           di3Var.f7257p = z2;
/* 445 */                           di3Var.m3111c(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
/* 454 */                           if (!cursorQuery.isNull(26)) {
/* 471 */                               di3Var.m3132x(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                                    }
/* 482 */                           if (mp3Var.m6752d(str).m7189i(nk3Var)) {
/* 486 */                               String string2 = cursorQuery.getString(28);
/* 490 */                               bj3 bj3Var2 = ij3Var2.f9659i;
/* 492 */                               ij3.m4555l(bj3Var2);
/* 495 */                               bj3Var2.mo1375y();
/* 508 */                               di3Var.f7239Q |= !Objects.equals(di3Var.f7261t, string2);
/* 510 */                               di3Var.f7261t = string2;
                                    }
/* 532 */                           boolean z3 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
/* 533 */                           bj3 bj3Var3 = ij3Var2.f9659i;
/* 535 */                           ij3.m4555l(bj3Var3);
/* 538 */                           bj3Var3.mo1375y();
/* 551 */                           di3Var.f7239Q |= di3Var.f7262u != z3;
/* 553 */                           di3Var.f7262u = z3;
/* 561 */                           di3Var.m3126r(cursorQuery.getLong(39));
/* 566 */                           String string3 = cursorQuery.getString(36);
/* 570 */                           bj3 bj3Var4 = ij3Var2.f9659i;
/* 572 */                           ij3.m4555l(bj3Var4);
/* 575 */                           bj3Var4.mo1375y();
/* 588 */                           di3Var.f7239Q |= di3Var.f7225C != string3;
/* 590 */                           di3Var.f7225C = string3;
/* 598 */                           di3Var.m3134z(cursorQuery.getLong(30));
/* 607 */                           di3Var.m3090A(cursorQuery.getLong(31));
/* 610 */                           zzql.zza();
/* 621 */                           if (ij3Var.f9651d.m7406J(str, vg3.f18094P0)) {
/* 625 */                               int i = cursorQuery.getInt(32);
/* 629 */                               bj3 bj3Var5 = ij3Var2.f9659i;
/* 631 */                               ij3.m4555l(bj3Var5);
/* 634 */                               bj3Var5.mo1375y();
/* 647 */                               di3Var.f7239Q |= di3Var.f7265x != i;
/* 649 */                               di3Var.f7265x = i;
/* 657 */                               di3Var.m3091B(cursorQuery.getLong(35));
                                    }
/* 676 */                           boolean z4 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
/* 677 */                           bj3 bj3Var6 = ij3Var2.f9659i;
/* 679 */                           ij3.m4555l(bj3Var6);
/* 682 */                           bj3Var6.mo1375y();
/* 695 */                           di3Var.f7239Q |= di3Var.f7266y != z4;
/* 697 */                           di3Var.f7266y = z4;
/* 705 */                           if (cursorQuery.isNull(34)) {
/* 707 */                               boolValueOf = null;
                                    } else {
/* 718 */                               boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                                    }
/* 722 */                           bj3 bj3Var7 = ij3Var2.f9659i;
/* 724 */                           ij3.m4555l(bj3Var7);
/* 727 */                           bj3Var7.mo1375y();
/* 740 */                           di3Var.f7239Q |= !Objects.equals(di3Var.f7258q, boolValueOf);
/* 742 */                           di3Var.f7258q = boolValueOf;
/* 750 */                           di3Var.m3124p(cursorQuery.getInt(37));
/* 759 */                           di3Var.m3125q(cursorQuery.getInt(38));
/* 768 */                           if (cursorQuery.isNull(40)) {
/* 770 */                               string = HttpUrl.FRAGMENT_ENCODE_SET;
                                    } else {
/* 773 */                               string = cursorQuery.getString(40);
/* 777 */                               kb1.m6061n(string);
                                    }
/* 780 */                           bj3 bj3Var8 = ij3Var2.f9659i;
/* 782 */                           ij3.m4555l(bj3Var8);
/* 785 */                           bj3Var8.mo1375y();
/* 798 */                           di3Var.f7239Q |= di3Var.f7229G != string;
/* 800 */                           di3Var.f7229G = string;
/* 808 */                           if (!cursorQuery.isNull(41)) {
/* 814 */                               Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
/* 818 */                               bj3 bj3Var9 = ij3Var2.f9659i;
/* 820 */                               ij3.m4555l(bj3Var9);
/* 823 */                               bj3Var9.mo1375y();
/* 836 */                               di3Var.f7239Q |= !Objects.equals(di3Var.f7267z, lValueOf);
/* 838 */                               di3Var.f7267z = lValueOf;
                                    }
/* 846 */                           if (!cursorQuery.isNull(42)) {
/* 852 */                               Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
/* 856 */                               bj3 bj3Var10 = ij3Var2.f9659i;
/* 858 */                               ij3.m4555l(bj3Var10);
/* 861 */                               bj3Var10.mo1375y();
/* 874 */                               di3Var.f7239Q |= !Objects.equals(di3Var.f7223A, lValueOf2);
/* 876 */                               di3Var.f7223A = lValueOf2;
                                    }
/* 880 */                           byte[] blob = cursorQuery.getBlob(43);
/* 884 */                           bj3 bj3Var11 = ij3Var2.f9659i;
/* 886 */                           ij3.m4555l(bj3Var11);
/* 889 */                           bj3Var11.mo1375y();
/* 902 */                           di3Var.f7239Q |= di3Var.f7230H != blob;
/* 904 */                           di3Var.f7230H = blob;
/* 912 */                           if (!cursorQuery.isNull(44)) {
/* 914 */                               int i2 = cursorQuery.getInt(44);
/* 918 */                               bj3 bj3Var12 = ij3Var2.f9659i;
/* 920 */                               ij3.m4555l(bj3Var12);
/* 923 */                               bj3Var12.mo1375y();
/* 926 */                               boolean z5 = di3Var.f7239Q;
/* 930 */                               if (di3Var.f7231I == i2) {
/* 933 */                                   z = false;
                                        }
/* 935 */                               di3Var.f7239Q = z | z5;
/* 937 */                               di3Var.f7231I = i2;
                                    }
/* 939 */                           bj3 bj3Var13 = ij3Var2.f9659i;
/* 941 */                           ij3.m4555l(bj3Var13);
/* 944 */                           bj3Var13.mo1375y();
/* 947 */                           di3Var.f7239Q = false;
/* 953 */                           if (cursorQuery.moveToNext()) {
/* 955 */                               uh3 uh3Var = ij3Var.f9655f;
/* 957 */                               ij3.m4555l(uh3Var);
/* 968 */                               uh3Var.f17538f.m8511b(uh3.m9013H(str), "Got multiple records for app, expected one. appId");
                                    }
/* 971 */                           cursorQuery.close();
/* 974 */                           return di3Var;
                                }
                            } catch (SQLiteException e) {
/* 513 */                       e = e;
/* 981 */                       uh3 uh3Var2 = ij3Var.f9655f;
/* 983 */                       ij3.m4555l(uh3Var2);
/* 994 */                       uh3Var2.f17538f.m8512c(uh3.m9013H(str), "Error querying app. appId", e);
                            }
                        } catch (Throwable th) {
/* 172 */                   th = th;
/* 975 */                   cursor = cursorQuery;
/* 1003 */                  if (cursor != null) {
/* 1005 */                      cursor.close();
                            }
/* 1008 */                  throw th;
                        }
                    } catch (SQLiteException e2) {
/* 979 */               e = e2;
/* 980 */               cursorQuery = null;
                    } catch (Throwable th2) {
/* 977 */               th = th2;
/* 1003 */              if (cursor != null) {
/* 1005 */                  cursor.close();
                        }
/* 1008 */              throw th;
                    }
/* 997 */           if (cursorQuery != null) {
/* 999 */               cursorQuery.close();
                    }
/* 18 */            return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
                /* JADX INFO: renamed from: E */
                public final List m220E(String str, zzon zzonVar, int i) {
                    ?? arrayList;
/* 1 */             kb1.m6058k(str);
/* 4 */             mo1375y();
/* 7 */             m9593A();
/* 14 */            Cursor cursorQuery = null;
                    try {
/* 15 */                SQLiteDatabase sQLiteDatabaseM261q0 = m261q0();
/* 41 */                String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
/* 49 */                String strM212e0 = m212e0(zzonVar.f4225a);
/* 53 */                String strM250d0 = m250d0();
/* 70 */                StringBuilder sb = new StringBuilder(strM212e0.length() + 17 + strM250d0.length());
/* 73 */                sb.append("app_id=?");
/* 76 */                sb.append(strM212e0);
/* 79 */                sb.append(" AND NOT ");
/* 82 */                sb.append(strM250d0);
/* 106 */               cursorQuery = sQLiteDatabaseM261q0.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? String.valueOf(i) : null);
/* 112 */               arrayList = new ArrayList();
/* 119 */               while (cursorQuery.moveToNext()) {
/* 172 */                   pp3 pp3VarM249c0 = m249c0(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
/* 176 */                   if (pp3VarM249c0 != null) {
/* 178 */                       arrayList.add(pp3VarM249c0);
                            }
                        }
                    } catch (SQLiteException e) {
/* 191 */               uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 193 */               ij3.m4555l(uh3Var);
/* 202 */               uh3Var.f17538f.m8512c(str, "Error to querying MeasurementBatch from upload_queue. appId", e);
/* 205 */               arrayList = Collections.EMPTY_LIST;
                    } finally {
/* 213 */               if (cursorQuery != null) {
/* 215 */                   cursorQuery.close();
                        }
                    }
/* 212 */           return arrayList;
                }

                /* JADX INFO: renamed from: E0 */
                public final void m221E0(di3 di3Var, boolean z) {
/* 5 */             ij3 ij3Var = (ij3) this.f16749a;
/* 7 */             ij3 ij3Var2 = di3Var.f7242a;
/* 9 */             mo1375y();
/* 12 */            m9593A();
/* 15 */            String strM3093D = di3Var.m3093D();
/* 19 */            kb1.m6061n(strM3093D);
/* 24 */            ContentValues contentValues = new ContentValues();
/* 29 */            contentValues.put("app_id", strM3093D);
/* 32 */            nk3 nk3Var = nk3.ANALYTICS_STORAGE;
/* 34 */            mp3 mp3Var = this.f15676b;
/* 39 */            if (z) {
/* 41 */                contentValues.put("app_instance_id", (String) null);
                    } else if (mp3Var.m6752d(strM3093D).m7189i(nk3Var)) {
/* 59 */                contentValues.put("app_instance_id", di3Var.m3094E());
                    }
/* 68 */            contentValues.put("gmp_app_id", di3Var.m3096G());
/* 81 */            if (mp3Var.m6752d(strM3093D).m7189i(nk3.AD_STORAGE)) {
/* 83 */                bj3 bj3Var = ij3Var2.f9659i;
/* 85 */                ij3.m4555l(bj3Var);
/* 88 */                bj3Var.mo1375y();
/* 95 */                contentValues.put("resettable_device_id_hash", di3Var.f7246e);
                    }
/* 98 */            bj3 bj3Var2 = ij3Var2.f9659i;
/* 100 */           ij3.m4555l(bj3Var2);
/* 103 */           bj3Var2.mo1375y();
/* 114 */           contentValues.put("last_bundle_index", Long.valueOf(di3Var.f7248g));
/* 117 */           bj3 bj3Var3 = ij3Var2.f9659i;
/* 119 */           ij3.m4555l(bj3Var3);
/* 122 */           bj3Var3.mo1375y();
/* 133 */           contentValues.put("last_bundle_start_timestamp", Long.valueOf(di3Var.f7249h));
/* 136 */           bj3 bj3Var4 = ij3Var2.f9659i;
/* 138 */           ij3.m4555l(bj3Var4);
/* 141 */           bj3Var4.mo1375y();
/* 152 */           contentValues.put("last_bundle_end_timestamp", Long.valueOf(di3Var.f7250i));
/* 161 */           contentValues.put("app_version", di3Var.m3103N());
/* 164 */           bj3 bj3Var5 = ij3Var2.f9659i;
/* 166 */           ij3.m4555l(bj3Var5);
/* 169 */           bj3Var5.mo1375y();
/* 176 */           contentValues.put("app_store", di3Var.f7253l);
/* 179 */           bj3 bj3Var6 = ij3Var2.f9659i;
/* 181 */           ij3.m4555l(bj3Var6);
/* 184 */           bj3Var6.mo1375y();
/* 195 */           contentValues.put("gmp_version", Long.valueOf(di3Var.f7254m));
/* 198 */           bj3 bj3Var7 = ij3Var2.f9659i;
/* 200 */           ij3.m4555l(bj3Var7);
/* 203 */           bj3Var7.mo1375y();
/* 214 */           contentValues.put("dev_cert_hash", Long.valueOf(di3Var.f7255n));
/* 217 */           bj3 bj3Var8 = ij3Var2.f9659i;
/* 219 */           ij3.m4555l(bj3Var8);
/* 222 */           bj3Var8.mo1375y();
/* 233 */           contentValues.put("measurement_enabled", Boolean.valueOf(di3Var.f7256o));
/* 236 */           bj3 bj3Var9 = ij3Var2.f9659i;
/* 238 */           bj3 bj3Var10 = ij3Var2.f9659i;
/* 240 */           ij3.m4555l(bj3Var9);
/* 243 */           bj3Var9.mo1375y();
/* 254 */           contentValues.put("day", Long.valueOf(di3Var.f7232J));
/* 257 */           ij3.m4555l(bj3Var10);
/* 260 */           bj3Var10.mo1375y();
/* 271 */           contentValues.put("daily_public_events_count", Long.valueOf(di3Var.f7233K));
/* 274 */           ij3.m4555l(bj3Var10);
/* 277 */           bj3Var10.mo1375y();
/* 288 */           contentValues.put("daily_events_count", Long.valueOf(di3Var.f7234L));
/* 291 */           ij3.m4555l(bj3Var10);
/* 294 */           bj3Var10.mo1375y();
/* 305 */           contentValues.put("daily_conversions_count", Long.valueOf(di3Var.f7235M));
/* 308 */           bj3 bj3Var11 = ij3Var2.f9659i;
/* 310 */           ij3.m4555l(bj3Var11);
/* 313 */           bj3Var11.mo1375y();
/* 324 */           contentValues.put("config_fetched_time", Long.valueOf(di3Var.f7240R));
/* 327 */           bj3 bj3Var12 = ij3Var2.f9659i;
/* 329 */           ij3.m4555l(bj3Var12);
/* 332 */           bj3Var12.mo1375y();
/* 343 */           contentValues.put("failed_config_fetch_time", Long.valueOf(di3Var.f7241S));
/* 356 */           contentValues.put("app_version_int", Long.valueOf(di3Var.m3105P()));
/* 365 */           contentValues.put("firebase_instance_id", di3Var.m3099J());
/* 368 */           ij3.m4555l(bj3Var10);
/* 371 */           bj3Var10.mo1375y();
/* 382 */           contentValues.put("daily_error_events_count", Long.valueOf(di3Var.f7236N));
/* 385 */           ij3.m4555l(bj3Var10);
/* 388 */           bj3Var10.mo1375y();
/* 399 */           contentValues.put("daily_realtime_events_count", Long.valueOf(di3Var.f7237O));
/* 402 */           ij3.m4555l(bj3Var10);
/* 405 */           bj3Var10.mo1375y();
/* 412 */           contentValues.put("health_monitor_sample", di3Var.f7238P);
/* 423 */           contentValues.put("android_id", (Long) 0L);
/* 426 */           bj3 bj3Var13 = ij3Var2.f9659i;
/* 428 */           ij3.m4555l(bj3Var13);
/* 431 */           bj3Var13.mo1375y();
/* 442 */           contentValues.put("adid_reporting_enabled", Boolean.valueOf(di3Var.f7257p));
/* 455 */           contentValues.put("dynamite_version", Long.valueOf(di3Var.m3110b()));
/* 466 */           if (mp3Var.m6752d(strM3093D).m7189i(nk3Var)) {
/* 468 */               bj3 bj3Var14 = ij3Var2.f9659i;
/* 470 */               ij3.m4555l(bj3Var14);
/* 473 */               bj3Var14.mo1375y();
/* 480 */               contentValues.put("session_stitching_token", di3Var.f7261t);
                    }
/* 493 */           contentValues.put("sgtm_upload_enabled", Boolean.valueOf(di3Var.m3133y()));
/* 496 */           bj3 bj3Var15 = ij3Var2.f9659i;
/* 498 */           ij3.m4555l(bj3Var15);
/* 501 */           bj3Var15.mo1375y();
/* 512 */           contentValues.put("target_os_version", Long.valueOf(di3Var.f7263v));
/* 515 */           bj3 bj3Var16 = ij3Var2.f9659i;
/* 517 */           ij3.m4555l(bj3Var16);
/* 520 */           bj3Var16.mo1375y();
/* 531 */           contentValues.put("session_stitching_token_hash", Long.valueOf(di3Var.f7264w));
/* 534 */           zzql.zza();
/* 537 */           pd3 pd3Var = ij3Var.f9651d;
/* 539 */           uh3 uh3Var = ij3Var.f9655f;
/* 547 */           if (pd3Var.m7406J(strM3093D, vg3.f18094P0)) {
/* 549 */               bj3 bj3Var17 = ij3Var2.f9659i;
/* 551 */               ij3.m4555l(bj3Var17);
/* 554 */               bj3Var17.mo1375y();
/* 565 */               contentValues.put("ad_services_version", Integer.valueOf(di3Var.f7265x));
/* 568 */               bj3 bj3Var18 = ij3Var2.f9659i;
/* 570 */               ij3.m4555l(bj3Var18);
/* 573 */               bj3Var18.mo1375y();
/* 584 */               contentValues.put("attribution_eligibility_status", Long.valueOf(di3Var.f7224B));
                    }
/* 587 */           bj3 bj3Var19 = ij3Var2.f9659i;
/* 589 */           ij3.m4555l(bj3Var19);
/* 592 */           bj3Var19.mo1375y();
/* 603 */           contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(di3Var.f7266y));
/* 612 */           contentValues.put("npa_metadata_value", di3Var.m3131w());
/* 615 */           bj3 bj3Var20 = ij3Var2.f9659i;
/* 617 */           ij3.m4555l(bj3Var20);
/* 620 */           bj3Var20.mo1375y();
/* 631 */           contentValues.put("bundle_delivery_index", Long.valueOf(di3Var.f7228F));
/* 640 */           contentValues.put("sgtm_preview_key", di3Var.m3092C());
/* 643 */           ij3.m4555l(bj3Var10);
/* 646 */           bj3Var10.mo1375y();
/* 657 */           contentValues.put("dma_consent_state", Integer.valueOf(di3Var.f7226D));
/* 660 */           ij3.m4555l(bj3Var10);
/* 663 */           bj3Var10.mo1375y();
/* 674 */           contentValues.put("daily_realtime_dcu_count", Integer.valueOf(di3Var.f7227E));
/* 683 */           contentValues.put("serialized_npa_metadata", di3Var.m3127s());
/* 696 */           contentValues.put("client_upload_eligibility", Integer.valueOf(di3Var.m3128t()));
/* 699 */           bj3 bj3Var21 = ij3Var2.f9659i;
/* 701 */           ij3.m4555l(bj3Var21);
/* 704 */           bj3Var21.mo1375y();
/* 707 */           ArrayList arrayList = di3Var.f7260s;
/* 711 */           if (arrayList != null) {
/* 717 */               if (arrayList.isEmpty()) {
/* 719 */                   ij3.m4555l(uh3Var);
/* 726 */                   uh3Var.f17541w.m8511b(strM3093D, "Safelisted events should not be an empty list. appId");
                        } else {
/* 736 */                   contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
                        }
                    }
/* 739 */           zzpn.zza();
/* 750 */           if (ij3Var.f9651d.m7406J(null, vg3.f18084K0) && !contentValues.containsKey("safelisted_events")) {
/* 758 */               contentValues.put("safelisted_events", (String) null);
                    }
/* 761 */           bj3 bj3Var22 = ij3Var2.f9659i;
/* 763 */           ij3.m4555l(bj3Var22);
/* 766 */           bj3Var22.mo1375y();
/* 773 */           contentValues.put("unmatched_pfo", di3Var.f7267z);
/* 776 */           bj3 bj3Var23 = ij3Var2.f9659i;
/* 778 */           ij3.m4555l(bj3Var23);
/* 781 */           bj3Var23.mo1375y();
/* 788 */           contentValues.put("unmatched_uwa", di3Var.f7223A);
/* 791 */           bj3 bj3Var24 = ij3Var2.f9659i;
/* 793 */           ij3.m4555l(bj3Var24);
/* 796 */           bj3Var24.mo1375y();
/* 803 */           contentValues.put("ad_campaign_info", di3Var.f7230H);
                    try {
/* 806 */               SQLiteDatabase sQLiteDatabaseM261q0 = m261q0();
/* 823 */               if (sQLiteDatabaseM261q0.update("apps", contentValues, "app_id = ?", new String[]{strM3093D}) == 0 && sQLiteDatabaseM261q0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
/* 836 */                   ij3.m4555l(uh3Var);
/* 847 */                   uh3Var.f17538f.m8511b(uh3.m9013H(strM3093D), "Failed to insert/update app (got -1). appId");
                        }
                    } catch (SQLiteException e) {
/* 854 */               ij3.m4555l(uh3Var);
/* 865 */               uh3Var.f17538f.m8512c(uh3.m9013H(strM3093D), "Error storing app. appId", e);
                    }
                }

                /* JADX INFO: renamed from: F */
                public final boolean m222F(String str) {
/* 3 */             zl3[] zl3VarArr = {zl3.GOOGLE_SIGNAL};
/* 10 */            ArrayList arrayList = new ArrayList(1);
/* 22 */            arrayList.add(Integer.valueOf(zl3VarArr[0].f20243a));
/* 25 */            String strM212e0 = m212e0(arrayList);
/* 29 */            String strM250d0 = m250d0();
                    return m242V(fm0.m3791q(new StringBuilder((strM212e0.length() + 61) + strM250d0.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strM212e0, " AND NOT ", strM250d0), new String[]{str}) != 0;
                }

                /* JADX INFO: renamed from: F0 */
                public final ud3 m223F0(boolean z, boolean z2, boolean z3, boolean z4, String str, long j) {
/* 17 */            return m225G0(j, str, 1L, false, false, z, false, z2, z3, z4);
                }

                /* JADX INFO: renamed from: G */
                public final void m224G(Long l) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             mo1375y();
/* 8 */             m9593A();
                    try {
/* 32 */                if (m261q0().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
/* 34 */                    uh3 uh3Var = ij3Var.f9655f;
/* 36 */                    ij3.m4555l(uh3Var);
/* 43 */                    uh3Var.f17541w.m8510a("Deleted fewer rows from upload_queue than expected");
                        }
                    } catch (SQLiteException e) {
/* 50 */                uh3 uh3Var2 = ij3Var.f9655f;
/* 52 */                ij3.m4555l(uh3Var2);
/* 59 */                uh3Var2.f17538f.m8511b(e, "Failed to delete a MeasurementBatch in a upload_queue table");
/* 62 */                throw e;
                    }
                }

                /* JADX INFO: renamed from: G0 */
                public final ud3 m225G0(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
/* 4 */             ij3 ij3Var = (ij3) this.f16749a;
/* 6 */             kb1.m6058k(str);
/* 9 */             mo1375y();
/* 12 */            m9593A();
/* 15 */            String[] strArr = {str};
/* 21 */            ud3 ud3Var = new ud3();
/* 24 */            Cursor cursorQuery = null;
                    try {
                        try {
/* 25 */                    SQLiteDatabase sQLiteDatabaseM261q0 = m261q0();
/* 60 */                    cursorQuery = sQLiteDatabaseM261q0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
/* 68 */                    if (cursorQuery.moveToFirst()) {
/* 103 */                       if (cursorQuery.getLong(0) == j) {
/* 110 */                           ud3Var.f17478b = cursorQuery.getLong(1);
/* 117 */                           ud3Var.f17477a = cursorQuery.getLong(2);
/* 124 */                           ud3Var.f17479c = cursorQuery.getLong(3);
/* 131 */                           ud3Var.f17480d = cursorQuery.getLong(4);
/* 138 */                           ud3Var.f17481e = cursorQuery.getLong(5);
/* 145 */                           ud3Var.f17482f = cursorQuery.getLong(6);
/* 152 */                           ud3Var.f17483g = cursorQuery.getLong(7);
                                }
/* 154 */                       if (z) {
/* 160 */                           ud3Var.f17478b += j2;
                                }
/* 162 */                       if (z2) {
/* 168 */                           ud3Var.f17477a += j2;
                                }
/* 170 */                       if (z3) {
/* 176 */                           ud3Var.f17479c += j2;
                                }
/* 178 */                       if (z4) {
/* 184 */                           ud3Var.f17480d += j2;
                                }
/* 186 */                       if (z5) {
/* 192 */                           ud3Var.f17481e += j2;
                                }
/* 194 */                       if (z6) {
/* 200 */                           ud3Var.f17482f += j2;
                                }
/* 202 */                       if (z7) {
/* 208 */                           ud3Var.f17483g += j2;
                                }
/* 212 */                       ContentValues contentValues = new ContentValues();
/* 221 */                       contentValues.put("day", Long.valueOf(j));
/* 232 */                       contentValues.put("daily_public_events_count", Long.valueOf(ud3Var.f17477a));
/* 243 */                       contentValues.put("daily_events_count", Long.valueOf(ud3Var.f17478b));
/* 254 */                       contentValues.put("daily_conversions_count", Long.valueOf(ud3Var.f17479c));
/* 265 */                       contentValues.put("daily_error_events_count", Long.valueOf(ud3Var.f17480d));
/* 276 */                       contentValues.put("daily_realtime_events_count", Long.valueOf(ud3Var.f17481e));
/* 287 */                       contentValues.put("daily_realtime_dcu_count", Long.valueOf(ud3Var.f17482f));
/* 298 */                       contentValues.put("daily_registered_triggers_count", Long.valueOf(ud3Var.f17483g));
/* 305 */                       sQLiteDatabaseM261q0.update("apps", contentValues, "app_id=?", strArr);
                            } else {
/* 70 */                        uh3 uh3Var = ij3Var.f9655f;
/* 72 */                        ij3.m4555l(uh3Var);
/* 83 */                        uh3Var.f17541w.m8511b(uh3.m9013H(str), "Not updating daily counts, app is not known. appId");
                            }
                        } catch (SQLiteException e) {
/* 309 */                   uh3 uh3Var2 = ij3Var.f9655f;
/* 311 */                   ij3.m4555l(uh3Var2);
/* 322 */                   uh3Var2.f17538f.m8512c(uh3.m9013H(str), "Error updating daily counts. appId", e);
                        }
/* 330 */               return ud3Var;
                    } finally {
/* 331 */               if (0 != 0) {
/* 333 */                   cursorQuery.close();
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:23:0x003d  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0 */
                /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r1v2 */
                /* JADX INFO: renamed from: H */
                public final String m226H() throws Throwable {
                    SQLiteException e;
                    Cursor cursorRawQuery;
/* 1 */             SQLiteDatabase sQLiteDatabaseM261q0 = m261q0();
/* 5 */             ?? r1 = 0;
                    try {
                        try {
/* 8 */                     cursorRawQuery = sQLiteDatabaseM261q0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                            try {
/* 16 */                        if (cursorRawQuery.moveToFirst()) {
/* 19 */                            String string = cursorRawQuery.getString(0);
/* 23 */                            cursorRawQuery.close();
/* 26 */                            return string;
                                }
                            } catch (SQLiteException e2) {
/* 29 */                        e = e2;
/* 42 */                        uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 44 */                        ij3.m4555l(uh3Var);
/* 51 */                        uh3Var.f17538f.m8511b(e, "Database error getting next bundle app id");
                            }
                        } catch (Throwable th) {
/* 27 */                    th = th;
/* 31 */                    r1 = sQLiteDatabaseM261q0;
/* 60 */                    if (r1 != 0) {
/* 62 */                        r1.close();
                            }
/* 65 */                    throw th;
                        }
                    } catch (SQLiteException e3) {
/* 36 */                e = e3;
/* 37 */                cursorRawQuery = null;
                    } catch (Throwable th2) {
/* 33 */                th = th2;
/* 60 */                if (r1 != 0) {
/* 62 */                    r1.close();
                        }
/* 65 */                throw th;
                    }
/* 54 */            if (cursorRawQuery != null) {
/* 56 */                cursorRawQuery.close();
                    }
/* 5 */             return null;
                }

                /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                /* JADX WARN: Code duplicated, block: B:35:? A[SYNTHETIC] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0 */
                /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r2v2 */
                /* JADX INFO: renamed from: H0 */
                public final ac1 m227H0(String str) throws Throwable {
                    Throwable th;
                    Cursor cursorQuery;
/* 4 */             ij3 ij3Var = (ij3) this.f16749a;
/* 6 */             kb1.m6058k(str);
/* 9 */             mo1375y();
/* 12 */            m9593A();
/* 15 */            ?? r2 = 0;
                    try {
                        try {
/* 41 */                    cursorQuery = m261q0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                            try {
/* 49 */                        if (cursorQuery.moveToFirst()) {
/* 53 */                            byte[] blob = cursorQuery.getBlob(0);
/* 58 */                            String string = cursorQuery.getString(1);
/* 63 */                            String string2 = cursorQuery.getString(2);
/* 71 */                            if (cursorQuery.moveToNext()) {
/* 73 */                                uh3 uh3Var = ij3Var.f9655f;
/* 75 */                                ij3.m4555l(uh3Var);
/* 86 */                                uh3Var.f17538f.m8511b(uh3.m9013H(str), "Got multiple records for app config, expected one. appId");
                                    }
/* 95 */                            if (blob != null) {
/* 102 */                               ac1 ac1Var = new ac1(26, blob, string, string2);
/* 105 */                               cursorQuery.close();
/* 108 */                               return ac1Var;
                                    }
                                }
                            } catch (SQLiteException e) {
/* 93 */                        e = e;
/* 118 */                       uh3 uh3Var2 = ij3Var.f9655f;
/* 120 */                       ij3.m4555l(uh3Var2);
/* 131 */                       uh3Var2.f17538f.m8512c(uh3.m9013H(str), "Error querying remote config. appId", e);
                            }
                        } catch (Throwable th2) {
/* 91 */                    th = th2;
/* 109 */                   r2 = this;
/* 140 */                   if (r2 != 0) {
/* 145 */                       throw th;
                            }
/* 142 */                   r2.close();
/* 145 */                   throw th;
                        }
                    } catch (SQLiteException e2) {
/* 115 */               e = e2;
/* 117 */               cursorQuery = null;
                    } catch (Throwable th3) {
/* 113 */               th = th3;
/* 140 */               if (r2 != 0) {
/* 145 */                   throw th;
                        }
/* 142 */               r2.close();
/* 145 */               throw th;
                    }
/* 134 */           if (cursorQuery != null) {
/* 136 */               cursorQuery.close();
                    }
/* 15 */            return null;
                }

                /* JADX INFO: renamed from: I */
                public final void m228I(long j) {
/* 1 */             mo1375y();
/* 4 */             m9593A();
                    try {
/* 28 */                if (m261q0().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
                        } else {
/* 38 */                    throw new SQLiteException("Deleted fewer rows from queue than expected");
                        }
                    } catch (SQLiteException e) {
/* 44 */                uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 46 */                ij3.m4555l(uh3Var);
/* 53 */                uh3Var.f17538f.m8511b(e, "Failed to delete a bundle in a queue table");
/* 56 */                throw e;
                    }
                }

                /* JADX INFO: renamed from: I0 */
                public final void m229I0(zzid zzidVar, boolean z) {
/* 1 */             mo1375y();
/* 4 */             m9593A();
/* 7 */             kb1.m6061n(zzidVar);
/* 14 */            kb1.m6058k(zzidVar.zzA());
/* 21 */            kb1.m6065r(zzidVar.zzn());
/* 24 */            m230J();
/* 29 */            ij3 ij3Var = (ij3) this.f16749a;
/* 31 */            xt0 xt0Var = ij3Var.f9640V;
/* 33 */            uh3 uh3Var = ij3Var.f9655f;
/* 35 */            xt0Var.getClass();
/* 38 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 42 */            long jZzo = zzidVar.zzo();
/* 46 */            ug3 ug3Var = vg3.f18097R;
/* 63 */            if (jZzo < jCurrentTimeMillis - ((Long) ug3Var.m9011a(null)).longValue() || zzidVar.zzo() > ((Long) ug3Var.m9011a(null)).longValue() + jCurrentTimeMillis) {
/* 84 */                ij3.m4555l(uh3Var);
/* 111 */               uh3Var.f17541w.m8513d("Storing bundle outside of the max uploading time span. appId, now, timestamp", uh3.m9013H(zzidVar.zzA()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzidVar.zzo()));
                    }
/* 114 */           byte[] bArrZzcc = zzidVar.zzcc();
                    try {
/* 120 */               ci3 ci3Var = this.f15676b.f13923i;
/* 122 */               mp3.m6728S(ci3Var);
/* 125 */               byte[] bArrM1695l0 = ci3Var.m1695l0(bArrZzcc);
/* 129 */               ij3.m4555l(uh3Var);
/* 141 */               uh3Var.f17534Y.m8511b(Integer.valueOf(bArrM1695l0.length), "Saving bundle, size");
/* 146 */               ContentValues contentValues = new ContentValues();
/* 155 */               contentValues.put("app_id", zzidVar.zzA());
/* 168 */               contentValues.put("bundle_end_timestamp", Long.valueOf(zzidVar.zzo()));
/* 173 */               contentValues.put(SharedDataContentProvider.BASE_PATH, bArrM1695l0);
/* 182 */               contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
/* 189 */               if (zzidVar.zzaa()) {
/* 201 */                   contentValues.put("retry_count", Integer.valueOf(zzidVar.zzab()));
                        }
                        try {
/* 218 */                   if (m261q0().insert("queue", null, contentValues) == -1) {
/* 220 */                       ij3.m4555l(uh3Var);
/* 235 */                       uh3Var.f17538f.m8511b(uh3.m9013H(zzidVar.zzA()), "Failed to insert bundle (got -1). appId");
                            }
                        } catch (SQLiteException e) {
/* 242 */                   ij3.m4555l(uh3Var);
/* 257 */                   uh3Var.f17538f.m8512c(uh3.m9013H(zzidVar.zzA()), "Error storing bundle. appId", e);
                        }
                    } catch (IOException e2) {
/* 262 */               ij3.m4555l(uh3Var);
/* 277 */               uh3Var.f17538f.m8512c(uh3.m9013H(zzidVar.zzA()), "Data loss. Failed to serialize bundle. appId", e2);
                    }
                }

                /* JADX INFO: renamed from: J */
                public final void m230J() {
/* 1 */             mo1375y();
/* 4 */             m9593A();
/* 11 */            if (m256k0()) {
/* 15 */                mp3 mp3Var = this.f15676b;
/* 21 */                long jM4932a = mp3Var.f13938w.f17195e.m4932a();
/* 27 */                ij3 ij3Var = (ij3) this.f16749a;
/* 31 */                ij3Var.f9640V.getClass();
/* 34 */                long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 59 */                if (Math.abs(jElapsedRealtime - jM4932a) > ((Long) vg3.f18087M.m9011a(null)).longValue()) {
/* 65 */                    mp3Var.f13938w.f17195e.m4933b(jElapsedRealtime);
/* 68 */                    mo1375y();
/* 71 */                    m9593A();
/* 78 */                    if (m256k0()) {
/* 80 */                        SQLiteDatabase sQLiteDatabaseM261q0 = m261q0();
/* 86 */                        ij3Var.f9640V.getClass();
/* 121 */                       int iDelete = sQLiteDatabaseM261q0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) vg3.f18097R.m9011a(null)).longValue())});
/* 125 */                       if (iDelete > 0) {
/* 127 */                           uh3 uh3Var = ij3Var.f9655f;
/* 129 */                           ij3.m4555l(uh3Var);
/* 140 */                           uh3Var.f17534Y.m8511b(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                                }
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: K */
                public final void m231K(ArrayList arrayList) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             mo1375y();
/* 8 */             m9593A();
/* 11 */            kb1.m6061n(arrayList);
/* 18 */            if (arrayList.size() == 0) {
/* 150 */               C1951n4.m6859j("Given Integer is zero");
/* 153 */               return;
                    }
/* 28 */            if (m256k0()) {
/* 33 */                String strJoin = TextUtils.join(",", arrayList);
/* 56 */                String strM3790p = fm0.m3790p(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
/* 88 */                if (m242V(fm0.m3790p(new StringBuilder(strM3790p.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strM3790p, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
/* 90 */                    uh3 uh3Var = ij3Var.f9655f;
/* 92 */                    ij3.m4555l(uh3Var);
/* 99 */                    uh3Var.f17541w.m8510a("The number of upload retries exceeds the limit. Will remain unchanged.");
                        }
                        try {
/* 102 */                   SQLiteDatabase sQLiteDatabaseM261q0 = m261q0();
/* 114 */                   StringBuilder sb = new StringBuilder(strM3790p.length() + 127);
/* 117 */                   sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
/* 120 */                   sb.append(strM3790p);
/* 123 */                   sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
/* 130 */                   sQLiteDatabaseM261q0.execSQL(sb.toString());
                        } catch (SQLiteException e) {
/* 135 */                   uh3 uh3Var2 = ij3Var.f9655f;
/* 137 */                   ij3.m4555l(uh3Var2);
/* 144 */                   uh3Var2.f17538f.m8511b(e, "Error incrementing retry count. error");
                        }
                    }
                }

                /* JADX INFO: renamed from: L */
                public final void m232L(Long l) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             mo1375y();
/* 8 */             m9593A();
/* 23 */            if (m256k0()) {
/* 38 */                StringBuilder sb = new StringBuilder(l.toString().length() + 86);
/* 43 */                sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
/* 46 */                sb.append(l);
/* 51 */                sb.append(" AND retry_count =  2147483647 LIMIT 1");
/* 67 */                if (m242V(sb.toString(), null) > 0) {
/* 69 */                    uh3 uh3Var = ij3Var.f9655f;
/* 71 */                    ij3.m4555l(uh3Var);
/* 78 */                    uh3Var.f17541w.m8510a("The number of upload retries exceeds the limit. Will remain unchanged.");
                        }
                        try {
/* 81 */                    SQLiteDatabase sQLiteDatabaseM261q0 = m261q0();
/* 87 */                    ij3Var.f9640V.getClass();
/* 90 */                    long jCurrentTimeMillis = System.currentTimeMillis();
/* 106 */                   StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
/* 109 */                   sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
/* 112 */                   sb2.append(jCurrentTimeMillis);
/* 115 */                   String string = sb2.toString();
/* 138 */                   StringBuilder sb3 = new StringBuilder(string.length() + 34 + l.toString().length() + 29);
/* 141 */                   sb3.append("UPDATE upload_queue");
/* 144 */                   sb3.append(string);
/* 147 */                   sb3.append(" WHERE rowid = ");
/* 150 */                   sb3.append(l);
/* 153 */                   sb3.append(" AND retry_count < 2147483647");
/* 160 */                   sQLiteDatabaseM261q0.execSQL(sb3.toString());
                        } catch (SQLiteException e) {
/* 165 */                   uh3 uh3Var2 = ij3Var.f9655f;
/* 167 */                   ij3.m4555l(uh3Var2);
/* 174 */                   uh3Var2.f17538f.m8511b(e, "Error incrementing retry count. error");
                        }
                    }
                }

                /* JADX INFO: renamed from: M */
                public final Object m233M(Cursor cursor, int i) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             int type = cursor.getType(i);
/* 10 */            if (type == 0) {
/* 77 */                uh3 uh3Var = ij3Var.f9655f;
/* 79 */                ij3.m4555l(uh3Var);
/* 86 */                uh3Var.f17538f.m8510a("Loaded invalid null value from database");
/* 9 */                 return null;
                    }
/* 13 */            if (type == 1) {
/* 72 */                return Long.valueOf(cursor.getLong(i));
                    }
/* 16 */            if (type == 2) {
/* 63 */                return Double.valueOf(cursor.getDouble(i));
                    }
/* 19 */            if (type == 3) {
/* 54 */                return cursor.getString(i);
                    }
/* 22 */            if (type != 4) {
/* 24 */                uh3 uh3Var2 = ij3Var.f9655f;
/* 26 */                ij3.m4555l(uh3Var2);
/* 37 */                uh3Var2.f17538f.m8511b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
/* 9 */                 return null;
                    }
/* 41 */            uh3 uh3Var3 = ij3Var.f9655f;
/* 43 */            ij3.m4555l(uh3Var3);
/* 50 */            uh3Var3.f17538f.m8510a("Loaded invalid blob type value, ignoring it");
/* 9 */             return null;
                }

                /* JADX WARN: Code duplicated, block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
                /* JADX WARN: Code duplicated, block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
                /* JADX INFO: renamed from: N */
                public final long m234N(String str) {
                    long j;
                    ContentValues contentValues;
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 7 */             kb1.m6058k(str);
/* 12 */            kb1.m6058k("first_open_count");
/* 15 */            mo1375y();
/* 18 */            m9593A();
/* 21 */            SQLiteDatabase sQLiteDatabaseM261q0 = m261q0();
/* 25 */            sQLiteDatabaseM261q0.beginTransaction();
/* 28 */            long j2 = 0;
                    try {
                        try {
/* 34 */                    StringBuilder sb = new StringBuilder(48);
/* 37 */                    sb.append("select first_open_count from app2 where app_id=?");
/* 48 */                    j = -1;
/* 50 */                    long jM243W = m243W(sb.toString(), new String[]{str}, -1L);
/* 60 */                    if (jM243W == -1) {
/* 64 */                        ContentValues contentValues2 = new ContentValues();
/* 67 */                        contentValues2.put("app_id", str);
/* 75 */                        contentValues2.put("first_open_count", (Integer) 0);
/* 80 */                        contentValues2.put("previous_install_count", (Integer) 0);
/* 91 */                        if (sQLiteDatabaseM261q0.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
/* 93 */                            uh3 uh3Var = ij3Var.f9655f;
/* 95 */                            ij3.m4555l(uh3Var);
/* 106 */                           uh3Var.f17538f.m8512c(uh3.m9013H(str), "Failed to insert column (got -1). appId", "first_open_count");
                                } else {
/* 114 */                           jM243W = 0;
                                    try {
/* 117 */                               contentValues = new ContentValues();
/* 120 */                               contentValues.put("app_id", str);
/* 130 */                               contentValues.put("first_open_count", Long.valueOf(1 + jM243W));
/* 146 */                               if (sQLiteDatabaseM261q0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
/* 148 */                                   uh3 uh3Var2 = ij3Var.f9655f;
/* 150 */                                   ij3.m4555l(uh3Var2);
/* 161 */                                   uh3Var2.f17538f.m8512c(uh3.m9013H(str), "Failed to update column (got 0). appId", "first_open_count");
                                        } else {
/* 167 */                                   sQLiteDatabaseM261q0.setTransactionSuccessful();
/* 170 */                                   j = jM243W;
                                        }
                                    } catch (SQLiteException e) {
/* 165 */                               e = e;
/* 172 */                               j2 = jM243W;
/* 173 */                               uh3 uh3Var3 = ij3Var.f9655f;
/* 175 */                               ij3.m4555l(uh3Var3);
/* 186 */                               uh3Var3.f17538f.m8513d("Error inserting column. appId", uh3.m9013H(str), "first_open_count", e);
/* 189 */                               j = j2;
                                    }
                                }
                            } else {
/* 117 */                       contentValues = new ContentValues();
/* 120 */                       contentValues.put("app_id", str);
/* 130 */                       contentValues.put("first_open_count", Long.valueOf(1 + jM243W));
/* 146 */                       if (sQLiteDatabaseM261q0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
/* 148 */                           uh3 uh3Var4 = ij3Var.f9655f;
/* 150 */                           ij3.m4555l(uh3Var4);
/* 161 */                           uh3Var4.f17538f.m8512c(uh3.m9013H(str), "Failed to update column (got 0). appId", "first_open_count");
                                } else {
/* 167 */                           sQLiteDatabaseM261q0.setTransactionSuccessful();
/* 170 */                           j = jM243W;
                                }
                            }
                        } catch (SQLiteException e2) {
/* 112 */                   e = e2;
                        }
/* 193 */               return j;
                    } finally {
/* 194 */               sQLiteDatabaseM261q0.endTransaction();
                    }
                }

                /* JADX INFO: renamed from: O */
                public final boolean m235O(String str, String str2) {
                    return m242V("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
                }

                /* JADX INFO: renamed from: P */
                public final void m236P(List list) {
/* 1 */             kb1.m6061n(list);
/* 4 */             mo1375y();
/* 7 */             m9593A();
/* 14 */            StringBuilder sb = new StringBuilder("rowid in (");
/* 22 */            for (int i = 0; i < list.size(); i++) {
/* 24 */                if (i != 0) {
/* 28 */                    sb.append(",");
                        }
/* 41 */                sb.append(((Long) list.get(i)).longValue());
                    }
/* 49 */            sb.append(")");
/* 63 */            int iDelete = m261q0().delete("raw_events", sb.toString(), null);
/* 71 */            if (iDelete != list.size()) {
/* 77 */                uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 79 */                ij3.m4555l(uh3Var);
/* 98 */                uh3Var.f17538f.m8512c(Integer.valueOf(iDelete), "Deleted fewer rows from raw events table than expected", Integer.valueOf(list.size()));
                    }
                }

                /* JADX INFO: renamed from: Q */
                public final void m237Q(String str) {
                    try {
/* 11 */                m261q0().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{str, str});
                    } catch (SQLiteException e) {
/* 20 */                uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 22 */                ij3.m4555l(uh3Var);
/* 33 */                uh3Var.f17538f.m8512c(uh3.m9013H(str), "Failed to remove unused event metadata. appId", e);
                    }
                }

                /* JADX INFO: renamed from: R */
                public final long m238R(String str) {
/* 1 */             kb1.m6058k(str);
/* 12 */            return m243W("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
                }

                /* JADX INFO: renamed from: S */
                public final void m239S(String str, Long l, long j, zzhs zzhsVar) {
/* 1 */             mo1375y();
/* 4 */             m9593A();
/* 7 */             kb1.m6061n(zzhsVar);
/* 10 */            kb1.m6058k(str);
/* 15 */            ij3 ij3Var = (ij3) this.f16749a;
/* 17 */            byte[] bArrZzcc = zzhsVar.zzcc();
/* 21 */            uh3 uh3Var = ij3Var.f9655f;
/* 23 */            uh3 uh3Var2 = ij3Var.f9655f;
/* 25 */            ij3.m4555l(uh3Var);
/* 43 */            uh3Var.f17534Y.m8512c(ij3Var.f9639U.m6656a(str), "Saving complex main event, appId, data size", Integer.valueOf(bArrZzcc.length));
/* 48 */            ContentValues contentValues = new ContentValues();
/* 53 */            contentValues.put("app_id", str);
/* 58 */            contentValues.put("event_id", l);
/* 67 */            contentValues.put("children_to_process", Long.valueOf(j));
/* 72 */            contentValues.put("main_event", bArrZzcc);
                    try {
/* 91 */                if (m261q0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
/* 93 */                    ij3.m4555l(uh3Var2);
/* 104 */                   uh3Var2.f17538f.m8511b(uh3.m9013H(str), "Failed to insert complex main event (got -1). appId");
                        }
                    } catch (SQLiteException e) {
/* 111 */               ij3.m4555l(uh3Var2);
/* 122 */               uh3Var2.f17538f.m8512c(uh3.m9013H(str), "Error storing complex main event. appId", e);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:122:0x0117 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:123:0x0117 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:125:0x0033 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:2: B:51:0x00fd->B:127:?, LOOP_END, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:50:0x00f5  */
                /* JADX WARN: Code duplicated, block: B:53:0x0103  */
                /* JADX INFO: renamed from: T */
                public final void m240T(String str, Long l, String str2, Bundle bundle) throws Throwable {
                    uh3 uh3Var;
                    Bundle bundle2;
                    long j;
                    String str3;
                    ContentValues contentValues;
                    uh3 uh3Var2;
                    zzid zzidVar;
                    Iterator it;
/* 1 */             ae3 ae3Var = this;
/* 3 */             String str4 = str;
/* 8 */             ij3 ij3Var = (ij3) ae3Var.f16749a;
/* 10 */            kb1.m6061n(bundle);
/* 13 */            ae3Var.mo1375y();
/* 16 */            ae3Var.m9593A();
/* 34 */            hh2 hh2Var = l != null ? new hh2(ae3Var, str4, l.longValue()) : new hh2(ae3Var, str4);
/* 38 */            List<xd3> listM4228f = hh2Var.m4228f();
/* 46 */            while (!listM4228f.isEmpty()) {
/* 56 */                for (xd3 xd3Var : listM4228f) {
                            try {
/* 69 */                        if (!TextUtils.isEmpty(str2)) {
/* 73 */                            Cursor cursor = null;
/* 73 */                            zzid zzidVar2 = null;
/* 73 */                            Cursor cursor2 = null;
                                    try {
                                        try {
/* 104 */                                   Cursor cursorQuery = ae3Var.m261q0().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(xd3Var.f19041b)}, null, null, "rowid", "2");
                                            try {
                                                try {
/* 112 */                                           if (cursorQuery.moveToFirst()) {
                                                        try {
/* 159 */                                                   zzidVar = (zzid) ((zzic) ci3.m1677m0(zzid.zzaE(), cursorQuery.getBlob(0))).zzbc();
                                                            try {
/* 165 */                                                       if (cursorQuery.moveToNext()) {
/* 167 */                                                           uh3 uh3Var3 = ij3Var.f9655f;
/* 169 */                                                           ij3.m4555l(uh3Var3);
/* 180 */                                                           uh3Var3.f17541w.m8511b(uh3.m9013H(str4), "Get multiple raw event metadata records, expected one. appId");
                                                                }
/* 186 */                                                       cursorQuery.close();
/* 189 */                                                       cursorQuery.close();
                                                            } catch (SQLiteException e) {
/* 184 */                                                       e = e;
/* 194 */                                                       cursor = cursorQuery;
/* 222 */                                                       uh3 uh3Var4 = ij3Var.f9655f;
/* 224 */                                                       ij3.m4555l(uh3Var4);
/* 235 */                                                       uh3Var4.f17538f.m8512c(uh3.m9013H(str4), "Data loss. Error selecting raw event. appId", e);
/* 238 */                                                       if (cursor != null) {
/* 240 */                                                           cursor.close();
                                                                }
                                                            }
/* 192 */                                                   zzidVar2 = zzidVar;
                                                        } catch (IOException e2) {
/* 197 */                                                   uh3 uh3Var5 = ij3Var.f9655f;
/* 199 */                                                   ij3.m4555l(uh3Var5);
/* 210 */                                                   uh3Var5.f17538f.m8512c(uh3.m9013H(str4), "Data loss. Failed to merge raw event metadata. appId", e2);
/* 130 */                                                   cursorQuery.close();
                                                        }
/* 244 */                                               if (zzidVar2 != null) {
/* 250 */                                                   it = zzidVar2.zzf().iterator();
                                                            while (true) {
/* 258 */                                                       if (it.hasNext()) {
/* 276 */                                                           if (((zziu) it.next()).zzc().equals(str2)) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
/* 114 */                                               uh3 uh3Var6 = ij3Var.f9655f;
/* 116 */                                               ij3.m4555l(uh3Var6);
/* 127 */                                               uh3Var6.f17538f.m8511b(uh3.m9013H(str4), "Raw event metadata record is missing. appId");
                                                    }
/* 130 */                                           cursorQuery.close();
                                                } catch (SQLiteException e3) {
/* 137 */                                           e = e3;
/* 216 */                                           zzidVar = null;
                                                }
                                            } catch (Throwable th) {
/* 135 */                                       th = th;
/* 214 */                                       cursor2 = cursorQuery;
/* 283 */                                       if (cursor2 != null) {
/* 285 */                                           cursor2.close();
                                                }
/* 288 */                                       throw th;
                                            }
                                        } catch (Throwable th2) {
/* 218 */                                   th = th2;
                                        }
                                    } catch (SQLiteException e4) {
/* 220 */                               e = e4;
/* 221 */                               zzidVar = null;
                                    }
/* 244 */                           if (zzidVar2 != null) {
/* 250 */                               it = zzidVar2.zzf().iterator();
                                        while (true) {
/* 258 */                                   if (it.hasNext()) {
/* 276 */                                       if (((zziu) it.next()).zzc().equals(str2)) {
                                                }
                                            }
                                        }
                                    }
                                }
/* 654 */                       long jUpdate = m261q0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
/* 663 */                       if (jUpdate != 1) {
/* 665 */                           ij3.m4555l(uh3Var);
/* 668 */                           uh3Var2 = uh3Var;
                                    try {
/* 682 */                               uh3Var2.f17538f.m8512c(uh3.m9013H(str3), "Failed to update raw event. appId, updatedRows", Long.valueOf(jUpdate));
                                    } catch (SQLiteException e5) {
/* 691 */                               e = e5;
/* 696 */                               ij3.m4555l(uh3Var2);
/* 707 */                               uh3Var2.f17538f.m8512c(uh3.m9013H(str3), "Error updating raw event. appId", e);
                                    }
                                }
                            } catch (SQLiteException e6) {
/* 693 */                       e = e6;
/* 694 */                       uh3Var2 = uh3Var;
                            }
/* 289 */                   mp3 mp3Var = ae3Var.f15676b;
/* 291 */                   ci3 ci3Var = mp3Var.f13923i;
/* 293 */                   mp3.m6728S(ci3Var);
/* 296 */                   zzhs zzhsVar = xd3Var.f19043d;
/* 300 */                   Bundle bundle3 = new Bundle();
/* 315 */                   for (zzhw zzhwVar : zzhsVar.zza()) {
/* 327 */                       if (zzhwVar.zzi()) {
/* 337 */                           bundle3.putDouble(zzhwVar.zzb(), zzhwVar.zzj());
                                } else if (zzhwVar.zzg()) {
/* 355 */                           bundle3.putFloat(zzhwVar.zzb(), zzhwVar.zzh());
                                } else if (zzhwVar.zze()) {
/* 373 */                           bundle3.putLong(zzhwVar.zzb(), zzhwVar.zzf());
                                } else if (zzhwVar.zzc()) {
/* 391 */                           bundle3.putString(zzhwVar.zzb(), zzhwVar.zzd());
                                } else if (zzhwVar.zzk().isEmpty()) {
/* 425 */                           uh3 uh3Var7 = ((ij3) ci3Var.f16749a).f9655f;
/* 427 */                           ij3.m4555l(uh3Var7);
/* 434 */                           uh3Var7.f17538f.m8511b(zzhwVar, "Unexpected parameter type for parameter");
                                } else {
/* 417 */                           bundle3.putParcelableArray(zzhwVar.zzb(), ci3.m1679o0(zzhwVar.zzk()));
                                }
                            }
/* 440 */                   String string = bundle3.getString("_o");
/* 444 */                   bundle3.remove("_o");
/* 447 */                   String strZzd = zzhsVar.zzd();
/* 451 */                   if (string == null) {
/* 453 */                       string = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
/* 455 */                   zzhsVar.zzf();
/* 458 */                   up3 up3Var = ij3Var.f9668w;
/* 460 */                   uh3Var = ij3Var.f9655f;
/* 462 */                   ij3.m4553j(up3Var);
/* 471 */                   if (strZzd.equals("_cmp")) {
/* 483 */                       bundle2 = new Bundle(bundle);
/* 498 */                       for (String str5 : bundle.keySet()) {
/* 508 */                           zzhs zzhsVar2 = zzhsVar;
/* 516 */                           if (str5.startsWith("gad_")) {
/* 518 */                               bundle2.remove(str5);
                                    }
/* 523 */                           zzhsVar = zzhsVar2;
                                }
                            } else {
/* 473 */                       bundle2 = bundle;
                            }
/* 476 */                   zzhs zzhsVar3 = zzhsVar;
/* 526 */                   up3Var.m9090K(bundle3, bundle2);
/* 554 */                   oe3 oe3Var = new oe3((ij3) ae3Var.f16749a, string, str4, zzhsVar3.zzd(), zzhsVar3.zzf(), zzhsVar3.zzh(), bundle3);
/* 557 */                   j = xd3Var.f19040a;
/* 559 */                   long j2 = xd3Var.f19041b;
/* 561 */                   boolean z = xd3Var.f19042c;
/* 563 */                   ae3Var.mo1375y();
/* 566 */                   ae3Var.m9593A();
/* 569 */                   str3 = oe3Var.f14727a;
/* 571 */                   kb1.m6058k(str3);
/* 574 */                   ci3 ci3Var2 = mp3Var.f13923i;
/* 576 */                   mp3.m6728S(ci3Var2);
/* 583 */                   byte[] bArrZzcc = ci3Var2.m1688b0(oe3Var).zzcc();
/* 589 */                   contentValues = new ContentValues();
/* 594 */                   contentValues.put("app_id", str3);
/* 601 */                   contentValues.put("name", oe3Var.f14728b);
/* 612 */                   contentValues.put("timestamp", Long.valueOf(oe3Var.f14730d));
/* 621 */                   contentValues.put("metadata_fingerprint", Long.valueOf(j2));
/* 626 */                   contentValues.put(SharedDataContentProvider.BASE_PATH, bArrZzcc);
/* 635 */                   contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
/* 685 */                   ae3Var = this;
/* 687 */                   str4 = str;
                        }
/* 711 */               listM4228f = hh2Var.m4228f();
/* 715 */               ae3Var = this;
/* 717 */               str4 = str;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:24:0x005e  */
                /* JADX WARN: Code duplicated, block: B:26:0x0061 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:28:0x0064  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0 */
                /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r2v2 */
                /* JADX WARN: Type inference failed for: r3v0, types: [ae3, sq3, wo3] */
                /* JADX WARN: Type inference failed for: r3v3 */
                /* JADX WARN: Type inference failed for: r3v4 */
                /* JADX WARN: Type inference failed for: r3v5 */
                /* JADX WARN: Type inference failed for: r3v7, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
                /* JADX INFO: renamed from: U */
                public final ok3 m241U(String str) {
                    Throwable th;
                    SQLiteException e;
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             kb1.m6061n(str);
/* 8 */             mo1375y();
/* 11 */            m9593A();
/* 20 */            ?? r2 = 0;
/* 20 */            ok3VarM7182c = null;
/* 20 */            ok3VarM7182c = null;
/* 20 */            ok3 ok3VarM7182c = null;
                    try {
                        try {
/* 25 */                    this = m261q0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
                            try {
/* 33 */                        if (this.moveToFirst()) {
/* 65 */                            ok3VarM7182c = ok3.m7182c(this.getInt(1), this.getString(0));
                                } else {
/* 35 */                            uh3 uh3Var = ij3Var.f9655f;
/* 37 */                            ij3.m4555l(uh3Var);
/* 44 */                            uh3Var.f17534Y.m8510a("No data found");
                                }
                            } catch (SQLiteException e2) {
/* 53 */                        e = e2;
/* 78 */                        uh3 uh3Var2 = ij3Var.f9655f;
/* 80 */                        ij3.m4555l(uh3Var2);
/* 87 */                        uh3Var2.f17538f.m8511b(e, "Error querying database.");
/* 90 */                        if (this != 0) {
                                }
/* 93 */                        if (ok3VarM7182c == null) {
/* 95 */                            return ok3.f14791c;
                                }
/* 98 */                        return ok3VarM7182c;
                            }
                        } catch (Throwable th2) {
/* 51 */                    th = th2;
/* 70 */                    r2 = this;
/* 99 */                    if (r2 != 0) {
/* 101 */                       r2.close();
                            }
/* 104 */                   throw th;
                        }
                    } catch (SQLiteException e3) {
/* 76 */                e = e3;
/* 77 */                this = 0;
                    } catch (Throwable th3) {
/* 73 */                th = th3;
/* 99 */                if (r2 != 0) {
/* 101 */                   r2.close();
                        }
/* 104 */               throw th;
                    }
/* 47 */            this.close();
/* 93 */            if (ok3VarM7182c == null) {
/* 95 */                return ok3.f14791c;
                    }
/* 98 */            return ok3VarM7182c;
                }

                /* JADX INFO: renamed from: V */
                public final long m242V(String str, String[] strArr) {
/* 5 */             Cursor cursor = null;
                    try {
                        try {
/* 6 */                     Cursor cursorRawQuery = m261q0().rawQuery(str, strArr);
/* 14 */                    if (!cursorRawQuery.moveToFirst()) {
/* 32 */                        throw new SQLiteException("Database returned empty set");
                            }
/* 17 */                    long j = cursorRawQuery.getLong(0);
/* 21 */                    cursorRawQuery.close();
/* 24 */                    return j;
                        } catch (SQLiteException e) {
/* 40 */                    uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 42 */                    ij3.m4555l(uh3Var);
/* 49 */                    uh3Var.f17538f.m8512c(str, "Database error", e);
/* 52 */                    throw e;
                        }
                    } catch (Throwable th) {
/* 53 */                if (0 != 0) {
/* 55 */                    cursor.close();
                        }
/* 58 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: W */
                public final long m243W(String str, String[] strArr, long j) {
/* 5 */             Cursor cursorRawQuery = null;
                    try {
                        try {
/* 6 */                     cursorRawQuery = m261q0().rawQuery(str, strArr);
/* 14 */                    if (cursorRawQuery.moveToFirst()) {
/* 17 */                        j = cursorRawQuery.getLong(0);
                            }
/* 21 */                    cursorRawQuery.close();
/* 24 */                    return j;
                        } catch (SQLiteException e) {
/* 32 */                    uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 34 */                    ij3.m4555l(uh3Var);
/* 41 */                    uh3Var.f17538f.m8512c(str, "Database error", e);
/* 44 */                    throw e;
                        }
                    } catch (Throwable th) {
/* 45 */                if (cursorRawQuery != null) {
/* 47 */                    cursorRawQuery.close();
                        }
/* 50 */                throw th;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0034  */
                /* JADX INFO: renamed from: X */
                public final String m244X(String str, String[] strArr) {
/* 5 */             Cursor cursorRawQuery = null;
                    try {
                        try {
/* 6 */                     cursorRawQuery = m261q0().rawQuery(str, strArr);
/* 14 */                    if (!cursorRawQuery.moveToFirst()) {
/* 25 */                        cursorRawQuery.close();
/* 28 */                        return HttpUrl.FRAGMENT_ENCODE_SET;
                            }
/* 17 */                    String string = cursorRawQuery.getString(0);
/* 21 */                    cursorRawQuery.close();
/* 24 */                    return string;
                        } catch (SQLiteException e) {
/* 38 */                    uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 40 */                    ij3.m4555l(uh3Var);
/* 47 */                    uh3Var.f17538f.m8512c(str, "Database error", e);
/* 50 */                    throw e;
                        }
                    } catch (Throwable th) {
/* 51 */                if (cursorRawQuery != null) {
/* 53 */                    cursorRawQuery.close();
                        }
/* 56 */                throw th;
                    }
/* 51 */            if (cursorRawQuery != null) {
/* 53 */                cursorRawQuery.close();
                    }
/* 56 */            throw th;
                }

                /* JADX INFO: renamed from: Y */
                public final void m245Y(ContentValues contentValues) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
                    try {
/* 11 */                SQLiteDatabase sQLiteDatabaseM261q0 = m261q0();
/* 15 */                String asString = contentValues.getAsString("app_id");
/* 19 */                if (asString == null) {
/* 21 */                    uh3 uh3Var = ij3Var.f9655f;
/* 23 */                    ij3.m4555l(uh3Var);
/* 34 */                    uh3Var.f17540v.m8511b(uh3.m9013H("app_id"), "Value of the primary key is not set.");
/* 37 */                    return;
                        }
/* 44 */                StringBuilder sb = new StringBuilder(10);
/* 47 */                sb.append("app_id = ?");
/* 67 */                if (sQLiteDatabaseM261q0.update("consent_settings", contentValues, sb.toString(), new String[]{asString}) == 0 && sQLiteDatabaseM261q0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
/* 81 */                    uh3 uh3Var2 = ij3Var.f9655f;
/* 83 */                    ij3.m4555l(uh3Var2);
/* 98 */                    uh3Var2.f17538f.m8512c(uh3.m9013H("consent_settings"), "Failed to insert/update table (got -1). key", uh3.m9013H("app_id"));
                        }
                    } catch (SQLiteException e) {
/* 102 */               uh3 uh3Var3 = ij3Var.f9655f;
/* 104 */               ij3.m4555l(uh3Var3);
/* 119 */               uh3Var3.f17538f.m8513d("Error storing into table. key", uh3.m9013H("consent_settings"), uh3.m9013H("app_id"), e);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:54:0x0129  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v3 */
                /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r3v5 */
                /* JADX INFO: renamed from: Z */
                public final pe3 m246Z(String str, String str2, String str3) {
                    Cursor cursorQuery;
                    Boolean boolValueOf;
/* 5 */             ij3 ij3Var = (ij3) this.f16749a;
/* 7 */             kb1.m6058k(str2);
/* 10 */            kb1.m6058k(str3);
/* 13 */            mo1375y();
/* 16 */            m9593A();
/* 47 */            ArrayList arrayList = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
/* 50 */            ?? r3 = 0;
                    try {
                        try {
/* 76 */                    cursorQuery = m261q0().query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                            try {
/* 84 */                        if (cursorQuery.moveToFirst()) {
/* 88 */                            long j = cursorQuery.getLong(0);
/* 93 */                            long j2 = cursorQuery.getLong(1);
/* 98 */                            long j3 = cursorQuery.getLong(2);
/* 107 */                           long j4 = 0;
/* 114 */                           long j5 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
/* 134 */                           Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
/* 154 */                           Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
/* 174 */                           Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
/* 185 */                           if (cursorQuery.isNull(7)) {
/* 207 */                               boolValueOf = null;
                                    } else {
/* 198 */                               boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                                    }
/* 215 */                           if (!cursorQuery.isNull(8)) {
/* 218 */                               j4 = cursorQuery.getLong(8);
                                    }
/* 228 */                           pe3 pe3Var = new pe3(str2, str3, j, j2, j4, j3, j5, lValueOf, lValueOf2, lValueOf3, boolValueOf);
/* 235 */                           if (cursorQuery.moveToNext()) {
/* 237 */                               uh3 uh3Var = ij3Var.f9655f;
/* 239 */                               ij3.m4555l(uh3Var);
/* 250 */                               uh3Var.f17538f.m8511b(uh3.m9013H(str2), "Got multiple records for event aggregates, expected one. appId");
                                    }
/* 256 */                           cursorQuery.close();
/* 259 */                           return pe3Var;
                                }
                            } catch (SQLiteException e) {
/* 254 */                       e = e;
/* 266 */                       uh3 uh3Var2 = ij3Var.f9655f;
/* 268 */                       ij3.m4555l(uh3Var2);
/* 287 */                       uh3Var2.f17538f.m8513d("Error querying events. appId", uh3.m9013H(str2), ij3Var.f9639U.m6656a(str3), e);
                            }
                        } catch (Throwable th) {
/* 205 */                   th = th;
/* 260 */                   r3 = arrayList;
/* 296 */                   if (r3 != 0) {
/* 298 */                       r3.close();
                            }
/* 301 */                   throw th;
                        }
                    } catch (SQLiteException e2) {
/* 264 */               e = e2;
/* 265 */               cursorQuery = null;
                    } catch (Throwable th2) {
/* 262 */               th = th2;
/* 296 */               if (r3 != 0) {
/* 298 */                   r3.close();
                        }
/* 301 */               throw th;
                    }
/* 290 */           if (cursorQuery != null) {
/* 292 */               cursorQuery.close();
                    }
/* 50 */            return null;
                }

                /* JADX INFO: renamed from: a0 */
                public final void m247a0(String str, pe3 pe3Var) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             kb1.m6061n(pe3Var);
/* 8 */             mo1375y();
/* 11 */            m9593A();
/* 16 */            ContentValues contentValues = new ContentValues();
/* 19 */            String str2 = pe3Var.f15080a;
/* 23 */            contentValues.put("app_id", str2);
/* 30 */            contentValues.put("name", pe3Var.f15081b);
/* 41 */            contentValues.put("lifetime_count", Long.valueOf(pe3Var.f15082c));
/* 52 */            contentValues.put("current_bundle_count", Long.valueOf(pe3Var.f15083d));
/* 63 */            contentValues.put("last_fire_timestamp", Long.valueOf(pe3Var.f15085f));
/* 74 */            contentValues.put("last_bundled_timestamp", Long.valueOf(pe3Var.f15086g));
/* 81 */            contentValues.put("last_bundled_day", pe3Var.f15087h);
/* 88 */            contentValues.put("last_sampled_complex_event_id", pe3Var.f15088i);
/* 95 */            contentValues.put("last_sampling_rate", pe3Var.f15089j);
/* 106 */           contentValues.put("current_session_count", Long.valueOf(pe3Var.f15084e));
/* 109 */           Boolean bool = pe3Var.f15090k;
/* 130 */           contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
                    try {
/* 146 */               if (m261q0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
/* 148 */                   uh3 uh3Var = ij3Var.f9655f;
/* 150 */                   ij3.m4555l(uh3Var);
/* 161 */                   uh3Var.f17538f.m8511b(uh3.m9013H(str2), "Failed to insert/update event aggregates (got -1). appId");
                        }
                    } catch (SQLiteException e) {
/* 168 */               uh3 uh3Var2 = ij3Var.f9655f;
/* 170 */               ij3.m4555l(uh3Var2);
/* 181 */               uh3Var2.f17538f.m8512c(uh3.m9013H(str2), "Error storing event aggregates. appId", e);
                    }
                }

                /* JADX INFO: renamed from: b0 */
                public final void m248b0(String str, String str2) {
/* 1 */             kb1.m6058k(str2);
/* 4 */             mo1375y();
/* 7 */             m9593A();
                    try {
/* 20 */                m261q0().delete(str, "app_id=?", new String[]{str2});
                    } catch (SQLiteException e) {
/* 29 */                uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 31 */                ij3.m4555l(uh3Var);
/* 42 */                uh3Var.f17538f.m8512c(uh3.m9013H(str2), "Error deleting snapshot. appId", e);
                    }
                }

                /* JADX INFO: renamed from: c0 */
                public final pp3 m249c0(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
                    zl3 zl3Var;
/* 10 */            ij3 ij3Var = (ij3) this.f16749a;
/* 17 */            if (TextUtils.isEmpty(str2)) {
/* 19 */                uh3 uh3Var = ij3Var.f9655f;
/* 21 */                ij3.m4555l(uh3Var);
/* 28 */                uh3Var.f17533X.m8510a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
/* 16 */                return null;
                    }
                    try {
/* 42 */                zzhz zzhzVar = (zzhz) ci3.m1677m0(zzib.zzh(), bArr);
/* 44 */                zl3[] zl3VarArrValues = zl3.values();
/* 48 */                int length = zl3VarArrValues.length;
/* 50 */                int i3 = 0;
                        while (true) {
/* 51 */                    if (i3 >= length) {
/* 65 */                        zl3Var = zl3.UNKNOWN;
                                break;
                            }
/* 53 */                    zl3Var = zl3VarArrValues[i3];
/* 59 */                    if (zl3Var.f20243a == i) {
                                break;
                            }
/* 62 */                    i3++;
                        }
/* 69 */                if (zl3Var != zl3.GOOGLE_SIGNAL && zl3Var != zl3.GOOGLE_SIGNAL_PENDING && i2 > 0) {
/* 79 */                    ArrayList arrayList = new ArrayList();
/* 86 */                    Iterator it = zzhzVar.zza().iterator();
/* 94 */                    while (it.hasNext()) {
/* 106 */                       zzic zzicVar = (zzic) ((zzid) it.next()).zzcl();
/* 108 */                       zzicVar.zzao(i2);
/* 117 */                       arrayList.add((zzid) zzicVar.zzbc());
                            }
/* 123 */                   zzhzVar.zzg();
/* 126 */                   zzhzVar.zzf(arrayList);
                        }
/* 131 */               HashMap map = new HashMap();
/* 134 */               if (str3 != null) {
/* 144 */                   for (String str4 : str3.split("\r\n")) {
/* 152 */                       if (str4.isEmpty()) {
                                    break;
                                }
/* 158 */                       String[] strArrSplit = str4.split("=", 2);
/* 163 */                       if (strArrSplit.length != 2) {
/* 165 */                           uh3 uh3Var2 = ij3Var.f9655f;
/* 167 */                           ij3.m4555l(uh3Var2);
/* 174 */                           uh3Var2.f17538f.m8511b(str4, "Invalid upload header: ");
                                    break;
                                }
/* 183 */                       map.put(strArrSplit[0], strArrSplit[1]);
                            }
                        }
/* 208 */               return new pp3(j, (zzib) zzhzVar.zzbc(), str2, map, zl3Var, j2, j3, j4, i2);
                    } catch (IOException e) {
/* 212 */               uh3 uh3Var3 = ij3Var.f9655f;
/* 214 */               ij3.m4555l(uh3Var3);
/* 223 */               uh3Var3.f17538f.m8512c(str, "Failed to queued MeasurementBatch from upload_queue. appId", e);
/* 16 */                return null;
                    }
                }

                /* JADX INFO: renamed from: d0 */
                public final String m250d0() {
/* 7 */             ((ij3) this.f16749a).f9640V.getClass();
/* 10 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 14 */            Locale locale = Locale.US;
/* 23 */            Long l = (Long) vg3.f18099S.m9011a(null);
/* 25 */            l.getClass();
/* 51 */            String str = "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l + ")";
/* 63 */            long jLongValue = ((Long) vg3.f18097R.m9011a(null)).longValue();
/* 71 */            StringBuilder sb = new StringBuilder("(upload_type != 1 AND ABS(creation_timestamp - ");
/* 74 */            sb.append(jCurrentTimeMillis);
/* 77 */            sb.append(") > ");
/* 80 */            String strM3787m = fm0.m3787m(sb, jLongValue, ")");
/* 99 */            StringBuilder sb2 = new StringBuilder(str.length() + 5 + strM3787m.length() + 1);
/* 106 */           fm0.m3796v(sb2, "(", str, " OR ", strM3787m);
/* 109 */           sb2.append(")");
/* 112 */           return sb2.toString();
                }

                /* JADX INFO: renamed from: f0 */
                public final void m251f0(String str, zzog zzogVar) {
/* 1 */             mo1375y();
/* 4 */             m9593A();
/* 7 */             kb1.m6058k(str);
/* 12 */            ij3 ij3Var = (ij3) this.f16749a;
/* 14 */            xt0 xt0Var = ij3Var.f9640V;
/* 16 */            uh3 uh3Var = ij3Var.f9655f;
/* 18 */            xt0Var.getClass();
/* 21 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 25 */            ug3 ug3Var = vg3.f18168v0;
/* 38 */            long jLongValue = jCurrentTimeMillis - ((Long) ug3Var.m9011a(null)).longValue();
/* 40 */            long j = zzogVar.f4216b;
/* 44 */            if (j < jLongValue || j > ((Long) ug3Var.m9011a(null)).longValue() + jCurrentTimeMillis) {
/* 61 */                ij3.m4555l(uh3Var);
/* 80 */                uh3Var.f17541w.m8513d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", uh3.m9013H(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
                    }
/* 83 */            ij3.m4555l(uh3Var);
/* 90 */            uh3Var.f17534Y.m8510a("Saving trigger URI");
/* 95 */            ContentValues contentValues = new ContentValues();
/* 100 */           contentValues.put("app_id", str);
/* 107 */           contentValues.put("trigger_uri", zzogVar.f4215a);
/* 118 */           contentValues.put(FirebaseAnalytics.Param.SOURCE, Integer.valueOf(zzogVar.f4217c));
/* 127 */           contentValues.put("timestamp_millis", Long.valueOf(j));
                    try {
/* 144 */               if (m261q0().insert("trigger_uris", null, contentValues) == -1) {
/* 146 */                   ij3.m4555l(uh3Var);
/* 157 */                   uh3Var.f17538f.m8511b(uh3.m9013H(str), "Failed to insert trigger URI (got -1). appId");
                        }
                    } catch (SQLiteException e) {
/* 164 */               ij3.m4555l(uh3Var);
/* 175 */               uh3Var.f17538f.m8512c(uh3.m9013H(str), "Error storing trigger URI. appId", e);
                    }
                }

                /* JADX INFO: renamed from: g0 */
                public final void m252g0(String str, ok3 ok3Var) {
/* 1 */             kb1.m6061n(str);
/* 4 */             kb1.m6061n(ok3Var);
/* 7 */             mo1375y();
/* 10 */            m9593A();
/* 15 */            ContentValues contentValues = new ContentValues();
/* 20 */            contentValues.put("app_id", str);
/* 29 */            contentValues.put("consent_state", ok3Var.m7188g());
/* 40 */            contentValues.put("consent_source", Integer.valueOf(ok3Var.f14793b));
/* 43 */            m245Y(contentValues);
                }

                /* JADX INFO: renamed from: h0 */
                public final void m253h0(String str, ok3 ok3Var) {
/* 1 */             kb1.m6061n(str);
/* 4 */             mo1375y();
/* 7 */             m9593A();
/* 14 */            m252g0(str, m241U(str));
/* 19 */            ContentValues contentValues = new ContentValues();
/* 24 */            contentValues.put("app_id", str);
/* 33 */            contentValues.put("storage_consent_at_bundling", ok3Var.m7188g());
/* 36 */            m245Y(contentValues);
                }

                /* JADX INFO: renamed from: i0 */
                public final ok3 m254i0(String str) {
/* 1 */             kb1.m6061n(str);
/* 4 */             mo1375y();
/* 7 */             m9593A();
/* 22 */            return ok3.m7182c(100, m244X("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
                }

                /* JADX INFO: renamed from: j0 */
                public final pe3 m255j0(String str, zzhs zzhsVar, String str2) {
/* 11 */            pe3 pe3VarM246Z = m246Z("events", str, zzhsVar.zzd());
/* 15 */            if (pe3VarM246Z != null) {
/* 79 */                long j = pe3VarM246Z.f15084e + 1;
/* 83 */                long j2 = pe3VarM246Z.f15083d + 1;
/* 118 */               return new pe3(pe3VarM246Z.f15080a, pe3VarM246Z.f15081b, pe3VarM246Z.f15082c + 1, j2, j, pe3VarM246Z.f15085f, pe3VarM246Z.f15086g, pe3VarM246Z.f15087h, pe3VarM246Z.f15088i, pe3VarM246Z.f15089j, pe3VarM246Z.f15090k);
                    }
/* 19 */            ij3 ij3Var = (ij3) this.f16749a;
/* 21 */            uh3 uh3Var = ij3Var.f9655f;
/* 23 */            ij3.m4555l(uh3Var);
/* 42 */            uh3Var.f17541w.m8512c(uh3.m9013H(str), "Event aggregate wasn't created during raw event logging. appId, event", ij3Var.f9639U.m6656a(str2));
/* 71 */            return new pe3(str, zzhsVar.zzd(), 1L, 1L, 1L, zzhsVar.zzf(), 0L, null, null, null, null);
                }

                /* JADX INFO: renamed from: k0 */
                public final boolean m256k0() {
/* 13 */            return ((ij3) this.f16749a).f9645a.getDatabasePath("google_app_measurement.db").exists();
                }

                /* JADX WARN: Code duplicated, block: B:42:0x00ea A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00cb, B:42:0x00ea, B:43:0x00fc, B:44:0x0100, B:45:0x0110, B:47:0x0116, B:48:0x0126, B:50:0x0132, B:53:0x0146, B:55:0x0164, B:56:0x016d, B:57:0x0177, B:62:0x01a4, B:61:0x0194, B:65:0x01ab, B:52:0x013f, B:67:0x01bd, B:71:0x01d0, B:11:0x003d, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:78:0x0017 }] */
                /* JADX WARN: Code duplicated, block: B:43:0x00fc A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TRY_LEAVE, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00cb, B:42:0x00ea, B:43:0x00fc, B:44:0x0100, B:45:0x0110, B:47:0x0116, B:48:0x0126, B:50:0x0132, B:53:0x0146, B:55:0x0164, B:56:0x016d, B:57:0x0177, B:62:0x01a4, B:61:0x0194, B:65:0x01ab, B:52:0x013f, B:67:0x01bd, B:71:0x01d0, B:11:0x003d, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:78:0x0017 }] */
                /* JADX WARN: Code duplicated, block: B:47:0x0116 A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00cb, B:42:0x00ea, B:43:0x00fc, B:44:0x0100, B:45:0x0110, B:47:0x0116, B:48:0x0126, B:50:0x0132, B:53:0x0146, B:55:0x0164, B:56:0x016d, B:57:0x0177, B:62:0x01a4, B:61:0x0194, B:65:0x01ab, B:52:0x013f, B:67:0x01bd, B:71:0x01d0, B:11:0x003d, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:78:0x0017 }] */
                /* JADX WARN: Code duplicated, block: B:50:0x0132 A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00cb, B:42:0x00ea, B:43:0x00fc, B:44:0x0100, B:45:0x0110, B:47:0x0116, B:48:0x0126, B:50:0x0132, B:53:0x0146, B:55:0x0164, B:56:0x016d, B:57:0x0177, B:62:0x01a4, B:61:0x0194, B:65:0x01ab, B:52:0x013f, B:67:0x01bd, B:71:0x01d0, B:11:0x003d, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:78:0x0017 }] */
                /* JADX WARN: Code duplicated, block: B:52:0x013f A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00cb, B:42:0x00ea, B:43:0x00fc, B:44:0x0100, B:45:0x0110, B:47:0x0116, B:48:0x0126, B:50:0x0132, B:53:0x0146, B:55:0x0164, B:56:0x016d, B:57:0x0177, B:62:0x01a4, B:61:0x0194, B:65:0x01ab, B:52:0x013f, B:67:0x01bd, B:71:0x01d0, B:11:0x003d, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:78:0x0017 }] */
                /* JADX WARN: Code duplicated, block: B:55:0x0164 A[Catch: all -> 0x007a, SQLiteException -> 0x007d, LOOP:0: B:55:0x0164->B:90:?, LOOP_START, TRY_LEAVE, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00cb, B:42:0x00ea, B:43:0x00fc, B:44:0x0100, B:45:0x0110, B:47:0x0116, B:48:0x0126, B:50:0x0132, B:53:0x0146, B:55:0x0164, B:56:0x016d, B:57:0x0177, B:62:0x01a4, B:61:0x0194, B:65:0x01ab, B:52:0x013f, B:67:0x01bd, B:71:0x01d0, B:11:0x003d, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:78:0x0017 }] */
                /* JADX WARN: Code duplicated, block: B:62:0x01a4 A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00cb, B:42:0x00ea, B:43:0x00fc, B:44:0x0100, B:45:0x0110, B:47:0x0116, B:48:0x0126, B:50:0x0132, B:53:0x0146, B:55:0x0164, B:56:0x016d, B:57:0x0177, B:62:0x01a4, B:61:0x0194, B:65:0x01ab, B:52:0x013f, B:67:0x01bd, B:71:0x01d0, B:11:0x003d, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:78:0x0017 }] */
                /* JADX WARN: Code duplicated, block: B:65:0x01ab A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00cb, B:42:0x00ea, B:43:0x00fc, B:44:0x0100, B:45:0x0110, B:47:0x0116, B:48:0x0126, B:50:0x0132, B:53:0x0146, B:55:0x0164, B:56:0x016d, B:57:0x0177, B:62:0x01a4, B:61:0x0194, B:65:0x01ab, B:52:0x013f, B:67:0x01bd, B:71:0x01d0, B:11:0x003d, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:78:0x0017 }] */
                /* JADX WARN: Code duplicated, block: B:88:0x0192 A[SYNTHETIC] */
                /* JADX INFO: renamed from: l0 */
                public final void m257l0(String str, long j, long j2, ji3 ji3Var) {
                    String string;
                    String[] strArr;
                    String string2;
                    String str2;
                    String[] strArr2;
                    long j3;
                    zzhr zzhrVar;
/* 7 */             ij3 ij3Var = (ij3) this.f16749a;
/* 9 */             mo1375y();
/* 12 */            m9593A();
/* 21 */            String str3 = "select app_id, metadata_fingerprint from raw_events where ";
/* 23 */            Cursor cursorRawQuery = null;
                    try {
                        try {
/* 24 */                    SQLiteDatabase sQLiteDatabaseM261q0 = m261q0();
/* 28 */                    boolean zIsEmpty = TextUtils.isEmpty(str);
/* 33 */                    String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 38 */                    if (zIsEmpty) {
/* 66 */                        String[] strArr3 = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
/* 70 */                        if (j2 != -1) {
/* 72 */                            str4 = "rowid <= ? and ";
                                }
/* 82 */                        StringBuilder sb = new StringBuilder(str4.length() + 148);
/* 85 */                        sb.append("select app_id, metadata_fingerprint from raw_events where ");
/* 88 */                        sb.append(str4);
/* 91 */                        sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
/* 98 */                        cursorRawQuery = sQLiteDatabaseM261q0.rawQuery(sb.toString(), strArr3);
                                try {
/* 106 */                           if (cursorRawQuery.moveToFirst()) {
/* 110 */                               string = cursorRawQuery.getString(0);
                                        try {
/* 114 */                                   string2 = cursorRawQuery.getString(1);
/* 118 */                                   cursorRawQuery.close();
/* 225 */                                   cursorRawQuery = sQLiteDatabaseM261q0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string, string2}, null, null, "rowid", "2");
/* 233 */                                   if (cursorRawQuery.moveToFirst()) {
                                                try {
/* 271 */                                           zzid zzidVar = (zzid) ((zzic) ci3.m1677m0(zzid.zzaE(), cursorRawQuery.getBlob(0))).zzbc();
/* 277 */                                           if (cursorRawQuery.moveToNext()) {
/* 279 */                                               uh3 uh3Var = ij3Var.f9655f;
/* 281 */                                               ij3.m4555l(uh3Var);
/* 292 */                                               uh3Var.f17541w.m8511b(uh3.m9013H(string), "Get multiple raw event metadata records, expected one. appId");
                                                    }
/* 295 */                                           cursorRawQuery.close();
/* 298 */                                           kb1.m6061n(zzidVar);
/* 301 */                                           ji3Var.f12320b = zzidVar;
/* 305 */                                           if (j2 != -1) {
/* 307 */                                               str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
/* 313 */                                               strArr2 = new String[]{string, string2, String.valueOf(j2)};
                                                    } else {
/* 320 */                                               str2 = "app_id = ? and metadata_fingerprint = ?";
/* 322 */                                               strArr2 = new String[]{string, string2};
                                                    }
/* 347 */                                           cursorRawQuery = sQLiteDatabaseM261q0.query("raw_events", new String[]{"rowid", "name", "timestamp", SharedDataContentProvider.BASE_PATH}, str2, strArr2, null, null, "rowid", null);
/* 355 */                                           if (cursorRawQuery.moveToFirst()) {
/* 425 */                                               do {
/* 357 */                                                   j3 = cursorRawQuery.getLong(0);
                                                            try {
/* 374 */                                                       zzhrVar = (zzhr) ci3.m1677m0(zzhs.zzk(), cursorRawQuery.getBlob(3));
/* 380 */                                                       zzhrVar.zzl(cursorRawQuery.getString(1));
/* 388 */                                                       zzhrVar.zzo(cursorRawQuery.getLong(2));
/* 401 */                                                       if (!ji3Var.m5839a(j3, (zzhs) zzhrVar.zzbc())) {
                                                                    break;
                                                                }
                                                            } catch (IOException e) {
/* 405 */                                                       uh3 uh3Var2 = ij3Var.f9655f;
/* 407 */                                                       ij3.m4555l(uh3Var2);
/* 418 */                                                       uh3Var2.f17538f.m8512c(uh3.m9013H(string), "Data loss. Failed to merge raw event. appId", e);
                                                            }
/* 425 */                                               } while (cursorRawQuery.moveToNext());
                                                    } else {
/* 428 */                                               uh3 uh3Var3 = ij3Var.f9655f;
/* 430 */                                               ij3.m4555l(uh3Var3);
/* 441 */                                               uh3Var3.f17541w.m8511b(uh3.m9013H(string), "Raw event data disappeared while in transaction. appId");
                                                    }
                                                } catch (IOException e2) {
/* 446 */                                           uh3 uh3Var4 = ij3Var.f9655f;
/* 448 */                                           ij3.m4555l(uh3Var4);
/* 459 */                                           uh3Var4.f17538f.m8512c(uh3.m9013H(string), "Data loss. Failed to merge raw event metadata. appId", e2);
                                                }
                                            } else {
/* 235 */                                       uh3 uh3Var5 = ij3Var.f9655f;
/* 237 */                                       ij3.m4555l(uh3Var5);
/* 248 */                                       uh3Var5.f17538f.m8511b(uh3.m9013H(string), "Raw event metadata record is missing. appId");
                                            }
                                        } catch (SQLiteException e3) {
/* 126 */                                   e = e3;
/* 465 */                                   uh3 uh3Var6 = ij3Var.f9655f;
/* 467 */                                   ij3.m4555l(uh3Var6);
/* 478 */                                   uh3Var6.f17538f.m8512c(uh3.m9013H(string), "Data loss. Error selecting raw event. appId", e);
                                        }
                                    }
                                } catch (SQLiteException e4) {
/* 129 */                           e = e4;
/* 130 */                           string = str;
                                }
                            } else {
                                try {
/* 136 */                           if (j2 != -1) {
/* 142 */                               str3 = str;
/* 144 */                               strArr = new String[]{str3, String.valueOf(j2)};
                                    } else {
/* 149 */                               str3 = str;
/* 151 */                               strArr = new String[]{str3};
                                    }
/* 155 */                           if (j2 != -1) {
/* 157 */                               str4 = " and rowid <= ?";
                                    }
/* 167 */                           StringBuilder sb2 = new StringBuilder(str4.length() + 84);
/* 170 */                           sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
/* 173 */                           sb2.append(str4);
/* 176 */                           sb2.append(" order by rowid limit 1;");
/* 183 */                           cursorRawQuery = sQLiteDatabaseM261q0.rawQuery(sb2.toString(), strArr);
/* 191 */                           if (cursorRawQuery.moveToFirst()) {
/* 195 */                               string2 = cursorRawQuery.getString(0);
/* 199 */                               cursorRawQuery.close();
/* 202 */                               string = str3;
/* 225 */                               cursorRawQuery = sQLiteDatabaseM261q0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string, string2}, null, null, "rowid", "2");
/* 233 */                               if (cursorRawQuery.moveToFirst()) {
/* 235 */                                   uh3 uh3Var7 = ij3Var.f9655f;
/* 237 */                                   ij3.m4555l(uh3Var7);
/* 248 */                                   uh3Var7.f17538f.m8511b(uh3.m9013H(string), "Raw event metadata record is missing. appId");
                                        } else {
/* 271 */                                   zzid zzidVar2 = (zzid) ((zzic) ci3.m1677m0(zzid.zzaE(), cursorRawQuery.getBlob(0))).zzbc();
/* 277 */                                   if (cursorRawQuery.moveToNext()) {
/* 279 */                                       uh3 uh3Var8 = ij3Var.f9655f;
/* 281 */                                       ij3.m4555l(uh3Var8);
/* 292 */                                       uh3Var8.f17541w.m8511b(uh3.m9013H(string), "Get multiple raw event metadata records, expected one. appId");
                                            }
/* 295 */                                   cursorRawQuery.close();
/* 298 */                                   kb1.m6061n(zzidVar2);
/* 301 */                                   ji3Var.f12320b = zzidVar2;
/* 305 */                                   if (j2 != -1) {
/* 307 */                                       str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
/* 313 */                                       strArr2 = new String[]{string, string2, String.valueOf(j2)};
                                            } else {
/* 320 */                                       str2 = "app_id = ? and metadata_fingerprint = ?";
/* 322 */                                       strArr2 = new String[]{string, string2};
                                            }
/* 347 */                                   cursorRawQuery = sQLiteDatabaseM261q0.query("raw_events", new String[]{"rowid", "name", "timestamp", SharedDataContentProvider.BASE_PATH}, str2, strArr2, null, null, "rowid", null);
/* 355 */                                   if (cursorRawQuery.moveToFirst()) {
/* 425 */                                       do {
/* 357 */                                           j3 = cursorRawQuery.getLong(0);
/* 374 */                                           zzhrVar = (zzhr) ci3.m1677m0(zzhs.zzk(), cursorRawQuery.getBlob(3));
/* 380 */                                           zzhrVar.zzl(cursorRawQuery.getString(1));
/* 388 */                                           zzhrVar.zzo(cursorRawQuery.getLong(2));
/* 401 */                                           if (!ji3Var.m5839a(j3, (zzhs) zzhrVar.zzbc())) {
                                                        break;
                                                        break;
                                                    }
/* 425 */                                       } while (cursorRawQuery.moveToNext());
                                            } else {
/* 428 */                                       uh3 uh3Var9 = ij3Var.f9655f;
/* 430 */                                       ij3.m4555l(uh3Var9);
/* 441 */                                       uh3Var9.f17541w.m8511b(uh3.m9013H(string), "Raw event data disappeared while in transaction. appId");
                                            }
                                        }
                                    }
                                } catch (SQLiteException e5) {
/* 463 */                           e = e5;
/* 464 */                           string = str3;
/* 465 */                           uh3 uh3Var10 = ij3Var.f9655f;
/* 467 */                           ij3.m4555l(uh3Var10);
/* 478 */                           uh3Var10.f17538f.m8512c(uh3.m9013H(string), "Data loss. Error selecting raw event. appId", e);
                                }
                            }
                        } catch (SQLiteException e6) {
/* 57 */                    e = e6;
/* 58 */                    str3 = str;
                        }
                    } finally {
/* 487 */               if (0 != 0) {
/* 489 */                   cursorRawQuery.close();
                        }
                    }
                }

                /* JADX INFO: renamed from: n0 */
                public final void m258n0() {
/* 1 */             m9593A();
/* 8 */             m261q0().beginTransaction();
                }

                /* JADX INFO: renamed from: o0 */
                public final void m259o0() {
/* 1 */             m9593A();
/* 8 */             m261q0().setTransactionSuccessful();
                }

                /* JADX INFO: renamed from: p0 */
                public final void m260p0() {
/* 1 */             m9593A();
/* 8 */             m261q0().endTransaction();
                }

                /* JADX INFO: renamed from: q0 */
                public final SQLiteDatabase m261q0() {
/* 1 */             mo1375y();
                    try {
/* 6 */                 return this.f215d.getWritableDatabase();
                    } catch (SQLiteException e) {
/* 16 */                uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 18 */                ij3.m4555l(uh3Var);
/* 25 */                uh3Var.f17541w.m8511b(e, "Error opening database");
/* 28 */                throw e;
                    }
                }

                /* JADX INFO: renamed from: r0 */
                public final void m262r0(String str) {
                    pe3 pe3VarM246Z;
/* 3 */             m248b0("events_snapshot", str);
/* 12 */            Cursor cursorQuery = null;
                    try {
                        try {
/* 38 */                    cursorQuery = m261q0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
/* 46 */                    if (cursorQuery.moveToFirst()) {
/* 75 */                        do {
/* 48 */                            String string = cursorQuery.getString(0);
/* 52 */                            if (string != null && (pe3VarM246Z = m246Z("events", str, string)) != null) {
/* 62 */                                m247a0("events_snapshot", pe3VarM246Z);
                                    }
/* 75 */                        } while (cursorQuery.moveToNext());
                            }
                        } catch (SQLiteException e) {
/* 82 */                    uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 84 */                    ij3.m4555l(uh3Var);
/* 95 */                    uh3Var.f17538f.m8512c(uh3.m9013H(str), "Error creating snapshot. appId", e);
                        }
                    } finally {
/* 104 */               if (cursorQuery != null) {
/* 106 */                   cursorQuery.close();
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
                /* JADX WARN: Code duplicated, block: B:55:0x00d7 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:56:0x00d9 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:7:0x0054  */
                /* JADX WARN: Code duplicated, block: B:9:0x005b  */
                /* JADX INFO: renamed from: s0 */
                public final void m263s0(String str) throws Throwable {
                    boolean z;
                    pe3 pe3VarM246Z;
/* 21 */            ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
/* 28 */            pe3 pe3VarM246Z2 = m246Z("events", str, "_f");
/* 34 */            pe3 pe3VarM246Z3 = m246Z("events", str, "_v");
/* 38 */            m248b0("events", str);
/* 41 */            Cursor cursorQuery = null;
/* 42 */            boolean z2 = false;
                    try {
/* 70 */                cursorQuery = m261q0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
/* 78 */                if (cursorQuery.moveToFirst()) {
/* 97 */                    boolean z3 = false;
/* 98 */                    z = false;
/* 149 */                   do {
                                try {
/* 99 */                            String string = cursorQuery.getString(0);
/* 112 */                           if (cursorQuery.getLong(1) >= 1) {
/* 118 */                               if ("_f".equals(string)) {
/* 120 */                                   z3 = true;
                                        } else if ("_v".equals(string)) {
/* 128 */                                   z = true;
                                        }
                                    }
/* 129 */                           if (string != null && (pe3VarM246Z = m246Z("events_snapshot", str, string)) != null) {
/* 137 */                               m247a0("events", pe3VarM246Z);
                                    }
                                } catch (SQLiteException e) {
/* 143 */                           e = e;
/* 154 */                           z2 = z3;
                                    try {
/* 165 */                               uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 167 */                               ij3.m4555l(uh3Var);
/* 178 */                               uh3Var.f17538f.m8512c(uh3.m9013H(str), "Error querying snapshot. appId", e);
/* 181 */                               z3 = z2;
                                    } catch (Throwable th) {
/* 201 */                               th = th;
/* 202 */                               if (cursorQuery != null) {
/* 204 */                                   cursorQuery.close();
                                        }
/* 207 */                               if (z2 && pe3VarM246Z2 != null) {
/* 212 */                                   m247a0("events", pe3VarM246Z2);
                                        } else if (!z && pe3VarM246Z3 != null) {
/* 220 */                                   m247a0("events", pe3VarM246Z3);
                                        }
/* 223 */                               m248b0("events_snapshot", str);
/* 226 */                               throw th;
                                    }
                                } catch (Throwable th2) {
/* 141 */                           th = th2;
/* 152 */                           z2 = z3;
/* 202 */                           if (cursorQuery != null) {
/* 204 */                               cursorQuery.close();
                                    }
/* 207 */                           if (z2) {
/* 216 */                               if (!z) {
/* 220 */                                   m247a0("events", pe3VarM246Z3);
                                        }
                                    } else if (!z) {
/* 220 */                               m247a0("events", pe3VarM246Z3);
                                    }
/* 223 */                           m248b0("events_snapshot", str);
/* 226 */                           throw th;
                                }
/* 149 */                   } while (cursorQuery.moveToNext());
/* 182 */                   if (cursorQuery != null) {
/* 184 */                       cursorQuery.close();
                            }
/* 187 */                   if (!z3 && pe3VarM246Z2 != null) {
/* 85 */                        m247a0("events", pe3VarM246Z2);
                            } else if (!z && pe3VarM246Z3 != null) {
/* 92 */                        m247a0("events", pe3VarM246Z3);
                            }
                        } else {
/* 80 */                    cursorQuery.close();
/* 83 */                    if (pe3VarM246Z2 != null) {
/* 85 */                        m247a0("events", pe3VarM246Z2);
                            } else if (pe3VarM246Z3 != null) {
/* 92 */                        m247a0("events", pe3VarM246Z3);
                            }
                        }
                    } catch (SQLiteException e2) {
/* 159 */               e = e2;
/* 160 */               z = false;
                    } catch (Throwable th3) {
/* 156 */               th = th3;
/* 157 */               z = false;
                    }
/* 197 */           m248b0("events_snapshot", str);
                }

                /* JADX INFO: renamed from: t0 */
                public final void m264t0(String str, String str2) {
/* 1 */             kb1.m6058k(str);
/* 4 */             kb1.m6058k(str2);
/* 7 */             mo1375y();
/* 10 */            m9593A();
                    try {
/* 25 */                m261q0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
                    } catch (SQLiteException e) {
/* 32 */                ij3 ij3Var = (ij3) this.f16749a;
/* 34 */                uh3 uh3Var = ij3Var.f9655f;
/* 36 */                ij3.m4555l(uh3Var);
/* 53 */                uh3Var.f17538f.m8513d("Error deleting user property. appId", uh3.m9013H(str), ij3Var.f9639U.m6658c(str2), e);
                    }
                }

                /* JADX INFO: renamed from: u0 */
                public final boolean m265u0(rp3 rp3Var) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             String str = rp3Var.f16225b;
/* 7 */             mo1375y();
/* 10 */            m9593A();
/* 13 */            String str2 = rp3Var.f16224a;
/* 15 */            String str3 = rp3Var.f16226c;
/* 21 */            if (m266v0(str2, str3) == null) {
/* 27 */                if (up3.m9074x0(str3)) {
/* 62 */                    if (m242V("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(ij3Var.f9651d.m7404H(str2, vg3.f18105V), 100), 25)) {
/* 92 */                        return false;
                            }
                        } else if (!"_npa".equals(str3)) {
/* 79 */                    long jM242V = m242V("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
/* 83 */                    ij3Var.getClass();
/* 90 */                    if (jM242V >= 25) {
/* 92 */                        return false;
                            }
                        }
                    }
/* 96 */            ContentValues contentValues = new ContentValues();
/* 101 */           contentValues.put("app_id", str2);
/* 106 */           contentValues.put(FirebaseAnalytics.Param.ORIGIN, str);
/* 111 */           contentValues.put("name", str3);
/* 122 */           contentValues.put("set_timestamp", Long.valueOf(rp3Var.f16227d));
/* 127 */           m213m0(contentValues, rp3Var.f16228e);
                    try {
/* 146 */               if (m261q0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
/* 182 */                   return true;
                        }
/* 148 */               uh3 uh3Var = ij3Var.f9655f;
/* 150 */               ij3.m4555l(uh3Var);
/* 161 */               uh3Var.f17538f.m8511b(uh3.m9013H(str2), "Failed to insert/update user property (got -1). appId");
/* 182 */               return true;
                    } catch (SQLiteException e) {
/* 166 */               uh3 uh3Var2 = ij3Var.f9655f;
/* 168 */               ij3.m4555l(uh3Var2);
/* 179 */               uh3Var2.f17538f.m8512c(uh3.m9013H(str2), "Error storing user property. appId", e);
/* 182 */               return true;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:34:0x009d  */
                /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
                /* JADX INFO: renamed from: v0 */
                public final rp3 m266v0(String str, String str2) {
                    Throwable th;
                    String str3;
                    String str4;
                    SQLiteException sQLiteException;
                    Cursor cursorQuery;
/* 4 */             ij3 ij3Var = (ij3) this.f16749a;
/* 6 */             kb1.m6058k(str);
/* 9 */             kb1.m6058k(str2);
/* 12 */            mo1375y();
/* 15 */            m9593A();
/* 18 */            Cursor cursor = null;
                    try {
/* 44 */                cursorQuery = m261q0().query("user_attributes", new String[]{"set_timestamp", FirebaseAnalytics.Param.VALUE, FirebaseAnalytics.Param.ORIGIN}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                        try {
                            try {
/* 52 */                        if (cursorQuery.moveToFirst()) {
/* 57 */                            long j = cursorQuery.getLong(0);
/* 62 */                            Object objM233M = m233M(cursorQuery, 1);
/* 66 */                            if (objM233M != null) {
/* 76 */                                str3 = str;
/* 77 */                                str4 = str2;
                                        try {
/* 78 */                                    rp3 rp3Var = new rp3(str3, cursorQuery.getString(2), str4, j, objM233M);
/* 85 */                                    if (cursorQuery.moveToNext()) {
/* 87 */                                        uh3 uh3Var = ij3Var.f9655f;
/* 89 */                                        ij3.m4555l(uh3Var);
/* 100 */                                       uh3Var.f17538f.m8511b(uh3.m9013H(str3), "Got multiple records for user property, expected one. appId");
                                            }
/* 110 */                                   cursorQuery.close();
/* 113 */                                   return rp3Var;
                                        } catch (SQLiteException e) {
/* 107 */                                   e = e;
                                        }
                                    }
/* 108 */                           sQLiteException = e;
/* 128 */                           uh3 uh3Var2 = ij3Var.f9655f;
/* 130 */                           ij3.m4555l(uh3Var2);
/* 147 */                           uh3Var2.f17538f.m8513d("Error querying user property. appId", uh3.m9013H(str3), ij3Var.f9639U.m6658c(str4), sQLiteException);
                                }
                            } catch (Throwable th2) {
/* 105 */                       th = th2;
/* 118 */                       cursor = cursorQuery;
/* 156 */                       if (cursor != null) {
/* 161 */                           throw th;
                                }
/* 158 */                       cursor.close();
/* 161 */                       throw th;
                            }
                        } catch (SQLiteException e2) {
/* 114 */                   e = e2;
/* 115 */                   str3 = str;
/* 116 */                   str4 = str2;
                        }
                    } catch (SQLiteException e3) {
/* 124 */               str3 = str;
/* 125 */               str4 = str2;
/* 126 */               sQLiteException = e3;
/* 127 */               cursorQuery = null;
                    } catch (Throwable th3) {
/* 121 */               th = th3;
/* 156 */               if (cursor != null) {
/* 161 */                   throw th;
                        }
/* 158 */               cursor.close();
/* 161 */               throw th;
                    }
/* 150 */           if (cursorQuery != null) {
/* 152 */               cursorQuery.close();
                    }
/* 18 */            return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
                /* JADX INFO: renamed from: w0 */
                public final List m267w0(String str) {
                    String str2;
                    SQLiteException sQLiteException;
/* 4 */             ij3 ij3Var = (ij3) this.f16749a;
/* 6 */             kb1.m6058k(str);
/* 9 */             mo1375y();
/* 12 */            m9593A();
/* 17 */            ?? arrayList = new ArrayList();
/* 22 */            Cursor cursorQuery = null;
                    try {
                        try {
/* 49 */                    ij3Var.getClass();
/* 54 */                    cursorQuery = m261q0().query("user_attributes", new String[]{"name", FirebaseAnalytics.Param.ORIGIN, "set_timestamp", FirebaseAnalytics.Param.VALUE}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
/* 62 */                    if (cursorQuery.moveToFirst()) {
                                while (true) {
/* 65 */                            String string = cursorQuery.getString(0);
/* 70 */                            String string2 = cursorQuery.getString(1);
/* 74 */                            if (string2 == null) {
/* 76 */                                string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
/* 78 */                            String str3 = string2;
/* 85 */                            long j = cursorQuery.getLong(2);
/* 90 */                            Object objM233M = m233M(cursorQuery, 3);
/* 94 */                            if (objM233M == null) {
                                        try {
/* 96 */                                    uh3 uh3Var = ij3Var.f9655f;
/* 98 */                                    ij3.m4555l(uh3Var);
/* 109 */                                   uh3Var.f17538f.m8511b(uh3.m9013H(str), "Read invalid user property value, ignoring it. appId");
/* 112 */                                   str2 = str;
                                        } catch (SQLiteException e) {
/* 81 */                                    sQLiteException = e;
/* 82 */                                    str2 = str;
/* 141 */                                   uh3 uh3Var2 = ij3Var.f9655f;
/* 143 */                                   ij3.m4555l(uh3Var2);
/* 154 */                                   uh3Var2.f17538f.m8512c(uh3.m9013H(str2), "Error querying user properties. appId", sQLiteException);
/* 157 */                                   arrayList = Collections.EMPTY_LIST;
                                        }
                                    } else {
/* 119 */                               str2 = str;
/* 123 */                               arrayList.add(new rp3(str2, str3, string, j, objM233M));
                                    }
                                    try {
/* 130 */                               if (!cursorQuery.moveToNext()) {
                                            break;
                                        }
/* 133 */                               str = str2;
                                    } catch (SQLiteException e2) {
/* 135 */                               e = e2;
/* 136 */                               sQLiteException = e;
/* 141 */                               uh3 uh3Var3 = ij3Var.f9655f;
/* 143 */                               ij3.m4555l(uh3Var3);
/* 154 */                               uh3Var3.f17538f.m8512c(uh3.m9013H(str2), "Error querying user properties. appId", sQLiteException);
/* 157 */                               arrayList = Collections.EMPTY_LIST;
                                    }
                                }
                            }
                        } finally {
/* 165 */                   if (0 != 0) {
/* 167 */                       cursorQuery.close();
                            }
                        }
                    } catch (SQLiteException e3) {
/* 138 */               e = e3;
/* 139 */               str2 = str;
                    }
/* 164 */           return arrayList;
                }

                /* JADX WARN: Code duplicated, block: B:49:0x012e  */
                /* JADX WARN: Code duplicated, block: B:53:0x0135  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
                /* JADX INFO: renamed from: x0 */
                public final List m268x0(String str, String str2, String str3) throws Throwable {
                    Cursor cursor;
                    String str4;
                    Cursor cursorQuery;
                    String str5;
/* 7 */             ij3 ij3Var = (ij3) this.f16749a;
/* 9 */             kb1.m6058k(str);
/* 12 */            mo1375y();
/* 15 */            m9593A();
/* 20 */            ?? arrayList = new ArrayList();
                    try {
/* 30 */                ArrayList arrayList2 = new ArrayList(3);
/* 33 */                String str6 = str;
/* 35 */                arrayList2.add(str6);
/* 42 */                StringBuilder sb = new StringBuilder("app_id=?");
/* 49 */                if (!TextUtils.isEmpty(str2)) {
/* 53 */                    arrayList2.add(str2);
/* 58 */                    sb.append(" and origin=?");
                        }
/* 75 */                if (!TextUtils.isEmpty(str3)) {
/* 88 */                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
/* 91 */                    sb2.append(str3);
/* 94 */                    sb2.append("*");
/* 101 */                   arrayList2.add(sb2.toString());
/* 106 */                   sb.append(" and name glob ?");
                        }
/* 120 */               String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
/* 122 */               SQLiteDatabase sQLiteDatabaseM261q0 = m261q0();
/* 136 */               String[] strArr2 = {"name", "set_timestamp", FirebaseAnalytics.Param.VALUE, FirebaseAnalytics.Param.ORIGIN};
/* 140 */               String string = sb.toString();
/* 146 */               ij3Var.getClass();
/* 149 */               uh3 uh3Var = ij3Var.f9655f;
/* 156 */               cursorQuery = sQLiteDatabaseM261q0.query("user_attributes", strArr2, string, strArr, null, null, "rowid", "1001");
                        try {
                            try {
/* 164 */                       if (cursorQuery.moveToFirst()) {
/* 168 */                           str4 = str2;
                                    while (true) {
                                        try {
/* 176 */                                   if (arrayList.size() >= 1000) {
/* 178 */                                       ij3.m4555l(uh3Var);
/* 189 */                                       uh3Var.f17538f.m8511b(1000, "Read more than the max allowed user properties, ignoring excess");
                                                break;
                                            }
/* 199 */                                   String string2 = cursorQuery.getString(0);
/* 203 */                                   long j = cursorQuery.getLong(1);
/* 208 */                                   Object objM233M = m233M(cursorQuery, 2);
/* 213 */                                   String string3 = cursorQuery.getString(3);
/* 217 */                                   if (objM233M == null) {
                                                try {
/* 219 */                                           ij3.m4555l(uh3Var);
/* 230 */                                           uh3Var.f17538f.m8513d("(2)Read invalid user property value, ignoring it", uh3.m9013H(str6), string3, str3);
/* 233 */                                           str5 = string3;
                                                } catch (SQLiteException e) {
/* 236 */                                           e = e;
/* 237 */                                           str5 = string3;
/* 265 */                                           cursor = cursorQuery;
/* 266 */                                           str4 = str5;
                                                    try {
/* 282 */                                               uh3 uh3Var2 = ij3Var.f9655f;
/* 284 */                                               ij3.m4555l(uh3Var2);
/* 295 */                                               uh3Var2.f17538f.m8513d("(2)Error querying user properties", uh3.m9013H(str), str4, e);
/* 298 */                                               arrayList = Collections.EMPTY_LIST;
/* 300 */                                               cursorQuery = cursor;
/* 301 */                                               if (cursorQuery != null) {
/* 303 */                                                   cursorQuery.close();
                                                        }
/* 306 */                                               return arrayList;
                                                    } catch (Throwable th) {
/* 307 */                                               th = th;
/* 308 */                                               if (cursor != null) {
/* 310 */                                                   cursor.close();
                                                        }
/* 313 */                                               throw th;
                                                    }
                                                }
                                            } else {
/* 244 */                                       str5 = string3;
/* 249 */                                       arrayList.add(new rp3(str, str5, string2, j, objM233M));
                                            }
                                            try {
/* 256 */                                       if (!cursorQuery.moveToNext()) {
                                                    break;
                                                }
/* 259 */                                       str6 = str;
/* 261 */                                       str4 = str5;
                                            } catch (SQLiteException e2) {
/* 264 */                                       e = e2;
/* 265 */                                       cursor = cursorQuery;
/* 266 */                                       str4 = str5;
/* 282 */                                       uh3 uh3Var3 = ij3Var.f9655f;
/* 284 */                                       ij3.m4555l(uh3Var3);
/* 295 */                                       uh3Var3.f17538f.m8513d("(2)Error querying user properties", uh3.m9013H(str), str4, e);
/* 298 */                                       arrayList = Collections.EMPTY_LIST;
/* 300 */                                       cursorQuery = cursor;
                                            }
                                        } catch (SQLiteException e3) {
/* 196 */                                   e = e3;
/* 269 */                                   cursor = cursorQuery;
/* 282 */                                   uh3 uh3Var4 = ij3Var.f9655f;
/* 284 */                                   ij3.m4555l(uh3Var4);
/* 295 */                                   uh3Var4.f17538f.m8513d("(2)Error querying user properties", uh3.m9013H(str), str4, e);
/* 298 */                                   arrayList = Collections.EMPTY_LIST;
/* 300 */                                   cursorQuery = cursor;
/* 301 */                                   if (cursorQuery != null) {
/* 303 */                                       cursorQuery.close();
                                            }
/* 306 */                                   return arrayList;
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
/* 194 */                       th = th2;
/* 271 */                       cursor = cursorQuery;
/* 308 */                       if (cursor != null) {
/* 310 */                           cursor.close();
                                }
/* 313 */                       throw th;
                            }
                        } catch (SQLiteException e4) {
/* 273 */                   e = e4;
/* 274 */                   str4 = str2;
                        }
                    } catch (SQLiteException e5) {
/* 65 */                e = e5;
/* 279 */               str4 = str2;
/* 281 */               cursor = null;
                    } catch (Throwable th3) {
/* 62 */                th = th3;
/* 277 */               cursor = null;
                    }
/* 301 */           if (cursorQuery != null) {
/* 303 */               cursorQuery.close();
                    }
/* 306 */           return arrayList;
                }

                /* JADX INFO: renamed from: y0 */
                public final boolean m269y0(zzah zzahVar) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             mo1375y();
/* 8 */             m9593A();
/* 11 */            String str = zzahVar.f4197a;
/* 13 */            kb1.m6061n(str);
/* 24 */            if (m266v0(str, zzahVar.f4199c.f4228b) == null) {
/* 32 */                long jM242V = m242V("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
/* 36 */                ij3Var.getClass();
/* 43 */                if (jM242V >= 1000) {
/* 46 */                    return false;
                        }
                    }
/* 50 */            ContentValues contentValues = new ContentValues();
/* 55 */            contentValues.put("app_id", str);
/* 62 */            contentValues.put(FirebaseAnalytics.Param.ORIGIN, zzahVar.f4198b);
/* 71 */            contentValues.put("name", zzahVar.f4199c.f4228b);
/* 76 */            Object objM2197D1 = zzahVar.f4199c.m2197D1();
/* 80 */            kb1.m6061n(objM2197D1);
/* 83 */            m213m0(contentValues, objM2197D1);
/* 94 */            contentValues.put("active", Boolean.valueOf(zzahVar.f4201e));
/* 101 */           contentValues.put("trigger_event_name", zzahVar.f4202f);
/* 112 */           contentValues.put("trigger_timeout", Long.valueOf(zzahVar.f4204v));
/* 115 */           zzbg zzbgVar = zzahVar.f4203i;
/* 117 */           up3 up3Var = ij3Var.f9668w;
/* 119 */           uh3 uh3Var = ij3Var.f9655f;
/* 121 */           ij3.m4553j(up3Var);
/* 130 */           contentValues.put("timed_out_event", up3.m9069d0(zzbgVar));
/* 141 */           contentValues.put("creation_timestamp", Long.valueOf(zzahVar.f4200d));
/* 144 */           ij3.m4553j(up3Var);
/* 155 */           contentValues.put("triggered_event", up3.m9069d0(zzahVar.f4205w));
/* 168 */           contentValues.put("triggered_timestamp", Long.valueOf(zzahVar.f4199c.f4229c));
/* 179 */           contentValues.put("time_to_live", Long.valueOf(zzahVar.f4195U));
/* 190 */           contentValues.put("expired_event", up3.m9069d0(zzahVar.f4196V));
                    try {
/* 209 */               if (m261q0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
/* 241 */                   return true;
                        }
/* 211 */               ij3.m4555l(uh3Var);
/* 222 */               uh3Var.f17538f.m8511b(uh3.m9013H(str), "Failed to insert/update conditional user property (got -1)");
/* 241 */               return true;
                    } catch (SQLiteException e) {
/* 227 */               ij3.m4555l(uh3Var);
/* 238 */               uh3Var.f17538f.m8512c(uh3.m9013H(str), "Error storing conditional user property", e);
/* 241 */               return true;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:36:0x0110  */
                /* JADX WARN: Code duplicated, block: B:39:0x0116  */
                /* JADX WARN: Not initialized variable reg: 8, insn: 0x00f0: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:241), block:B:29:0x00f0 */
                /* JADX INFO: renamed from: z0 */
                public final zzah m270z0(String str, String str2) throws Throwable {
                    String str3;
                    Cursor cursorQuery;
                    Cursor cursor;
/* 6 */             ij3 ij3Var = (ij3) this.f16749a;
/* 8 */             kb1.m6058k(str);
/* 11 */            kb1.m6058k(str2);
/* 14 */            mo1375y();
/* 17 */            m9593A();
/* 20 */            Cursor cursor2 = null;
                    try {
                        try {
/* 62 */                    cursorQuery = m261q0().query("conditional_properties", new String[]{FirebaseAnalytics.Param.ORIGIN, FirebaseAnalytics.Param.VALUE, "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                            try {
/* 70 */                        if (!cursorQuery.moveToFirst()) {
/* 271 */                           if (cursorQuery != null) {
/* 273 */                               cursorQuery.close();
                                    }
/* 20 */                            return null;
                                }
/* 75 */                        String string = cursorQuery.getString(0);
/* 79 */                        if (string == null) {
/* 81 */                            string = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
/* 83 */                        String str4 = string;
/* 89 */                        Object objM233M = m233M(cursorQuery, 1);
/* 102 */                       boolean z = cursorQuery.getInt(2) != 0;
/* 104 */                       String string2 = cursorQuery.getString(3);
/* 109 */                       long j = cursorQuery.getLong(4);
/* 115 */                       ci3 ci3Var = this.f15676b.f13923i;
/* 117 */                       mp3.m6728S(ci3Var);
/* 121 */                       byte[] blob = cursorQuery.getBlob(5);
/* 125 */                       Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
/* 133 */                       zzbg zzbgVar = (zzbg) ci3Var.m1691e0(blob, creator);
/* 136 */                       long j2 = cursorQuery.getLong(6);
/* 140 */                       mp3.m6728S(ci3Var);
/* 154 */                       zzbg zzbgVar2 = (zzbg) ci3Var.m1691e0(cursorQuery.getBlob(7), creator);
/* 158 */                       long j3 = cursorQuery.getLong(8);
/* 164 */                       long j4 = cursorQuery.getLong(9);
/* 168 */                       mp3.m6728S(ci3Var);
/* 187 */                       str3 = str2;
                                try {
/* 199 */                           zzah zzahVar = new zzah(str, str4, new zzpk(j3, objM233M, str3, str4), j2, z, string2, zzbgVar, j, zzbgVar2, j4, (zzbg) ci3Var.m1691e0(cursorQuery.getBlob(10), creator));
/* 206 */                           if (cursorQuery.moveToNext()) {
/* 208 */                               uh3 uh3Var = ij3Var.f9655f;
/* 210 */                               ij3.m4555l(uh3Var);
/* 227 */                               uh3Var.f17538f.m8512c(uh3.m9013H(str), "Got multiple records for conditional property, expected one", ij3Var.f9639U.m6658c(str3));
                                    }
/* 233 */                           cursorQuery.close();
/* 236 */                           return zzahVar;
                                } catch (SQLiteException e) {
/* 231 */                           e = e;
                                }
                            } catch (SQLiteException e2) {
/* 237 */                       e = e2;
/* 238 */                       str3 = str2;
                            }
                        } catch (Throwable th) {
/* 85 */                    th = th;
/* 241 */                   cursor2 = cursor;
/* 277 */                   if (cursor2 != null) {
/* 279 */                       cursor2.close();
                            }
/* 282 */                   throw th;
                        }
                    } catch (SQLiteException e3) {
/* 245 */               e = e3;
/* 246 */               str3 = str2;
/* 248 */               cursorQuery = null;
                    } catch (Throwable th2) {
/* 243 */               th = th2;
/* 277 */               if (cursor2 != null) {
/* 279 */                   cursor2.close();
                        }
/* 282 */               throw th;
                    }
/* 249 */           uh3 uh3Var2 = ij3Var.f9655f;
/* 251 */           ij3.m4555l(uh3Var2);
/* 268 */           uh3Var2.f17538f.m8513d("Error querying conditional property", uh3.m9013H(str), ij3Var.f9639U.m6658c(str3), e);
/* 271 */           if (cursorQuery != null) {
/* 273 */               cursorQuery.close();
                    }
/* 20 */            return null;
                }
            }
