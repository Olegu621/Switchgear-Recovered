.class public final synthetic Lcom/google/android/gms/internal/games_v2/zzei;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/gms/internal/games_v2/zzaq;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/games/snapshot/SnapshotMetadata;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/games_v2/zzei;->zza:Lcom/google/android/gms/games/snapshot/SnapshotMetadata;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final zza(Lor0;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/games_v2/zzei;->zza:Lcom/google/android/gms/games/snapshot/SnapshotMetadata;

    .line 2
    .line 3
    invoke-static {}, Lum2;->builder()Ltm2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/google/android/gms/internal/games_v2/zzeq;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/games_v2/zzeq;-><init>(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, Ltm2;->a:Lc32;

    .line 13
    .line 14
    const/16 p0, 0x1a44

    .line 15
    .line 16
    iput p0, v0, Ltm2;->d:I

    .line 17
    .line 18
    invoke-virtual {v0}, Ltm2;->a()Lmb3;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p1, p0}, Lor0;->doWrite(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
