            package p000;

            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class f23 {

                /* JADX INFO: renamed from: e */
                public static final int[] f7977e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

                /* JADX INFO: renamed from: f */
                public static final f23[] f7978f = m3634a();

                /* JADX INFO: renamed from: a */
                public final int f7979a;

                /* JADX INFO: renamed from: b */
                public final int[] f7980b;

                /* JADX INFO: renamed from: c */
                public final C1954n7[] f7981c;

                /* JADX INFO: renamed from: d */
                public final int f7982d;

                public f23(int i, int[] iArr, C1954n7... c1954n7Arr) {
/* 4 */             this.f7979a = i;
/* 6 */             this.f7980b = iArr;
/* 8 */             this.f7981c = c1954n7Arr;
/* 11 */            C1954n7 c1954n7 = c1954n7Arr[0];
/* 13 */            int i2 = c1954n7.f14151b;
/* 20 */            int i3 = 0;
/* 21 */            for (m12 m12Var : (m12[]) c1954n7.f14152c) {
/* 31 */                i3 += (m12Var.f13546b + i2) * m12Var.f13545a;
                    }
/* 35 */            this.f7982d = i3;
                }

                /* JADX INFO: renamed from: a */
                public static f23[] m3634a() {
/* 1 */             return new f23[]{new f23(1, new int[0], new C1954n7(7, new m12[]{new m12(1, 19)}, 8), new C1954n7(10, new m12[]{new m12(1, 16)}, 8), new C1954n7(13, new m12[]{new m12(1, 13)}, 8), new C1954n7(17, new m12[]{new m12(1, 9)}, 8)), new f23(2, new int[]{6, 18}, new C1954n7(10, new m12[]{new m12(1, 34)}, 8), new C1954n7(16, new m12[]{new m12(1, 28)}, 8), new C1954n7(22, new m12[]{new m12(1, 22)}, 8), new C1954n7(28, new m12[]{new m12(1, 16)}, 8)), new f23(3, new int[]{6, 22}, new C1954n7(15, new m12[]{new m12(1, 55)}, 8), new C1954n7(26, new m12[]{new m12(1, 44)}, 8), new C1954n7(18, new m12[]{new m12(2, 17)}, 8), new C1954n7(22, new m12[]{new m12(2, 13)}, 8)), new f23(4, new int[]{6, 26}, new C1954n7(20, new m12[]{new m12(1, 80)}, 8), new C1954n7(18, new m12[]{new m12(2, 32)}, 8), new C1954n7(26, new m12[]{new m12(2, 24)}, 8), new C1954n7(16, new m12[]{new m12(4, 9)}, 8)), new f23(5, new int[]{6, 30}, new C1954n7(26, new m12[]{new m12(1, 108)}, 8), new C1954n7(24, new m12[]{new m12(2, 43)}, 8), new C1954n7(18, new m12[]{new m12(2, 15), new m12(2, 16)}, 8), new C1954n7(22, new m12[]{new m12(2, 11), new m12(2, 12)}, 8)), new f23(6, new int[]{6, 34}, new C1954n7(18, new m12[]{new m12(2, 68)}, 8), new C1954n7(16, new m12[]{new m12(4, 27)}, 8), new C1954n7(24, new m12[]{new m12(4, 19)}, 8), new C1954n7(28, new m12[]{new m12(4, 15)}, 8)), new f23(7, new int[]{6, 22, 38}, new C1954n7(20, new m12[]{new m12(2, 78)}, 8), new C1954n7(18, new m12[]{new m12(4, 31)}, 8), new C1954n7(18, new m12[]{new m12(2, 14), new m12(4, 15)}, 8), new C1954n7(26, new m12[]{new m12(4, 13), new m12(1, 14)}, 8)), new f23(8, new int[]{6, 24, 42}, new C1954n7(24, new m12[]{new m12(2, 97)}, 8), new C1954n7(22, new m12[]{new m12(2, 38), new m12(2, 39)}, 8), new C1954n7(22, new m12[]{new m12(4, 18), new m12(2, 19)}, 8), new C1954n7(26, new m12[]{new m12(4, 14), new m12(2, 15)}, 8)), new f23(9, new int[]{6, 26, 46}, new C1954n7(30, new m12[]{new m12(2, 116)}, 8), new C1954n7(22, new m12[]{new m12(3, 36), new m12(2, 37)}, 8), new C1954n7(20, new m12[]{new m12(4, 16), new m12(4, 17)}, 8), new C1954n7(24, new m12[]{new m12(4, 12), new m12(4, 13)}, 8)), new f23(10, new int[]{6, 28, 50}, new C1954n7(18, new m12[]{new m12(2, 68), new m12(2, 69)}, 8), new C1954n7(26, new m12[]{new m12(4, 43), new m12(1, 44)}, 8), new C1954n7(24, new m12[]{new m12(6, 19), new m12(2, 20)}, 8), new C1954n7(28, new m12[]{new m12(6, 15), new m12(2, 16)}, 8)), new f23(11, new int[]{6, 30, 54}, new C1954n7(20, new m12[]{new m12(4, 81)}, 8), new C1954n7(30, new m12[]{new m12(1, 50), new m12(4, 51)}, 8), new C1954n7(28, new m12[]{new m12(4, 22), new m12(4, 23)}, 8), new C1954n7(24, new m12[]{new m12(3, 12), new m12(8, 13)}, 8)), new f23(12, new int[]{6, 32, 58}, new C1954n7(24, new m12[]{new m12(2, 92), new m12(2, 93)}, 8), new C1954n7(22, new m12[]{new m12(6, 36), new m12(2, 37)}, 8), new C1954n7(26, new m12[]{new m12(4, 20), new m12(6, 21)}, 8), new C1954n7(28, new m12[]{new m12(7, 14), new m12(4, 15)}, 8)), new f23(13, new int[]{6, 34, 62}, new C1954n7(26, new m12[]{new m12(4, 107)}, 8), new C1954n7(22, new m12[]{new m12(8, 37), new m12(1, 38)}, 8), new C1954n7(24, new m12[]{new m12(8, 20), new m12(4, 21)}, 8), new C1954n7(22, new m12[]{new m12(12, 11), new m12(4, 12)}, 8)), new f23(14, new int[]{6, 26, 46, 66}, new C1954n7(30, new m12[]{new m12(3, 115), new m12(1, 116)}, 8), new C1954n7(24, new m12[]{new m12(4, 40), new m12(5, 41)}, 8), new C1954n7(20, new m12[]{new m12(11, 16), new m12(5, 17)}, 8), new C1954n7(24, new m12[]{new m12(11, 12), new m12(5, 13)}, 8)), new f23(15, new int[]{6, 26, 48, 70}, new C1954n7(22, new m12[]{new m12(5, 87), new m12(1, 88)}, 8), new C1954n7(24, new m12[]{new m12(5, 41), new m12(5, 42)}, 8), new C1954n7(30, new m12[]{new m12(5, 24), new m12(7, 25)}, 8), new C1954n7(24, new m12[]{new m12(11, 12), new m12(7, 13)}, 8)), new f23(16, new int[]{6, 26, 50, 74}, new C1954n7(24, new m12[]{new m12(5, 98), new m12(1, 99)}, 8), new C1954n7(28, new m12[]{new m12(7, 45), new m12(3, 46)}, 8), new C1954n7(24, new m12[]{new m12(15, 19), new m12(2, 20)}, 8), new C1954n7(30, new m12[]{new m12(3, 15), new m12(13, 16)}, 8)), new f23(17, new int[]{6, 30, 54, 78}, new C1954n7(28, new m12[]{new m12(1, 107), new m12(5, 108)}, 8), new C1954n7(28, new m12[]{new m12(10, 46), new m12(1, 47)}, 8), new C1954n7(28, new m12[]{new m12(1, 22), new m12(15, 23)}, 8), new C1954n7(28, new m12[]{new m12(2, 14), new m12(17, 15)}, 8)), new f23(18, new int[]{6, 30, 56, 82}, new C1954n7(30, new m12[]{new m12(5, 120), new m12(1, 121)}, 8), new C1954n7(26, new m12[]{new m12(9, 43), new m12(4, 44)}, 8), new C1954n7(28, new m12[]{new m12(17, 22), new m12(1, 23)}, 8), new C1954n7(28, new m12[]{new m12(2, 14), new m12(19, 15)}, 8)), new f23(19, new int[]{6, 30, 58, 86}, new C1954n7(28, new m12[]{new m12(3, 113), new m12(4, 114)}, 8), new C1954n7(26, new m12[]{new m12(3, 44), new m12(11, 45)}, 8), new C1954n7(26, new m12[]{new m12(17, 21), new m12(4, 22)}, 8), new C1954n7(26, new m12[]{new m12(9, 13), new m12(16, 14)}, 8)), new f23(20, new int[]{6, 34, 62, 90}, new C1954n7(28, new m12[]{new m12(3, 107), new m12(5, 108)}, 8), new C1954n7(26, new m12[]{new m12(3, 41), new m12(13, 42)}, 8), new C1954n7(30, new m12[]{new m12(15, 24), new m12(5, 25)}, 8), new C1954n7(28, new m12[]{new m12(15, 15), new m12(10, 16)}, 8)), new f23(21, new int[]{6, 28, 50, 72, 94}, new C1954n7(28, new m12[]{new m12(4, 116), new m12(4, 117)}, 8), new C1954n7(26, new m12[]{new m12(17, 42)}, 8), new C1954n7(28, new m12[]{new m12(17, 22), new m12(6, 23)}, 8), new C1954n7(30, new m12[]{new m12(19, 16), new m12(6, 17)}, 8)), new f23(22, new int[]{6, 26, 50, 74, 98}, new C1954n7(28, new m12[]{new m12(2, 111), new m12(7, 112)}, 8), new C1954n7(28, new m12[]{new m12(17, 46)}, 8), new C1954n7(30, new m12[]{new m12(7, 24), new m12(16, 25)}, 8), new C1954n7(24, new m12[]{new m12(34, 13)}, 8)), new f23(23, new int[]{6, 30, 54, 78, 102}, new C1954n7(30, new m12[]{new m12(4, 121), new m12(5, 122)}, 8), new C1954n7(28, new m12[]{new m12(4, 47), new m12(14, 48)}, 8), new C1954n7(30, new m12[]{new m12(11, 24), new m12(14, 25)}, 8), new C1954n7(30, new m12[]{new m12(16, 15), new m12(14, 16)}, 8)), new f23(24, new int[]{6, 28, 54, 80, 106}, new C1954n7(30, new m12[]{new m12(6, 117), new m12(4, 118)}, 8), new C1954n7(28, new m12[]{new m12(6, 45), new m12(14, 46)}, 8), new C1954n7(30, new m12[]{new m12(11, 24), new m12(16, 25)}, 8), new C1954n7(30, new m12[]{new m12(30, 16), new m12(2, 17)}, 8)), new f23(25, new int[]{6, 32, 58, 84, 110}, new C1954n7(26, new m12[]{new m12(8, 106), new m12(4, 107)}, 8), new C1954n7(28, new m12[]{new m12(8, 47), new m12(13, 48)}, 8), new C1954n7(30, new m12[]{new m12(7, 24), new m12(22, 25)}, 8), new C1954n7(30, new m12[]{new m12(22, 15), new m12(13, 16)}, 8)), new f23(26, new int[]{6, 30, 58, 86, 114}, new C1954n7(28, new m12[]{new m12(10, 114), new m12(2, 115)}, 8), new C1954n7(28, new m12[]{new m12(19, 46), new m12(4, 47)}, 8), new C1954n7(28, new m12[]{new m12(28, 22), new m12(6, 23)}, 8), new C1954n7(30, new m12[]{new m12(33, 16), new m12(4, 17)}, 8)), new f23(27, new int[]{6, 34, 62, 90, 118}, new C1954n7(30, new m12[]{new m12(8, 122), new m12(4, 123)}, 8), new C1954n7(28, new m12[]{new m12(22, 45), new m12(3, 46)}, 8), new C1954n7(30, new m12[]{new m12(8, 23), new m12(26, 24)}, 8), new C1954n7(30, new m12[]{new m12(12, 15), new m12(28, 16)}, 8)), new f23(28, new int[]{6, 26, 50, 74, 98, 122}, new C1954n7(30, new m12[]{new m12(3, 117), new m12(10, 118)}, 8), new C1954n7(28, new m12[]{new m12(3, 45), new m12(23, 46)}, 8), new C1954n7(30, new m12[]{new m12(4, 24), new m12(31, 25)}, 8), new C1954n7(30, new m12[]{new m12(11, 15), new m12(31, 16)}, 8)), new f23(29, new int[]{6, 30, 54, 78, 102, WebSocketProtocol.PAYLOAD_SHORT}, new C1954n7(30, new m12[]{new m12(7, 116), new m12(7, 117)}, 8), new C1954n7(28, new m12[]{new m12(21, 45), new m12(7, 46)}, 8), new C1954n7(30, new m12[]{new m12(1, 23), new m12(37, 24)}, 8), new C1954n7(30, new m12[]{new m12(19, 15), new m12(26, 16)}, 8)), new f23(30, new int[]{6, 26, 52, 78, 104, 130}, new C1954n7(30, new m12[]{new m12(5, 115), new m12(10, 116)}, 8), new C1954n7(28, new m12[]{new m12(19, 47), new m12(10, 48)}, 8), new C1954n7(30, new m12[]{new m12(15, 24), new m12(25, 25)}, 8), new C1954n7(30, new m12[]{new m12(23, 15), new m12(25, 16)}, 8)), new f23(31, new int[]{6, 30, 56, 82, 108, 134}, new C1954n7(30, new m12[]{new m12(13, 115), new m12(3, 116)}, 8), new C1954n7(28, new m12[]{new m12(2, 46), new m12(29, 47)}, 8), new C1954n7(30, new m12[]{new m12(42, 24), new m12(1, 25)}, 8), new C1954n7(30, new m12[]{new m12(23, 15), new m12(28, 16)}, 8)), new f23(32, new int[]{6, 34, 60, 86, 112, 138}, new C1954n7(30, new m12[]{new m12(17, 115)}, 8), new C1954n7(28, new m12[]{new m12(10, 46), new m12(23, 47)}, 8), new C1954n7(30, new m12[]{new m12(10, 24), new m12(35, 25)}, 8), new C1954n7(30, new m12[]{new m12(19, 15), new m12(35, 16)}, 8)), new f23(33, new int[]{6, 30, 58, 86, 114, 142}, new C1954n7(30, new m12[]{new m12(17, 115), new m12(1, 116)}, 8), new C1954n7(28, new m12[]{new m12(14, 46), new m12(21, 47)}, 8), new C1954n7(30, new m12[]{new m12(29, 24), new m12(19, 25)}, 8), new C1954n7(30, new m12[]{new m12(11, 15), new m12(46, 16)}, 8)), new f23(34, new int[]{6, 34, 62, 90, 118, 146}, new C1954n7(30, new m12[]{new m12(13, 115), new m12(6, 116)}, 8), new C1954n7(28, new m12[]{new m12(14, 46), new m12(23, 47)}, 8), new C1954n7(30, new m12[]{new m12(44, 24), new m12(7, 25)}, 8), new C1954n7(30, new m12[]{new m12(59, 16), new m12(1, 17)}, 8)), new f23(35, new int[]{6, 30, 54, 78, 102, WebSocketProtocol.PAYLOAD_SHORT, 150}, new C1954n7(30, new m12[]{new m12(12, 121), new m12(7, 122)}, 8), new C1954n7(28, new m12[]{new m12(12, 47), new m12(26, 48)}, 8), new C1954n7(30, new m12[]{new m12(39, 24), new m12(14, 25)}, 8), new C1954n7(30, new m12[]{new m12(22, 15), new m12(41, 16)}, 8)), new f23(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C1954n7(30, new m12[]{new m12(6, 121), new m12(14, 122)}, 8), new C1954n7(28, new m12[]{new m12(6, 47), new m12(34, 48)}, 8), new C1954n7(30, new m12[]{new m12(46, 24), new m12(10, 25)}, 8), new C1954n7(30, new m12[]{new m12(2, 15), new m12(64, 16)}, 8)), new f23(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new C1954n7(30, new m12[]{new m12(17, 122), new m12(4, 123)}, 8), new C1954n7(28, new m12[]{new m12(29, 46), new m12(14, 47)}, 8), new C1954n7(30, new m12[]{new m12(49, 24), new m12(10, 25)}, 8), new C1954n7(30, new m12[]{new m12(24, 15), new m12(46, 16)}, 8)), new f23(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new C1954n7(30, new m12[]{new m12(4, 122), new m12(18, 123)}, 8), new C1954n7(28, new m12[]{new m12(13, 46), new m12(32, 47)}, 8), new C1954n7(30, new m12[]{new m12(48, 24), new m12(14, 25)}, 8), new C1954n7(30, new m12[]{new m12(42, 15), new m12(32, 16)}, 8)), new f23(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C1954n7(30, new m12[]{new m12(20, 117), new m12(4, 118)}, 8), new C1954n7(28, new m12[]{new m12(40, 47), new m12(7, 48)}, 8), new C1954n7(30, new m12[]{new m12(43, 24), new m12(22, 25)}, 8), new C1954n7(30, new m12[]{new m12(10, 15), new m12(67, 16)}, 8)), new f23(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new C1954n7(30, new m12[]{new m12(19, 118), new m12(6, 119)}, 8), new C1954n7(28, new m12[]{new m12(18, 47), new m12(31, 48)}, 8), new C1954n7(30, new m12[]{new m12(34, 24), new m12(34, 25)}, 8), new C1954n7(30, new m12[]{new m12(20, 15), new m12(61, 16)}, 8))};
                }

                /* JADX INFO: renamed from: b */
                public static f23 m3635b(int i) {
/* 1 */             int i2 = AbstractC0208c9.API_PRIORITY_OTHER;
/* 5 */             int i3 = 0;
/* 8 */             for (int i4 = 0; i4 < 34; i4++) {
/* 12 */                int i5 = f7977e[i4];
/* 14 */                if (i5 == i) {
/* 18 */                    return m3636c(i4 + 7);
                        }
/* 24 */                int iBitCount = Integer.bitCount(i5 ^ i);
/* 28 */                if (iBitCount < i2) {
/* 30 */                    i3 = i4 + 7;
/* 33 */                    i2 = iBitCount;
                        }
                    }
/* 38 */            if (i2 <= 3) {
/* 40 */                return m3636c(i3);
                    }
/* 45 */            return null;
                }

                /* JADX INFO: renamed from: c */
                public static f23 m3636c(int i) {
/* 1 */             if (i <= 0 || i > 40) {
/* 14 */                f42.m3649e();
/* 17 */                return null;
                    }
/* 11 */            return f7978f[i - 1];
                }

                public final String toString() {
/* 3 */             return String.valueOf(this.f7979a);
                }
            }
