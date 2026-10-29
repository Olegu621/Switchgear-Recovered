.class public final enum Lxb0;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lp7;


# static fields
.field public static final synthetic b:[Lxb0;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lxb0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, -0x104

    .line 5
    .line 6
    const-string v3, "ED256"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lxb0;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lxb0;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const/16 v3, -0x105

    .line 15
    .line 16
    const-string v4, "ED512"

    .line 17
    .line 18
    invoke-direct {v1, v4, v2, v3}, Lxb0;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lxb0;

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    const/4 v4, -0x7

    .line 25
    const-string v5, "ES256"

    .line 26
    .line 27
    invoke-direct {v2, v5, v3, v4}, Lxb0;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    new-instance v3, Lxb0;

    .line 31
    .line 32
    const/4 v4, 0x3

    .line 33
    const/16 v5, -0x23

    .line 34
    .line 35
    const-string v6, "ES384"

    .line 36
    .line 37
    invoke-direct {v3, v6, v4, v5}, Lxb0;-><init>(Ljava/lang/String;II)V

    .line 38
    .line 39
    .line 40
    new-instance v4, Lxb0;

    .line 41
    .line 42
    const/4 v5, 0x4

    .line 43
    const/16 v6, -0x24

    .line 44
    .line 45
    const-string v7, "ES512"

    .line 46
    .line 47
    invoke-direct {v4, v7, v5, v6}, Lxb0;-><init>(Ljava/lang/String;II)V

    .line 48
    .line 49
    .line 50
    filled-new-array {v0, v1, v2, v3, v4}, [Lxb0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, Lxb0;->b:[Lxb0;

    .line 55
    .line 56
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lxb0;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lxb0;
    .locals 1

    .line 1
    const-class v0, Lxb0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lxb0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lxb0;
    .locals 1

    .line 1
    sget-object v0, Lxb0;->b:[Lxb0;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lxb0;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lxb0;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget p0, p0, Lxb0;->a:I

    .line 2
    .line 3
    return p0
.end method
