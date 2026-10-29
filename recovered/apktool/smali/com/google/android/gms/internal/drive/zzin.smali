.class public final Lcom/google/android/gms/internal/drive/zzin;
.super Ljava/lang/Object;


# static fields
.field public static final zzlk:Lii1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lii1;"
        }
    .end annotation
.end field

.field public static final zzll:Lii1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lii1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lfi3;

    .line 2
    .line 3
    const-string v1, "contentAvailability"

    .line 4
    .line 5
    const v2, 0x419ce0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lsc3;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/google/android/gms/internal/drive/zzin;->zzlk:Lii1;

    .line 12
    .line 13
    new-instance v0, Lke3;

    .line 14
    .line 15
    const-string v1, "isPinnable"

    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Lsc3;-><init>(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/google/android/gms/internal/drive/zzin;->zzll:Lii1;

    .line 21
    .line 22
    return-void
.end method
