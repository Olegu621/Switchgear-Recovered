.class final Lcom/google/android/gms/internal/drive/zzbp;
.super Ljava/lang/Object;

# interfaces
.implements Lia0;


# instance fields
.field private final zzfa:Lv81;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv81;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv81;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv81;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzbp;->zzfa:Lv81;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onProgress(JJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzbp;->zzfa:Lv81;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/internal/drive/zzbq;

    .line 4
    .line 5
    move-object v2, p0

    .line 6
    move-wide v3, p1

    .line 7
    move-wide v5, p3

    .line 8
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/drive/zzbq;-><init>(Lcom/google/android/gms/internal/drive/zzbp;JJ)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lv81;->a(Lu81;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
