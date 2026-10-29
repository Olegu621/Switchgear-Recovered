            package io.sentry.vendor.gson.stream;

            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.io.Closeable;
            import java.io.EOFException;
            import java.io.IOException;
            import java.io.Reader;
            import java.util.Arrays;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import okio.Segment;
            import okio.internal.Buffer;
            import p000.C1868kw;
            import p000.f42;
            
            /* JADX INFO: renamed from: io.sentry.vendor.gson.stream.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1730a implements Closeable {

                /* JADX INFO: renamed from: U */
                public int f11768U;

                /* JADX INFO: renamed from: V */
                public String f11769V;

                /* JADX INFO: renamed from: W */
                public int[] f11770W;

                /* JADX INFO: renamed from: Y */
                public String[] f11772Y;

                /* JADX INFO: renamed from: Z */
                public int[] f11773Z;

                /* JADX INFO: renamed from: a */
                public final Reader f11774a;

                /* JADX INFO: renamed from: w */
                public long f11782w;

                /* JADX INFO: renamed from: b */
                public boolean f11775b = false;

                /* JADX INFO: renamed from: c */
                public final char[] f11776c = new char[Segment.SHARE_MINIMUM];

                /* JADX INFO: renamed from: d */
                public int f11777d = 0;

                /* JADX INFO: renamed from: e */
                public int f11778e = 0;

                /* JADX INFO: renamed from: f */
                public int f11779f = 0;

                /* JADX INFO: renamed from: i */
                public int f11780i = 0;

                /* JADX INFO: renamed from: v */
                public int f11781v = 0;

                /* JADX INFO: renamed from: X */
                public int f11771X = 1;

                public C1730a(Reader reader) {
/* 25 */            int[] iArr = new int[32];
/* 27 */            this.f11770W = iArr;
/* 33 */            iArr[0] = 6;
/* 37 */            this.f11772Y = new String[32];
/* 41 */            this.f11773Z = new int[32];
/* 43 */            this.f11774a = reader;
                }

                /* JADX INFO: renamed from: c */
                public final void m5498c() {
/* 3 */             if (this.f11775b) {
/* 5 */                 return;
                    }
/* 8 */             m5510s("Use JsonReader.setLenient(true) to accept malformed JSON");
/* 12 */            throw null;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
/* 2 */             this.f11781v = 0;
/* 8 */             this.f11770W[0] = 8;
/* 11 */            this.f11771X = 1;
/* 15 */            this.f11774a.close();
                }

                /* JADX WARN: Code duplicated, block: B:115:0x0179 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:116:0x017a  */
                /* JADX WARN: Code duplicated, block: B:119:0x018b  */
                /* JADX WARN: Code duplicated, block: B:122:0x0191  */
                /* JADX WARN: Code duplicated, block: B:125:0x019c  */
                /* JADX WARN: Code duplicated, block: B:126:0x01a0 A[PHI: r1 r7
  0x01a0: PHI (r1v56 int) = (r1v55 int), (r1v71 int) binds: [B:118:0x0189, B:125:0x019c] A[DONT_GENERATE, DONT_INLINE]
  0x01a0: PHI (r7v7 int) = (r7v6 int), (r7v8 int) binds: [B:118:0x0189, B:125:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:128:0x01a8  */
                /* JADX WARN: Code duplicated, block: B:130:0x01ac  */
                /* JADX WARN: Code duplicated, block: B:169:0x020f  */
                /* JADX WARN: Code duplicated, block: B:170:0x0211  */
                /* JADX WARN: Code duplicated, block: B:182:0x0232 A[DONT_INVERT, PHI: r10
  0x0232: PHI (r10v31 char) = (r10v30 char), (r10v32 char) binds: [B:168:0x020d, B:174:0x021a] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:183:0x0234  */
                /* JADX WARN: Code duplicated, block: B:196:0x0252  */
                /* JADX WARN: Code duplicated, block: B:198:0x0256  */
                /* JADX WARN: Code duplicated, block: B:201:0x025b  */
                /* JADX WARN: Code duplicated, block: B:206:0x0265 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:207:0x0266  */
                /* JADX WARN: Code duplicated, block: B:209:0x0270  */
                /* JADX WARN: Code duplicated, block: B:211:0x0276  */
                /* JADX WARN: Code duplicated, block: B:271:0x018e A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:272:0x018e A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:273:0x0199 A[SYNTHETIC] */
                /* JADX INFO: renamed from: f */
                public final int m5499f() throws IOException {
                    int iM5503k;
                    String str;
                    String str2;
                    int i;
                    int i2;
                    char c;
                    int i3;
                    int i4;
                    boolean z;
                    int i5;
                    char c2;
                    char c3;
                    char c4;
                    int i6;
                    char c5;
/* 3 */             int[] iArr = this.f11770W;
/* 8 */             int i7 = this.f11771X - 1;
/* 9 */             int i8 = iArr[i7];
/* 25 */            char[] cArr = this.f11776c;
/* 32 */            if (i8 == 1) {
/* 34 */                iArr[i7] = 2;
                    } else if (i8 == 2) {
/* 40 */                int iM5503k2 = m5503k(true);
/* 44 */                if (iM5503k2 != 44) {
/* 46 */                    if (iM5503k2 != 59) {
/* 48 */                        if (iM5503k2 == 93) {
/* 50 */                            this.f11781v = 4;
/* 27 */                            return 4;
                                }
/* 55 */                        m5510s("Unterminated array");
/* 58 */                        throw null;
                            }
/* 59 */                    m5498c();
                        }
                    } else {
/* 66 */                if (i8 == 3 || i8 == 5) {
/* 694 */                   iArr[i7] = 4;
/* 696 */                   if (i8 == 5 && (iM5503k = m5503k(true)) != 44) {
/* 704 */                       if (iM5503k != 59) {
/* 706 */                           if (iM5503k == 125) {
/* 709 */                               this.f11781v = 2;
/* 708 */                               return 2;
                                    }
/* 714 */                           m5510s("Unterminated object");
/* 717 */                           throw null;
                                }
/* 718 */                       m5498c();
                            }
/* 721 */                   int iM5503k3 = m5503k(true);
/* 727 */                   if (iM5503k3 == 34) {
/* 779 */                       this.f11781v = 13;
/* 777 */                       return 13;
                            }
/* 729 */                   if (iM5503k3 == 39) {
/* 769 */                       m5498c();
/* 774 */                       this.f11781v = 12;
/* 772 */                       return 12;
                            }
/* 733 */                   if (iM5503k3 == 125) {
/* 759 */                       if (i8 != 5) {
/* 762 */                           this.f11781v = 2;
/* 761 */                           return 2;
                                }
/* 765 */                       m5510s("Expected name");
/* 768 */                       throw null;
                            }
/* 735 */                   m5498c();
/* 741 */                   this.f11777d--;
/* 748 */                   if (m5501h((char) iM5503k3)) {
/* 752 */                       this.f11781v = 14;
/* 750 */                       return 14;
                            }
/* 755 */                   m5510s("Expected name");
/* 758 */                   throw null;
                        }
/* 74 */                if (i8 == 4) {
/* 76 */                    iArr[i7] = 5;
/* 78 */                    int iM5503k4 = m5503k(true);
/* 84 */                    if (iM5503k4 != 58) {
/* 88 */                        if (iM5503k4 != 61) {
/* 120 */                           m5510s("Expected ':'");
/* 123 */                           throw null;
                                }
/* 90 */                        m5498c();
/* 97 */                        if (this.f11777d < this.f11778e || m5500g(1)) {
/* 105 */                           int i9 = this.f11777d;
/* 111 */                           if (cArr[i9] == '>') {
/* 114 */                               this.f11777d = i9 + 1;
                                    }
                                }
                            }
                        } else if (i8 == 6) {
/* 128 */                   if (this.f11775b) {
/* 130 */                       m5503k(true);
/* 133 */                       int i10 = this.f11777d;
/* 135 */                       int i11 = i10 - 1;
/* 137 */                       this.f11777d = i11;
/* 143 */                       if ((i10 + 4 <= this.f11778e || m5500g(5)) && cArr[i11] == ')' && cArr[i10] == ']' && cArr[i10 + 1] == '}' && cArr[i10 + 2] == '\'' && cArr[i10 + 3] == '\n') {
/* 184 */                           this.f11777d += 5;
                                }
                            }
/* 191 */                   this.f11770W[this.f11771X - 1] = 7;
                        } else if (i8 == 7) {
/* 204 */                   if (m5503k(false) == -1) {
/* 208 */                       this.f11781v = 17;
/* 206 */                       return 17;
                            }
/* 211 */                   m5498c();
/* 217 */                   this.f11777d--;
                        } else if (i8 == 8) {
/* 688 */                   f42.m3656l("JsonReader is closed");
/* 691 */                   return 0;
                        }
                    }
/* 224 */           int iM5503k5 = m5503k(true);
/* 230 */           if (iM5503k5 == 34) {
/* 683 */               this.f11781v = 9;
/* 681 */               return 9;
                    }
/* 232 */           if (iM5503k5 == 39) {
/* 673 */               m5498c();
/* 678 */               this.f11781v = 8;
/* 676 */               return 8;
                    }
/* 234 */           if (iM5503k5 != 44 && iM5503k5 != 59) {
/* 240 */               if (iM5503k5 == 91) {
/* 646 */                   this.f11781v = 3;
/* 16 */                    return 3;
                        }
/* 242 */               if (iM5503k5 != 93) {
/* 246 */                   if (iM5503k5 == 123) {
/* 637 */                       this.f11781v = 1;
/* 7 */                         return 1;
                            }
/* 250 */                   int i12 = this.f11777d - 1;
/* 251 */                   this.f11777d = i12;
/* 253 */                   char c6 = cArr[i12];
/* 257 */                   if (c6 == 't' || c6 == 'T') {
/* 296 */                       str = "true";
/* 298 */                       str2 = "TRUE";
/* 300 */                       i = 5;
                            } else {
/* 266 */                       if (c6 != 'f' && c6 != 'F') {
/* 275 */                           if (c6 != 'n' && c6 != 'N') {
/* 282 */                               i2 = 0;
                                        break;
                                    }
/* 284 */                           str = "null";
/* 286 */                           str2 = "NULL";
/* 288 */                           i = 7;
/* 376 */                           if (i2 != 0) {
/* 378 */                               return i2;
                                    }
/* 379 */                           i3 = this.f11777d;
/* 381 */                           i4 = this.f11778e;
/* 384 */                           z = true;
/* 385 */                           i5 = 0;
/* 386 */                           boolean z2 = false;
/* 387 */                           c2 = 0;
/* 388 */                           long j = 0;
                                    while (true) {
/* 394 */                               if (i3 + i5 != i4) {
/* 419 */                                   c3 = cArr[i3 + i5];
/* 423 */                                   if (c3 != '+') {
/* 427 */                                       if (c3 != 'E' || c3 == 'e') {
/* 597 */                                           if (c2 != 2 || c2 == 4) {
/* 602 */                                               c2 = 5;
/* 608 */                                               i5++;
                                                    }
                                                } else if (c3 == '-') {
/* 585 */                                           c4 = 6;
/* 586 */                                           if (c2 == 0) {
/* 588 */                                               z2 = true;
/* 589 */                                               c2 = 1;
                                                    } else {
/* 591 */                                               if (c2 != 5) {
                                                        }
/* 593 */                                               c2 = c4;
                                                    }
/* 608 */                                           i5++;
                                                } else if (c3 != '.') {
/* 443 */                                           if (c3 >= '0' && c3 <= '9') {
/* 450 */                                               if (c2 == 1 || c2 == 0) {
/* 514 */                                                   j = -(c3 - '0');
/* 516 */                                                   c2 = 2;
                                                        } else if (c2 == 2) {
/* 461 */                                                   if (j != 0) {
/* 471 */                                                       long j2 = (10 * j) - ((long) (c3 - '0'));
/* 492 */                                                       z &= j > Buffer.OVERFLOW_ZONE || (j == Buffer.OVERFLOW_ZONE && j2 < j);
/* 493 */                                                       j = j2;
                                                            }
                                                        } else if (c2 == 3) {
/* 501 */                                                   c2 = 4;
                                                        } else if (c2 == 5 || c2 == 6) {
/* 509 */                                                   c2 = 7;
                                                        }
/* 608 */                                               i5++;
                                                    } else if (!m5501h(c3)) {
/* 410 */                                               c5 = 2;
/* 526 */                                               if (c2 != 2) {
/* 563 */                                                   if (c2 != c5 || c2 == 4 || c2 == 7) {
/* 571 */                                                       this.f11768U = i5;
/* 573 */                                                       i6 = 16;
/* 575 */                                                       this.f11781v = 16;
                                                            }
                                                        } else if (z || ((j == Long.MIN_VALUE && !z2) || (j == 0 && z2))) {
/* 539 */                                                   c5 = 2;
/* 563 */                                                   if (c2 != c5) {
                                                            }
/* 571 */                                                   this.f11768U = i5;
/* 573 */                                                   i6 = 16;
/* 575 */                                                   this.f11781v = 16;
                                                        } else {
/* 547 */                                                   if (!z2) {
/* 550 */                                                       j = -j;
                                                            }
/* 551 */                                                   this.f11782w = j;
/* 556 */                                                   this.f11777d += i5;
/* 558 */                                                   i6 = 15;
/* 560 */                                                   this.f11781v = 15;
                                                        }
                                                    }
                                                } else if (c2 == 2) {
/* 582 */                                           c2 = 3;
/* 608 */                                           i5++;
                                                }
/* 612 */                                       if (i6 != 0) {
/* 614 */                                           return i6;
                                                }
/* 623 */                                       if (m5501h(cArr[this.f11777d])) {
/* 633 */                                           m5510s("Expected value");
/* 636 */                                           throw null;
                                                }
/* 625 */                                       m5498c();
/* 628 */                                       this.f11781v = 10;
/* 11 */                                        return 10;
                                            }
/* 604 */                                   c4 = 6;
/* 605 */                                   if (c2 != 5) {
                                            }
/* 593 */                                   c2 = c4;
/* 608 */                                   i5++;
                                        } else if (i5 != cArr.length) {
/* 408 */                                   if (!m5500g(i5 + 1)) {
/* 413 */                                       i3 = this.f11777d;
/* 415 */                                       i4 = this.f11778e;
/* 419 */                                       c3 = cArr[i3 + i5];
/* 423 */                                       if (c3 != '+') {
/* 427 */                                           if (c3 != 'E') {
/* 597 */                                               if (c2 != 2) {
                                                        }
/* 602 */                                               c2 = 5;
/* 608 */                                               i5++;
                                                    } else {
/* 597 */                                               if (c2 != 2) {
                                                        }
/* 602 */                                               c2 = 5;
/* 608 */                                               i5++;
                                                    }
/* 612 */                                           if (i6 != 0) {
/* 614 */                                               return i6;
                                                    }
/* 623 */                                           if (m5501h(cArr[this.f11777d])) {
/* 633 */                                               m5510s("Expected value");
/* 636 */                                               throw null;
                                                    }
/* 625 */                                           m5498c();
/* 628 */                                           this.f11781v = 10;
/* 11 */                                            return 10;
                                                }
/* 604 */                                       c4 = 6;
/* 605 */                                       if (c2 != 5) {
                                                }
/* 593 */                                       c2 = c4;
/* 608 */                                       i5++;
                                            }
/* 410 */                                   c5 = 2;
/* 526 */                                   if (c2 != 2) {
/* 563 */                                       if (c2 != c5) {
                                                }
/* 571 */                                       this.f11768U = i5;
/* 573 */                                       i6 = 16;
/* 575 */                                       this.f11781v = 16;
                                            } else {
/* 528 */                                       if (z) {
                                                }
/* 539 */                                       c5 = 2;
/* 563 */                                       if (c2 != c5) {
                                                }
/* 571 */                                       this.f11768U = i5;
/* 573 */                                       i6 = 16;
/* 575 */                                       this.f11781v = 16;
                                            }
/* 612 */                                   if (i6 != 0) {
/* 614 */                                       return i6;
                                            }
/* 623 */                                   if (m5501h(cArr[this.f11777d])) {
/* 633 */                                       m5510s("Expected value");
/* 636 */                                       throw null;
                                            }
/* 625 */                                   m5498c();
/* 628 */                                   this.f11781v = 10;
/* 11 */                                    return 10;
                                        }
/* 399 */                               i6 = 0;
/* 612 */                               if (i6 != 0) {
/* 614 */                                   return i6;
                                        }
/* 623 */                               if (m5501h(cArr[this.f11777d])) {
/* 633 */                                   m5510s("Expected value");
/* 636 */                                   throw null;
                                        }
/* 625 */                               m5498c();
/* 628 */                               this.f11781v = 10;
/* 11 */                                return 10;
                                    }
                                }
/* 290 */                       str = "false";
/* 292 */                       str2 = "FALSE";
/* 294 */                       i = 6;
                            }
/* 301 */                   int length = str.length();
/* 305 */                   int i13 = 1;
                            while (true) {
/* 306 */                       int i14 = this.f11777d;
/* 308 */                       int i15 = this.f11778e;
/* 310 */                       if (i13 >= length) {
/* 346 */                           if ((i14 + length >= i15 && !m5500g(length + 1)) || !m5501h(cArr[this.f11777d + length])) {
/* 371 */                               this.f11777d += length;
/* 373 */                               this.f11781v = i;
/* 375 */                               i2 = i;
                                        break;
                                    }
                                    break;
                                }
/* 313 */                       if ((i14 + i13 < i15 || m5500g(i13 + 1)) && ((c = cArr[this.f11777d + i13]) == str.charAt(i13) || c == str2.charAt(i13))) {
/* 342 */                           i13++;
                                }
/* 282 */                       i2 = 0;
                                break;
                            }
/* 376 */                   if (i2 != 0) {
/* 378 */                       return i2;
                            }
/* 379 */                   i3 = this.f11777d;
/* 381 */                   i4 = this.f11778e;
/* 384 */                   z = true;
/* 385 */                   i5 = 0;
/* 386 */                   boolean z3 = false;
/* 387 */                   c2 = 0;
/* 388 */                   long j3 = 0;
                            while (true) {
/* 394 */                       if (i3 + i5 != i4) {
/* 419 */                           c3 = cArr[i3 + i5];
/* 423 */                           if (c3 != '+') {
/* 427 */                               if (c3 != 'E') {
/* 597 */                                   if (c2 != 2) {
                                            }
/* 602 */                                   c2 = 5;
/* 608 */                                   i5++;
                                        } else {
/* 597 */                                   if (c2 != 2) {
                                            }
/* 602 */                                   c2 = 5;
/* 608 */                                   i5++;
                                        }
/* 612 */                               if (i6 != 0) {
/* 614 */                                   return i6;
                                        }
/* 623 */                               if (m5501h(cArr[this.f11777d])) {
/* 633 */                                   m5510s("Expected value");
/* 636 */                                   throw null;
                                        }
/* 625 */                               m5498c();
/* 628 */                               this.f11781v = 10;
/* 11 */                                return 10;
                                    }
/* 604 */                           c4 = 6;
/* 605 */                           if (c2 != 5) {
                                    }
/* 593 */                           c2 = c4;
/* 608 */                           i5++;
                                } else if (i5 != cArr.length) {
/* 408 */                           if (!m5500g(i5 + 1)) {
/* 413 */                               i3 = this.f11777d;
/* 415 */                               i4 = this.f11778e;
/* 419 */                               c3 = cArr[i3 + i5];
/* 423 */                               if (c3 != '+') {
/* 427 */                                   if (c3 != 'E') {
/* 597 */                                       if (c2 != 2) {
                                                }
/* 602 */                                       c2 = 5;
/* 608 */                                       i5++;
                                            } else {
/* 597 */                                       if (c2 != 2) {
                                                }
/* 602 */                                       c2 = 5;
/* 608 */                                       i5++;
                                            }
/* 612 */                                   if (i6 != 0) {
/* 614 */                                       return i6;
                                            }
/* 623 */                                   if (m5501h(cArr[this.f11777d])) {
/* 633 */                                       m5510s("Expected value");
/* 636 */                                       throw null;
                                            }
/* 625 */                                   m5498c();
/* 628 */                                   this.f11781v = 10;
/* 11 */                                    return 10;
                                        }
/* 604 */                               c4 = 6;
/* 605 */                               if (c2 != 5) {
                                        }
/* 593 */                               c2 = c4;
/* 608 */                               i5++;
                                    }
/* 410 */                           c5 = 2;
/* 526 */                           if (c2 != 2) {
/* 563 */                               if (c2 != c5) {
                                        }
/* 571 */                               this.f11768U = i5;
/* 573 */                               i6 = 16;
/* 575 */                               this.f11781v = 16;
                                    } else {
/* 528 */                               if (z) {
                                        }
/* 539 */                               c5 = 2;
/* 563 */                               if (c2 != c5) {
                                        }
/* 571 */                               this.f11768U = i5;
/* 573 */                               i6 = 16;
/* 575 */                               this.f11781v = 16;
                                    }
/* 612 */                           if (i6 != 0) {
/* 614 */                               return i6;
                                    }
/* 623 */                           if (m5501h(cArr[this.f11777d])) {
/* 633 */                               m5510s("Expected value");
/* 636 */                               throw null;
                                    }
/* 625 */                           m5498c();
/* 628 */                           this.f11781v = 10;
/* 11 */                            return 10;
                                }
/* 399 */                       i6 = 0;
/* 612 */                       if (i6 != 0) {
/* 614 */                           return i6;
                                }
/* 623 */                       if (m5501h(cArr[this.f11777d])) {
/* 633 */                           m5510s("Expected value");
/* 636 */                           throw null;
                                }
/* 625 */                       m5498c();
/* 628 */                       this.f11781v = 10;
/* 11 */                        return 10;
                            }
                        }
/* 640 */               if (i8 == 1) {
/* 643 */                   this.f11781v = 4;
/* 642 */                   return 4;
                        }
                    }
/* 649 */           if (i8 != 1 && i8 != 2) {
/* 657 */               m5510s("Unexpected value");
/* 660 */               throw null;
                    }
/* 661 */           m5498c();
/* 667 */           this.f11777d--;
/* 670 */           this.f11781v = 7;
/* 669 */           return 7;
                }

                /* JADX INFO: renamed from: g */
                public final boolean m5500g(int i) throws IOException {
                    int i2;
                    int i3;
/* 1 */             int i4 = this.f11780i;
/* 3 */             int i5 = this.f11777d;
/* 6 */             this.f11780i = i4 - i5;
/* 8 */             int i6 = this.f11778e;
/* 11 */            char[] cArr = this.f11776c;
/* 13 */            if (i6 != i5) {
/* 15 */                int i7 = i6 - i5;
/* 16 */                this.f11778e = i7;
/* 18 */                System.arraycopy(cArr, i5, cArr, 0, i7);
                    } else {
/* 22 */                this.f11778e = 0;
                    }
/* 24 */            this.f11777d = 0;
/* 73 */            do {
/* 26 */                int i8 = this.f11778e;
/* 32 */                int i9 = this.f11774a.read(cArr, i8, cArr.length - i8);
/* 37 */                if (i9 == -1) {
/* 10 */                    return false;
                        }
/* 41 */                i2 = this.f11778e + i9;
/* 42 */                this.f11778e = i2;
/* 47 */                if (this.f11779f == 0 && (i3 = this.f11780i) == 0 && i2 > 0 && cArr[0] == 65279) {
/* 65 */                    this.f11777d++;
/* 69 */                    this.f11780i = i3 + 1;
/* 71 */                    i++;
                        }
/* 73 */            } while (i2 < i);
/* 46 */            return true;
                }

                /* JADX INFO: renamed from: h */
                public final boolean m5501h(char c) {
/* 3 */             if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
/* 61 */                return false;
                    }
