.class public final Lj63;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lorg/chromium/support_lib_boundary/WebMessagePayloadBoundaryInterface;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lj63;->a:I

    .line 6
    .line 7
    iput-object p1, p0, Lj63;->b:Ljava/lang/String;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Lj63;->c:[B

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 14
    iput v0, p0, Lj63;->a:I

    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lj63;->b:Ljava/lang/String;

    .line 16
    iput-object p1, p0, Lj63;->c:[B

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .line 1
    iget p0, p0, Lj63;->a:I

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "Expected "

    .line 7
    .line 8
    const-string v1, ", but type is "

    .line 9
    .line 10
    invoke-static {v0, p1, p0, v1}, Len;->j(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final getAsArrayBuffer()[B
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lj63;->a(I)V

    .line 3
    .line 4
    .line 5
    iget-object p0, p0, Lj63;->c:[B

    .line 6
    .line 7
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    check-cast p0, [B

    .line 11
    .line 12
    return-object p0
.end method

.method public final getAsString()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lj63;->a(I)V

    .line 3
    .line 4
    .line 5
    iget-object p0, p0, Lj63;->b:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0
.end method

.method public final getSupportedFeatures()[Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    new-array p0, p0, [Ljava/lang/String;

    .line 3
    .line 4
    return-object p0
.end method

.method public final getType()I
    .locals 0

    .line 1
    iget p0, p0, Lj63;->a:I

    .line 2
    .line 3
    return p0
.end method
