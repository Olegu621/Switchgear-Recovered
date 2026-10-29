            package com.google.android.play.core.integrity;

            import android.app.Activity;
            import com.google.android.gms.tasks.Task;
            import java.util.Set;
            import p000.ga3;
            import p000.ia3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface StandardIntegrityManager {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class PrepareIntegrityTokenRequest {

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static abstract class Builder {
                        public abstract PrepareIntegrityTokenRequest build();

                        public abstract Builder setCloudProjectNumber(long j);
                    }

                    public static Builder builder() {
/* 3 */                 C0436c c0436c = new C0436c();
/* 7 */                 c0436c.m2493a(0);
/* 10 */                return c0436c;
                    }

                    /* JADX INFO: renamed from: a */
                    public abstract int mo2444a();

                    /* JADX INFO: renamed from: b */
                    public abstract long mo2445b();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class StandardIntegrityToken {
                    public abstract Task<Integer> showDialog(Activity activity, int i);

                    public abstract String token();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface StandardIntegrityTokenProvider {
                    Task<StandardIntegrityToken> request(StandardIntegrityTokenRequest standardIntegrityTokenRequest);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class StandardIntegrityTokenRequest {

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static abstract class Builder {
                        public abstract StandardIntegrityTokenRequest build();

                        public abstract Builder setRequestHash(String str);

                        public abstract Builder setVerdictOptOut(Set<Integer> set);
                    }

                    public static Builder builder() {
/* 3 */                 C0440f c0440f = new C0440f();
/* 6 */                 int i = ga3.f8528c;
/* 10 */                c0440f.setVerdictOptOut(ia3.f9514i);
/* 13 */                return c0440f;
                    }

                    public abstract String requestHash();

                    public abstract Set<Integer> verdictOptOut();
                }

                Task<StandardIntegrityTokenProvider> prepareIntegrityToken(PrepareIntegrityTokenRequest prepareIntegrityTokenRequest);
            }
