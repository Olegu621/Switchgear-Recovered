            package p000;

            import java.io.IOException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class pz0 extends IOException {

                /* JADX INFO: renamed from: a */
                public boolean f15349a;

                /* JADX INFO: renamed from: a */
                public static pz0 m7622a() {
/* 5 */             return new pz0("Protocol message contained an invalid tag (zero).");
                }

                /* JADX INFO: renamed from: b */
                public static pz0 m7623b() {
/* 5 */             return new pz0("Protocol message had invalid UTF-8.");
                }

                /* JADX INFO: renamed from: c */
                public static nz0 m7624c() {
/* 5 */             return new nz0("Protocol message tag had invalid wire type.");
                }

                /* JADX INFO: renamed from: d */
                public static pz0 m7625d() {
/* 5 */             return new pz0("CodedInputStream encountered a malformed varint.");
                }

                /* JADX INFO: renamed from: e */
                public static pz0 m7626e() {
/* 5 */             return new pz0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }

                /* JADX INFO: renamed from: f */
                public static pz0 m7627f() {
/* 5 */             return new pz0("Failed to parse the message.");
                }

                /* JADX INFO: renamed from: g */
                public static pz0 m7628g() {
/* 5 */             return new pz0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            }
