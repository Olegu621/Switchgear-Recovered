            package io.sentry;

            import io.sentry.logger.InterfaceC1541a;
            import io.sentry.protocol.C1608j0;
            import io.sentry.protocol.C1609k;
            import io.sentry.protocol.C1614n;
            import io.sentry.protocol.C1624u;
            import io.sentry.protocol.C1626w;
            import io.sentry.util.AbstractC1712k;
            import java.util.HashMap;
            import java.util.Iterator;
            import p000.C2076pn;
            import p000.fm0;
            
            /* JADX INFO: renamed from: io.sentry.f0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1444f0 implements InterfaceC1695u0, InterfaceC1541a {

                /* JADX INFO: renamed from: a */
                public final C1460g4 f10935a;

                public /* synthetic */ C1444f0(C1460g4 c1460g4) {
/* 1 */             this.f10935a = c1460g4;
                }

                @Override // io.sentry.InterfaceC1695u0
                /* JADX INFO: renamed from: a */
                public C1626w mo5210a(C1609k c1609k) {
/* 3 */             return this.f10935a.mo5096p(c1609k);
                }

                /* JADX INFO: renamed from: b */
                public HashMap m5211b(C1422d c1422d, String str, Object... objArr) {
/* 3 */             HashMap map = new HashMap();
/* 6 */             C1460g4 c1460g4 = this.f10935a;
/* 18 */            Iterator it = c1460g4.f10957e.getAttributes().values().iterator();
/* 26 */            if (it.hasNext()) {
/* 417 */               throw fm0.m3780f(it);
                    }
/* 28 */            String str2 = c1422d.f10847a;
/* 36 */            if (!"manual".equalsIgnoreCase(str2)) {
/* 47 */                map.put("sentry.origin", new C1614n(EnumC1574o4.STRING, str2));
                    }
/* 53 */            int i = 0;
/* 54 */            for (Object obj : objArr) {
/* 73 */                map.put(fm0.m3781g(i, "sentry.message.parameter."), new C1614n(EnumC1574o4.inferFrom(obj), obj));
/* 76 */                i++;
                    }
/* 81 */            if (i > 0 && map.get("sentry.message.template") == null) {
/* 98 */                map.put("sentry.message.template", new C1614n(EnumC1574o4.STRING, str));
                    }
/* 105 */           C1624u sdkVersion = c1460g4.mo5092l().getSdkVersion();
/* 109 */           if (sdkVersion != null) {
/* 113 */               EnumC1574o4 enumC1574o4 = EnumC1574o4.STRING;
/* 122 */               map.put("sentry.sdk.name", new C1614n(enumC1574o4, sdkVersion.f11466a));
/* 138 */               map.put("sentry.sdk.version", new C1614n(enumC1574o4.apiName(), sdkVersion.f11467b));
                    }
/* 145 */           String environment = c1460g4.mo5092l().getEnvironment();
/* 149 */           if (environment != null) {
/* 160 */               map.put("sentry.environment", new C1614n(EnumC1574o4.STRING, environment));
                    }
/* 165 */           C1626w c1626wMo4696i = c1460g4.f10957e.mo4696i();
/* 169 */           C1626w c1626w = C1626w.f11478b;
/* 177 */           if (c1626w.equals(c1626wMo4696i)) {
/* 202 */               C1626w c1626wMo4974i = c1460g4.mo5092l().getReplayController().mo4974i();
/* 210 */               if (!c1626w.equals(c1626wMo4974i)) {
/* 223 */                   map.put("sentry.replay_id", new C1614n(EnumC1574o4.STRING, c1626wMo4974i.m5380a()));
/* 237 */                   map.put("sentry._internal.replay_is_buffering", new C1614n(EnumC1574o4.BOOLEAN, Boolean.TRUE));
                        }
                    } else {
/* 190 */               map.put("sentry.replay_id", new C1614n(EnumC1574o4.STRING, c1626wMo4696i.m5380a()));
                    }
/* 244 */           String release = c1460g4.mo5092l().getRelease();
/* 248 */           if (release != null) {
/* 259 */               map.put("sentry.release", new C1614n(EnumC1574o4.STRING, release));
                    }
/* 264 */           if (!AbstractC1712k.f11736a) {
/* 266 */               C1554m6 c1554m6Mo5092l = c1460g4.mo5092l();
/* 270 */               String serverName = c1554m6Mo5092l.getServerName();
/* 276 */               if (serverName != null) {
/* 285 */                   map.put("server.address", new C1614n(EnumC1574o4.STRING, serverName));
                        } else if (c1554m6Mo5092l.isAttachServerName()) {
/* 295 */                   C1533l0 c1533l0M5343a = C1533l0.m5343a();
/* 307 */                   if (c1533l0M5343a.f11107c < System.currentTimeMillis() && c1533l0M5343a.f11108d.compareAndSet(false, true)) {
/* 318 */                       c1533l0M5343a.m5344b();
                            }
/* 321 */                   String str3 = c1533l0M5343a.f11106b;
/* 323 */                   if (str3 != null) {
/* 332 */                       map.put("server.address", new C1614n(EnumC1574o4.STRING, str3));
                            }
                        }
                    }
/* 337 */           C1608j0 c1608j0Mo4687K = c1460g4.f10957e.mo4687K();
/* 343 */           if (c1608j0Mo4687K == null) {
/* 349 */               String distinctId = c1460g4.mo5092l().getDistinctId();
/* 353 */               if (distinctId != null) {
/* 362 */                   map.put("user.id", new C1614n(EnumC1574o4.STRING, distinctId));
/* 365 */                   return map;
                        }
                    } else {
/* 366 */               String str4 = c1608j0Mo4687K.f11362b;
/* 368 */               if (str4 != null) {
/* 377 */                   map.put("user.id", new C1614n(EnumC1574o4.STRING, str4));
                        }
/* 380 */               String str5 = c1608j0Mo4687K.f11363c;
/* 382 */               if (str5 != null) {
/* 393 */                   map.put("user.name", new C1614n(EnumC1574o4.STRING, str5));
                        }
/* 396 */               String str6 = c1608j0Mo4687K.f11361a;
/* 398 */               if (str6 != null) {
/* 409 */                   map.put("user.email", new C1614n(EnumC1574o4.STRING, str6));
                        }
                    }
/* 412 */           return map;
                }

                @Override // io.sentry.logger.InterfaceC1541a
                /* JADX INFO: renamed from: e */
                public void mo5212e(EnumC1636q5 enumC1636q5, C1422d c1422d, String str, Object... objArr) {
                    String str2;
/* 1 */             C1460g4 c1460g4 = this.f10935a;
/* 3 */             C1554m6 c1554m6Mo5092l = c1460g4.mo5092l();
/* 7 */             InterfaceC1156a1 interfaceC1156a1 = c1460g4.f10957e;
                    try {
/* 14 */                if (!c1460g4.isEnabled()) {
/* 26 */                    c1554m6Mo5092l.getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'logger' call is a no-op.", new Object[0]);
/* 29 */                    return;
                        }
/* 39 */                if (!c1554m6Mo5092l.getLogs().f10914a) {
/* 51 */                    c1554m6Mo5092l.getLogger().mo4672k(EnumC1553m5.WARNING, "Sentry Log is disabled and this 'logger' call is a no-op.", new Object[0]);
/* 54 */                    return;
                        }
/* 55 */                if (str == null) {
/* 197 */                   return;
                        }
/* 63 */                AbstractC1672t4 abstractC1672t4Mo4856a = c1554m6Mo5092l.getDateProvider().mo4856a();
/* 68 */                if (objArr.length == 0) {
/* 70 */                    str2 = str;
                        } else {
                            try {
/* 72 */                        str2 = String.format(str, objArr);
                            } catch (Throwable th) {
/* 90 */                        c1460g4.mo5092l().getLogger().mo4671d(EnumC1553m5.ERROR, "Error while running log through String.format", th);
/* 70 */                        str2 = str;
                            }
                        }
/* 94 */                C1671t3 c1671t3Mo4708u = interfaceC1156a1.mo4708u();
/* 98 */                InterfaceC1525k1 interfaceC1525k1Mo4694g = interfaceC1156a1.mo4694g();
/* 102 */               if (interfaceC1525k1Mo4694g == null) {
/* 111 */                   interfaceC1156a1.mo4681E(new C2076pn(29, interfaceC1156a1, c1554m6Mo5092l));
                        }
/* 125 */               C1626w c1626w = interfaceC1525k1Mo4694g == null ? (C1626w) c1671t3Mo4708u.f11668b : interfaceC1525k1Mo4694g.mo4737s().f10755a;
/* 138 */               C1430d7 c1430d7 = interfaceC1525k1Mo4694g == null ? (C1430d7) c1671t3Mo4708u.f11669c : interfaceC1525k1Mo4694g.mo4737s().f10756b;
/* 157 */               C1575o5 c1575o5 = new C1575o5(c1626w, Double.valueOf(abstractC1672t4Mo4856a.mo5278d() / 1.0E9d), str2, enumC1636q5);
/* 160 */               c1575o5.f11202b = c1430d7;
/* 166 */               c1575o5.f11207i = m5211b(c1422d, str, objArr);
/* 176 */               c1575o5.f11206f = Integer.valueOf(enumC1636q5.getSeverityNumber());
/* 182 */               interfaceC1156a1.mo4711y().mo5222i(c1575o5, interfaceC1156a1);
                    } catch (Throwable th2) {
/* 194 */               c1554m6Mo5092l.getLogger().mo4671d(EnumC1553m5.ERROR, "Error while capturing log event", th2);
                    }
                }

                @Override // io.sentry.InterfaceC1695u0
                /* JADX INFO: renamed from: j */
                public C1626w mo5213j(C1609k c1609k) {
/* 3 */             return this.f10935a.mo5079A(c1609k);
                }

                @Override // io.sentry.InterfaceC1695u0
                /* JADX INFO: renamed from: l */
                public C1626w mo5214l(C1609k c1609k) {
/* 3 */             return this.f10935a.mo5079A(c1609k);
                }
            }
