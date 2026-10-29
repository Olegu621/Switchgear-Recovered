            package androidx.media;

            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.Arrays;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class AudioAttributesImplBase implements AudioAttributesImpl {

                /* JADX INFO: renamed from: a */
                public int f1548a;

                /* JADX INFO: renamed from: b */
                public int f1549b;

                /* JADX INFO: renamed from: c */
                public int f1550c;

                /* JADX INFO: renamed from: d */
                public int f1551d;

                public final boolean equals(Object obj) {
                    int i;
/* 4 */             if (!(obj instanceof AudioAttributesImplBase)) {
/* 3 */                 return false;
                    }
/* 7 */             AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
/* 13 */            if (this.f1549b == audioAttributesImplBase.f1549b) {
/* 15 */                int i2 = this.f1550c;
/* 17 */                int i3 = audioAttributesImplBase.f1550c;
/* 19 */                int i4 = audioAttributesImplBase.f1551d;
/* 25 */                if (i4 == -1) {
/* 29 */                    int i5 = audioAttributesImplBase.f1548a;
/* 31 */                    int i6 = AudioAttributesCompat.f1544b;
/* 35 */                    if ((i3 & 1) != 1) {
/* 41 */                        i = 4;
/* 42 */                        if ((i3 & 4) != 4) {
                                    switch (i5) {
                                        case 2:
/* 63 */                                    i = 0;
                                            break;
                                        case 3:
/* 60 */                                    i = 8;
                                            break;
                                        case 4:
                                            break;
                                        case 5:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
/* 58 */                                    i = 5;
                                            break;
                                        case 6:
/* 56 */                                    i = 2;
                                            break;
                                        case 11:
/* 53 */                                    i = 10;
                                            break;
                                        case 12:
                                        default:
/* 49 */                                    i = 3;
                                            break;
                                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 51 */                                    i = 1;
                                            break;
                                    }
                                } else {
/* 44 */                            i = 6;
                                }
                            } else {
/* 37 */                        i = 7;
                            }
                        } else {
/* 27 */                    i = i4;
                        }
/* 64 */                if (i == 6) {
/* 66 */                    i3 |= 4;
                        } else if (i == 7) {
/* 71 */                    i3 |= 1;
                        }
/* 75 */                if (i2 == (i3 & 273) && this.f1548a == audioAttributesImplBase.f1548a && this.f1551d == i4) {
/* 22 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 29 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1549b), Integer.valueOf(this.f1550c), Integer.valueOf(this.f1548a), Integer.valueOf(this.f1551d)});
                }

                public final String toString() {
                    String strM3781g;
/* 5 */             StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
/* 11 */            if (this.f1551d != -1) {
/* 15 */                sb.append(" stream=");
/* 20 */                sb.append(this.f1551d);
/* 25 */                sb.append(" derived");
                    }
/* 30 */            sb.append(" usage=");
/* 33 */            int i = this.f1548a;
/* 35 */            int i2 = AudioAttributesCompat.f1544b;
                    switch (i) {
                        case 0:
/* 92 */                    strM3781g = "USAGE_UNKNOWN";
                            break;
                        case 1:
/* 89 */                    strM3781g = "USAGE_MEDIA";
                            break;
                        case 2:
/* 86 */                    strM3781g = "USAGE_VOICE_COMMUNICATION";
                            break;
                        case 3:
/* 83 */                    strM3781g = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                            break;
                        case 4:
/* 80 */                    strM3781g = "USAGE_ALARM";
                            break;
                        case 5:
/* 77 */                    strM3781g = "USAGE_NOTIFICATION";
                            break;
                        case 6:
/* 74 */                    strM3781g = "USAGE_NOTIFICATION_RINGTONE";
                            break;
                        case 7:
/* 71 */                    strM3781g = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                            break;
                        case 8:
/* 68 */                    strM3781g = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                            break;
                        case 9:
/* 65 */                    strM3781g = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                            break;
                        case 10:
/* 62 */                    strM3781g = "USAGE_NOTIFICATION_EVENT";
                            break;
                        case 11:
/* 59 */                    strM3781g = "USAGE_ASSISTANCE_ACCESSIBILITY";
                            break;
                        case 12:
/* 56 */                    strM3781g = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                            break;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 53 */                    strM3781g = "USAGE_ASSISTANCE_SONIFICATION";
                            break;
                        case 14:
/* 50 */                    strM3781g = "USAGE_GAME";
                            break;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                        default:
/* 42 */                    strM3781g = fm0.m3781g(i, "unknown usage ");
                            break;
                        case 16:
/* 47 */                    strM3781g = "USAGE_ASSISTANT";
                            break;
                    }
/* 94 */            sb.append(strM3781g);
/* 99 */            sb.append(" content=");
/* 104 */           sb.append(this.f1549b);
/* 109 */           sb.append(" flags=0x");
/* 122 */           sb.append(Integer.toHexString(this.f1550c).toUpperCase());
/* 125 */           return sb.toString();
                }
            }
