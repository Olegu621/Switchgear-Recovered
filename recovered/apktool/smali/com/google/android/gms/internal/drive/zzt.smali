.class public final Lcom/google/android/gms/internal/drive/zzt;
.super Ljava/lang/Object;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private zzba:Ljava/lang/String;

.field private zzbd:Lcom/google/android/gms/drive/DriveId;

.field private zzdk:Ljava/lang/Integer;

.field private final zzdl:I

.field private zzdm:Lhi1;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/google/android/gms/internal/drive/zzt;->zzdl:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final build(Ltr0;)Landroid/content/IntentSender;
    .locals 0

    .line 1
    check-cast p1, Leb3;

    .line 2
    .line 3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string p1, "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method."

    .line 9
    .line 10
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method

.method public final getRequestId()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzt;->zzdk:Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final zza(Lcom/google/android/gms/drive/DriveId;)V
    .locals 0

    .line 7
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzt;->zzbd:Lcom/google/android/gms/drive/DriveId;

    return-void
.end method

.method public final zza(Lhi1;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzt;->zzdm:Lhi1;

    .line 5
    .line 6
    return-void
.end method

.method public final zzc()Lhi1;
    .locals 0

    .line 7
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzt;->zzdm:Lhi1;

    return-object p0
.end method

.method public final zzc(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzt;->zzba:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public final zzd()Lcom/google/android/gms/drive/DriveId;
    .locals 0

    .line 8
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzt;->zzbd:Lcom/google/android/gms/drive/DriveId;

    return-object p0
.end method

.method public final zzd(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzt;->zzdk:Ljava/lang/Integer;

    .line 6
    .line 7
    return-void
.end method

.method public final zze()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzt;->zzba:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zzg()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzt;->zzdm:Lhi1;

    .line 2
    .line 3
    const-string v1, "Must provide initial metadata via setInitialMetadata."

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzt;->zzdk:Ljava/lang/Integer;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/google/android/gms/internal/drive/zzt;->zzdk:Ljava/lang/Integer;

    .line 23
    .line 24
    return-void
.end method
