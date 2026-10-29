.class public final synthetic Lcom/google/android/gms/internal/games_v2/zzct;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/gms/internal/games_v2/zzaq;


# instance fields
.field public final synthetic zza:Ljava/lang/String;

.field public final synthetic zzb:I

.field public final synthetic zzc:I

.field public final synthetic zzd:I

.field public final synthetic zze:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;IIIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/games_v2/zzct;->zza:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lcom/google/android/gms/internal/games_v2/zzct;->zzb:I

    .line 7
    .line 8
    iput p3, p0, Lcom/google/android/gms/internal/games_v2/zzct;->zzc:I

    .line 9
    .line 10
    iput p4, p0, Lcom/google/android/gms/internal/games_v2/zzct;->zzd:I

    .line 11
    .line 12
    iput-boolean p5, p0, Lcom/google/android/gms/internal/games_v2/zzct;->zze:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final zza(Lor0;)Lcom/google/android/gms/tasks/Task;
    .locals 6

    .line 1
    iget-object v1, p0, Lcom/google/android/gms/internal/games_v2/zzct;->zza:Ljava/lang/String;

    .line 2
    .line 3
    iget v2, p0, Lcom/google/android/gms/internal/games_v2/zzct;->zzb:I

    .line 4
    .line 5
    iget v3, p0, Lcom/google/android/gms/internal/games_v2/zzct;->zzc:I

    .line 6
    .line 7
    iget v4, p0, Lcom/google/android/gms/internal/games_v2/zzct;->zzd:I

    .line 8
    .line 9
    iget-boolean v5, p0, Lcom/google/android/gms/internal/games_v2/zzct;->zze:Z

    .line 10
    .line 11
    invoke-static {}, Lum2;->builder()Ltm2;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    new-instance v0, Lcom/google/android/gms/internal/games_v2/zzdc;

    .line 16
    .line 17
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/games_v2/zzdc;-><init>(Ljava/lang/String;IIIZ)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Ltm2;->a:Lc32;

    .line 21
    .line 22
    const/16 v0, 0x1a31

    .line 23
    .line 24
    iput v0, p0, Ltm2;->d:I

    .line 25
    .line 26
    invoke-virtual {p0}, Ltm2;->a()Lmb3;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p1, p0}, Lor0;->doRead(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
