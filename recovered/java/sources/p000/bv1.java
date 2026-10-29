            package p000;

            import java.util.List;
            import java.util.Locale;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bv1 {

                /* JADX INFO: renamed from: a */
                public final String f2615a;

                /* JADX INFO: renamed from: b */
                public final String f2616b;

                public bv1(String str) {
                    String strValueOf;
/* 1 */             str.getClass();
/* 7 */             this.f2615a = str;
/* 11 */            List listM6224c = zs1.f20320a.m6224c(str);
/* 22 */            String str2 = (String) CollectionsKt.m6201v(0, listM6224c);
/* 24 */            String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 28 */            str2 = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
/* 34 */            String str4 = (String) CollectionsKt.m6201v(1, listM6224c);
/* 40 */            Locale locale = new Locale(str2, str4 != null ? str4 : str3);
/* 43 */            String displayName = locale.getDisplayName(locale);
/* 47 */            displayName.getClass();
/* 54 */            if (displayName.length() > 0) {
/* 58 */                StringBuilder sb = new StringBuilder();
/* 61 */                char cCharAt = displayName.charAt(0);
/* 69 */                if (Character.isLowerCase(cCharAt)) {
/* 71 */                    String strValueOf2 = String.valueOf(cCharAt);
/* 75 */                    strValueOf2.getClass();
/* 78 */                    strValueOf = strValueOf2.toUpperCase(locale);
/* 82 */                    strValueOf.getClass();
/* 89 */                    if (strValueOf.length() <= 1) {
/* 129 */                       String strValueOf3 = String.valueOf(cCharAt);
/* 133 */                       strValueOf3.getClass();
/* 138 */                       String upperCase = strValueOf3.toUpperCase(Locale.ROOT);
/* 142 */                       upperCase.getClass();
/* 149 */                       if (strValueOf.equals(upperCase)) {
/* 156 */                           strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
                                }
                            } else if (cCharAt != 329) {
/* 96 */                        char cCharAt2 = strValueOf.charAt(0);
/* 106 */                       String lowerCase = strValueOf.substring(1).toLowerCase(Locale.ROOT);
/* 110 */                       lowerCase.getClass();
/* 124 */                       strValueOf = cCharAt2 + lowerCase;
                            }
                        } else {
/* 161 */                   strValueOf = String.valueOf(cCharAt);
                        }
/* 165 */               sb.append((Object) strValueOf);
/* 172 */               sb.append(displayName.substring(1));
/* 175 */               displayName = sb.toString();
                    }
/* 179 */           this.f2616b = displayName;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof bv1) && Intrinsics.m6216a(this.f2615a, ((bv1) obj).f2615a);
                }

                public final int hashCode() {
/* 3 */             return this.f2615a.hashCode();
                }

                public final String toString() {
/* 7 */             return fm0.m3784j("PredefinedUILanguage(isoCode=", this.f2615a, ")");
                }
            }
