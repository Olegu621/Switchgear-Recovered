.class public final Li63;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:[Ll63;

.field public final b:Ljava/lang/String;

.field public final c:[B

.field public final d:I


# direct methods
.method public constructor <init>(Ljava/lang/String;[Ll63;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Li63;->b:Ljava/lang/String;

    const/4 p1, 0x0

    .line 20
    iput-object p1, p0, Li63;->c:[B

    .line 21
    iput-object p2, p0, Li63;->a:[Ll63;

    const/4 p1, 0x0

    .line 22
    iput p1, p0, Li63;->d:I

    return-void
.end method

.method public constructor <init>([B[Ll63;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Li63;->c:[B

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Li63;->b:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, Li63;->a:[Ll63;

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput p1, p0, Li63;->d:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 6

    .line 1
    iget p0, p0, Li63;->d:I

    .line 2
    .line 3
    if-ne p1, p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v2, "Wrong data accessor type detected. "

    .line 11
    .line 12
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v2, "String"

    .line 16
    .line 17
    const-string v3, "ArrayBuffer"

    .line 18
    .line 19
    const-string v4, "Unknown"

    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    if-eq p0, v5, :cond_1

    .line 25
    .line 26
    move-object p0, v4

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object p0, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    move-object p0, v2

    .line 31
    :goto_0
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, " expected, but got "

    .line 35
    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    if-eqz p1, :cond_4

    .line 40
    .line 41
    if-eq p1, v5, :cond_3

    .line 42
    .line 43
    move-object v2, v4

    .line 44
    goto :goto_1

    .line 45
    :cond_3
    move-object v2, v3

    .line 46
    :cond_4
    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0
.end method
