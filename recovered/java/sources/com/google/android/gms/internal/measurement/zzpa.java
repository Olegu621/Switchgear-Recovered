            package com.google.android.gms.internal.measurement;

            import android.support.v4.media.session.PlaybackStateCompat;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzpa implements zzoz {
                public static final zzkl zzA;
                public static final zzkl zzB;
                public static final zzkl zzC;
                public static final zzkl zzD;
                public static final zzkl zzE;
                public static final zzkl zzF;
                public static final zzkl zzG;
                public static final zzkl zzH;
                public static final zzkl zzI;
                public static final zzkl zzJ;
                public static final zzkl zzK;
                public static final zzkl zzL;
                public static final zzkl zzM;
                public static final zzkl zzN;
                public static final zzkl zzO;
                public static final zzkl zzP;
                public static final zzkl zzQ;
                public static final zzkl zzR;
                public static final zzkl zzS;
                public static final zzkl zzT;
                public static final zzkl zzU;
                public static final zzkl zzV;
                public static final zzkl zzW;
                public static final zzkl zzX;
                public static final zzkl zzY;
                public static final zzkl zzZ;
                public static final zzkl zza;
                public static final zzkl zzaa;
                public static final zzkl zzab;
                public static final zzkl zzac;
                public static final zzkl zzad;
                public static final zzkl zzae;
                public static final zzkl zzaf;
                public static final zzkl zzag;
                public static final zzkl zzah;
                public static final zzkl zzai;
                public static final zzkl zzaj;
                public static final zzkl zzak;
                public static final zzkl zzal;
                public static final zzkl zzam;
                public static final zzkl zzan;
                public static final zzkl zzao;
                public static final zzkl zzap;
                public static final zzkl zzaq;
                public static final zzkl zzar;
                public static final zzkl zzas;
                public static final zzkl zzat;
                public static final zzkl zzau;
                public static final zzkl zzav;
                public static final zzkl zzaw;
                public static final zzkl zzb;
                public static final zzkl zzc;
                public static final zzkl zzd;
                public static final zzkl zze;
                public static final zzkl zzf;
                public static final zzkl zzg;
                public static final zzkl zzh;
                public static final zzkl zzi;
                public static final zzkl zzj;
                public static final zzkl zzk;
                public static final zzkl zzl;
                public static final zzkl zzm;
                public static final zzkl zzn;
                public static final zzkl zzo;
                public static final zzkl zzp;
                public static final zzkl zzq;
                public static final zzkl zzr;
                public static final zzkl zzs;
                public static final zzkl zzt;
                public static final zzkl zzu;
                public static final zzkl zzv;
                public static final zzkl zzw;
                public static final zzkl zzx;
                public static final zzkl zzy;
                public static final zzkl zzz;

                static {
/* 16 */            zzkf zzkfVarZzb = new zzkf(zzka.zza("com.google.android.gms.measurement")).zza().zzb();
/* 28 */            zza = zzkfVarZzb.zzc("measurement.ad_id_cache_time", 10000L);
/* 39 */            zzb = zzkfVarZzb.zzc("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
/* 48 */            zzc = zzkfVarZzb.zzd("measurement.config.bundle_for_all_apps_on_backgrounded", true);
/* 58 */            zzd = zzkfVarZzb.zzc("measurement.max_bundles_per_iteration", 100L);
/* 68 */            zze = zzkfVarZzb.zzf("measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid");
/* 79 */            zzf = zzkfVarZzb.zzc("measurement.config.cache_time", 86400000L);
/* 85 */            zzkfVarZzb.zzf("measurement.log_tag", "FA");
/* 96 */            zzg = zzkfVarZzb.zzf("measurement.config.url_authority", "app-measurement.com");
/* 106 */           zzh = zzkfVarZzb.zzf("measurement.config.url_scheme", "https");
/* 116 */           zzi = zzkfVarZzb.zzc("measurement.upload.debug_upload_interval", 1000L);
/* 120 */           zzkfVarZzb.zzd("measurement.config.default_flag_values", true);
/* 129 */           zzj = zzkfVarZzb.zzc("measurement.session.engagement_interval", 3600000L);
/* 139 */           zzk = zzkfVarZzb.zzf("measurement.rb.attribution.event_params", "value|currency");
/* 149 */           zzl = zzkfVarZzb.zzf("measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp");
/* 160 */           zzm = zzkfVarZzb.zzc("measurement.upload.google_signal_max_queue_time", 605000L);
/* 170 */           zzn = zzkfVarZzb.zzf("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d");
/* 180 */           zzo = zzkfVarZzb.zzc("measurement.lifetimevalue.max_currency_tracked", 4L);
/* 190 */           zzp = zzkfVarZzb.zzc("measurement.dma_consent.max_daily_dcu_realtime_events", 1L);
/* 200 */           zzq = zzkfVarZzb.zzc("measurement.upload.max_event_parameter_value_length", 500L);
/* 211 */           zzr = zzkfVarZzb.zzc("measurement.store.max_stored_events_per_app", 100000L);
/* 221 */           zzs = zzkfVarZzb.zzc("measurement.experiment.max_ids", 50L);
/* 231 */           zzt = zzkfVarZzb.zzc("measurement.audience.filter_result_max_count", 200L);
/* 241 */           zzu = zzkfVarZzb.zzc("measurement.upload.max_item_scoped_custom_parameters", 27L);
/* 249 */           zzv = zzkfVarZzb.zzc("measurement.rb.max_trigger_registrations_per_day", 1000L);
/* 259 */           zzw = zzkfVarZzb.zzc("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0L);
/* 269 */           zzx = zzkfVarZzb.zzc("measurement.rb.attribution.client.min_ad_services_version", 7L);
/* 280 */           zzy = zzkfVarZzb.zzc("measurement.alarm_manager.minimum_interval", 60000L);
/* 288 */           zzz = zzkfVarZzb.zzc("measurement.upload.minimum_delay", 500L);
/* 296 */           zzA = zzkfVarZzb.zzc("measurement.monitoring.sample_period_millis", 86400000L);
/* 306 */           zzB = zzkfVarZzb.zzc("measurement.rb.attribution.notify_app_delay_millis", 3000L);
/* 314 */           zzC = zzkfVarZzb.zzd("measurement.config.notify_trigger_uris_on_backgrounded", true);
/* 318 */           zzkfVarZzb.zzc("measurement.id.rb.attribution.app_allowlist", 0L);
/* 329 */           zzD = zzkfVarZzb.zzf("measurement.rb.attribution.app_allowlist", "com.labpixies.flood");
/* 337 */           zzE = zzkfVarZzb.zzc("measurement.upload.realtime_upload_interval", 10000L);
/* 348 */           zzF = zzkfVarZzb.zzc("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
/* 352 */           zzkfVarZzb.zzc("measurement.config.cache_time.service", 3600000L);
/* 363 */           zzG = zzkfVarZzb.zzc("measurement.service_client.idle_disconnect_millis", 5000L);
/* 369 */           zzkfVarZzb.zzf("measurement.log_tag.service", "FA-SVC");
/* 380 */           zzH = zzkfVarZzb.zzc("measurement.service_client.reconnect_millis", 1000L);
/* 386 */           zzkfVarZzb.zzf("measurement.sgtm.app_allowlist", "*");
/* 398 */           zzI = zzkfVarZzb.zzc("measurement.sgtm.batch.long_queuing_threshold", 240000L);
/* 409 */           zzJ = zzkfVarZzb.zzc("measurement.sgtm.batch.retry_interval", 1800000L);
/* 419 */           zzK = zzkfVarZzb.zzc("measurement.sgtm.batch.retry_max_count", 10L);
/* 430 */           zzL = zzkfVarZzb.zzc("measurement.sgtm.batch.retry_max_wait", 21600000L);
/* 440 */           zzM = zzkfVarZzb.zzf("measurement.sgtm.service_upload_apps_list", HttpUrl.FRAGMENT_ENCODE_SET);
/* 450 */           zzN = zzkfVarZzb.zzf("measurement.sgtm.upload.backoff_http_codes", "404,429,503,504");
/* 460 */           zzO = zzkfVarZzb.zzc("measurement.sgtm.upload.batches_retrieval_limit", 5L);
/* 468 */           zzP = zzkfVarZzb.zzc("measurement.sgtm.upload.max_queued_batches", 5000L);
/* 479 */           zzQ = zzkfVarZzb.zzc("measurement.sgtm.upload.min_delay_after_background", 600000L);
/* 489 */           zzR = zzkfVarZzb.zzc("measurement.sgtm.upload.min_delay_after_broadcast", 1000L);
/* 497 */           zzS = zzkfVarZzb.zzc("measurement.sgtm.upload.min_delay_after_startup", 5000L);
/* 505 */           zzT = zzkfVarZzb.zzc("measurement.sgtm.upload.retry_interval", 600000L);
/* 513 */           zzU = zzkfVarZzb.zzc("measurement.sgtm.upload.retry_max_wait", 21600000L);
/* 521 */           zzV = zzkfVarZzb.zzc("measurement.upload.stale_data_deletion_interval", 86400000L);
/* 531 */           zzW = zzkfVarZzb.zzc("measurement.rb.attribution.max_retry_delay_seconds", 16L);
/* 541 */           zzX = zzkfVarZzb.zzc("measurement.rb.attribution.client.min_time_after_boot_seconds", 90L);
/* 551 */           zzY = zzkfVarZzb.zzf("measurement.rb.attribution.uri_authority", "google-analytics.com");
/* 562 */           zzZ = zzkfVarZzb.zzc("measurement.rb.attribution.max_queue_time", 864000000L);
/* 572 */           zzaa = zzkfVarZzb.zzf("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
/* 580 */           zzab = zzkfVarZzb.zzf("measurement.rb.attribution.query_parameters_to_remove", HttpUrl.FRAGMENT_ENCODE_SET);
/* 588 */           zzac = zzkfVarZzb.zzf("measurement.rb.attribution.uri_scheme", "https");
/* 596 */           zzad = zzkfVarZzb.zzc("measurement.sdk.attribution.cache.ttl", 604800000L);
/* 607 */           zzae = zzkfVarZzb.zzc("measurement.redaction.app_instance_id.ttl", 7200000L);
/* 618 */           zzaf = zzkfVarZzb.zzc("measurement.upload.backoff_period", 43200000L);
/* 628 */           zzag = zzkfVarZzb.zzc("measurement.upload.initial_upload_delay_time", 15000L);
/* 639 */           zzah = zzkfVarZzb.zzc("measurement.upload.interval", 3600000L);
/* 650 */           zzai = zzkfVarZzb.zzc("measurement.upload.max_bundle_size", PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
/* 660 */           zzaj = zzkfVarZzb.zzc("measurement.upload.max_bundles", 100L);
/* 670 */           zzak = zzkfVarZzb.zzc("measurement.upload.max_conversions_per_day", 500L);
/* 680 */           zzal = zzkfVarZzb.zzc("measurement.upload.max_error_events_per_day", 1000L);
/* 688 */           zzam = zzkfVarZzb.zzc("measurement.upload.max_events_per_bundle", 1000L);
/* 699 */           zzan = zzkfVarZzb.zzc("measurement.upload.max_events_per_day", 100000L);
/* 710 */           zzao = zzkfVarZzb.zzc("measurement.upload.max_public_events_per_day", 50000L);
/* 721 */           zzap = zzkfVarZzb.zzc("measurement.upload.max_queue_time", 518400000L);
/* 731 */           zzaq = zzkfVarZzb.zzc("measurement.upload.max_realtime_events_per_day", 10L);
/* 739 */           zzar = zzkfVarZzb.zzc("measurement.upload.max_batch_size", PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
/* 749 */           zzas = zzkfVarZzb.zzc("measurement.upload.retry_count", 6L);
/* 760 */           zzat = zzkfVarZzb.zzc("measurement.upload.retry_time", 1800000L);
/* 770 */           zzau = zzkfVarZzb.zzf("measurement.upload.url", "https://app-measurement.com/a");
/* 781 */           zzav = zzkfVarZzb.zzc("measurement.upload.window_interval", 3600000L);
/* 791 */           zzaw = zzkfVarZzb.zzf("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot");
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzA() {
/* 9 */             return ((Long) zzA.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzB() {
/* 9 */             return ((Long) zzB.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final boolean zzC() {
/* 9 */             return ((Boolean) zzC.zzd()).booleanValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final String zzD() {
/* 7 */             return (String) zzD.zzd();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzE() {
/* 9 */             return ((Long) zzE.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzF() {
/* 9 */             return ((Long) zzF.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzG() {
/* 9 */             return ((Long) zzG.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzH() {
/* 9 */             return ((Long) zzH.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzI() {
/* 9 */             return ((Long) zzI.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzJ() {
/* 9 */             return ((Long) zzJ.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzK() {
/* 9 */             return ((Long) zzK.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzL() {
/* 9 */             return ((Long) zzL.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final String zzM() {
/* 7 */             return (String) zzM.zzd();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final String zzN() {
/* 7 */             return (String) zzN.zzd();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzO() {
/* 9 */             return ((Long) zzO.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzP() {
/* 9 */             return ((Long) zzP.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzQ() {
/* 9 */             return ((Long) zzQ.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzR() {
/* 9 */             return ((Long) zzR.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzS() {
/* 9 */             return ((Long) zzS.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzT() {
/* 9 */             return ((Long) zzT.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzU() {
/* 9 */             return ((Long) zzU.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzV() {
/* 9 */             return ((Long) zzV.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzW() {
/* 9 */             return ((Long) zzW.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzX() {
/* 9 */             return ((Long) zzX.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final String zzY() {
/* 7 */             return (String) zzY.zzd();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzZ() {
/* 9 */             return ((Long) zzZ.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zza() {
/* 9 */             return ((Long) zza.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final String zzaa() {
/* 7 */             return (String) zzaa.zzd();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final String zzab() {
/* 7 */             return (String) zzab.zzd();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final String zzac() {
/* 7 */             return (String) zzac.zzd();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzad() {
/* 9 */             return ((Long) zzad.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzae() {
/* 9 */             return ((Long) zzae.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzaf() {
/* 9 */             return ((Long) zzaf.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzag() {
/* 9 */             return ((Long) zzag.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzah() {
/* 9 */             return ((Long) zzah.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzai() {
/* 9 */             return ((Long) zzai.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzaj() {
/* 9 */             return ((Long) zzaj.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzak() {
/* 9 */             return ((Long) zzak.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzal() {
/* 9 */             return ((Long) zzal.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzam() {
/* 9 */             return ((Long) zzam.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzan() {
/* 9 */             return ((Long) zzan.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzao() {
/* 9 */             return ((Long) zzao.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzap() {
/* 9 */             return ((Long) zzap.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzaq() {
/* 9 */             return ((Long) zzaq.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzar() {
/* 9 */             return ((Long) zzar.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzas() {
/* 9 */             return ((Long) zzas.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzat() {
/* 9 */             return ((Long) zzat.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final String zzau() {
/* 7 */             return (String) zzau.zzd();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzav() {
/* 9 */             return ((Long) zzav.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final String zzaw() {
/* 7 */             return (String) zzaw.zzd();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzb() {
/* 9 */             return ((Long) zzb.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final boolean zzc() {
/* 9 */             return ((Boolean) zzc.zzd()).booleanValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzd() {
/* 9 */             return ((Long) zzd.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final String zze() {
/* 7 */             return (String) zze.zzd();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzf() {
/* 9 */             return ((Long) zzf.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final String zzg() {
/* 7 */             return (String) zzg.zzd();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final String zzh() {
/* 7 */             return (String) zzh.zzd();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzi() {
/* 9 */             return ((Long) zzi.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzj() {
/* 9 */             return ((Long) zzj.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final String zzk() {
/* 7 */             return (String) zzk.zzd();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final String zzl() {
/* 7 */             return (String) zzl.zzd();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzm() {
/* 9 */             return ((Long) zzm.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final String zzn() {
/* 7 */             return (String) zzn.zzd();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzo() {
/* 9 */             return ((Long) zzo.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzp() {
/* 9 */             return ((Long) zzp.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzq() {
/* 9 */             return ((Long) zzq.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzr() {
/* 9 */             return ((Long) zzr.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzs() {
/* 9 */             return ((Long) zzs.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzt() {
/* 9 */             return ((Long) zzt.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzu() {
/* 9 */             return ((Long) zzu.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzv() {
/* 9 */             return ((Long) zzv.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzw() {
/* 9 */             return ((Long) zzw.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzx() {
/* 9 */             return ((Long) zzx.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzy() {
/* 9 */             return ((Long) zzy.zzd()).longValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzoz
                public final long zzz() {
/* 9 */             return ((Long) zzz.zzd()).longValue();
                }
            }
