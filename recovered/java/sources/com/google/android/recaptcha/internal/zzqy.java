            package com.google.android.recaptcha.internal;

            import okhttp3.internal.p013ws.WebSocketProtocol;
            import p000.AbstractC0208c9;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum zzqy implements zzsp {
                EDITION_UNKNOWN(0),
                EDITION_LEGACY(900),
                EDITION_PROTO2(998),
                EDITION_PROTO3(999),
                EDITION_2023(1000),
                EDITION_2024(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY),
                EDITION_1_TEST_ONLY(1),
                EDITION_2_TEST_ONLY(2),
                EDITION_99997_TEST_ONLY(99997),
                EDITION_99998_TEST_ONLY(99998),
                EDITION_99999_TEST_ONLY(99999),
                EDITION_MAX(AbstractC0208c9.API_PRIORITY_OTHER);

                private final int zzn;

                zzqy(int i) {
/* 4 */             this.zzn = i;
                }

                @Override // java.lang.Enum
                public final String toString() {
/* 3 */             return Integer.toString(this.zzn);
                }

                @Override // com.google.android.recaptcha.internal.zzsp
                public final int zza() {
/* 1 */             return this.zzn;
                }
            }
