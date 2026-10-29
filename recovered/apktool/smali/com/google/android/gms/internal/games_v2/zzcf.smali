.class public final synthetic Lcom/google/android/gms/internal/games_v2/zzcf;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lc32;


# instance fields
.field public final synthetic zza:Ljava/lang/String;

.field public final synthetic zzb:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/games_v2/zzcf;->zza:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lcom/google/android/gms/internal/games_v2/zzcf;->zzb:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/games_v2/zzcf;->zza:Ljava/lang/String;

    .line 2
    .line 3
    iget p0, p0, Lcom/google/android/gms/internal/games_v2/zzcf;->zzb:I

    .line 4
    .line 5
    check-cast p1, Lnd3;

    .line 6
    .line 7
    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 8
    .line 9
    iget-object p1, p1, Lnd3;->a:Lgm3;

    .line 10
    .line 11
    invoke-virtual {p1, v0, p0}, Lcom/google/android/gms/internal/games_v2/zzak;->zzc(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
