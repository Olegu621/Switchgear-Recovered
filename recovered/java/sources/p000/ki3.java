            package p000;

            import android.content.SharedPreferences;
            import android.os.Bundle;
            import android.util.Pair;
            import android.util.SparseArray;
            import io.sentry.android.core.C1268s;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ki3 extends hk3 {

                /* JADX INFO: renamed from: k0 */
                public static final Pair f12794k0 = new Pair(HttpUrl.FRAGMENT_ENCODE_SET, 0L);

                /* JADX INFO: renamed from: U */
                public long f12795U;

                /* JADX INFO: renamed from: V */
                public final C1268s f12796V;

                /* JADX INFO: renamed from: W */
                public final hi3 f12797W;

                /* JADX INFO: renamed from: X */
                public final C2220tj f12798X;

                /* JADX INFO: renamed from: Y */
                public final ra2 f12799Y;

                /* JADX INFO: renamed from: Z */
                public final hi3 f12800Z;

                /* JADX INFO: renamed from: a0 */
                public final C1268s f12801a0;

                /* JADX INFO: renamed from: b0 */
                public final C1268s f12802b0;

                /* JADX INFO: renamed from: c */
                public SharedPreferences f12803c;

                /* JADX INFO: renamed from: c0 */
                public boolean f12804c0;

                /* JADX INFO: renamed from: d */
                public SharedPreferences f12805d;

                /* JADX INFO: renamed from: d0 */
                public final hi3 f12806d0;

                /* JADX INFO: renamed from: e */
                public ji3 f12807e;

                /* JADX INFO: renamed from: e0 */
                public final hi3 f12808e0;

                /* JADX INFO: renamed from: f */
                public final C1268s f12809f;

                /* JADX INFO: renamed from: f0 */
                public final C1268s f12810f0;

                /* JADX INFO: renamed from: g0 */
                public final C2220tj f12811g0;

                /* JADX INFO: renamed from: h0 */
                public final C2220tj f12812h0;

                /* JADX INFO: renamed from: i */
                public final C2220tj f12813i;

                /* JADX INFO: renamed from: i0 */
                public final C1268s f12814i0;

                /* JADX INFO: renamed from: j0 */
                public final ra2 f12815j0;

                /* JADX INFO: renamed from: v */
                public String f12816v;

                /* JADX INFO: renamed from: w */
                public boolean f12817w;

                public ki3(ij3 ij3Var) {
/* 1 */             super(ij3Var);
/* 14 */            this.f12796V = new C1268s(this, "session_timeout", 1800000L);
/* 24 */            this.f12797W = new hi3(this, "start_new_session", true);
/* 35 */            this.f12801a0 = new C1268s(this, "last_pause_time", 0L);
/* 44 */            this.f12802b0 = new C1268s(this, "session_id", 0L);
/* 53 */            this.f12798X = new C2220tj(this, "non_personalized_ads");
/* 62 */            this.f12799Y = new ra2(this, "last_received_uri_timestamps_by_source");
/* 72 */            this.f12800Z = new hi3(this, "allow_remote_dynamite", false);
/* 81 */            this.f12809f = new C1268s(this, "first_open_time", 0L);
/* 85 */            kb1.m6058k("app_install_time");
/* 95 */            this.f12813i = new C2220tj(this, "app_instance_id");
/* 104 */           this.f12806d0 = new hi3(this, "app_backgrounded", false);
/* 113 */           this.f12808e0 = new hi3(this, "deep_link_retrieval_complete", false);
/* 122 */           this.f12810f0 = new C1268s(this, "deep_link_retrieval_attempts", 0L);
/* 131 */           this.f12811g0 = new C2220tj(this, "firebase_feature_rollouts");
/* 140 */           this.f12812h0 = new C2220tj(this, "deferred_attribution_cache");
/* 149 */           this.f12814i0 = new C1268s(this, "deferred_attribution_cache_timestamp", 0L);
/* 158 */           this.f12815j0 = new ra2(this, "default_event_parameters");
                }

                @Override // p000.hk3
                /* JADX INFO: renamed from: A */
                public final boolean mo1364A() {
/* 1 */             return true;
                }

                /* JADX INFO: renamed from: D */
                public final SharedPreferences m6113D() {
/* 1 */             mo1375y();
/* 4 */             m4240B();
/* 9 */             kb1.m6061n(this.f12803c);
/* 12 */            return this.f12803c;
                }

                /* JADX INFO: renamed from: E */
                public final SharedPreferences m6114E() {
/* 1 */             mo1375y();
/* 4 */             m4240B();
/* 9 */             if (this.f12805d == null) {
/* 13 */                ij3 ij3Var = (ij3) this.f16749a;
/* 21 */                String strValueOf = String.valueOf(ij3Var.f9645a.getPackageName());
/* 25 */                uh3 uh3Var = ij3Var.f9655f;
/* 27 */                ij3.m4555l(uh3Var);
/* 30 */                sh3 sh3Var = uh3Var.f17534Y;
/* 34 */                String strConcat = strValueOf.concat("_preferences");
/* 40 */                sh3Var.m8511b(strConcat, "Default prefs file");
/* 50 */                this.f12805d = ij3Var.f9645a.getSharedPreferences(strConcat, 0);
                    }
/* 52 */            return this.f12805d;
                }

                /* JADX INFO: renamed from: F */
                public final SparseArray m6115F() {
/* 3 */             Bundle bundleM8119x = this.f12799Y.m8119x();
/* 9 */             int[] intArray = bundleM8119x.getIntArray("uriSources");
/* 15 */            long[] longArray = bundleM8119x.getLongArray("uriTimestamps");
/* 19 */            if (intArray == null || longArray == null) {
/* 76 */                return new SparseArray();
                    }
/* 26 */            if (intArray.length != longArray.length) {
/* 32 */                uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 34 */                ij3.m4555l(uh3Var);
/* 41 */                uh3Var.f17538f.m8510a("Trigger URI source and timestamp array lengths do not match");
/* 46 */                return new SparseArray();
                    }
/* 52 */            SparseArray sparseArray = new SparseArray();
/* 57 */            for (int i = 0; i < intArray.length; i++) {
/* 67 */                sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
                    }
/* 73 */            return sparseArray;
                }

                /* JADX INFO: renamed from: G */
                public final ok3 m6116G() {
/* 1 */             mo1375y();
/* 28 */            return ok3.m7182c(m6113D().getInt("consent_source", 100), m6113D().getString("consent_settings", "G1"));
                }

                /* JADX INFO: renamed from: H */
                public final boolean m6117H(mo3 mo3Var) {
/* 1 */             mo1375y();
/* 12 */            String string = m6113D().getString("stored_tcf_param", HttpUrl.FRAGMENT_ENCODE_SET);
/* 16 */            String strM6718a = mo3Var.m6718a();
/* 24 */            if (strM6718a.equals(string)) {
/* 42 */                return false;
                    }
/* 30 */            SharedPreferences.Editor editorEdit = m6113D().edit();
/* 34 */            editorEdit.putString("stored_tcf_param", strM6718a);
/* 37 */            editorEdit.apply();
/* 40 */            return true;
                }

                /* JADX INFO: renamed from: I */
                public final void m6118I(boolean z) {
/* 1 */             mo1375y();
/* 8 */             uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 10 */            ij3.m4555l(uh3Var);
/* 21 */            uh3Var.f17534Y.m8511b(Boolean.valueOf(z), "App measurement setting deferred collection");
/* 28 */            SharedPreferences.Editor editorEdit = m6113D().edit();
/* 34 */            editorEdit.putBoolean("deferred_analytics_collection", z);
/* 37 */            editorEdit.apply();
                }

                /* JADX INFO: renamed from: J */
                public final boolean m6119J(long j) {
                    return j - this.f12796V.m4932a() > this.f12801a0.m4932a();
                }
            }
