            package p000;

            import java.io.IOException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class qz0 extends IOException {

                /* JADX INFO: renamed from: a */
                public boolean f15809a;

                /* JADX INFO: renamed from: a */
                public static qz0 m8029a() {
/* 5 */             return new qz0("Protocol message had invalid UTF-8.");
                }

                /* JADX INFO: renamed from: b */
                public static oz0 m8030b() {
/* 5 */             return new oz0("Protocol message tag had invalid wire type.");
                }

                /* JADX INFO: renamed from: c */
                public static qz0 m8031c() {
/* 5 */             return new qz0("CodedInputStream encountered a malformed varint.");
                }

                /* JADX INFO: renamed from: d */
                public static qz0 m8032d() {
/* 5 */             return new qz0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }

                /* JADX INFO: renamed from: e */
                public static qz0 m8033e() {
/* 5 */             return new qz0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            }
