.class public abstract Lea0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Le9;

.field public static final b:Lh9;


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
    sput-object v0, Lea0;->a:Le9;

    .line 7
    .line 8
    new-instance v1, Lva3;

    .line 9
    .line 10
    const/16 v2, 0xc

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lva3;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/google/android/gms/common/api/Scope;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    const-string v4, "https://www.googleapis.com/auth/drive.file"

    .line 19
    .line 20
    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Lcom/google/android/gms/common/api/Scope;

    .line 24
    .line 25
    const-string v4, "https://www.googleapis.com/auth/drive.appdata"

    .line 26
    .line 27
    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Lcom/google/android/gms/common/api/Scope;

    .line 31
    .line 32
    const-string v4, "https://www.googleapis.com/auth/drive"

    .line 33
    .line 34
    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    new-instance v2, Lcom/google/android/gms/common/api/Scope;

    .line 38
    .line 39
    const-string v4, "https://www.googleapis.com/auth/drive.apps"

    .line 40
    .line 41
    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance v2, Lh9;

    .line 45
    .line 46
    const-string v3, "Drive.API_CONNECTIONLESS"

    .line 47
    .line 48
    invoke-direct {v2, v3, v1, v0}, Lh9;-><init>(Ljava/lang/String;Lw8;Le9;)V

    .line 49
    .line 50
    .line 51
    sput-object v2, Lea0;->b:Lh9;

    .line 52
    .line 53
    new-instance v0, Lcom/google/android/gms/internal/drive/zzaf;

    .line 54
    .line 55
    invoke-direct {v0}, Lcom/google/android/gms/internal/drive/zzaf;-><init>()V

    .line 56
    .line 57
    .line 58
    new-instance v0, Lcom/google/android/gms/internal/drive/zzbr;

    .line 59
    .line 60
    invoke-direct {v0}, Lcom/google/android/gms/internal/drive/zzbr;-><init>()V

    .line 61
    .line 62
    .line 63
    new-instance v0, Lcom/google/android/gms/internal/drive/zzeb;

    .line 64
    .line 65
    invoke-direct {v0}, Lcom/google/android/gms/internal/drive/zzeb;-><init>()V

    .line 66
    .line 67
    .line 68
    new-instance v0, Lcom/google/android/gms/internal/drive/zzcb;

    .line 69
    .line 70
    invoke-direct {v0}, Lcom/google/android/gms/internal/drive/zzcb;-><init>()V

    .line 71
    .line 72
    .line 73
    return-void
.end method
