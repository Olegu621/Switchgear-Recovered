.class public abstract Lb11;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final d:La11;


# instance fields
.field public final a:Lwl0;

.field public final b:Lb5;

.field public final c:Lyy;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La11;

    .line 2
    .line 3
    new-instance v1, Lwl0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v2, v2, v2}, Lwl0;-><init>(ZZZ)V

    .line 7
    .line 8
    .line 9
    sget-object v2, Loa2;->a:Lb5;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Lb11;-><init>(Lwl0;Lb5;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lb11;->d:La11;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Lwl0;Lb5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb11;->a:Lwl0;

    .line 5
    .line 6
    iput-object p2, p0, Lb11;->b:Lb5;

    .line 7
    .line 8
    new-instance p1, Lyy;

    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    invoke-direct {p1, p2}, Lyy;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lb11;->c:Lyy;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v3, Lkn;

    .line 8
    .line 9
    invoke-direct {v3, p1}, Lkn;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Loh2;

    .line 13
    .line 14
    invoke-interface {p2}, Lkotlinx/serialization/KSerializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v2, 0x1

    .line 20
    move-object v1, p0

    .line 21
    invoke-direct/range {v0 .. v5}, Loh2;-><init>(Lb11;ILkn;Lkotlinx/serialization/descriptors/SerialDescriptor;Ld5;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2}, Loh2;->u(Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v3}, Lkn;->e()B

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    const/16 v0, 0xa

    .line 33
    .line 34
    if-ne p2, v0, :cond_0

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string p2, "Expected EOF after parsing, but had "

    .line 40
    .line 41
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget p2, v3, Lkn;->b:I

    .line 45
    .line 46
    add-int/lit8 p2, p2, -0x1

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p1, " instead"

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const/4 p1, 0x0

    .line 65
    const/4 p2, 0x6

    .line 66
    invoke-static {v3, p0, p1, p2}, Lkn;->m(Lkn;Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x0

    .line 70
    throw p0
.end method

.method public final b(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ln7;

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    invoke-direct {v0, v1}, Ln7;-><init>(I)V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lht;->a:Lht;

    .line 11
    .line 12
    monitor-enter v1

    .line 13
    :try_start_0
    sget-object v2, Lht;->b:Ldd;

    .line 14
    .line 15
    invoke-virtual {v2}, Ldd;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    move-object v2, v4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v2}, Ldd;->removeLast()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :goto_0
    check-cast v2, [C

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    sget v3, Lht;->c:I

    .line 33
    .line 34
    array-length v4, v2

    .line 35
    sub-int/2addr v3, v4

    .line 36
    sput v3, Lht;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    move-object v4, v2

    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    :goto_1
    monitor-exit v1

    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    const/16 v1, 0x80

    .line 46
    .line 47
    new-array v4, v1, [C

    .line 48
    .line 49
    :cond_2
    iput-object v4, v0, Ln7;->c:Ljava/lang/Object;

    .line 50
    .line 51
    :try_start_1
    new-instance v1, Lph2;

    .line 52
    .line 53
    const/4 v2, 0x4

    .line 54
    invoke-static {v2}, Len;->E(I)[I

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    array-length v2, v2

    .line 59
    new-array v2, v2, [Lp11;

    .line 60
    .line 61
    new-instance v3, Lzr3;

    .line 62
    .line 63
    invoke-direct {v3, v0}, Lzr3;-><init>(Ln7;)V

    .line 64
    .line 65
    .line 66
    const/4 v4, 0x1

    .line 67
    invoke-direct {v1, v3, p0, v4, v2}, Lph2;-><init>(Lzr3;Lb11;I[Lp11;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, p1, p2}, Lph2;->A(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ln7;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    invoke-virtual {v0}, Ln7;->h()V

    .line 78
    .line 79
    .line 80
    return-object p0

    .line 81
    :catchall_1
    move-exception p0

    .line 82
    invoke-virtual {v0}, Ln7;->h()V

    .line 83
    .line 84
    .line 85
    throw p0

    .line 86
    :goto_2
    monitor-exit v1

    .line 87
    throw p0
.end method
