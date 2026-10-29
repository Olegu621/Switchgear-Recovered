            package io.sentry.util;

            import java.util.Arrays;
            import java.util.UUID;
            
            /* JADX INFO: renamed from: io.sentry.util.p */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC1717p {

                /* JADX INFO: renamed from: a */
                public static final char[] f11745a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

                static {
/* 12 */            long[] jArr = new long[128];
/* 16 */            Arrays.fill(jArr, -1L);
/* 23 */            jArr[48] = 0;
/* 29 */            jArr[49] = 1;
/* 35 */            jArr[50] = 2;
/* 41 */            jArr[51] = 3;
/* 47 */            jArr[52] = 4;
/* 53 */            jArr[53] = 5;
/* 59 */            jArr[54] = 6;
/* 65 */            jArr[55] = 7;
/* 71 */            jArr[56] = 8;
/* 77 */            jArr[57] = 9;
/* 83 */            jArr[97] = 10;
/* 89 */            jArr[98] = 11;
/* 95 */            jArr[99] = 12;
/* 101 */           jArr[100] = 13;
/* 107 */           jArr[101] = 14;
/* 113 */           jArr[102] = 15;
/* 117 */           jArr[65] = 10;
/* 121 */           jArr[66] = 11;
/* 125 */           jArr[67] = 12;
/* 129 */           jArr[68] = 13;
/* 133 */           jArr[69] = 14;
/* 137 */           jArr[70] = 15;
                }

                /* JADX INFO: renamed from: a */
                public static void m5487a(char[] cArr, long j) {
/* 8 */             char[] cArr2 = f11745a;
/* 13 */            cArr[0] = cArr2[(int) (((-1152921504606846976L) & j) >>> 60)];
/* 25 */            cArr[1] = cArr2[(int) ((1080863910568919040L & j) >>> 56)];
/* 37 */            cArr[2] = cArr2[(int) ((67553994410557440L & j) >>> 52)];
/* 49 */            cArr[3] = cArr2[(int) ((4222124650659840L & j) >>> 48)];
/* 64 */            cArr[4] = cArr2[(int) ((263882790666240L & j) >>> 44)];
/* 79 */            cArr[5] = cArr2[(int) ((16492674416640L & j) >>> 40)];
/* 94 */            cArr[6] = cArr2[(int) ((1030792151040L & j) >>> 36)];
/* 109 */           cArr[7] = cArr2[(int) ((64424509440L & j) >>> 32)];
/* 125 */           cArr[8] = cArr2[(int) ((4026531840L & j) >>> 28)];
/* 139 */           cArr[9] = cArr2[(int) ((251658240 & j) >>> 24)];
/* 153 */           cArr[10] = cArr2[(int) ((15728640 & j) >>> 20)];
/* 167 */           cArr[11] = cArr2[(int) ((983040 & j) >>> 16)];
/* 179 */           cArr[12] = cArr2[(int) ((61440 & j) >>> 12)];
/* 191 */           cArr[13] = cArr2[(int) ((3840 & j) >>> 8)];
/* 203 */           cArr[14] = cArr2[(int) ((240 & j) >>> 4)];
/* 213 */           cArr[15] = cArr2[(int) (j & 15)];
                }

                /* JADX INFO: renamed from: b */
                public static String m5488b(UUID uuid) {
/* 1 */             long mostSignificantBits = uuid.getMostSignificantBits();
/* 5 */             long leastSignificantBits = uuid.getLeastSignificantBits();
/* 11 */            char[] cArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, cArr[(int) (((-1152921504606846976L) & leastSignificantBits) >>> 60)], cArr[(int) ((1080863910568919040L & leastSignificantBits) >>> 56)], cArr[(int) ((67553994410557440L & leastSignificantBits) >>> 52)], cArr[(int) ((4222124650659840L & leastSignificantBits) >>> 48)], cArr[(int) ((263882790666240L & leastSignificantBits) >>> 44)], cArr[(int) ((16492674416640L & leastSignificantBits) >>> 40)], cArr[(int) ((1030792151040L & leastSignificantBits) >>> 36)], cArr[(int) ((64424509440L & leastSignificantBits) >>> 32)], cArr[(int) ((4026531840L & leastSignificantBits) >>> 28)], cArr[(int) ((251658240 & leastSignificantBits) >>> 24)], cArr[(int) ((15728640 & leastSignificantBits) >>> 20)], cArr[(int) ((983040 & leastSignificantBits) >>> 16)], cArr[(int) ((61440 & leastSignificantBits) >>> 12)], cArr[(int) ((3840 & leastSignificantBits) >>> 8)], cArr[(int) ((240 & leastSignificantBits) >>> 4)], cArr[(int) (leastSignificantBits & 15)]};
/* 13 */            m5487a(cArr, mostSignificantBits);
/* 23 */            char[] cArr2 = f11745a;
/* 236 */           return new String(cArr);
                }
            }
