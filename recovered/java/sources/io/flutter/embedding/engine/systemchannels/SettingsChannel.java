            package io.flutter.embedding.engine.systemchannels;

            import android.os.Build;
            import android.util.DisplayMetrics;
            import io.flutter.Log;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.plugin.common.BasicMessageChannel;
            import io.flutter.plugin.common.JSONMessageCodec;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.concurrent.ConcurrentLinkedQueue;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SettingsChannel {
                static final /* synthetic */ boolean $assertionsDisabled = false;
                private static final String ALWAYS_USE_24_HOUR_FORMAT = "alwaysUse24HourFormat";
                private static final String BRIEFLY_SHOW_PASSWORD = "brieflyShowPassword";
                public static final String CHANNEL_NAME = "flutter/settings";
                private static final String CONFIGURATION_ID = "configurationId";
                private static final ConfigurationQueue CONFIGURATION_QUEUE = new ConfigurationQueue();
                private static final String NATIVE_SPELL_CHECK_SERVICE_DEFINED = "nativeSpellCheckServiceDefined";
                private static final String PLATFORM_BRIGHTNESS = "platformBrightness";
                private static final String TAG = "SettingsChannel";
                private static final String TEXT_SCALE_FACTOR = "textScaleFactor";
                public final BasicMessageChannel<Object> channel;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ConfigurationQueue {
                    private SentConfiguration currentConfiguration;
                    private SentConfiguration previousEnqueuedConfiguration;
                    private final ConcurrentLinkedQueue<SentConfiguration> sentQueue = new ConcurrentLinkedQueue<>();

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class SentConfiguration {
                        private static int nextConfigGeneration = Integer.MIN_VALUE;
                        private final DisplayMetrics displayMetrics;
                        public final int generationNumber;

                        public SentConfiguration(DisplayMetrics displayMetrics) {
/* 4 */                     int i = nextConfigGeneration;
/* 8 */                     nextConfigGeneration = i + 1;
/* 10 */                    this.generationNumber = i;
/* 12 */                    this.displayMetrics = displayMetrics;
                        }
                    }

                    public BasicMessageChannel.Reply enqueueConfiguration(SentConfiguration sentConfiguration) {
/* 3 */                 this.sentQueue.add(sentConfiguration);
/* 6 */                 final SentConfiguration sentConfiguration2 = this.previousEnqueuedConfiguration;
/* 8 */                 this.previousEnqueuedConfiguration = sentConfiguration;
/* 10 */                if (sentConfiguration2 == null) {
/* 12 */                    return null;
                        }
/* 16 */                return new BasicMessageChannel.Reply() { // from class: io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.1
                            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                            public void reply(Object obj) {
/* 9 */                         ConfigurationQueue.this.sentQueue.remove(sentConfiguration2);
/* 22 */                        if (ConfigurationQueue.this.sentQueue.isEmpty()) {
/* 51 */                            return;
                                }
/* 48 */                        Log.m4585e(SettingsChannel.TAG, "The queue becomes empty after removing config generation " + String.valueOf(sentConfiguration2.generationNumber));
                            }
                        };
                    }

                    public SentConfiguration getConfiguration(int i) {
                        SentConfiguration sentConfiguration;
/* 3 */                 if (this.currentConfiguration == null) {
/* 13 */                    this.currentConfiguration = this.sentQueue.poll();
                        }
                        while (true) {
/* 15 */                    sentConfiguration = this.currentConfiguration;
/* 17 */                    if (sentConfiguration == null || sentConfiguration.generationNumber >= i) {
                                break;
                            }
/* 31 */                    this.currentConfiguration = this.sentQueue.poll();
                        }
/* 39 */                if (sentConfiguration == null) {
/* 62 */                    Log.m4585e(SettingsChannel.TAG, "Cannot find config with generation: " + String.valueOf(i) + ", after exhausting the queue.");
/* 34 */                    return null;
                        }
/* 68 */                if (sentConfiguration.generationNumber == i) {
/* 106 */                   return sentConfiguration;
                        }
/* 102 */               Log.m4585e(SettingsChannel.TAG, "Cannot find config with generation: " + String.valueOf(i) + ", the oldest config is now: " + String.valueOf(this.currentConfiguration.generationNumber));
/* 34 */                return null;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class MessageBuilder {
                    private final BasicMessageChannel<Object> channel;
                    private DisplayMetrics displayMetrics;
                    private Map<String, Object> message = new HashMap();

                    public MessageBuilder(BasicMessageChannel<Object> basicMessageChannel) {
/* 11 */                this.channel = basicMessageChannel;
                    }

                    public void send() {
/* 57 */                Log.m4589v(SettingsChannel.TAG, "Sending message: \ntextScaleFactor: " + this.message.get(SettingsChannel.TEXT_SCALE_FACTOR) + "\nalwaysUse24HourFormat: " + this.message.get(SettingsChannel.ALWAYS_USE_24_HOUR_FORMAT) + "\nplatformBrightness: " + this.message.get(SettingsChannel.PLATFORM_BRIGHTNESS));
/* 60 */                DisplayMetrics displayMetrics = this.displayMetrics;
/* 66 */                if (!SettingsChannel.hasNonlinearTextScalingSupport() || displayMetrics == null) {
/* 109 */                   this.channel.send(this.message);
/* 112 */                   return;
                        }
/* 73 */                ConfigurationQueue.SentConfiguration sentConfiguration = new ConfigurationQueue.SentConfiguration(displayMetrics);
/* 80 */                BasicMessageChannel.Reply<Object> replyEnqueueConfiguration = SettingsChannel.CONFIGURATION_QUEUE.enqueueConfiguration(sentConfiguration);
/* 94 */                this.message.put(SettingsChannel.CONFIGURATION_ID, Integer.valueOf(sentConfiguration.generationNumber));
/* 101 */               this.channel.send(this.message, replyEnqueueConfiguration);
                    }

                    public MessageBuilder setBrieflyShowPassword(boolean z) {
/* 9 */                 this.message.put(SettingsChannel.BRIEFLY_SHOW_PASSWORD, Boolean.valueOf(z));
/* 12 */                return this;
                    }

                    public MessageBuilder setDisplayMetrics(DisplayMetrics displayMetrics) {
/* 1 */                 this.displayMetrics = displayMetrics;
/* 3 */                 return this;
                    }

                    public MessageBuilder setNativeSpellCheckServiceDefined(boolean z) {
/* 9 */                 this.message.put(SettingsChannel.NATIVE_SPELL_CHECK_SERVICE_DEFINED, Boolean.valueOf(z));
/* 12 */                return this;
                    }

                    public MessageBuilder setPlatformBrightness(PlatformBrightness platformBrightness) {
/* 7 */                 this.message.put(SettingsChannel.PLATFORM_BRIGHTNESS, platformBrightness.name);
/* 10 */                return this;
                    }

                    public MessageBuilder setTextScaleFactor(float f) {
/* 9 */                 this.message.put(SettingsChannel.TEXT_SCALE_FACTOR, Float.valueOf(f));
/* 12 */                return this;
                    }

                    public MessageBuilder setUse24HourFormat(boolean z) {
/* 9 */                 this.message.put(SettingsChannel.ALWAYS_USE_24_HOUR_FORMAT, Boolean.valueOf(z));
/* 12 */                return this;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum PlatformBrightness {
                    light("light"),
                    dark("dark");

                    public String name;

                    PlatformBrightness(String str) {
/* 4 */                 this.name = str;
                    }
                }

                public SettingsChannel(DartExecutor dartExecutor) {
/* 13 */            this.channel = new BasicMessageChannel<>(dartExecutor, CHANNEL_NAME, JSONMessageCodec.INSTANCE);
                }

                public static DisplayMetrics getPastDisplayMetrics(int i) {
/* 3 */             ConfigurationQueue.SentConfiguration configuration = CONFIGURATION_QUEUE.getConfiguration(i);
/* 7 */             if (configuration == null) {
/* 9 */                 return null;
                    }
/* 1 */             return configuration.displayMetrics;
                }

                public static boolean hasNonlinearTextScalingSupport() {
                    return Build.VERSION.SDK_INT >= 34;
                }

                public MessageBuilder startMessage() {
/* 5 */             return new MessageBuilder(this.channel);
                }
            }
