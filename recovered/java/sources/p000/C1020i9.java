            package p000;

            import com.google.android.gms.common.api.Status;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: i9 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C1020i9 extends Exception {

                @Deprecated
                protected final Status mStatus;

                public C1020i9(Status status) {
/* 1 */             int i = status.f3445a;
/* 3 */             String str = status.f3446b;
/* 8 */             str = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
/* 31 */            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
/* 34 */            sb.append(i);
/* 39 */            sb.append(": ");
/* 42 */            sb.append(str);
/* 49 */            super(sb.toString());
/* 52 */            this.mStatus = status;
                }

                public Status getStatus() {
/* 1 */             return this.mStatus;
                }

                public int getStatusCode() {
/* 3 */             return this.mStatus.f3445a;
                }

                @Deprecated
                public String getStatusMessage() {
/* 3 */             return this.mStatus.f3446b;
                }
            }
