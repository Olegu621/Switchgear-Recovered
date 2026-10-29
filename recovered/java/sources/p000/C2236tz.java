            package p000;

            import androidx.constraintlayout.widget.C0076c;
            import com.appsflyer.attribution.RequestError;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.Arrays;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: renamed from: tz */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2236tz {

                /* JADX INFO: renamed from: a */
                public int[] f17306a;

                /* JADX INFO: renamed from: b */
                public int[] f17307b;

                /* JADX INFO: renamed from: c */
                public int f17308c;

                /* JADX INFO: renamed from: d */
                public int[] f17309d;

                /* JADX INFO: renamed from: e */
                public float[] f17310e;

                /* JADX INFO: renamed from: f */
                public int f17311f;

                /* JADX INFO: renamed from: g */
                public int[] f17312g;

                /* JADX INFO: renamed from: h */
                public String[] f17313h;

                /* JADX INFO: renamed from: i */
                public int f17314i;

                /* JADX INFO: renamed from: j */
                public int[] f17315j;

                /* JADX INFO: renamed from: k */
                public boolean[] f17316k;

                /* JADX INFO: renamed from: l */
                public int f17317l;

                /* JADX INFO: renamed from: a */
                public final void m8926a(float f, int i) {
/* 1 */             int i2 = this.f17311f;
/* 3 */             int[] iArr = this.f17309d;
/* 6 */             if (i2 >= iArr.length) {
/* 15 */                this.f17309d = Arrays.copyOf(iArr, iArr.length * 2);
/* 17 */                float[] fArr = this.f17310e;
/* 26 */                this.f17310e = Arrays.copyOf(fArr, fArr.length * 2);
                    }
/* 28 */            int[] iArr2 = this.f17309d;
/* 30 */            int i3 = this.f17311f;
/* 32 */            iArr2[i3] = i;
/* 34 */            float[] fArr2 = this.f17310e;
/* 38 */            this.f17311f = i3 + 1;
/* 40 */            fArr2[i3] = f;
                }

                /* JADX INFO: renamed from: b */
                public final void m8927b(int i, int i2) {
/* 1 */             int i3 = this.f17308c;
/* 3 */             int[] iArr = this.f17306a;
/* 6 */             if (i3 >= iArr.length) {
/* 15 */                this.f17306a = Arrays.copyOf(iArr, iArr.length * 2);
/* 17 */                int[] iArr2 = this.f17307b;
/* 26 */                this.f17307b = Arrays.copyOf(iArr2, iArr2.length * 2);
                    }
/* 28 */            int[] iArr3 = this.f17306a;
/* 30 */            int i4 = this.f17308c;
/* 32 */            iArr3[i4] = i;
/* 34 */            int[] iArr4 = this.f17307b;
/* 38 */            this.f17308c = i4 + 1;
/* 40 */            iArr4[i4] = i2;
                }

                /* JADX INFO: renamed from: c */
                public final void m8928c(int i, String str) {
/* 1 */             int i2 = this.f17314i;
/* 3 */             int[] iArr = this.f17312g;
/* 6 */             if (i2 >= iArr.length) {
/* 15 */                this.f17312g = Arrays.copyOf(iArr, iArr.length * 2);
/* 17 */                String[] strArr = this.f17313h;
/* 28 */                this.f17313h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                    }
/* 30 */            int[] iArr2 = this.f17312g;
/* 32 */            int i3 = this.f17314i;
/* 34 */            iArr2[i3] = i;
/* 36 */            String[] strArr2 = this.f17313h;
/* 40 */            this.f17314i = i3 + 1;
/* 42 */            strArr2[i3] = str;
                }

                /* JADX INFO: renamed from: d */
                public final void m8929d(int i, boolean z) {
/* 1 */             int i2 = this.f17317l;
/* 3 */             int[] iArr = this.f17315j;
/* 6 */             if (i2 >= iArr.length) {
/* 15 */                this.f17315j = Arrays.copyOf(iArr, iArr.length * 2);
/* 17 */                boolean[] zArr = this.f17316k;
/* 26 */                this.f17316k = Arrays.copyOf(zArr, zArr.length * 2);
                    }
/* 28 */            int[] iArr2 = this.f17315j;
/* 30 */            int i3 = this.f17317l;
/* 32 */            iArr2[i3] = i;
/* 34 */            boolean[] zArr2 = this.f17316k;
/* 38 */            this.f17317l = i3 + 1;
/* 40 */            zArr2[i3] = z;
                }

                /* JADX INFO: renamed from: e */
                public final void m8930e(C0076c c0076c) {
/* 9 */             for (int i = 0; i < this.f17308c; i++) {
/* 13 */                int i2 = this.f17306a[i];
/* 17 */                int i3 = this.f17307b[i];
/* 20 */                if (i2 == 6) {
/* 370 */                   c0076c.f1180e.f17748D = i3;
                        } else if (i2 == 7) {
/* 365 */                   c0076c.f1180e.f17749E = i3;
                        } else if (i2 == 8) {
/* 360 */                   c0076c.f1180e.f17755K = i3;
                        } else if (i2 == 27) {
/* 355 */                   c0076c.f1180e.f17750F = i3;
                        } else if (i2 == 28) {
/* 350 */                   c0076c.f1180e.f17752H = i3;
                        } else if (i2 == 41) {
/* 345 */                   c0076c.f1180e.f17767W = i3;
                        } else if (i2 == 42) {
/* 340 */                   c0076c.f1180e.f17768X = i3;
                        } else if (i2 == 61) {
/* 335 */                   c0076c.f1180e.f17745A = i3;
                        } else if (i2 == 62) {
/* 330 */                   c0076c.f1180e.f17746B = i3;
                        } else if (i2 == 72) {
/* 325 */                   c0076c.f1180e.f17784g0 = i3;
                        } else if (i2 == 73) {
/* 320 */                   c0076c.f1180e.f17786h0 = i3;
                        } else if (i2 == 2) {
/* 315 */                   c0076c.f1180e.f17754J = i3;
                        } else if (i2 == 31) {
/* 310 */                   c0076c.f1180e.f17756L = i3;
                        } else if (i2 == 34) {
/* 305 */                   c0076c.f1180e.f17753I = i3;
                        } else if (i2 == 38) {
/* 300 */                   c0076c.f1176a = i3;
                        } else if (i2 == 64) {
/* 297 */                   c0076c.f1179d.f18390b = i3;
                        } else if (i2 == 66) {
/* 292 */                   c0076c.f1179d.f18394f = i3;
                        } else if (i2 == 76) {
/* 287 */                   c0076c.f1179d.f18393e = i3;
                        } else if (i2 == 78) {
/* 282 */                   c0076c.f1178c.f18872c = i3;
                        } else if (i2 == 97) {
/* 276 */                   c0076c.f1180e.f17802p0 = i3;
                        } else if (i2 == 93) {
/* 270 */                   c0076c.f1180e.f17757M = i3;
                        } else if (i2 != 94) {
                            switch (i2) {
                                case 11:
/* 258 */                           c0076c.f1180e.f17761Q = i3;
                                    break;
                                case 12:
/* 252 */                           c0076c.f1180e.f17762R = i3;
                                    break;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 246 */                           c0076c.f1180e.f17758N = i3;
                                    break;
                                case 14:
/* 240 */                           c0076c.f1180e.f17760P = i3;
                                    break;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 234 */                           c0076c.f1180e.f17763S = i3;
                                    break;
                                case 16:
/* 228 */                           c0076c.f1180e.f17759O = i3;
                                    break;
                                case 17:
/* 222 */                           c0076c.f1180e.f17779e = i3;
                                    break;
                                case 18:
/* 216 */                           c0076c.f1180e.f17781f = i3;
                                    break;
                                default:
                                    switch (i2) {
                                        case Build.API_LEVELS.API_21 /* 21 */:
/* 210 */                                   c0076c.f1180e.f17777d = i3;
                                            break;
                                        case Build.API_LEVELS.API_22 /* 22 */:
/* 204 */                                   c0076c.f1178c.f18871b = i3;
                                            break;
                                        case Build.API_LEVELS.API_23 /* 23 */:
/* 198 */                                   c0076c.f1180e.f17775c = i3;
                                            break;
                                        case 24:
/* 192 */                                   c0076c.f1180e.f17751G = i3;
                                            break;
                                        default:
                                            switch (i2) {
                                                case 54:
/* 186 */                                           c0076c.f1180e.f17769Y = i3;
                                                    break;
                                                case 55:
/* 180 */                                           c0076c.f1180e.f17770Z = i3;
                                                    break;
                                                case 56:
/* 174 */                                           c0076c.f1180e.f17772a0 = i3;
                                                    break;
                                                case 57:
/* 168 */                                           c0076c.f1180e.f17774b0 = i3;
                                                    break;
                                                case 58:
/* 162 */                                           c0076c.f1180e.f17776c0 = i3;
                                                    break;
                                                case 59:
/* 156 */                                           c0076c.f1180e.f17778d0 = i3;
                                                    break;
                                                default:
                                                    switch (i2) {
                                                        case 82:
/* 150 */                                                   c0076c.f1179d.f18391c = i3;
                                                            break;
                                                        case 83:
/* 144 */                                                   c0076c.f1181f.f19414i = i3;
                                                            break;
                                                        case 84:
/* 138 */                                                   c0076c.f1179d.f18398j = i3;
                                                            break;
                                                        default:
                                                            switch (i2) {
                                                                case 87:
                                                                    break;
                                                                case 88:
/* 132 */                                                           c0076c.f1179d.f18400l = i3;
                                                                    break;
                                                                case 89:
/* 126 */                                                           c0076c.f1179d.f18401m = i3;
                                                                    break;
                                                                default:
/* 119 */                                                           AbstractC1245n0.m4889q("ConstraintSet", "Unknown attribute 0x");
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
/* 264 */                   c0076c.f1180e.f17764T = i3;
                        }
                    }
/* 381 */           for (int i4 = 0; i4 < this.f17311f; i4++) {
/* 385 */               int i5 = this.f17309d[i4];
/* 389 */               float f = this.f17310e[i4];
/* 393 */               if (i5 == 19) {
/* 566 */                   c0076c.f1180e.f17783g = f;
                        } else if (i5 == 20) {
/* 561 */                   c0076c.f1180e.f17810x = f;
                        } else if (i5 == 37) {
/* 556 */                   c0076c.f1180e.f17811y = f;
                        } else if (i5 == 60) {
/* 551 */                   c0076c.f1181f.f19407b = f;
                        } else if (i5 == 63) {
/* 546 */                   c0076c.f1180e.f17747C = f;
                        } else if (i5 == 79) {
/* 541 */                   c0076c.f1179d.f18395g = f;
                        } else if (i5 == 85) {
/* 536 */                   c0076c.f1179d.f18397i = f;
                        } else if (i5 != 87) {
/* 423 */                   if (i5 == 39) {
/* 531 */                       c0076c.f1180e.f17766V = f;
                            } else if (i5 != 40) {
                                switch (i5) {
                                    case 43:
/* 521 */                               c0076c.f1178c.f18873d = f;
                                        break;
                                    case 44:
/* 511 */                               C2479xz c2479xz = c0076c.f1181f;
/* 513 */                               c2479xz.f19419n = f;
/* 516 */                               c2479xz.f19418m = true;
                                        break;
                                    case 45:
/* 508 */                               c0076c.f1181f.f19408c = f;
                                        break;
                                    case 46:
/* 503 */                               c0076c.f1181f.f19409d = f;
                                        break;
                                    case 47:
/* 498 */                               c0076c.f1181f.f19410e = f;
                                        break;
                                    case 48:
/* 493 */                               c0076c.f1181f.f19411f = f;
                                        break;
                                    case 49:
/* 488 */                               c0076c.f1181f.f19412g = f;
                                        break;
                                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 483 */                               c0076c.f1181f.f19413h = f;
                                        break;
                                    case 51:
/* 478 */                               c0076c.f1181f.f19415j = f;
                                        break;
                                    case 52:
/* 472 */                               c0076c.f1181f.f19416k = f;
                                        break;
                                    case 53:
/* 466 */                               c0076c.f1181f.f19417l = f;
                                        break;
                                    default:
                                        switch (i5) {
                                            case 67:
/* 460 */                                       c0076c.f1179d.f18396h = f;
                                                break;
                                            case 68:
/* 454 */                                       c0076c.f1178c.f18874e = f;
                                                break;
                                            case 69:
/* 448 */                                       c0076c.f1180e.f17780e0 = f;
                                                break;
                                            case 70:
/* 442 */                                       c0076c.f1180e.f17782f0 = f;
                                                break;
                                            default:
/* 435 */                                       AbstractC1245n0.m4889q("ConstraintSet", "Unknown attribute 0x");
                                                break;
                                        }
                                        break;
                                }
                            } else {
/* 526 */                       c0076c.f1180e.f17765U = f;
                            }
                        }
                    }
/* 575 */           for (int i6 = 0; i6 < this.f17314i; i6++) {
/* 579 */               int i7 = this.f17312g[i6];
/* 583 */               String str = this.f17313h[i6];
/* 586 */               if (i7 == 5) {
/* 635 */                   c0076c.f1180e.f17812z = str;
                        } else if (i7 == 65) {
/* 630 */                   c0076c.f1179d.f18392d = str;
                        } else if (i7 == 74) {
/* 620 */                   C2274uz c2274uz = c0076c.f1180e;
/* 622 */                   c2274uz.f17792k0 = str;
/* 625 */                   c2274uz.f17790j0 = null;
                        } else if (i7 == 77) {
/* 617 */                   c0076c.f1180e.f17794l0 = str;
                        } else if (i7 != 87) {
/* 604 */                   if (i7 != 90) {
/* 606 */                       AbstractC1245n0.m4889q("ConstraintSet", "Unknown attribute 0x");
                            } else {
/* 612 */                       c0076c.f1179d.f18399k = str;
                            }
                        }
                    }
/* 642 */           for (int i8 = 0; i8 < this.f17317l; i8++) {
/* 646 */               int i9 = this.f17315j[i8];
/* 650 */               boolean z = this.f17316k[i8];
/* 654 */               if (i9 == 44) {
/* 691 */                   c0076c.f1181f.f19418m = z;
                        } else if (i9 == 75) {
/* 686 */                   c0076c.f1180e.f17800o0 = z;
                        } else if (i9 != 87) {
/* 664 */                   if (i9 == 80) {
/* 681 */                       c0076c.f1180e.f17796m0 = z;
                            } else if (i9 != 81) {
/* 670 */                       AbstractC1245n0.m4889q("ConstraintSet", "Unknown attribute 0x");
                            } else {
/* 676 */                       c0076c.f1180e.f17798n0 = z;
                            }
                        }
                    }
                }
            }
