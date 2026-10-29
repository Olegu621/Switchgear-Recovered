            package com.google.android.gms.internal.drive;

            import java.io.IOException;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zzkq extends IOException {
                private zzlq zzsq;

                public zzkq(String str) {
/* 1 */             super(str);
/* 5 */             this.zzsq = null;
                }

                public static zzkq zzdi() {
/* 5 */             return new zzkq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }

                public static zzkq zzdj() {
/* 5 */             return new zzkq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }

                public static zzkq zzdk() {
/* 5 */             return new zzkq("Protocol message contained an invalid tag (zero).");
                }

                public static zzkr zzdl() {
/* 5 */             return new zzkr("Protocol message tag had invalid wire type.");
                }

                public static zzkq zzdm() {
/* 5 */             return new zzkq("Failed to parse the message.");
                }

                public static zzkq zzdn() {
/* 5 */             return new zzkq("Protocol message had invalid UTF-8.");
                }

                public final zzkq zzg(zzlq zzlqVar) {
/* 1 */             this.zzsq = zzlqVar;
/* 3 */             return this;
                }
            }