/* 23 */            if (c != '#') {
/* 27 */                if (c == ',') {
/* 61 */                    return false;
                        }
/* 31 */                if (c != '/' && c != '=') {
/* 39 */                    if (c == '{' || c == '}' || c == ':') {
/* 61 */                        return false;
                            }
/* 51 */                    if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
/* 61 */                                return false;
                                    case '\\':
                                        break;
                                    default:
/* 56 */                                return true;
                                }
                            }
                        }
                    }
/* 58 */            m5498c();
/* 61 */            return false;
                }

                public final boolean hasNext() throws IOException {
/* 1 */             int iM5499f = this.f11781v;
/* 3 */             if (iM5499f == 0) {
/* 5 */                 iM5499f = m5499f();
                    }
                    return (iM5499f == 2 || iM5499f == 4) ? false : true;
                }

                /* JADX INFO: renamed from: i */
                public final String m5502i() {
/* 4 */             int i = this.f11779f + 1;
/* 10 */            int i2 = (this.f11777d - this.f11780i) + 1;
/* 15 */            StringBuilder sb = new StringBuilder(" at line ");
/* 18 */            sb.append(i);
/* 23 */            sb.append(" column ");
/* 26 */            sb.append(i2);
/* 31 */            sb.append(" path ");
/* 38 */            StringBuilder sb2 = new StringBuilder("$");
/* 41 */            int i3 = this.f11771X;
/* 44 */            for (int i4 = 0; i4 < i3; i4++) {
/* 48 */                int i5 = this.f11770W[i4];
/* 50 */                if (i5 == 1 || i5 == 2) {
/* 82 */                    sb2.append('[');
/* 89 */                    sb2.append(this.f11773Z[i4]);
/* 94 */                    sb2.append(']');
                        } else if (i5 == 3 || i5 == 4 || i5 == 5) {
/* 67 */                    sb2.append('.');
/* 72 */                    String str = this.f11772Y[i4];
/* 74 */                    if (str != null) {
/* 76 */                        sb2.append(str);
                            }
                        }
                    }
/* 104 */           sb.append(sb2.toString());
/* 107 */           return sb.toString();
                }

                /* JADX INFO: renamed from: k */
                public final int m5503k(boolean z) throws IOException {
/* 1 */             int i = this.f11777d;
/* 3 */             int i2 = this.f11778e;
                    while (true) {
/* 6 */                 if (i == i2) {
/* 8 */                     this.f11777d = i;
/* 14 */                    if (!m5500g(1)) {
/* 16 */                        if (z) {
/* 35 */                            throw new EOFException("End of input".concat(m5502i()));
                                }
/* 18 */                        return -1;
                            }
/* 36 */                    i = this.f11777d;
/* 38 */                    i2 = this.f11778e;
                        }
/* 40 */                int i3 = i + 1;
/* 42 */                char[] cArr = this.f11776c;
/* 44 */                char c = cArr[i];
/* 48 */                if (c == '\n') {
/* 53 */                    this.f11779f++;
/* 55 */                    this.f11780i = i3;
                        } else if (c != ' ' && c != '\r' && c != '\t') {
/* 75 */                    if (c == '/') {
/* 77 */                        this.f11777d = i3;
/* 80 */                        if (i3 == i2) {
/* 82 */                            this.f11777d = i;
/* 84 */                            boolean zM5500g = m5500g(2);
/* 91 */                            this.f11777d++;
/* 93 */                            if (!zM5500g) {
                                    }
/* 109 */                           return c;
                                }
/* 96 */                        m5498c();
/* 99 */                        int i4 = this.f11777d;
/* 101 */                       char c2 = cArr[i4];
/* 105 */                       if (c2 == '*') {
/* 124 */                           this.f11777d = i4 + 1;
                                    while (true) {
/* 131 */                               if (this.f11777d + 2 > this.f11778e && !m5500g(2)) {
/* 142 */                                   m5510s("Unterminated comment");
/* 146 */                                   throw null;
                                        }
/* 147 */                               int i5 = this.f11777d;
/* 151 */                               if (cArr[i5] != '\n') {
/* 163 */                                   int i6 = 0;
                                            while (true) {
/* 164 */                                       int i7 = this.f11777d;
/* 166 */                                       if (i6 >= 2) {
/* 188 */                                           i = i7 + 2;
/* 190 */                                           i2 = this.f11778e;
                                                    break;
                                                }
/* 177 */                                       if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                                    break;
                                                }
/* 185 */                                       i6++;
                                            }
                                        } else {
/* 156 */                                   this.f11779f++;
/* 160 */                                   this.f11780i = i5 + 1;
                                        }
/* 182 */                               this.f11777d++;
                                    }
                                } else {
/* 107 */                           if (c2 != '/') {
/* 109 */                               return c;
                                    }
/* 112 */                           this.f11777d = i4 + 1;
/* 114 */                           m5509q();
/* 117 */                           i = this.f11777d;
/* 119 */                           i2 = this.f11778e;
                                }
                            } else {
/* 196 */                       if (c != '#') {
/* 212 */                           this.f11777d = i3;
/* 214 */                           return c;
                                }
/* 198 */                       this.f11777d = i3;
/* 200 */                       m5498c();
/* 203 */                       m5509q();
/* 206 */                       i = this.f11777d;
/* 208 */                       i2 = this.f11778e;
                            }
                        }
/* 215 */               i = i3;
                    }
                }

                /* JADX INFO: renamed from: l */
                public final String m5504l(char c) throws IOException {
                    int i;
                    char[] cArr;
/* 2 */             StringBuilder sb = null;
/* 119 */           do {
/* 3 */                 int i2 = this.f11777d;
/* 5 */                 int i3 = this.f11778e;
                        while (true) {
/* 7 */                     int i4 = i3;
/* 8 */                     i = i2;
                            while (true) {
/* 12 */                        cArr = this.f11776c;
/* 14 */                        if (i2 < i4) {
/* 16 */                            int i5 = i2 + 1;
/* 18 */                            char c2 = cArr[i2];
/* 20 */                            if (c2 == c) {
/* 22 */                                this.f11777d = i5;
/* 25 */                                int i6 = (i5 - i) - 1;
/* 26 */                                if (sb == null) {
/* 30 */                                    return new String(cArr, i, i6);
                                        }
/* 34 */                                sb.append(cArr, i, i6);
/* 37 */                                return sb.toString();
                                    }
/* 44 */                            if (c2 == '\\') {
/* 46 */                                this.f11777d = i5;
/* 48 */                                int i7 = i5 - i;
/* 49 */                                int i8 = i7 - 1;
/* 51 */                                if (sb == null) {
/* 61 */                                    sb = new StringBuilder(Math.max(i7 * 2, 16));
                                        }
/* 64 */                                sb.append(cArr, i, i8);
/* 71 */                                sb.append(m5507o());
/* 74 */                                i2 = this.f11777d;
/* 76 */                                i3 = this.f11778e;
                                    } else {
/* 81 */                                if (c2 == '\n') {
/* 86 */                                    this.f11779f++;
/* 88 */                                    this.f11780i = i5;
                                        }
/* 90 */                                i2 = i5;
                                    }
                                }
                            }
                        }
/* 92 */                if (sb == null) {
/* 104 */                   sb = new StringBuilder(Math.max((i2 - i) * 2, 16));
                        }
/* 110 */               sb.append(cArr, i, i2 - i);
/* 113 */               this.f11777d = i2;
/* 119 */           } while (m5500g(1));
/* 124 */           m5510s("Unterminated string");
/* 127 */           throw null;
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
                /* JADX INFO: renamed from: m */
                public final String m5505m() throws IOException {
                    String string;
/* 1 */             StringBuilder sb = null;
/* 2 */             int i = 0;
                    while (true) {
/* 3 */                 int i2 = 0;
                        while (true) {
/* 6 */                     int i3 = this.f11777d + i2;
/* 7 */                     int i4 = this.f11778e;
/* 9 */                     char[] cArr = this.f11776c;
/* 11 */                    if (i3 < i4) {
/* 13 */                        char c = cArr[i3];
/* 17 */                        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
/* 37 */                            if (c != '#') {
/* 41 */                                if (c != ',') {
/* 45 */                                    if (c != '/' && c != '=') {
/* 53 */                                        if (c != '{' && c != '}' && c != ':') {
/* 65 */                                            if (c != ';') {
                                                        switch (c) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
/* 70 */                                                        i2++;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
/* 73 */                            m5498c();
                                }
/* 89 */                        i = i2;
                            } else if (i2 >= cArr.length) {
/* 91 */                        if (sb == null) {
/* 101 */                           sb = new StringBuilder(Math.max(i2, 16));
                                }
/* 106 */                       sb.append(cArr, this.f11777d, i2);
/* 112 */                       this.f11777d += i2;
/* 119 */                       if (!m5500g(1)) {
                                }
                            } else if (!m5500g(i2 + 1)) {
/* 89 */                        i = i2;
                            }
/* 121 */                   int i5 = this.f11777d;
/* 123 */                   if (sb == null) {
/* 127 */                       string = new String(cArr, i5, i);
                            } else {
/* 131 */                       sb.append(cArr, i5, i);
/* 134 */                       string = sb.toString();
                            }
/* 141 */                   this.f11777d += i;
/* 143 */                   return string;
                        }
                    }
                }

                /* JADX INFO: renamed from: n */
                public final void m5506n(int i) {
/* 1 */             int i2 = this.f11771X;
/* 3 */             int[] iArr = this.f11770W;
/* 6 */             if (i2 == iArr.length) {
/* 8 */                 int i3 = i2 * 2;
/* 14 */                this.f11770W = Arrays.copyOf(iArr, i3);
/* 22 */                this.f11773Z = Arrays.copyOf(this.f11773Z, i3);
/* 32 */                this.f11772Y = (String[]) Arrays.copyOf(this.f11772Y, i3);
                    }
/* 34 */            int[] iArr2 = this.f11770W;
/* 36 */            int i4 = this.f11771X;
/* 40 */            this.f11771X = i4 + 1;
/* 42 */            iArr2[i4] = i;
                }

                public final double nextDouble() throws IOException {
/* 1 */             int iM5499f = this.f11781v;
/* 3 */             if (iM5499f == 0) {
/* 5 */                 iM5499f = m5499f();
                    }
/* 12 */            if (iM5499f == 15) {
/* 14 */                this.f11781v = 0;
/* 16 */                int[] iArr = this.f11773Z;
/* 20 */                int i = this.f11771X - 1;
/* 26 */                iArr[i] = iArr[i] + 1;
/* 30 */                return this.f11782w;
                    }
/* 36 */            if (iM5499f == 16) {
/* 49 */                this.f11769V = new String(this.f11776c, this.f11777d, this.f11768U);
/* 56 */                this.f11777d += this.f11768U;
                    } else if (iM5499f == 8 || iM5499f == 9) {
/* 117 */               this.f11769V = m5504l(iM5499f == 8 ? '\'' : '\"');
                    } else if (iM5499f == 10) {
/* 76 */                this.f11769V = m5505m();
                    } else if (iM5499f != 11) {
/* 86 */                StringBuilder sb = new StringBuilder("Expected a double but was ");
/* 93 */                sb.append(peek());
/* 100 */               f42.m3659o(sb, m5502i());
/* 103 */               return 0.0d;
                    }
/* 119 */           this.f11781v = 11;
/* 123 */           double d = Double.parseDouble(this.f11769V);
/* 129 */           if (!this.f11775b && (Double.isNaN(d) || Double.isInfinite(d))) {
/* 170 */               throw new C1868kw("JSON forbids NaN and infinities: " + d + m5502i());
                    }
/* 172 */           this.f11769V = null;
/* 174 */           this.f11781v = 0;
/* 176 */           int[] iArr2 = this.f11773Z;
/* 180 */           int i2 = this.f11771X - 1;
/* 186 */           iArr2[i2] = iArr2[i2] + 1;
/* 188 */           return d;
                }

                /* JADX WARN: Failed to analyze thrown exceptions
                java.util.ConcurrentModificationException
                	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
                	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
                	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
                	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
                	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
                	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
                	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
                 */
                public final String nextName() throws IOException {
                    String strM5504l;
/* 1 */             int iM5499f = this.f11781v;
/* 3 */             if (iM5499f == 0) {
/* 5 */                 iM5499f = m5499f();
                    }
/* 11 */            if (iM5499f == 14) {
/* 13 */                strM5504l = m5505m();
                    } else if (iM5499f == 12) {
/* 24 */                strM5504l = m5504l('\'');
                    } else {
/* 31 */                if (iM5499f != 13) {
/* 55 */                    StringBuilder sb = new StringBuilder("Expected a name but was ");
/* 62 */                    sb.append(peek());
/* 69 */                    f42.m3659o(sb, m5502i());
/* 72 */                    return null;
                        }
/* 35 */                strM5504l = m5504l('\"');
                    }
/* 40 */            this.f11781v = 0;
/* 48 */            this.f11772Y[this.f11771X - 1] = strM5504l;
/* 50 */            return strM5504l;
                }

                /* JADX WARN: Failed to analyze thrown exceptions
                java.util.ConcurrentModificationException
                	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
                	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
                	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
                	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
                	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
                	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
                	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
                	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
                	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
                	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
                	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
                	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
                	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
                 */
                /* JADX INFO: renamed from: o */
                public final char m5507o() throws IOException {
                    int i;
/* 9 */             if (this.f11777d == this.f11778e && !m5500g(1)) {
/* 18 */                m5510s("Unterminated escape sequence");
/* 21 */                throw null;
                    }
/* 22 */            int i2 = this.f11777d;
/* 24 */            int i3 = i2 + 1;
/* 26 */            this.f11777d = i3;
/* 28 */            char[] cArr = this.f11776c;
/* 30 */            char c = cArr[i2];
/* 34 */            if (c == '\n') {
/* 190 */               this.f11779f++;
/* 192 */               this.f11780i = i3;
/* 194 */               return c;
                    }
/* 38 */            if (c == '\"' || c == '\'' || c == '/' || c == '\\') {
/* 186 */               return c;
                    }
/* 54 */            if (c == 'b') {
/* 183 */               return '\b';
                    }
/* 58 */            if (c == 'f') {
/* 180 */               return '\f';
                    }
/* 62 */            if (c == 'n') {
/* 32 */                return '\n';
                    }
/* 66 */            if (c == 'r') {
/* 176 */               return '\r';
                    }
/* 70 */            if (c == 't') {
/* 173 */               return '\t';
                    }
/* 74 */            if (c != 'u') {
/* 169 */               m5510s("Invalid escape sequence");
/* 172 */               throw null;
                    }
/* 81 */            if (i2 + 5 > this.f11778e && !m5500g(4)) {
/* 90 */                m5510s("Unterminated escape sequence");
/* 93 */                throw null;
                    }
/* 94 */            int i4 = this.f11777d;
/* 96 */            int i5 = i4 + 4;
/* 98 */            char c2 = 0;
/* 99 */            while (i4 < i5) {
/* 101 */               char c3 = cArr[i4];
/* 105 */               char c4 = (char) (c2 << 4);
/* 108 */               if (c3 >= '0' && c3 <= '9') {
/* 114 */                   i = c3 - '0';
                        } else if (c3 >= 'a' && c3 <= 'f') {
/* 125 */                   i = c3 - 'W';
                        } else {
/* 130 */                   if (c3 < 'A' || c3 > 'F') {
/* 160 */                       throw new NumberFormatException("\\u".concat(new String(cArr, this.f11777d, 4)));
                            }
/* 136 */                   i = c3 - '7';
                        }
/* 117 */               c2 = (char) (i + c4);
/* 139 */               i4++;
                    }
/* 164 */           this.f11777d += 4;
/* 166 */           return c2;
                }

                /* JADX INFO: renamed from: p */
                public final void m5508p(char c) throws IOException {
/* 52 */            do {
/* 1 */                 int i = this.f11777d;
/* 3 */                 int i2 = this.f11778e;
/* 6 */                 while (i < i2) {
/* 8 */                     int i3 = i + 1;
/* 12 */                    char c2 = this.f11776c[i];
/* 14 */                    if (c2 == c) {
/* 16 */                        this.f11777d = i3;
/* 18 */                        return;
                            }
/* 21 */                    if (c2 == '\\') {
/* 23 */                        this.f11777d = i3;
/* 25 */                        m5507o();
/* 28 */                        i = this.f11777d;
/* 30 */                        i2 = this.f11778e;
                            } else {
/* 35 */                        if (c2 == '\n') {
/* 40 */                            this.f11779f++;
/* 42 */                            this.f11780i = i3;
                                }
/* 44 */                        i = i3;
                            }
                        }
/* 46 */                this.f11777d = i;
/* 52 */            } while (m5500g(1));
/* 57 */            m5510s("Unterminated string");
/* 61 */            throw null;
                }

                public final EnumC1731b peek() throws IOException {
/* 1 */             int iM5499f = this.f11781v;
/* 3 */             if (iM5499f == 0) {
/* 5 */                 iM5499f = m5499f();
                    }
                    switch (iM5499f) {
                        case 1:
/* 45 */                    return EnumC1731b.BEGIN_OBJECT;
                        case 2:
/* 42 */                    return EnumC1731b.END_OBJECT;
                        case 3:
/* 39 */                    return EnumC1731b.BEGIN_ARRAY;
                        case 4:
/* 36 */                    return EnumC1731b.END_ARRAY;
                        case 5:
                        case 6:
/* 33 */                    return EnumC1731b.BOOLEAN;
                        case 7:
/* 30 */                    return EnumC1731b.NULL;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
/* 27 */                    return EnumC1731b.STRING;
                        case 12:
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                        case 14:
/* 24 */                    return EnumC1731b.NAME;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                        case 16:
/* 21 */                    return EnumC1731b.NUMBER;
                        case 17:
/* 18 */                    return EnumC1731b.END_DOCUMENT;
                        default:
/* 17 */                    throw new AssertionError();
                    }
                }

                /* JADX INFO: renamed from: q */
                public final void m5509q() throws IOException {
                    char c;
/* 38 */            do {
/* 6 */                 if (this.f11777d >= this.f11778e && !m5500g(1)) {
/* 40 */                    return;
                        }
/* 14 */                int i = this.f11777d;
/* 16 */                int i2 = i + 1;
/* 18 */                this.f11777d = i2;
/* 22 */                c = this.f11776c[i];
/* 26 */                if (c == '\n') {
/* 31 */                    this.f11779f++;
/* 33 */                    this.f11780i = i2;
/* 35 */                    return;
                        }
/* 38 */            } while (c != '\r');
                }

                /* JADX INFO: renamed from: s */
                public final void m5510s(String str) {
/* 14 */            throw new C1868kw(str.concat(m5502i()));
                }

                public final String toString() {
/* 11 */            return C1730a.class.getSimpleName().concat(m5502i());
                }
            }
