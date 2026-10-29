            package p000;

            import java.util.HashMap;
            
            /* JADX INFO: renamed from: tt */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public enum EnumC2230tt {
                /* JADX INFO: Fake field, exist only in values array */
                Cp437(new int[]{0, 2}, new String[0]),
                /* JADX INFO: Fake field, exist only in values array */
                ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
                /* JADX INFO: Fake field, exist only in values array */
                ISO8859_2(4, "ISO-8859-2"),
                /* JADX INFO: Fake field, exist only in values array */
                ISO8859_3(5, "ISO-8859-3"),
                /* JADX INFO: Fake field, exist only in values array */
                ISO8859_4(6, "ISO-8859-4"),
                /* JADX INFO: Fake field, exist only in values array */
                ISO8859_5(7, "ISO-8859-5"),
                /* JADX INFO: Fake field, exist only in values array */
                ISO8859_6(8, "ISO-8859-6"),
                /* JADX INFO: Fake field, exist only in values array */
                ISO8859_7(9, "ISO-8859-7"),
                /* JADX INFO: Fake field, exist only in values array */
                ISO8859_8(10, "ISO-8859-8"),
                /* JADX INFO: Fake field, exist only in values array */
                ISO8859_9(11, "ISO-8859-9"),
                /* JADX INFO: Fake field, exist only in values array */
                ISO8859_10(12, "ISO-8859-10"),
                /* JADX INFO: Fake field, exist only in values array */
                ISO8859_11(13, "ISO-8859-11"),
                /* JADX INFO: Fake field, exist only in values array */
                ISO8859_13(15, "ISO-8859-13"),
                /* JADX INFO: Fake field, exist only in values array */
                ISO8859_14(16, "ISO-8859-14"),
                /* JADX INFO: Fake field, exist only in values array */
                ISO8859_15(17, "ISO-8859-15"),
                /* JADX INFO: Fake field, exist only in values array */
                ISO8859_16(18, "ISO-8859-16"),
                /* JADX INFO: Fake field, exist only in values array */
                SJIS(20, "Shift_JIS"),
                /* JADX INFO: Fake field, exist only in values array */
                Cp1250(21, "windows-1250"),
                /* JADX INFO: Fake field, exist only in values array */
                Cp1251(22, "windows-1251"),
                /* JADX INFO: Fake field, exist only in values array */
                Cp1252(23, "windows-1252"),
                /* JADX INFO: Fake field, exist only in values array */
                Cp1256(24, "windows-1256"),
                /* JADX INFO: Fake field, exist only in values array */
                UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
                /* JADX INFO: Fake field, exist only in values array */
                UTF8(26, "UTF-8"),
                /* JADX INFO: Fake field, exist only in values array */
                ASCII(new int[]{27, 170}, "US-ASCII"),
                /* JADX INFO: Fake field, exist only in values array */
                Big5(new int[]{28}, new String[0]),
                /* JADX INFO: Fake field, exist only in values array */
                GB18030(29, "GB2312", "EUC_CN", "GBK"),
                /* JADX INFO: Fake field, exist only in values array */
                EUC_KR(30, "EUC-KR");


                /* JADX INFO: renamed from: c */
                public static final HashMap f17253c = new HashMap();

                /* JADX INFO: renamed from: d */
                public static final HashMap f17254d = new HashMap();

                /* JADX INFO: renamed from: a */
                public final int[] f17256a;

                /* JADX INFO: renamed from: b */
                public final String[] f17257b;

                static {
/* 544 */           for (EnumC2230tt enumC2230tt : values()) {
/* 553 */               for (int i : enumC2230tt.f17256a) {
/* 563 */                   f17253c.put(Integer.valueOf(i), enumC2230tt);
                        }
/* 575 */               f17254d.put(enumC2230tt.name(), enumC2230tt);
/* 583 */               for (String str : enumC2230tt.f17257b) {
/* 589 */                   f17254d.put(str, enumC2230tt);
                        }
                    }
                }

                EnumC2230tt(int i, String... strArr) {
/* 8 */             this.f17256a = new int[]{i};
/* 10 */            this.f17257b = strArr;
                }

/* 12 */        EnumC2230tt(int[] iArr, String... strArr) {
/* 14 */            this.f17256a = iArr;
/* 15 */            this.f17257b = strArr;
                }
            }
