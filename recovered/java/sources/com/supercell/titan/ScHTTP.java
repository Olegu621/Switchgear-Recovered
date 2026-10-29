            package com.supercell.titan;

            import io.sentry.android.core.AbstractC1245n0;
            import java.net.URI;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 139 */   public class ScHTTP {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Client {
                    public Transaction startTransaction(Request request) {
/* 2 */                 throw null;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Config {
                    public Config(String str, int i, boolean z, boolean z2) {
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Request {

                    /* JADX INFO: renamed from: a */
                    public final String f5904a;

                    /* JADX INFO: renamed from: b */
                    public final URI f5905b;

                    public Request(String str, String str2, String[] strArr, String[] strArr2, byte[] bArr) {
/* 4 */                 this.f5904a = str;
/* 10 */                this.f5905b = URI.create(str2);
/* 14 */                new Headers(strArr, strArr2);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Response {
                    public final Headers headers;
                    public final int statusCode;
                    public final String statusMessage;
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class State {
                    public static final State COMPLETED;
                    public static final State FAILED;
                    public static final State RECEIVING_BODY;
                    public static final State WAITING_RESPONSE;

                    /* JADX INFO: renamed from: a */
                    public static final /* synthetic */ State[] f5906a;

                    static {
/* 6 */                 State state = new State("WAITING_RESPONSE", 0);
/* 9 */                 WAITING_RESPONSE = state;
/* 16 */                State state2 = new State("RECEIVING_BODY", 1);
/* 19 */                RECEIVING_BODY = state2;
/* 26 */                State state3 = new State("COMPLETED", 2);
/* 29 */                COMPLETED = state3;
/* 36 */                State state4 = new State("FAILED", 3);
/* 39 */                FAILED = state4;
/* 45 */                f5906a = new State[]{state, state2, state3, state4};
                    }

                    public static State valueOf(String str) {
/* 7 */                 return (State) Enum.valueOf(State.class, str);
                    }

                    public static State[] values() {
/* 7 */                 return (State[]) f5906a.clone();
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Transaction implements Runnable {

                    /* JADX INFO: renamed from: a */
                    public volatile State f5907a;

                    public void abort() {
                    }

                    public ByteSource getBody() {
/* 1 */                 return null;
                    }

                    public Response getResponse() {
/* 1 */                 return null;
                    }

                    public State getState() {
/* 1 */                 return this.f5907a;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
/* 2 */                     throw null;
                        } catch (Exception e) {
/* 20 */                    AbstractC1245n0.m4877e("ScHTTP", "HTTP download failed: " + e, e);
/* 25 */                    this.f5907a = State.FAILED;
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 140 */       public static class Headers {

                    /* JADX INFO: renamed from: a */
                    public final Map f5901a;

                    /* JADX INFO: renamed from: b */
                    public final String[] f5902b;

                    /* JADX INFO: renamed from: c */
                    public final String[] f5903c;

                    public Headers(Map<String, List<String>> map) {
/* 6 */                 HashMap map2 = new HashMap();
/* 11 */                ArrayList arrayList = new ArrayList();
/* 16 */                ArrayList arrayList2 = new ArrayList();
/* 31 */                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
/* 41 */                    StringBuilder sb = new StringBuilder();
/* 58 */                    for (String str : entry.getValue()) {
/* 77 */                        sb.append(sb.length() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : ", ");
/* 80 */                        sb.append(str);
                            }
/* 94 */                    map2.put(entry.getKey(), sb.toString());
/* 103 */                   arrayList.add(entry.getKey());
/* 110 */                   arrayList2.add(sb.toString());
                        }
/* 123 */               this.f5902b = (String[]) arrayList.toArray(new String[0]);
/* 133 */               this.f5903c = (String[]) arrayList2.toArray(new String[0]);
/* 139 */               this.f5901a = Collections.unmodifiableMap(map2);
                    }

                    public String[] getFieldNames() {
/* 7 */                 return (String[]) this.f5902b.clone();
                    }

                    public String[] getFieldValues() {
/* 7 */                 return (String[]) this.f5903c.clone();
                    }

                    public Map<String, String> getFields() {
/* 1 */                 return this.f5901a;
                    }

/* 141 */           public Headers(String[] strArr, String[] strArr2) {
/* 143 */               if (strArr.length == strArr2.length) {
/* 144 */                   this.f5902b = (String[]) strArr.clone();
/* 145 */                   this.f5903c = (String[]) strArr2.clone();
/* 146 */                   HashMap map = new HashMap();
/* 147 */                   for (int i = 0; i < strArr.length; i++) {
/* 148 */                       map.put(strArr[i], strArr2[i]);
                            }
/* 149 */                   this.f5901a = Collections.unmodifiableMap(map);
                            return;
                        }
/* 150 */               C1951n4.m6859j("Different numbers of field names and values");
                        throw null;
                    }
                }
            }
