            package com.google.android.gms.internal.measurement;

            import java.io.IOException;
            import java.util.Locale;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 41 */    public final class zzlk extends IOException {
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzlk(long j, long j2, int i, Throwable th) {
/* 39 */            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j + ", limit: " + j2 + ", len: " + i), th);
/* 1 */             Locale locale = Locale.US;
                }

/* 42 */        public zzlk() {
/* 43 */            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
                }

/* 43 */        public zzlk(Throwable th) {
/* 44 */            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
                }
            }
