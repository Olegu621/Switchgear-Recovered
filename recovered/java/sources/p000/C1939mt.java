            package p000;

            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: renamed from: mt */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1939mt {

                /* JADX INFO: renamed from: a */
                public static final char[] f14015a = new char[117];

                /* JADX INFO: renamed from: b */
                public static final byte[] f14016b = new byte[WebSocketProtocol.PAYLOAD_SHORT];

                static {
/* 17 */            for (int i = 0; i < 32; i++) {
                    }
/* 26 */            m6799a(8, 'b');
/* 33 */            m6799a(9, 't');
/* 40 */            m6799a(10, 'n');
/* 47 */            m6799a(12, 'f');
/* 54 */            m6799a(13, 'r');
/* 59 */            m6799a(47, '/');
/* 64 */            m6799a(34, '\"');
/* 69 */            m6799a(92, '\\');
/* 72 */            byte[] bArr = f14016b;
/* 76 */            for (int i2 = 0; i2 < 33; i2++) {
/* 80 */                bArr[i2] = 127;
                    }
/* 86 */            bArr[9] = 3;
/* 88 */            bArr[10] = 3;
/* 90 */            bArr[13] = 3;
/* 92 */            bArr[32] = 3;
/* 97 */            bArr[44] = 4;
/* 102 */           bArr[58] = 5;
/* 107 */           bArr[123] = 6;
/* 112 */           bArr[125] = 7;
/* 116 */           bArr[91] = 8;
/* 120 */           bArr[93] = 9;
/* 123 */           bArr[34] = 1;
/* 126 */           bArr[92] = 2;
                }

                /* JADX INFO: renamed from: a */
                public static void m6799a(int i, char c) {
/* 3 */             if (c != 'u') {
/* 8 */                 f14015a[c] = (char) i;
                    }
                }
            }
