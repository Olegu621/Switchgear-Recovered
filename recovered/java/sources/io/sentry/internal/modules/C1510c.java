            package io.sentry.internal.modules;

            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.util.AbstractC1704c;
            import java.net.URL;
            import java.util.ArrayList;
            import java.util.Enumeration;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            
            /* JADX INFO: renamed from: io.sentry.internal.modules.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1510c extends AbstractC1511d {

                /* JADX INFO: renamed from: e */
                public final Pattern f11050e;

                /* JADX INFO: renamed from: f */
                public final Pattern f11051f;

                /* JADX INFO: renamed from: g */
                public final ClassLoader f11052g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1510c(ILogger iLogger) {
/* 7 */             super(iLogger);
/* 3 */             ClassLoader classLoader = C1510c.class.getClassLoader();
/* 16 */            this.f11050e = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
/* 24 */            this.f11051f = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
/* 30 */            this.f11052g = AbstractC1704c.m5449d(classLoader);
                }

                @Override // io.sentry.internal.modules.AbstractC1511d
                /* JADX INFO: renamed from: b */
                public final Map mo5303b() {
/* 3 */             HashMap map = new HashMap();
/* 8 */             ArrayList<C1509b> arrayList = new ArrayList();
                    try {
/* 15 */                Enumeration<URL> resources = this.f11052g.getResources("META-INF/MANIFEST.MF");
/* 23 */                while (resources.hasMoreElements()) {
/* 37 */                    Matcher matcher = this.f11050e.matcher(resources.nextElement().toString());
/* 45 */                    C1509b c1509b = null;
/* 60 */                    String strGroup = (matcher.matches() && matcher.groupCount() == 1) ? matcher.group(1) : null;
/* 61 */                    if (strGroup != null) {
/* 66 */                        Matcher matcher2 = this.f11051f.matcher(strGroup);
/* 74 */                        if (matcher2.matches() && matcher2.groupCount() == 2) {
/* 93 */                            c1509b = new C1509b(matcher2.group(1), matcher2.group(2));
                                }
                            }
/* 96 */                    if (c1509b != null) {
/* 98 */                        arrayList.add(c1509b);
                            }
                        }
                    } catch (Throwable th) {
/* 109 */               this.f11054a.mo4671d(EnumC1553m5.ERROR, "Unable to detect modules via manifest files.", th);
                    }
/* 120 */           for (C1509b c1509b2 : arrayList) {
/* 132 */               map.put(c1509b2.f11048a, c1509b2.f11049b);
                    }
/* 136 */           return map;
                }
            }
