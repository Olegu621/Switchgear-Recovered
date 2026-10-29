            package com.google.android.play.core.integrity;

            import com.google.android.gms.common.api.Status;
            import com.google.android.play.core.integrity.model.C0448a;
            import java.util.Locale;
            import p000.C1020i9;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class IntegrityServiceException extends C1020i9 {

                /* JADX INFO: renamed from: a */
                private final Throwable f5145a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IntegrityServiceException(int i, Throwable th) {
/* 40 */            super(new Status(i, "Integrity API error (" + i + "): " + C0448a.m2496a(i) + ".", null, null));
/* 3 */             Locale locale = Locale.ROOT;
/* 43 */            if (i != 0) {
/* 45 */                this.f5145a = th;
                    } else {
/* 50 */                C1951n4.m6859j("ErrorCode should not be 0.");
/* 53 */                throw null;
                    }
                }

                @Override // java.lang.Throwable
                public final synchronized Throwable getCause() {
/* 2 */             return this.f5145a;
                }

                public int getErrorCode() {
/* 1 */             return super.getStatusCode();
                }
            }
