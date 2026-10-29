            package com.google.android.gms.internal.auth;

            import java.io.IOException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class zzfa extends IOException {
                private zzfw zza;

                public zzfa(IOException iOException) {
/* 5 */             super(iOException.getMessage(), iOException);
/* 9 */             this.zza = null;
                }

                public static zzfa zza() {
/* 5 */             return new zzfa("Protocol message contained an invalid tag (zero).");
                }

                public static zzfa zzb() {
/* 5 */             return new zzfa("Protocol message had invalid UTF-8.");
                }

                public static zzfa zzc() {
/* 5 */             return new zzfa("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }

                public static zzfa zzd() {
/* 5 */             return new zzfa("Failed to parse the message.");
                }

                public static zzfa zzf() {
/* 5 */             return new zzfa("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }

                public final zzfa zze(zzfw zzfwVar) {
/* 1 */             this.zza = zzfwVar;
/* 3 */             return this;
                }

/* 11 */        public zzfa(String str) {
/* 12 */            super(str);
                    this.zza = null;
                }
            }
