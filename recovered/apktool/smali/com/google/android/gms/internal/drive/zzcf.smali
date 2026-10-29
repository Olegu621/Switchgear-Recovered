.class final Lcom/google/android/gms/internal/drive/zzcf;
.super Ljava/lang/Object;

# interfaces
.implements Lp42;


# instance fields
.field private final zzdy:Lcom/google/android/gms/common/api/Status;

.field private final zzfm:Lci0;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/drive/zzcb;Lcom/google/android/gms/common/api/Status;Lci0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/google/android/gms/internal/drive/zzcf;->zzdy:Lcom/google/android/gms/common/api/Status;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/google/android/gms/internal/drive/zzcf;->zzfm:Lci0;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/drive/zzcb;Lcom/google/android/gms/common/api/Status;Lci0;Lcom/google/android/gms/internal/drive/zzcc;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/drive/zzcf;-><init>(Lcom/google/android/gms/internal/drive/zzcb;Lcom/google/android/gms/common/api/Status;Lci0;)V

    return-void
.end method


# virtual methods
.method public final getFileUploadPreferences()Lci0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzcf;->zzfm:Lci0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzcf;->zzdy:Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    return-object p0
.end method
