.class public final Lfi1;
.super Ldi1;


# instance fields
.field public final a:Lcom/google/android/gms/common/data/DataHolder;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfi1;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 5
    .line 6
    iput p2, p0, Lfi1;->b:I

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lcom/google/android/gms/common/data/DataHolder;->H1(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lfi1;->c:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final zza(Lii1;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lfi1;->b:I

    .line 2
    .line 3
    iget v1, p0, Lfi1;->c:I

    .line 4
    .line 5
    iget-object p0, p0, Lfi1;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 6
    .line 7
    invoke-interface {p1, p0, v0, v1}, Lii1;->zza(Lcom/google/android/gms/common/data/DataHolder;II)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
