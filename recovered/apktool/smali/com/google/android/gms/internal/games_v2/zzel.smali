.class public final synthetic Lcom/google/android/gms/internal/games_v2/zzel;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/gms/internal/games_v2/zzaq;


# instance fields
.field public final synthetic zza:Ljava/lang/String;

.field public final synthetic zzb:Z

.field public final synthetic zzc:Z

.field public final synthetic zzd:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/games_v2/zzel;->zza:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/google/android/gms/internal/games_v2/zzel;->zzb:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lcom/google/android/gms/internal/games_v2/zzel;->zzc:Z

    .line 9
    .line 10
    iput p4, p0, Lcom/google/android/gms/internal/games_v2/zzel;->zzd:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final zza(Lor0;)Lcom/google/android/gms/tasks/Task;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/games_v2/zzel;->zza:Ljava/lang/String;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/games_v2/zzel;->zzb:Z

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/google/android/gms/internal/games_v2/zzel;->zzc:Z

    .line 6
    .line 7
    iget p0, p0, Lcom/google/android/gms/internal/games_v2/zzel;->zzd:I

    .line 8
    .line 9
    invoke-static {}, Lum2;->builder()Ltm2;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    new-instance v4, Lcom/google/android/gms/internal/games_v2/zzet;

    .line 14
    .line 15
    invoke-direct {v4, v0, v1, v2, p0}, Lcom/google/android/gms/internal/games_v2/zzet;-><init>(Ljava/lang/String;ZZI)V

    .line 16
    .line 17
    .line 18
    iput-object v4, v3, Ltm2;->a:Lc32;

    .line 19
    .line 20
    const/16 p0, 0x1a3f

    .line 21
    .line 22
    iput p0, v3, Ltm2;->d:I

    .line 23
    .line 24
    invoke-virtual {v3}, Ltm2;->a()Lmb3;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p1, p0}, Lor0;->doRead(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
