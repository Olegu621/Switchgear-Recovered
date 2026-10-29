.class public abstract Lfq0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Lcom/google/android/gms/common/api/Scope;

.field public static final b:Lh9;

.field public static final c:Lcom/google/android/gms/common/api/Scope;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Le9;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lah3;

    .line 7
    .line 8
    invoke-direct {v1}, Lah3;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lcom/google/android/gms/common/api/Scope;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    const-string v4, "https://www.googleapis.com/auth/games"

    .line 15
    .line 16
    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v2, Lfq0;->a:Lcom/google/android/gms/common/api/Scope;

    .line 20
    .line 21
    new-instance v2, Lcom/google/android/gms/common/api/Scope;

    .line 22
    .line 23
    const-string v4, "https://www.googleapis.com/auth/games_lite"

    .line 24
    .line 25
    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance v2, Lcom/google/android/gms/common/api/Scope;

    .line 29
    .line 30
    const-string v4, "https://www.googleapis.com/auth/drive.appdata"

    .line 31
    .line 32
    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v2, Lh9;

    .line 36
    .line 37
    const-string v4, "Games.API"

    .line 38
    .line 39
    invoke-direct {v2, v4, v1, v0}, Lh9;-><init>(Ljava/lang/String;Lw8;Le9;)V

    .line 40
    .line 41
    .line 42
    sput-object v2, Lfq0;->b:Lh9;

    .line 43
    .line 44
    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    .line 45
    .line 46
    const-string v1, "https://www.googleapis.com/auth/games.firstparty"

    .line 47
    .line 48
    invoke-direct {v0, v3, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lfq0;->c:Lcom/google/android/gms/common/api/Scope;

    .line 52
    .line 53
    new-instance v0, Lcom/google/android/gms/internal/games_v2/zzg;

    .line 54
    .line 55
    invoke-direct {v0}, Lcom/google/android/gms/internal/games_v2/zzg;-><init>()V

    .line 56
    .line 57
    .line 58
    new-instance v0, Lcom/google/android/gms/internal/games_v2/zzd;

    .line 59
    .line 60
    invoke-direct {v0}, Lcom/google/android/gms/internal/games_v2/zzd;-><init>()V

    .line 61
    .line 62
    .line 63
    new-instance v0, Lcom/google/android/gms/internal/games_v2/zzf;

    .line 64
    .line 65
    invoke-direct {v0}, Lcom/google/android/gms/internal/games_v2/zzf;-><init>()V

    .line 66
    .line 67
    .line 68
    new-instance v0, Lcom/google/android/gms/internal/games_v2/zzh;

    .line 69
    .line 70
    invoke-direct {v0}, Lcom/google/android/gms/internal/games_v2/zzh;-><init>()V

    .line 71
    .line 72
    .line 73
    new-instance v0, Lcom/google/android/gms/internal/games_v2/zzi;

    .line 74
    .line 75
    invoke-direct {v0}, Lcom/google/android/gms/internal/games_v2/zzi;-><init>()V

    .line 76
    .line 77
    .line 78
    new-instance v0, Lcom/google/android/gms/internal/games_v2/zzj;

    .line 79
    .line 80
    invoke-direct {v0}, Lcom/google/android/gms/internal/games_v2/zzj;-><init>()V

    .line 81
    .line 82
    .line 83
    new-instance v0, Lcom/google/android/gms/internal/games_v2/zzk;

    .line 84
    .line 85
    invoke-direct {v0}, Lcom/google/android/gms/internal/games_v2/zzk;-><init>()V

    .line 86
    .line 87
    .line 88
    new-instance v0, Lcom/google/android/gms/internal/games_v2/zzl;

    .line 89
    .line 90
    invoke-direct {v0}, Lcom/google/android/gms/internal/games_v2/zzl;-><init>()V

    .line 91
    .line 92
    .line 93
    return-void
.end method
