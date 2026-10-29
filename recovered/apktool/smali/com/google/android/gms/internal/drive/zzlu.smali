.class final Lcom/google/android/gms/internal/drive/zzlu;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/drive/zzmf;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/drive/zzmf<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final zzub:[I

.field private static final zzuc:Lsun/misc/Unsafe;


# instance fields
.field private final zzud:[I

.field private final zzue:[Ljava/lang/Object;

.field private final zzuf:I

.field private final zzug:I

.field private final zzuh:Lcom/google/android/gms/internal/drive/zzlq;

.field private final zzui:Z

.field private final zzuj:Z

.field private final zzuk:Z

.field private final zzul:Z

.field private final zzum:[I

.field private final zzun:I

.field private final zzuo:I

.field private final zzup:Lcom/google/android/gms/internal/drive/zzly;

.field private final zzuq:Lcom/google/android/gms/internal/drive/zzla;

.field private final zzur:Lcom/google/android/gms/internal/drive/zzmx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/drive/zzmx<",
            "**>;"
        }
    .end annotation
.end field

.field private final zzus:Lcom/google/android/gms/internal/drive/zzjy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/drive/zzjy<",
            "*>;"
        }
    .end annotation
.end field

.field private final zzut:Lcom/google/android/gms/internal/drive/zzll;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, Lcom/google/android/gms/internal/drive/zzlu;->zzub:[I

    .line 5
    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/drive/zznd;->zzff()Lsun/misc/Unsafe;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lcom/google/android/gms/internal/drive/zzlu;->zzuc:Lsun/misc/Unsafe;

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/drive/zzlq;ZZ[IIILcom/google/android/gms/internal/drive/zzly;Lcom/google/android/gms/internal/drive/zzla;Lcom/google/android/gms/internal/drive/zzmx;Lcom/google/android/gms/internal/drive/zzjy;Lcom/google/android/gms/internal/drive/zzll;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I[",
            "Ljava/lang/Object;",
            "II",
            "Lcom/google/android/gms/internal/drive/zzlq;",
            "ZZ[III",
            "Lcom/google/android/gms/internal/drive/zzly;",
            "Lcom/google/android/gms/internal/drive/zzla;",
            "Lcom/google/android/gms/internal/drive/zzmx<",
            "**>;",
            "Lcom/google/android/gms/internal/drive/zzjy<",
            "*>;",
            "Lcom/google/android/gms/internal/drive/zzll;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzue:[Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzuf:I

    .line 9
    .line 10
    iput p4, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzug:I

    .line 11
    .line 12
    instance-of p1, p5, Lcom/google/android/gms/internal/drive/zzkk;

    .line 13
    .line 14
    iput-boolean p1, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzuj:Z

    .line 15
    .line 16
    iput-boolean p6, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzuk:Z

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    if-eqz p14, :cond_0

    .line 20
    .line 21
    invoke-virtual {p14, p5}, Lcom/google/android/gms/internal/drive/zzjy;->zze(Lcom/google/android/gms/internal/drive/zzlq;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    const/4 p2, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move p2, p1

    .line 30
    :goto_0
    iput-boolean p2, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzui:Z

    .line 31
    .line 32
    iput-boolean p1, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 33
    .line 34
    iput-object p8, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzum:[I

    .line 35
    .line 36
    iput p9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzun:I

    .line 37
    .line 38
    iput p10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzuo:I

    .line 39
    .line 40
    iput-object p11, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzup:Lcom/google/android/gms/internal/drive/zzly;

    .line 41
    .line 42
    iput-object p12, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzuq:Lcom/google/android/gms/internal/drive/zzla;

    .line 43
    .line 44
    iput-object p13, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzur:Lcom/google/android/gms/internal/drive/zzmx;

    .line 45
    .line 46
    iput-object p14, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 47
    .line 48
    iput-object p5, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzuh:Lcom/google/android/gms/internal/drive/zzlq;

    .line 49
    .line 50
    iput-object p15, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzut:Lcom/google/android/gms/internal/drive/zzll;

    .line 51
    .line 52
    return-void
.end method

.method private static zza(Lcom/google/android/gms/internal/drive/zzmx;Ljava/lang/Object;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/drive/zzmx<",
            "TUT;TUB;>;TT;)I"
        }
    .end annotation

    .line 2650
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/drive/zzmx;->zzr(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 2651
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/drive/zzmx;->zzn(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method private final zza(Ljava/lang/Object;[BIIIIIIIJILcom/google/android/gms/internal/drive/zziz;)I
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;[BIIIIIIIJI",
            "Lcom/google/android/gms/internal/drive/zziz;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p5

    move/from16 v8, p6

    move/from16 v3, p7

    move-wide/from16 v9, p10

    move/from16 v4, p12

    .line 2951
    sget-object v11, Lcom/google/android/gms/internal/drive/zzlu;->zzuc:Lsun/misc/Unsafe;

    .line 2952
    iget-object v5, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    add-int/lit8 v6, v4, 0x2

    aget v5, v5, v6

    const v6, 0xfffff

    and-int/2addr v5, v6

    int-to-long v12, v5

    const/4 v5, 0x5

    const/4 v14, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x2

    packed-switch p9, :pswitch_data_0

    :cond_0
    move/from16 v15, p3

    goto/16 :goto_8

    :pswitch_0
    const/4 v5, 0x3

    if-ne v3, v5, :cond_0

    and-int/lit8 v2, v2, -0x8

    or-int/lit8 v6, v2, 0x4

    .line 2953
    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    move-result-object v2

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v7, p13

    .line 2954
    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/drive/zziy;->zza(Lcom/google/android/gms/internal/drive/zzmf;[BIIILcom/google/android/gms/internal/drive/zziz;)I

    move-result v0

    move-object v5, v7

    .line 2955
    invoke-virtual {v11, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v2

    if-ne v2, v8, :cond_1

    .line 2956
    invoke-virtual {v11, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v14

    :cond_1
    if-nez v14, :cond_2

    .line 2957
    iget-object v2, v5, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_7

    .line 2958
    :cond_2
    iget-object v2, v5, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    .line 2959
    invoke-static {v14, v2}, Lcom/google/android/gms/internal/drive/zzkm;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 2960
    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_1
    move-object/from16 v6, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-nez v3, :cond_b

    .line 2961
    invoke-static {v6, v15, v5}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v0

    .line 2962
    iget-wide v2, v5, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/drive/zzjo;->zzk(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_2
    move-object/from16 v6, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-nez v3, :cond_b

    .line 2963
    invoke-static {v6, v15, v5}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v0

    .line 2964
    iget v2, v5, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    invoke-static {v2}, Lcom/google/android/gms/internal/drive/zzjo;->zzw(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_3
    move-object/from16 v6, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-nez v3, :cond_b

    .line 2965
    invoke-static {v6, v15, v5}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v3

    .line 2966
    iget v5, v5, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    .line 2967
    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zzar(I)Lcom/google/android/gms/internal/drive/zzko;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 2968
    invoke-interface {v0, v5}, Lcom/google/android/gms/internal/drive/zzko;->zzan(I)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 2969
    :cond_3
    invoke-static {v1}, Lcom/google/android/gms/internal/drive/zzlu;->zzo(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzmy;

    move-result-object v0

    int-to-long v4, v5

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/drive/zzmy;->zzb(ILjava/lang/Object;)V

    return v3

    .line 2970
    :cond_4
    :goto_0
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v1, v9, v10, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move v0, v3

    goto/16 :goto_7

    :pswitch_4
    move-object/from16 v6, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-ne v3, v7, :cond_b

    .line 2971
    invoke-static {v6, v15, v5}, Lcom/google/android/gms/internal/drive/zziy;->zze([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v0

    .line 2972
    iget-object v2, v5, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_5
    move-object/from16 v6, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-ne v3, v7, :cond_b

    .line 2973
    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    move-result-object v0

    move/from16 v2, p4

    .line 2974
    invoke-static {v0, v6, v15, v2, v5}, Lcom/google/android/gms/internal/drive/zziy;->zza(Lcom/google/android/gms/internal/drive/zzmf;[BIILcom/google/android/gms/internal/drive/zziz;)I

    move-result v0

    .line 2975
    invoke-virtual {v11, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v2

    if-ne v2, v8, :cond_5

    .line 2976
    invoke-virtual {v11, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v14

    :cond_5
    if-nez v14, :cond_6

    .line 2977
    iget-object v2, v5, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    .line 2978
    :cond_6
    iget-object v2, v5, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    .line 2979
    invoke-static {v14, v2}, Lcom/google/android/gms/internal/drive/zzkm;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 2980
    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 2981
    :goto_1
    invoke-virtual {v11, v1, v12, v13, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v0

    :pswitch_6
    move-object/from16 v6, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-ne v3, v7, :cond_b

    .line 2982
    invoke-static {v6, v15, v5}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v0

    .line 2983
    iget v2, v5, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-nez v2, :cond_7

    .line 2984
    const-string v2, ""

    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_3

    :cond_7
    const/high16 v3, 0x20000000

    and-int v3, p8, v3

    if-eqz v3, :cond_9

    add-int v3, v0, v2

    .line 2985
    invoke-static {v6, v0, v3}, Lcom/google/android/gms/internal/drive/zznf;->zze([BII)Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_2

    .line 2986
    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdn()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object v0

    throw v0

    .line 2987
    :cond_9
    :goto_2
    new-instance v3, Ljava/lang/String;

    sget-object v4, Lcom/google/android/gms/internal/drive/zzkm;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v3, v6, v0, v2, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 2988
    invoke-virtual {v11, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/2addr v0, v2

    .line 2989
    :goto_3
    invoke-virtual {v11, v1, v12, v13, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v0

    :pswitch_7
    move-object/from16 v0, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-nez v3, :cond_b

    .line 2990
    invoke-static {v0, v15, v5}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v0

    .line 2991
    iget-wide v2, v5, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_a

    goto :goto_4

    :cond_a
    const/4 v6, 0x0

    :goto_4
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_8
    move-object/from16 v0, p2

    move/from16 v15, p3

    if-ne v3, v5, :cond_b

    .line 2992
    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/drive/zziy;->zza([BI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v1, v9, v10, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_5
    add-int/lit8 v0, v15, 0x4

    goto/16 :goto_7

    :pswitch_9
    move-object/from16 v0, p2

    move/from16 v15, p3

    if-ne v3, v6, :cond_b

    .line 2993
    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BI)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v11, v1, v9, v10, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_6
    add-int/lit8 v0, v15, 0x8

    goto :goto_7

    :pswitch_a
    move-object/from16 v0, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-nez v3, :cond_b

    .line 2994
    invoke-static {v0, v15, v5}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v0

    .line 2995
    iget v2, v5, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_7

    :pswitch_b
    move-object/from16 v0, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-nez v3, :cond_b

    .line 2996
    invoke-static {v0, v15, v5}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v0

    .line 2997
    iget-wide v2, v5, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_7

    :pswitch_c
    move-object/from16 v0, p2

    move/from16 v15, p3

    if-ne v3, v5, :cond_b

    .line 2998
    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/drive/zziy;->zzd([BI)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v11, v1, v9, v10, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_5

    :pswitch_d
    move-object/from16 v0, p2

    move/from16 v15, p3

    if-ne v3, v6, :cond_b

    .line 2999
    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/drive/zziy;->zzc([BI)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v11, v1, v9, v10, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    .line 3000
    :goto_7
    invoke-virtual {v11, v1, v12, v13, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v0

    :cond_b
    :goto_8
    return v15

    :pswitch_data_0
    .packed-switch 0x33
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final zza(Ljava/lang/Object;[BIIIIIIJIJLcom/google/android/gms/internal/drive/zziz;)I
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;[BIIIIIIJIJ",
            "Lcom/google/android/gms/internal/drive/zziz;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move/from16 v1, p5

    move/from16 v2, p7

    move/from16 v7, p8

    move-wide/from16 v3, p12

    .line 2757
    sget-object v5, Lcom/google/android/gms/internal/drive/zzlu;->zzuc:Lsun/misc/Unsafe;

    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/drive/zzkp;

    .line 2758
    invoke-interface {v6}, Lcom/google/android/gms/internal/drive/zzkp;->zzbo()Z

    move-result v8

    const/4 v9, 0x1

    if-nez v8, :cond_1

    .line 2759
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    if-nez v8, :cond_0

    const/16 v8, 0xa

    goto :goto_0

    :cond_0
    shl-int/2addr v8, v9

    .line 2760
    :goto_0
    invoke-interface {v6, v8}, Lcom/google/android/gms/internal/drive/zzkp;->zzr(I)Lcom/google/android/gms/internal/drive/zzkp;

    move-result-object v6

    .line 2761
    invoke-virtual {v5, p1, v3, v4, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1
    move-object v5, v6

    const/4 v3, 0x5

    const-wide/16 v10, 0x0

    const/4 v4, 0x2

    packed-switch p11, :pswitch_data_0

    :cond_2
    move/from16 p0, p3

    goto/16 :goto_1c

    :pswitch_0
    const/4 v0, 0x3

    if-ne v2, v0, :cond_2

    .line 2762
    invoke-direct {p0, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    move-result-object p0

    and-int/lit8 v0, v1, -0x8

    or-int/lit8 v0, v0, 0x4

    move-object/from16 p6, p0

    move-object/from16 p7, p2

    move/from16 p8, p3

    move/from16 p9, p4

    move-object/from16 p11, p14

    move/from16 p10, v0

    .line 2763
    invoke-static/range {p6 .. p11}, Lcom/google/android/gms/internal/drive/zziy;->zza(Lcom/google/android/gms/internal/drive/zzmf;[BIIILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    move-object/from16 v0, p6

    move-object/from16 v2, p7

    move/from16 v4, p9

    move/from16 v3, p10

    move-object/from16 v6, p11

    .line 2764
    iget-object v7, v6, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    if-ge p0, v4, :cond_3

    .line 2765
    invoke-static {v2, p0, v6}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v7

    .line 2766
    iget v8, v6, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-ne v1, v8, :cond_3

    move-object/from16 p6, v0

    move-object/from16 p7, v2

    move/from16 p10, v3

    move/from16 p9, v4

    move-object/from16 p11, v6

    move/from16 p8, v7

    .line 2767
    invoke-static/range {p6 .. p11}, Lcom/google/android/gms/internal/drive/zziy;->zza(Lcom/google/android/gms/internal/drive/zzmf;[BIIILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    move-object/from16 v3, p7

    move/from16 v6, p9

    move/from16 v2, p10

    move-object/from16 v8, p11

    .line 2768
    iget-object v4, v8, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v4, v3

    move v3, v2

    move-object v2, v4

    move v4, v6

    move-object v6, v8

    goto :goto_1

    :cond_3
    return p0

    :pswitch_1
    move-object/from16 v3, p2

    move/from16 v9, p3

    move/from16 v6, p4

    move-object/from16 v8, p14

    if-ne v2, v4, :cond_6

    .line 2769
    check-cast v5, Lcom/google/android/gms/internal/drive/zzle;

    .line 2770
    invoke-static {v3, v9, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2771
    iget v0, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    add-int/2addr v0, p0

    :goto_2
    if-ge p0, v0, :cond_4

    .line 2772
    invoke-static {v3, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2773
    iget-wide v1, v8, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/drive/zzjo;->zzk(J)J

    move-result-wide v1

    invoke-virtual {v5, v1, v2}, Lcom/google/android/gms/internal/drive/zzle;->zzv(J)V

    goto :goto_2

    :cond_4
    if-ne p0, v0, :cond_5

    return p0

    .line 2774
    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdi()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0

    :cond_6
    if-nez v2, :cond_8

    .line 2775
    check-cast v5, Lcom/google/android/gms/internal/drive/zzle;

    .line 2776
    invoke-static {v3, v9, v8}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2777
    iget-wide v9, v8, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/drive/zzjo;->zzk(J)J

    move-result-wide v9

    invoke-virtual {v5, v9, v10}, Lcom/google/android/gms/internal/drive/zzle;->zzv(J)V

    :goto_3
    if-ge p0, v6, :cond_7

    .line 2778
    invoke-static {v3, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v0

    .line 2779
    iget v2, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-ne v1, v2, :cond_7

    .line 2780
    invoke-static {v3, v0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2781
    iget-wide v9, v8, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/drive/zzjo;->zzk(J)J

    move-result-wide v9

    invoke-virtual {v5, v9, v10}, Lcom/google/android/gms/internal/drive/zzle;->zzv(J)V

    goto :goto_3

    :cond_7
    return p0

    :cond_8
    move p0, v9

    goto/16 :goto_1c

    :pswitch_2
    move-object/from16 v3, p2

    move/from16 v9, p3

    move/from16 v6, p4

    move-object/from16 v8, p14

    if-ne v2, v4, :cond_b

    .line 2782
    check-cast v5, Lcom/google/android/gms/internal/drive/zzkl;

    .line 2783
    invoke-static {v3, v9, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2784
    iget v0, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    add-int/2addr v0, p0

    :goto_4
    if-ge p0, v0, :cond_9

    .line 2785
    invoke-static {v3, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2786
    iget v1, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    invoke-static {v1}, Lcom/google/android/gms/internal/drive/zzjo;->zzw(I)I

    move-result v1

    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/drive/zzkl;->zzam(I)V

    goto :goto_4

    :cond_9
    if-ne p0, v0, :cond_a

    return p0

    .line 2787
    :cond_a
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdi()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0

    :cond_b
    if-nez v2, :cond_8

    .line 2788
    check-cast v5, Lcom/google/android/gms/internal/drive/zzkl;

    .line 2789
    invoke-static {v3, v9, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2790
    iget v0, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    invoke-static {v0}, Lcom/google/android/gms/internal/drive/zzjo;->zzw(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/drive/zzkl;->zzam(I)V

    :goto_5
    if-ge p0, v6, :cond_c

    .line 2791
    invoke-static {v3, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v0

    .line 2792
    iget v2, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-ne v1, v2, :cond_c

    .line 2793
    invoke-static {v3, v0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2794
    iget v0, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    invoke-static {v0}, Lcom/google/android/gms/internal/drive/zzjo;->zzw(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/drive/zzkl;->zzam(I)V

    goto :goto_5

    :cond_c
    return p0

    :pswitch_3
    move-object/from16 v3, p2

    move/from16 v9, p3

    move/from16 v6, p4

    move-object/from16 v8, p14

    if-ne v2, v4, :cond_d

    .line 2795
    invoke-static {v3, v9, v5, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zzkp;Lcom/google/android/gms/internal/drive/zziz;)I

    move-result v1

    goto :goto_6

    :cond_d
    if-nez v2, :cond_8

    move-object v2, v3

    move v4, v6

    move-object v6, v8

    move v3, v9

    .line 2796
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/drive/zziy;->zza(I[BIILcom/google/android/gms/internal/drive/zzkp;Lcom/google/android/gms/internal/drive/zziz;)I

    move-result v1

    .line 2797
    :goto_6
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/drive/zzkk;

    iget-object v2, v0, Lcom/google/android/gms/internal/drive/zzkk;->zzrq:Lcom/google/android/gms/internal/drive/zzmy;

    .line 2798
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzmy;->zzfa()Lcom/google/android/gms/internal/drive/zzmy;

    move-result-object v3

    if-ne v2, v3, :cond_e

    const/4 v2, 0x0

    .line 2799
    :cond_e
    invoke-direct {p0, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zzar(I)Lcom/google/android/gms/internal/drive/zzko;

    move-result-object v3

    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzur:Lcom/google/android/gms/internal/drive/zzmx;

    move/from16 v4, p6

    .line 2800
    invoke-static {v4, v5, v3, v2, p0}, Lcom/google/android/gms/internal/drive/zzmh;->zza(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzko;Ljava/lang/Object;Lcom/google/android/gms/internal/drive/zzmx;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/drive/zzmy;

    if-eqz p0, :cond_f

    .line 2801
    iput-object p0, v0, Lcom/google/android/gms/internal/drive/zzkk;->zzrq:Lcom/google/android/gms/internal/drive/zzmy;

    :cond_f
    return v1

    :pswitch_4
    move-object/from16 v0, p2

    move/from16 v3, p3

    move/from16 v6, p4

    move-object/from16 v8, p14

    if-ne v2, v4, :cond_17

    .line 2802
    invoke-static {v0, v3, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2803
    iget v2, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-ltz v2, :cond_16

    .line 2804
    array-length v3, v0

    sub-int/2addr v3, p0

    if-gt v2, v3, :cond_15

    if-nez v2, :cond_10

    .line 2805
    sget-object v2, Lcom/google/android/gms/internal/drive/zzjc;->zznq:Lcom/google/android/gms/internal/drive/zzjc;

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 2806
    :cond_10
    invoke-static {v0, p0, v2}, Lcom/google/android/gms/internal/drive/zzjc;->zzb([BII)Lcom/google/android/gms/internal/drive/zzjc;

    move-result-object v3

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_7
    add-int/2addr p0, v2

    :goto_8
    if-ge p0, v6, :cond_14

    .line 2807
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    .line 2808
    iget v3, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-ne v1, v3, :cond_14

    .line 2809
    invoke-static {v0, v2, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2810
    iget v2, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-ltz v2, :cond_13

    .line 2811
    array-length v3, v0

    sub-int/2addr v3, p0

    if-gt v2, v3, :cond_12

    if-nez v2, :cond_11

    .line 2812
    sget-object v2, Lcom/google/android/gms/internal/drive/zzjc;->zznq:Lcom/google/android/gms/internal/drive/zzjc;

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 2813
    :cond_11
    invoke-static {v0, p0, v2}, Lcom/google/android/gms/internal/drive/zzjc;->zzb([BII)Lcom/google/android/gms/internal/drive/zzjc;

    move-result-object v3

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 2814
    :cond_12
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdi()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0

    .line 2815
    :cond_13
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdj()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0

    :cond_14
    return p0

    .line 2816
    :cond_15
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdi()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0

    .line 2817
    :cond_16
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdj()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0

    :cond_17
    move p0, v3

    goto/16 :goto_1c

    :pswitch_5
    move-object/from16 v0, p2

    move/from16 v3, p3

    move/from16 v6, p4

    move-object/from16 v8, p14

    if-ne v2, v4, :cond_17

    .line 2818
    invoke-direct {p0, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    move-result-object p0

    move-object/from16 p6, p0

    move-object/from16 p8, v0

    move/from16 p7, v1

    move/from16 p9, v3

    move-object/from16 p11, v5

    move/from16 p10, v6

    move-object/from16 p12, v8

    .line 2819
    invoke-static/range {p6 .. p12}, Lcom/google/android/gms/internal/drive/zziy;->zza(Lcom/google/android/gms/internal/drive/zzmf;I[BIILcom/google/android/gms/internal/drive/zzkp;Lcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    return p0

    :pswitch_6
    move-object/from16 v0, p2

    move/from16 p0, p3

    move/from16 v6, p4

    move-object/from16 v8, p14

    if-ne v2, v4, :cond_40

    const-wide/32 v2, 0x20000000

    and-long v2, p9, v2

    cmp-long v2, v2, v10

    .line 2820
    const-string v3, ""

    if-nez v2, :cond_1d

    .line 2821
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2822
    iget v2, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-ltz v2, :cond_1c

    if-nez v2, :cond_18

    .line 2823
    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 2824
    :cond_18
    new-instance v4, Ljava/lang/String;

    sget-object v7, Lcom/google/android/gms/internal/drive/zzkm;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v4, v0, p0, v2, v7}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 2825
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_9
    add-int/2addr p0, v2

    :goto_a
    if-ge p0, v6, :cond_1b

    .line 2826
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    .line 2827
    iget v4, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-ne v1, v4, :cond_1b

    .line 2828
    invoke-static {v0, v2, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2829
    iget v2, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-ltz v2, :cond_1a

    if-nez v2, :cond_19

    .line 2830
    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 2831
    :cond_19
    new-instance v4, Ljava/lang/String;

    sget-object v7, Lcom/google/android/gms/internal/drive/zzkm;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v4, v0, p0, v2, v7}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 2832
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 2833
    :cond_1a
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdj()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0

    :cond_1b
    return p0

    .line 2834
    :cond_1c
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdj()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0

    .line 2835
    :cond_1d
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2836
    iget v2, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-ltz v2, :cond_24

    if-nez v2, :cond_1e

    .line 2837
    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_1e
    add-int v4, p0, v2

    .line 2838
    invoke-static {v0, p0, v4}, Lcom/google/android/gms/internal/drive/zznf;->zze([BII)Z

    move-result v7

    if-eqz v7, :cond_23

    .line 2839
    new-instance v7, Ljava/lang/String;

    sget-object v9, Lcom/google/android/gms/internal/drive/zzkm;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v7, v0, p0, v2, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 2840
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_b
    move p0, v4

    :goto_c
    if-ge p0, v6, :cond_22

    .line 2841
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    .line 2842
    iget v4, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-ne v1, v4, :cond_22

    .line 2843
    invoke-static {v0, v2, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2844
    iget v2, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-ltz v2, :cond_21

    if-nez v2, :cond_1f

    .line 2845
    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_1f
    add-int v4, p0, v2

    .line 2846
    invoke-static {v0, p0, v4}, Lcom/google/android/gms/internal/drive/zznf;->zze([BII)Z

    move-result v7

    if-eqz v7, :cond_20

    .line 2847
    new-instance v7, Ljava/lang/String;

    sget-object v9, Lcom/google/android/gms/internal/drive/zzkm;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v7, v0, p0, v2, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 2848
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_b

    .line 2849
    :cond_20
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdn()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0

    .line 2850
    :cond_21
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdj()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0

    :cond_22
    return p0

    .line 2851
    :cond_23
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdn()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0

    .line 2852
    :cond_24
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdj()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0

    :pswitch_7
    move-object/from16 v0, p2

    move/from16 p0, p3

    move/from16 v6, p4

    move-object/from16 v8, p14

    const/4 v3, 0x0

    if-ne v2, v4, :cond_28

    .line 2853
    check-cast v5, Lcom/google/android/gms/internal/drive/zzja;

    .line 2854
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2855
    iget v1, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    add-int/2addr v1, p0

    :goto_d
    if-ge p0, v1, :cond_26

    .line 2856
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2857
    iget-wide v6, v8, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    cmp-long v2, v6, v10

    if-eqz v2, :cond_25

    move v2, v9

    goto :goto_e

    :cond_25
    move v2, v3

    :goto_e
    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/drive/zzja;->addBoolean(Z)V

    goto :goto_d

    :cond_26
    if-ne p0, v1, :cond_27

    return p0

    .line 2858
    :cond_27
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdi()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0

    :cond_28
    if-nez v2, :cond_40

    .line 2859
    check-cast v5, Lcom/google/android/gms/internal/drive/zzja;

    .line 2860
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2861
    iget-wide v12, v8, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    cmp-long v2, v12, v10

    if-eqz v2, :cond_29

    move v2, v9

    goto :goto_f

    :cond_29
    move v2, v3

    :goto_f
    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/drive/zzja;->addBoolean(Z)V

    :goto_10
    if-ge p0, v6, :cond_2b

    .line 2862
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    .line 2863
    iget v4, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-ne v1, v4, :cond_2b

    .line 2864
    invoke-static {v0, v2, v8}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2865
    iget-wide v12, v8, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    cmp-long v2, v12, v10

    if-eqz v2, :cond_2a

    move v2, v9

    goto :goto_11

    :cond_2a
    move v2, v3

    :goto_11
    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/drive/zzja;->addBoolean(Z)V

    goto :goto_10

    :cond_2b
    return p0

    :pswitch_8
    move-object/from16 v0, p2

    move/from16 p0, p3

    move/from16 v6, p4

    move-object/from16 v8, p14

    if-ne v2, v4, :cond_2e

    .line 2866
    check-cast v5, Lcom/google/android/gms/internal/drive/zzkl;

    .line 2867
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2868
    iget v1, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    add-int/2addr v1, p0

    :goto_12
    if-ge p0, v1, :cond_2c

    .line 2869
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/drive/zziy;->zza([BI)I

    move-result v2

    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/drive/zzkl;->zzam(I)V

    add-int/lit8 p0, p0, 0x4

    goto :goto_12

    :cond_2c
    if-ne p0, v1, :cond_2d

    return p0

    .line 2870
    :cond_2d
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdi()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0

    :cond_2e
    if-ne v2, v3, :cond_40

    .line 2871
    check-cast v5, Lcom/google/android/gms/internal/drive/zzkl;

    .line 2872
    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/drive/zziy;->zza([BI)I

    move-result v2

    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/drive/zzkl;->zzam(I)V

    add-int/lit8 p0, p0, 0x4

    :goto_13
    if-ge p0, v6, :cond_2f

    .line 2873
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    .line 2874
    iget v3, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-ne v1, v3, :cond_2f

    .line 2875
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/drive/zziy;->zza([BI)I

    move-result p0

    invoke-virtual {v5, p0}, Lcom/google/android/gms/internal/drive/zzkl;->zzam(I)V

    add-int/lit8 p0, v2, 0x4

    goto :goto_13

    :cond_2f
    return p0

    :pswitch_9
    move-object/from16 v0, p2

    move/from16 p0, p3

    move/from16 v6, p4

    move-object/from16 v8, p14

    if-ne v2, v4, :cond_32

    .line 2876
    check-cast v5, Lcom/google/android/gms/internal/drive/zzle;

    .line 2877
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2878
    iget v1, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    add-int/2addr v1, p0

    :goto_14
    if-ge p0, v1, :cond_30

    .line 2879
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BI)J

    move-result-wide v2

    invoke-virtual {v5, v2, v3}, Lcom/google/android/gms/internal/drive/zzle;->zzv(J)V

    add-int/lit8 p0, p0, 0x8

    goto :goto_14

    :cond_30
    if-ne p0, v1, :cond_31

    return p0

    .line 2880
    :cond_31
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdi()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0

    :cond_32
    if-ne v2, v9, :cond_40

    .line 2881
    check-cast v5, Lcom/google/android/gms/internal/drive/zzle;

    .line 2882
    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BI)J

    move-result-wide v2

    invoke-virtual {v5, v2, v3}, Lcom/google/android/gms/internal/drive/zzle;->zzv(J)V

    add-int/lit8 p0, p0, 0x8

    :goto_15
    if-ge p0, v6, :cond_33

    .line 2883
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    .line 2884
    iget v3, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-ne v1, v3, :cond_33

    .line 2885
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BI)J

    move-result-wide v3

    invoke-virtual {v5, v3, v4}, Lcom/google/android/gms/internal/drive/zzle;->zzv(J)V

    add-int/lit8 p0, v2, 0x8

    goto :goto_15

    :cond_33
    return p0

    :pswitch_a
    move-object/from16 v0, p2

    move/from16 p0, p3

    move/from16 v6, p4

    move-object/from16 v8, p14

    if-ne v2, v4, :cond_34

    .line 2886
    invoke-static {v0, p0, v5, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zzkp;Lcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    return p0

    :cond_34
    if-nez v2, :cond_40

    move/from16 p8, p0

    move-object/from16 p7, v0

    move/from16 p6, v1

    move-object/from16 p10, v5

    move/from16 p9, v6

    move-object/from16 p11, v8

    .line 2887
    invoke-static/range {p6 .. p11}, Lcom/google/android/gms/internal/drive/zziy;->zza(I[BIILcom/google/android/gms/internal/drive/zzkp;Lcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    return p0

    :pswitch_b
    move-object/from16 v0, p2

    move/from16 p0, p3

    move/from16 v6, p4

    move-object/from16 v8, p14

    if-ne v2, v4, :cond_37

    .line 2888
    check-cast v5, Lcom/google/android/gms/internal/drive/zzle;

    .line 2889
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2890
    iget v1, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    add-int/2addr v1, p0

    :goto_16
    if-ge p0, v1, :cond_35

    .line 2891
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2892
    iget-wide v2, v8, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    invoke-virtual {v5, v2, v3}, Lcom/google/android/gms/internal/drive/zzle;->zzv(J)V

    goto :goto_16

    :cond_35
    if-ne p0, v1, :cond_36

    return p0

    .line 2893
    :cond_36
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdi()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0

    :cond_37
    if-nez v2, :cond_40

    .line 2894
    check-cast v5, Lcom/google/android/gms/internal/drive/zzle;

    .line 2895
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2896
    iget-wide v2, v8, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    invoke-virtual {v5, v2, v3}, Lcom/google/android/gms/internal/drive/zzle;->zzv(J)V

    :goto_17
    if-ge p0, v6, :cond_38

    .line 2897
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    .line 2898
    iget v3, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-ne v1, v3, :cond_38

    .line 2899
    invoke-static {v0, v2, v8}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2900
    iget-wide v2, v8, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    invoke-virtual {v5, v2, v3}, Lcom/google/android/gms/internal/drive/zzle;->zzv(J)V

    goto :goto_17

    :cond_38
    return p0

    :pswitch_c
    move-object/from16 v0, p2

    move/from16 p0, p3

    move/from16 v6, p4

    move-object/from16 v8, p14

    if-ne v2, v4, :cond_3b

    .line 2901
    check-cast v5, Lcom/google/android/gms/internal/drive/zzkh;

    .line 2902
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2903
    iget v1, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    add-int/2addr v1, p0

    :goto_18
    if-ge p0, v1, :cond_39

    .line 2904
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/drive/zziy;->zzd([BI)F

    move-result v2

    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/drive/zzkh;->zzc(F)V

    add-int/lit8 p0, p0, 0x4

    goto :goto_18

    :cond_39
    if-ne p0, v1, :cond_3a

    return p0

    .line 2905
    :cond_3a
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdi()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0

    :cond_3b
    if-ne v2, v3, :cond_40

    .line 2906
    check-cast v5, Lcom/google/android/gms/internal/drive/zzkh;

    .line 2907
    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/drive/zziy;->zzd([BI)F

    move-result v2

    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/drive/zzkh;->zzc(F)V

    add-int/lit8 p0, p0, 0x4

    :goto_19
    if-ge p0, v6, :cond_3c

    .line 2908
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    .line 2909
    iget v3, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-ne v1, v3, :cond_3c

    .line 2910
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/drive/zziy;->zzd([BI)F

    move-result p0

    invoke-virtual {v5, p0}, Lcom/google/android/gms/internal/drive/zzkh;->zzc(F)V

    add-int/lit8 p0, v2, 0x4

    goto :goto_19

    :cond_3c
    return p0

    :pswitch_d
    move-object/from16 v0, p2

    move/from16 p0, p3

    move/from16 v6, p4

    move-object/from16 v8, p14

    if-ne v2, v4, :cond_3f

    .line 2911
    check-cast v5, Lcom/google/android/gms/internal/drive/zzju;

    .line 2912
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2913
    iget v1, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    add-int/2addr v1, p0

    :goto_1a
    if-ge p0, v1, :cond_3d

    .line 2914
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/drive/zziy;->zzc([BI)D

    move-result-wide v2

    invoke-virtual {v5, v2, v3}, Lcom/google/android/gms/internal/drive/zzju;->zzc(D)V

    add-int/lit8 p0, p0, 0x8

    goto :goto_1a

    :cond_3d
    if-ne p0, v1, :cond_3e

    return p0

    .line 2915
    :cond_3e
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdi()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0

    :cond_3f
    if-ne v2, v9, :cond_40

    .line 2916
    check-cast v5, Lcom/google/android/gms/internal/drive/zzju;

    .line 2917
    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/drive/zziy;->zzc([BI)D

    move-result-wide v2

    invoke-virtual {v5, v2, v3}, Lcom/google/android/gms/internal/drive/zzju;->zzc(D)V

    add-int/lit8 p0, p0, 0x8

    :goto_1b
    if-ge p0, v6, :cond_40

    .line 2918
    invoke-static {v0, p0, v8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    .line 2919
    iget v3, v8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-ne v1, v3, :cond_40

    .line 2920
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/drive/zziy;->zzc([BI)D

    move-result-wide v3

    invoke-virtual {v5, v3, v4}, Lcom/google/android/gms/internal/drive/zzju;->zzc(D)V

    add-int/lit8 p0, v2, 0x8

    goto :goto_1b

    :cond_40
    :goto_1c
    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final zza(Ljava/lang/Object;[BIIIJLcom/google/android/gms/internal/drive/zziz;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(TT;[BIIIJ",
            "Lcom/google/android/gms/internal/drive/zziz;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2921
    sget-object v0, Lcom/google/android/gms/internal/drive/zzlu;->zzuc:Lsun/misc/Unsafe;

    .line 2922
    invoke-direct {p0, p5}, Lcom/google/android/gms/internal/drive/zzlu;->zzaq(I)Ljava/lang/Object;

    move-result-object p5

    .line 2923
    invoke-virtual {v0, p1, p6, p7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    .line 2924
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzut:Lcom/google/android/gms/internal/drive/zzll;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/drive/zzll;->zzj(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2925
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzut:Lcom/google/android/gms/internal/drive/zzll;

    invoke-interface {v2, p5}, Lcom/google/android/gms/internal/drive/zzll;->zzl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 2926
    iget-object v3, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzut:Lcom/google/android/gms/internal/drive/zzll;

    invoke-interface {v3, v2, v1}, Lcom/google/android/gms/internal/drive/zzll;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2927
    invoke-virtual {v0, p1, p6, p7, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object v1, v2

    .line 2928
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzut:Lcom/google/android/gms/internal/drive/zzll;

    .line 2929
    invoke-interface {p1, p5}, Lcom/google/android/gms/internal/drive/zzll;->zzm(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzlj;

    move-result-object p1

    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzut:Lcom/google/android/gms/internal/drive/zzll;

    .line 2930
    invoke-interface {p0, v1}, Lcom/google/android/gms/internal/drive/zzll;->zzh(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    .line 2931
    invoke-static {p2, p3, p8}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p3

    .line 2932
    iget p5, p8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    if-ltz p5, :cond_8

    sub-int p6, p4, p3

    if-gt p5, p6, :cond_8

    add-int/2addr p5, p3

    .line 2933
    iget-object p6, p1, Lcom/google/android/gms/internal/drive/zzlj;->zztv:Ljava/lang/Object;

    .line 2934
    iget-object p7, p1, Lcom/google/android/gms/internal/drive/zzlj;->zztx:Ljava/lang/Object;

    :goto_0
    if-ge p3, p5, :cond_6

    add-int/lit8 v0, p3, 0x1

    .line 2935
    aget-byte p3, p2, p3

    if-gez p3, :cond_1

    .line 2936
    invoke-static {p3, p2, v0, p8}, Lcom/google/android/gms/internal/drive/zziy;->zza(I[BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v0

    .line 2937
    iget p3, p8, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    :cond_1
    move v1, v0

    ushr-int/lit8 v0, p3, 0x3

    and-int/lit8 v2, p3, 0x7

    const/4 v3, 0x1

    if-eq v0, v3, :cond_4

    const/4 v3, 0x2

    if-eq v0, v3, :cond_3

    :cond_2
    move-object v0, p2

    move v2, p4

    move-object v5, p8

    goto :goto_2

    .line 2938
    :cond_3
    iget-object v0, p1, Lcom/google/android/gms/internal/drive/zzlj;->zztw:Lcom/google/android/gms/internal/drive/zznm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/drive/zznm;->zzfk()I

    move-result v0

    if-ne v2, v0, :cond_2

    .line 2939
    iget-object v3, p1, Lcom/google/android/gms/internal/drive/zzlj;->zztw:Lcom/google/android/gms/internal/drive/zznm;

    iget-object p3, p1, Lcom/google/android/gms/internal/drive/zzlj;->zztx:Ljava/lang/Object;

    .line 2940
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    move-object v0, p2

    move v2, p4

    move-object v5, p8

    .line 2941
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/drive/zzlu;->zza([BIILcom/google/android/gms/internal/drive/zznm;Ljava/lang/Class;Lcom/google/android/gms/internal/drive/zziz;)I

    move-result p3

    move p2, v2

    .line 2942
    iget-object p7, v5, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    move p4, p2

    move-object p2, v0

    goto :goto_0

    :cond_4
    move-object v0, p2

    move p2, p4

    move-object v5, p8

    .line 2943
    iget-object p4, p1, Lcom/google/android/gms/internal/drive/zzlj;->zztu:Lcom/google/android/gms/internal/drive/zznm;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/drive/zznm;->zzfk()I

    move-result p4

    if-ne v2, p4, :cond_5

    .line 2944
    iget-object v3, p1, Lcom/google/android/gms/internal/drive/zzlj;->zztu:Lcom/google/android/gms/internal/drive/zznm;

    const/4 v4, 0x0

    move v2, p2

    .line 2945
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/drive/zzlu;->zza([BIILcom/google/android/gms/internal/drive/zznm;Ljava/lang/Class;Lcom/google/android/gms/internal/drive/zziz;)I

    move-result p3

    .line 2946
    iget-object p6, v5, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    :goto_1
    move-object p2, v0

    move p4, v2

    move-object p8, v5

    goto :goto_0

    :cond_5
    move v2, p2

    .line 2947
    :goto_2
    invoke-static {p3, v0, v1, v2, v5}, Lcom/google/android/gms/internal/drive/zziy;->zza(I[BIILcom/google/android/gms/internal/drive/zziz;)I

    move-result p3

    goto :goto_1

    :cond_6
    if-ne p3, p5, :cond_7

    .line 2948
    invoke-interface {p0, p6, p7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return p5

    .line 2949
    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdm()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0

    .line 2950
    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdi()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object p0

    throw p0
.end method

.method private static zza([BIILcom/google/android/gms/internal/drive/zznm;Ljava/lang/Class;Lcom/google/android/gms/internal/drive/zziz;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII",
            "Lcom/google/android/gms/internal/drive/zznm;",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/google/android/gms/internal/drive/zziz;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2737
    sget-object v0, Lcom/google/android/gms/internal/drive/zzlv;->zzox:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v0, p3

    const/4 v0, 0x0

    packed-switch p3, :pswitch_data_0

    .line 2738
    const-string p0, "unsupported field type."

    invoke-static {p0}, Lf42;->s(Ljava/lang/String;)V

    return v0

    .line 2739
    :pswitch_0
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/drive/zziy;->zzd([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    return p0

    .line 2740
    :pswitch_1
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2741
    iget-wide p1, p5, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/drive/zzjo;->zzk(J)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p5, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    return p0

    .line 2742
    :pswitch_2
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2743
    iget p1, p5, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    invoke-static {p1}, Lcom/google/android/gms/internal/drive/zzjo;->zzw(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p5, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    return p0

    .line 2744
    :pswitch_3
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzmd;->zzej()Lcom/google/android/gms/internal/drive/zzmd;

    move-result-object p3

    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/drive/zzmd;->zzf(Ljava/lang/Class;)Lcom/google/android/gms/internal/drive/zzmf;

    move-result-object p3

    .line 2745
    invoke-static {p3, p0, p1, p2, p5}, Lcom/google/android/gms/internal/drive/zziy;->zza(Lcom/google/android/gms/internal/drive/zzmf;[BIILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    return p0

    .line 2746
    :pswitch_4
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2747
    iget-wide p1, p5, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p5, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    return p0

    .line 2748
    :pswitch_5
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2749
    iget p1, p5, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p5, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    return p0

    .line 2750
    :pswitch_6
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/drive/zziy;->zzd([BI)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    iput-object p0, p5, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x4

    return p1

    .line 2751
    :pswitch_7
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BI)J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    iput-object p0, p5, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x8

    return p1

    .line 2752
    :pswitch_8
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/drive/zziy;->zza([BI)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    iput-object p0, p5, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x4

    return p1

    .line 2753
    :pswitch_9
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/drive/zziy;->zzc([BI)D

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    iput-object p0, p5, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x8

    return p1

    .line 2754
    :pswitch_a
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/drive/zziy;->zze([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    return p0

    .line 2755
    :pswitch_b
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result p0

    .line 2756
    iget-wide p1, p5, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p5, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static zza(Ljava/lang/Class;Lcom/google/android/gms/internal/drive/zzlo;Lcom/google/android/gms/internal/drive/zzly;Lcom/google/android/gms/internal/drive/zzla;Lcom/google/android/gms/internal/drive/zzmx;Lcom/google/android/gms/internal/drive/zzjy;Lcom/google/android/gms/internal/drive/zzll;)Lcom/google/android/gms/internal/drive/zzlu;
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/google/android/gms/internal/drive/zzlo;",
            "Lcom/google/android/gms/internal/drive/zzly;",
            "Lcom/google/android/gms/internal/drive/zzla;",
            "Lcom/google/android/gms/internal/drive/zzmx<",
            "**>;",
            "Lcom/google/android/gms/internal/drive/zzjy<",
            "*>;",
            "Lcom/google/android/gms/internal/drive/zzll;",
            ")",
            "Lcom/google/android/gms/internal/drive/zzlu<",
            "TT;>;"
        }
    .end annotation

    move-object/from16 v0, p1

    .line 2652
    instance-of v1, v0, Lcom/google/android/gms/internal/drive/zzme;

    if-eqz v1, :cond_35

    .line 2653
    check-cast v0, Lcom/google/android/gms/internal/drive/zzme;

    .line 2654
    invoke-virtual {v0}, Lcom/google/android/gms/internal/drive/zzme;->zzec()I

    move-result v1

    sget v2, Lcom/google/android/gms/internal/drive/zzkk$zze;->zzsg:I

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    const/4 v11, 0x1

    goto :goto_0

    :cond_0
    move v11, v3

    .line 2655
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/drive/zzme;->zzek()Ljava/lang/String;

    move-result-object v1

    .line 2656
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    .line 2657
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const v7, 0xd800

    if-lt v5, v7, :cond_2

    and-int/lit16 v5, v5, 0x1fff

    const/4 v8, 0x1

    const/16 v9, 0xd

    :goto_1
    add-int/lit8 v10, v8, 0x1

    .line 2658
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v7, :cond_1

    and-int/lit16 v8, v8, 0x1fff

    shl-int/2addr v8, v9

    or-int/2addr v5, v8

    add-int/lit8 v9, v9, 0xd

    move v8, v10

    goto :goto_1

    :cond_1
    shl-int/2addr v8, v9

    or-int/2addr v5, v8

    goto :goto_2

    :cond_2
    const/4 v10, 0x1

    :goto_2
    add-int/lit8 v8, v10, 0x1

    .line 2659
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v7, :cond_4

    and-int/lit16 v9, v9, 0x1fff

    const/16 v10, 0xd

    :goto_3
    add-int/lit8 v12, v8, 0x1

    .line 2660
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v7, :cond_3

    and-int/lit16 v8, v8, 0x1fff

    shl-int/2addr v8, v10

    or-int/2addr v9, v8

    add-int/lit8 v10, v10, 0xd

    move v8, v12

    goto :goto_3

    :cond_3
    shl-int/2addr v8, v10

    or-int/2addr v9, v8

    move v8, v12

    :cond_4
    if-nez v9, :cond_5

    .line 2661
    sget-object v9, Lcom/google/android/gms/internal/drive/zzlu;->zzub:[I

    move v6, v3

    move v10, v6

    move v12, v10

    move v14, v12

    move v15, v14

    move-object v13, v9

    move v9, v15

    :goto_4
    const/16 v16, 0x1

    goto/16 :goto_e

    :cond_5
    add-int/lit8 v9, v8, 0x1

    .line 2662
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v7, :cond_7

    and-int/lit16 v8, v8, 0x1fff

    const/16 v10, 0xd

    :goto_5
    add-int/lit8 v12, v9, 0x1

    .line 2663
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v7, :cond_6

    and-int/lit16 v9, v9, 0x1fff

    shl-int/2addr v9, v10

    or-int/2addr v8, v9

    add-int/lit8 v10, v10, 0xd

    move v9, v12

    goto :goto_5

    :cond_6
    shl-int/2addr v9, v10

    or-int/2addr v8, v9

    move v9, v12

    :cond_7
    add-int/lit8 v10, v9, 0x1

    .line 2664
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v7, :cond_9

    and-int/lit16 v9, v9, 0x1fff

    const/16 v12, 0xd

    :goto_6
    add-int/lit8 v13, v10, 0x1

    .line 2665
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-lt v10, v7, :cond_8

    and-int/lit16 v10, v10, 0x1fff

    shl-int/2addr v10, v12

    or-int/2addr v9, v10

    add-int/lit8 v12, v12, 0xd

    move v10, v13

    goto :goto_6

    :cond_8
    shl-int/2addr v10, v12

    or-int/2addr v9, v10

    move v10, v13

    :cond_9
    add-int/lit8 v12, v10, 0x1

    .line 2666
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-lt v10, v7, :cond_b

    and-int/lit16 v10, v10, 0x1fff

    const/16 v13, 0xd

    :goto_7
    add-int/lit8 v14, v12, 0x1

    .line 2667
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v7, :cond_a

    and-int/lit16 v12, v12, 0x1fff

    shl-int/2addr v12, v13

    or-int/2addr v10, v12

    add-int/lit8 v13, v13, 0xd

    move v12, v14

    goto :goto_7

    :cond_a
    shl-int/2addr v12, v13

    or-int/2addr v10, v12

    move v12, v14

    :cond_b
    add-int/lit8 v13, v12, 0x1

    .line 2668
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v7, :cond_d

    and-int/lit16 v12, v12, 0x1fff

    const/16 v14, 0xd

    :goto_8
    add-int/lit8 v15, v13, 0x1

    .line 2669
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v7, :cond_c

    and-int/lit16 v13, v13, 0x1fff

    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    add-int/lit8 v14, v14, 0xd

    move v13, v15

    goto :goto_8

    :cond_c
    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    move v13, v15

    :cond_d
    add-int/lit8 v14, v13, 0x1

    .line 2670
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v7, :cond_f

    and-int/lit16 v13, v13, 0x1fff

    const/16 v15, 0xd

    :goto_9
    add-int/lit8 v16, v14, 0x1

    .line 2671
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v7, :cond_e

    and-int/lit16 v14, v14, 0x1fff

    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    add-int/lit8 v15, v15, 0xd

    move/from16 v14, v16

    goto :goto_9

    :cond_e
    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    move/from16 v14, v16

    :cond_f
    add-int/lit8 v15, v14, 0x1

    .line 2672
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v7, :cond_11

    and-int/lit16 v14, v14, 0x1fff

    const/16 v16, 0xd

    :goto_a
    add-int/lit8 v17, v15, 0x1

    .line 2673
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v7, :cond_10

    and-int/lit16 v15, v15, 0x1fff

    shl-int v15, v15, v16

    or-int/2addr v14, v15

    add-int/lit8 v16, v16, 0xd

    move/from16 v15, v17

    goto :goto_a

    :cond_10
    shl-int v15, v15, v16

    or-int/2addr v14, v15

    move/from16 v15, v17

    :cond_11
    add-int/lit8 v16, v15, 0x1

    .line 2674
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v7, :cond_13

    and-int/lit16 v15, v15, 0x1fff

    move/from16 v3, v16

    const/16 v16, 0xd

    :goto_b
    add-int/lit8 v17, v3, 0x1

    .line 2675
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lt v3, v7, :cond_12

    and-int/lit16 v3, v3, 0x1fff

    shl-int v3, v3, v16

    or-int/2addr v15, v3

    add-int/lit8 v16, v16, 0xd

    move/from16 v3, v17

    goto :goto_b

    :cond_12
    shl-int v3, v3, v16

    or-int/2addr v15, v3

    move/from16 v3, v17

    goto :goto_c

    :cond_13
    move/from16 v3, v16

    :goto_c
    add-int/lit8 v16, v3, 0x1

    .line 2676
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lt v3, v7, :cond_15

    and-int/lit16 v3, v3, 0x1fff

    move/from16 v6, v16

    const/16 v16, 0xd

    :goto_d
    add-int/lit8 v17, v6, 0x1

    .line 2677
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v7, :cond_14

    and-int/lit16 v6, v6, 0x1fff

    shl-int v6, v6, v16

    or-int/2addr v3, v6

    add-int/lit8 v16, v16, 0xd

    move/from16 v6, v17

    goto :goto_d

    :cond_14
    shl-int v6, v6, v16

    or-int/2addr v3, v6

    move/from16 v16, v17

    :cond_15
    add-int v6, v3, v14

    add-int/2addr v6, v15

    .line 2678
    new-array v6, v6, [I

    shl-int/lit8 v15, v8, 0x1

    add-int/2addr v15, v9

    move v9, v13

    move-object v13, v6

    move v6, v9

    move v9, v12

    move v12, v14

    move v14, v3

    move v3, v8

    move/from16 v8, v16

    goto/16 :goto_4

    .line 2679
    :goto_e
    sget-object v4, Lcom/google/android/gms/internal/drive/zzlu;->zzuc:Lsun/misc/Unsafe;

    .line 2680
    invoke-virtual {v0}, Lcom/google/android/gms/internal/drive/zzme;->zzel()[Ljava/lang/Object;

    move-result-object v17

    .line 2681
    invoke-virtual {v0}, Lcom/google/android/gms/internal/drive/zzme;->zzee()Lcom/google/android/gms/internal/drive/zzlq;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    move-object/from16 v18, v0

    mul-int/lit8 v0, v6, 0x3

    .line 2682
    new-array v0, v0, [I

    shl-int/lit8 v6, v6, 0x1

    .line 2683
    new-array v6, v6, [Ljava/lang/Object;

    add-int/2addr v12, v14

    move/from16 v23, v12

    move/from16 v22, v14

    const/16 v20, 0x0

    const/16 v21, 0x0

    :goto_f
    if-ge v8, v2, :cond_34

    add-int/lit8 v24, v8, 0x1

    .line 2684
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    move-object/from16 v25, v0

    const v0, 0xd800

    if-lt v8, v0, :cond_17

    and-int/lit16 v8, v8, 0x1fff

    move/from16 v0, v24

    const/16 v24, 0xd

    :goto_10
    add-int/lit8 v26, v0, 0x1

    .line 2685
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    move/from16 v27, v2

    const v2, 0xd800

    if-lt v0, v2, :cond_16

    and-int/lit16 v0, v0, 0x1fff

    shl-int v0, v0, v24

    or-int/2addr v8, v0

    add-int/lit8 v24, v24, 0xd

    move/from16 v0, v26

    move/from16 v2, v27

    goto :goto_10

    :cond_16
    shl-int v0, v0, v24

    or-int/2addr v8, v0

    move/from16 v0, v26

    goto :goto_11

    :cond_17
    move/from16 v27, v2

    move/from16 v0, v24

    :goto_11
    add-int/lit8 v2, v0, 0x1

    .line 2686
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    move/from16 v24, v2

    const v2, 0xd800

    if-lt v0, v2, :cond_19

    and-int/lit16 v0, v0, 0x1fff

    move/from16 v2, v24

    const/16 v24, 0xd

    :goto_12
    add-int/lit8 v26, v2, 0x1

    .line 2687
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    move/from16 v28, v0

    const v0, 0xd800

    if-lt v2, v0, :cond_18

    and-int/lit16 v0, v2, 0x1fff

    shl-int v0, v0, v24

    or-int v0, v28, v0

    add-int/lit8 v24, v24, 0xd

    move/from16 v2, v26

    goto :goto_12

    :cond_18
    shl-int v0, v2, v24

    or-int v0, v28, v0

    move/from16 v2, v26

    goto :goto_13

    :cond_19
    move/from16 v2, v24

    :goto_13
    move/from16 v24, v3

    and-int/lit16 v3, v0, 0xff

    move/from16 v26, v5

    and-int/lit16 v5, v0, 0x400

    if-eqz v5, :cond_1a

    add-int/lit8 v5, v20, 0x1

    .line 2688
    aput v21, v13, v20

    move/from16 v20, v5

    :cond_1a
    const/16 v5, 0x33

    move-object/from16 v30, v6

    if-lt v3, v5, :cond_22

    add-int/lit8 v5, v2, 0x1

    .line 2689
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const v6, 0xd800

    if-lt v2, v6, :cond_1c

    and-int/lit16 v2, v2, 0x1fff

    const/16 v31, 0xd

    :goto_14
    add-int/lit8 v32, v5, 0x1

    .line 2690
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v6, :cond_1b

    and-int/lit16 v5, v5, 0x1fff

    shl-int v5, v5, v31

    or-int/2addr v2, v5

    add-int/lit8 v31, v31, 0xd

    move/from16 v5, v32

    const v6, 0xd800

    goto :goto_14

    :cond_1b
    shl-int v5, v5, v31

    or-int/2addr v2, v5

    move/from16 v5, v32

    :cond_1c
    add-int/lit8 v6, v3, -0x33

    move/from16 v31, v2

    const/16 v2, 0x9

    if-eq v6, v2, :cond_1f

    const/16 v2, 0x11

    if-ne v6, v2, :cond_1d

    goto :goto_15

    :cond_1d
    const/16 v2, 0xc

    if-ne v6, v2, :cond_1e

    and-int/lit8 v2, v26, 0x1

    move/from16 v6, v16

    if-ne v2, v6, :cond_1e

    .line 2691
    div-int/lit8 v2, v21, 0x3

    shl-int/2addr v2, v6

    add-int/2addr v2, v6

    add-int/lit8 v6, v15, 0x1

    aget-object v15, v17, v15

    aput-object v15, v30, v2

    move v15, v6

    :cond_1e
    const/16 v16, 0x1

    goto :goto_16

    .line 2692
    :cond_1f
    :goto_15
    div-int/lit8 v2, v21, 0x3

    const/16 v16, 0x1

    shl-int/lit8 v2, v2, 0x1

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v6, v15, 0x1

    aget-object v15, v17, v15

    aput-object v15, v30, v2

    move v15, v6

    :goto_16
    shl-int/lit8 v2, v31, 0x1

    .line 2693
    aget-object v6, v17, v2

    move/from16 v28, v2

    .line 2694
    instance-of v2, v6, Ljava/lang/reflect/Field;

    if-eqz v2, :cond_20

    .line 2695
    check-cast v6, Ljava/lang/reflect/Field;

    :goto_17
    move v2, v5

    goto :goto_18

    .line 2696
    :cond_20
    check-cast v6, Ljava/lang/String;

    invoke-static {v7, v6}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    .line 2697
    aput-object v6, v17, v28

    goto :goto_17

    .line 2698
    :goto_18
    invoke-virtual {v4, v6}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v5

    long-to-int v5, v5

    add-int/lit8 v6, v28, 0x1

    move/from16 v28, v2

    .line 2699
    aget-object v2, v17, v6

    move/from16 v29, v5

    .line 2700
    instance-of v5, v2, Ljava/lang/reflect/Field;

    if-eqz v5, :cond_21

    .line 2701
    check-cast v2, Ljava/lang/reflect/Field;

    goto :goto_19

    .line 2702
    :cond_21
    check-cast v2, Ljava/lang/String;

    invoke-static {v7, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 2703
    aput-object v2, v17, v6

    .line 2704
    :goto_19
    invoke-virtual {v4, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v5

    long-to-int v2, v5

    move v6, v15

    move/from16 v5, v29

    const/16 v16, 0x1

    move v15, v9

    move/from16 v29, v28

    move/from16 v28, v8

    move v8, v2

    const/4 v2, 0x0

    goto/16 :goto_26

    :cond_22
    add-int/lit8 v5, v15, 0x1

    .line 2705
    aget-object v6, v17, v15

    check-cast v6, Ljava/lang/String;

    invoke-static {v7, v6}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    move/from16 v31, v5

    const/16 v5, 0x9

    if-eq v3, v5, :cond_23

    const/16 v5, 0x11

    if-ne v3, v5, :cond_24

    :cond_23
    move/from16 v28, v8

    const/4 v8, 0x1

    goto/16 :goto_1d

    :cond_24
    const/16 v5, 0x1b

    if-eq v3, v5, :cond_25

    const/16 v5, 0x31

    if-ne v3, v5, :cond_26

    :cond_25
    move/from16 v28, v8

    const/4 v8, 0x1

    goto :goto_1c

    :cond_26
    const/16 v5, 0xc

    if-eq v3, v5, :cond_2a

    const/16 v5, 0x1e

    if-eq v3, v5, :cond_2a

    const/16 v5, 0x2c

    if-ne v3, v5, :cond_27

    goto :goto_1a

    :cond_27
    const/16 v5, 0x32

    if-ne v3, v5, :cond_29

    add-int/lit8 v5, v22, 0x1

    .line 2706
    aput v21, v13, v22

    .line 2707
    div-int/lit8 v22, v21, 0x3

    const/16 v16, 0x1

    shl-int/lit8 v22, v22, 0x1

    add-int/lit8 v28, v15, 0x2

    aget-object v29, v17, v31

    aput-object v29, v30, v22

    move/from16 v29, v5

    and-int/lit16 v5, v0, 0x800

    if-eqz v5, :cond_28

    add-int/lit8 v22, v22, 0x1

    add-int/lit8 v5, v15, 0x3

    .line 2708
    aget-object v15, v17, v28

    aput-object v15, v30, v22

    move/from16 v28, v8

    move v15, v9

    move/from16 v22, v29

    goto :goto_1f

    :cond_28
    move v15, v9

    move/from16 v5, v28

    move/from16 v22, v29

    move/from16 v28, v8

    goto :goto_1f

    :cond_29
    move/from16 v28, v8

    const/4 v8, 0x1

    goto :goto_1e

    :cond_2a
    :goto_1a
    and-int/lit8 v5, v26, 0x1

    move/from16 v28, v8

    const/4 v8, 0x1

    if-ne v5, v8, :cond_2b

    .line 2709
    div-int/lit8 v5, v21, 0x3

    shl-int/2addr v5, v8

    add-int/2addr v5, v8

    add-int/lit8 v15, v15, 0x2

    aget-object v16, v17, v31

    aput-object v16, v30, v5

    :goto_1b
    move v5, v15

    move v15, v9

    goto :goto_1f

    .line 2710
    :goto_1c
    div-int/lit8 v5, v21, 0x3

    shl-int/2addr v5, v8

    add-int/2addr v5, v8

    add-int/lit8 v15, v15, 0x2

    aget-object v16, v17, v31

    aput-object v16, v30, v5

    goto :goto_1b

    .line 2711
    :goto_1d
    div-int/lit8 v5, v21, 0x3

    shl-int/2addr v5, v8

    add-int/2addr v5, v8

    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v15

    aput-object v15, v30, v5

    :cond_2b
    :goto_1e
    move v15, v9

    move/from16 v5, v31

    .line 2712
    :goto_1f
    invoke-virtual {v4, v6}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v8

    long-to-int v6, v8

    and-int/lit8 v8, v26, 0x1

    const/4 v9, 0x1

    if-ne v8, v9, :cond_30

    const/16 v8, 0x11

    if-gt v3, v8, :cond_2f

    add-int/lit8 v8, v2, 0x1

    .line 2713
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const v9, 0xd800

    if-lt v2, v9, :cond_2d

    and-int/lit16 v2, v2, 0x1fff

    const/16 v19, 0xd

    :goto_20
    add-int/lit8 v29, v8, 0x1

    .line 2714
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v9, :cond_2c

    and-int/lit16 v8, v8, 0x1fff

    shl-int v8, v8, v19

    or-int/2addr v2, v8

    add-int/lit8 v19, v19, 0xd

    move/from16 v8, v29

    goto :goto_20

    :cond_2c
    shl-int v8, v8, v19

    or-int/2addr v2, v8

    :goto_21
    const/16 v16, 0x1

    goto :goto_22

    :cond_2d
    move/from16 v29, v8

    goto :goto_21

    :goto_22
    shl-int/lit8 v8, v24, 0x1

    .line 2715
    div-int/lit8 v19, v2, 0x20

    add-int v19, v19, v8

    .line 2716
    aget-object v8, v17, v19

    .line 2717
    instance-of v9, v8, Ljava/lang/reflect/Field;

    if-eqz v9, :cond_2e

    .line 2718
    check-cast v8, Ljava/lang/reflect/Field;

    goto :goto_23

    .line 2719
    :cond_2e
    check-cast v8, Ljava/lang/String;

    invoke-static {v7, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    .line 2720
    aput-object v8, v17, v19

    .line 2721
    :goto_23
    invoke-virtual {v4, v8}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v8

    long-to-int v8, v8

    .line 2722
    rem-int/lit8 v2, v2, 0x20

    goto :goto_25

    :cond_2f
    const/16 v16, 0x1

    goto :goto_24

    :cond_30
    move/from16 v16, v9

    :goto_24
    move/from16 v29, v2

    const/4 v2, 0x0

    const/4 v8, 0x0

    :goto_25
    const/16 v9, 0x12

    if-lt v3, v9, :cond_31

    const/16 v9, 0x31

    if-gt v3, v9, :cond_31

    add-int/lit8 v9, v23, 0x1

    .line 2723
    aput v6, v13, v23

    move/from16 v23, v6

    move v6, v5

    move/from16 v5, v23

    move/from16 v23, v9

    goto :goto_26

    :cond_31
    move/from16 v33, v6

    move v6, v5

    move/from16 v5, v33

    :goto_26
    add-int/lit8 v9, v21, 0x1

    .line 2724
    aput v28, v25, v21

    add-int/lit8 v19, v21, 0x2

    move-object/from16 v28, v1

    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_32

    const/high16 v1, 0x20000000

    goto :goto_27

    :cond_32
    const/4 v1, 0x0

    :goto_27
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_33

    const/high16 v0, 0x10000000

    goto :goto_28

    :cond_33
    const/4 v0, 0x0

    :goto_28
    or-int/2addr v0, v1

    shl-int/lit8 v1, v3, 0x14

    or-int/2addr v0, v1

    or-int/2addr v0, v5

    .line 2725
    aput v0, v25, v9

    add-int/lit8 v21, v21, 0x3

    shl-int/lit8 v0, v2, 0x14

    or-int/2addr v0, v8

    .line 2726
    aput v0, v25, v19

    move v9, v15

    move/from16 v3, v24

    move-object/from16 v0, v25

    move/from16 v5, v26

    move/from16 v2, v27

    move-object/from16 v1, v28

    move/from16 v8, v29

    move v15, v6

    move-object/from16 v6, v30

    goto/16 :goto_f

    :cond_34
    move-object/from16 v25, v0

    move-object/from16 v30, v6

    move v15, v9

    .line 2727
    new-instance v5, Lcom/google/android/gms/internal/drive/zzlu;

    .line 2728
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/drive/zzme;->zzee()Lcom/google/android/gms/internal/drive/zzlq;

    move-result-object v0

    move v15, v12

    const/4 v12, 0x0

    move-object/from16 v16, p2

    move-object/from16 v17, p3

    move-object/from16 v18, p4

    move-object/from16 v19, p5

    move-object/from16 v20, p6

    move v8, v10

    move-object/from16 v6, v25

    move-object/from16 v7, v30

    move-object v10, v0

    invoke-direct/range {v5 .. v20}, Lcom/google/android/gms/internal/drive/zzlu;-><init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/drive/zzlq;ZZ[IIILcom/google/android/gms/internal/drive/zzly;Lcom/google/android/gms/internal/drive/zzla;Lcom/google/android/gms/internal/drive/zzmx;Lcom/google/android/gms/internal/drive/zzjy;Lcom/google/android/gms/internal/drive/zzll;)V

    return-object v5

    .line 2729
    :cond_35
    check-cast v0, Lcom/google/android/gms/internal/drive/zzms;

    .line 2730
    invoke-virtual {v0}, Lcom/google/android/gms/internal/drive/zzms;->zzec()I

    .line 2731
    new-instance v0, Ljava/lang/NoSuchMethodError;

    invoke-direct {v0}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw v0
.end method

.method private final zza(IILjava/util/Map;Lcom/google/android/gms/internal/drive/zzko;Ljava/lang/Object;Lcom/google/android/gms/internal/drive/zzmx;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            "UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(II",
            "Ljava/util/Map<",
            "TK;TV;>;",
            "Lcom/google/android/gms/internal/drive/zzko;",
            "TUB;",
            "Lcom/google/android/gms/internal/drive/zzmx<",
            "TUT;TUB;>;)TUB;"
        }
    .end annotation

    .line 3142
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzut:Lcom/google/android/gms/internal/drive/zzll;

    .line 3143
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/drive/zzlu;->zzaq(I)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/drive/zzll;->zzm(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzlj;

    move-result-object p0

    .line 3144
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    .line 3145
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    .line 3146
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p4, v0}, Lcom/google/android/gms/internal/drive/zzko;->zzan(I)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p5, :cond_1

    .line 3147
    invoke-virtual {p6}, Lcom/google/android/gms/internal/drive/zzmx;->zzez()Ljava/lang/Object;

    move-result-object p5

    .line 3148
    :cond_1
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/drive/zzli;->zza(Lcom/google/android/gms/internal/drive/zzlj;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    .line 3149
    invoke-static {v0}, Lcom/google/android/gms/internal/drive/zzjc;->zzu(I)Lcom/google/android/gms/internal/drive/zzjk;

    move-result-object v0

    .line 3150
    invoke-virtual {v0}, Lcom/google/android/gms/internal/drive/zzjk;->zzby()Lcom/google/android/gms/internal/drive/zzjr;

    move-result-object v1

    .line 3151
    :try_start_0
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    invoke-static {v1, p0, v2, p3}, Lcom/google/android/gms/internal/drive/zzli;->zza(Lcom/google/android/gms/internal/drive/zzjr;Lcom/google/android/gms/internal/drive/zzlj;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3152
    invoke-virtual {v0}, Lcom/google/android/gms/internal/drive/zzjk;->zzbx()Lcom/google/android/gms/internal/drive/zzjc;

    move-result-object p3

    invoke-virtual {p6, p5, p2, p3}, Lcom/google/android/gms/internal/drive/zzmx;->zza(Ljava/lang/Object;ILcom/google/android/gms/internal/drive/zzjc;)V

    .line 3153
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catch_0
    move-exception p0

    .line 3154
    invoke-static {p0}, Lds0;->p(Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0

    :cond_2
    return-object p5
.end method

.method private static zza(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Field;"
        }
    .end annotation

    .line 2633
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 2634
    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    .line 2635
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2636
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2637
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    .line 2638
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x28

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Field "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not found. Known fields are "

    .line 2639
    invoke-static {v2, p0, v0}, Lfm0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 2640
    invoke-static {p0}, Lf42;->s(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static zza(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzns;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3157
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3158
    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, p0, p1}, Lcom/google/android/gms/internal/drive/zzns;->zza(ILjava/lang/String;)V

    return-void

    .line 3159
    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/drive/zzjc;

    invoke-interface {p2, p0, p1}, Lcom/google/android/gms/internal/drive/zzns;->zza(ILcom/google/android/gms/internal/drive/zzjc;)V

    return-void
.end method

.method private static zza(Lcom/google/android/gms/internal/drive/zzmx;Ljava/lang/Object;Lcom/google/android/gms/internal/drive/zzns;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/drive/zzmx<",
            "TUT;TUB;>;TT;",
            "Lcom/google/android/gms/internal/drive/zzns;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2736
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/drive/zzmx;->zzr(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzmx;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/drive/zzns;)V

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/drive/zzns;ILjava/lang/Object;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/drive/zzns;",
            "I",
            "Ljava/lang/Object;",
            "I)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p3, :cond_0

    .line 2732
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzut:Lcom/google/android/gms/internal/drive/zzll;

    .line 2733
    invoke-direct {p0, p4}, Lcom/google/android/gms/internal/drive/zzlu;->zzaq(I)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {v0, p4}, Lcom/google/android/gms/internal/drive/zzll;->zzm(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzlj;

    move-result-object p4

    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzut:Lcom/google/android/gms/internal/drive/zzll;

    .line 2734
    invoke-interface {p0, p3}, Lcom/google/android/gms/internal/drive/zzll;->zzi(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    .line 2735
    invoke-interface {p1, p2, p4, p0}, Lcom/google/android/gms/internal/drive/zzns;->zza(ILcom/google/android/gms/internal/drive/zzlj;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method private final zza(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)V"
        }
    .end annotation

    .line 2641
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/drive/zzlu;->zzas(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    .line 2642
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 2643
    :cond_0
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    .line 2644
    invoke-static {p2, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    if-eqz v2, :cond_1

    if-eqz p2, :cond_1

    .line 2645
    invoke-static {v2, p2}, Lcom/google/android/gms/internal/drive/zzkm;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 2646
    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 2647
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;I)V

    return-void

    :cond_1
    if-eqz p2, :cond_2

    .line 2648
    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 2649
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;I)V

    :cond_2
    :goto_0
    return-void
.end method

.method private final zza(Ljava/lang/Object;I)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)Z"
        }
    .end annotation

    .line 3162
    iget-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzuk:Z

    const v1, 0xfffff

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_14

    .line 3163
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/drive/zzlu;->zzas(I)I

    move-result p0

    and-int p2, p0, v1

    int-to-long v0, p2

    const/high16 p2, 0xff00000

    and-int/2addr p0, p2

    ushr-int/lit8 p0, p0, 0x14

    const-wide/16 v4, 0x0

    packed-switch p0, :pswitch_data_0

    .line 3164
    invoke-static {}, Lf42;->e()V

    return v2

    .line 3165
    :pswitch_0
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    return v3

    :cond_0
    return v2

    .line 3166
    :pswitch_1
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    move-result-wide p0

    cmp-long p0, p0, v4

    if-eqz p0, :cond_1

    return v3

    :cond_1
    return v2

    .line 3167
    :pswitch_2
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    move-result p0

    if-eqz p0, :cond_2

    return v3

    :cond_2
    return v2

    .line 3168
    :pswitch_3
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    move-result-wide p0

    cmp-long p0, p0, v4

    if-eqz p0, :cond_3

    return v3

    :cond_3
    return v2

    .line 3169
    :pswitch_4
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    move-result p0

    if-eqz p0, :cond_4

    return v3

    :cond_4
    return v2

    .line 3170
    :pswitch_5
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    move-result p0

    if-eqz p0, :cond_5

    return v3

    :cond_5
    return v2

    .line 3171
    :pswitch_6
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    move-result p0

    if-eqz p0, :cond_6

    return v3

    :cond_6
    return v2

    .line 3172
    :pswitch_7
    sget-object p0, Lcom/google/android/gms/internal/drive/zzjc;->zznq:Lcom/google/android/gms/internal/drive/zzjc;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/drive/zzjc;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    return v3

    :cond_7
    return v2

    .line 3173
    :pswitch_8
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_8

    return v3

    :cond_8
    return v2

    .line 3174
    :pswitch_9
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 3175
    instance-of p1, p0, Ljava/lang/String;

    if-eqz p1, :cond_a

    .line 3176
    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_9

    return v3

    :cond_9
    return v2

    .line 3177
    :cond_a
    instance-of p1, p0, Lcom/google/android/gms/internal/drive/zzjc;

    if-eqz p1, :cond_c

    .line 3178
    sget-object p1, Lcom/google/android/gms/internal/drive/zzjc;->zznq:Lcom/google/android/gms/internal/drive/zzjc;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/drive/zzjc;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    return v3

    :cond_b
    return v2

    .line 3179
    :cond_c
    invoke-static {}, Lf42;->e()V

    return v2

    .line 3180
    :pswitch_a
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzl(Ljava/lang/Object;J)Z

    move-result p0

    return p0

    .line 3181
    :pswitch_b
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    move-result p0

    if-eqz p0, :cond_d

    return v3

    :cond_d
    return v2

    .line 3182
    :pswitch_c
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    move-result-wide p0

    cmp-long p0, p0, v4

    if-eqz p0, :cond_e

    return v3

    :cond_e
    return v2

    .line 3183
    :pswitch_d
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    move-result p0

    if-eqz p0, :cond_f

    return v3

    :cond_f
    return v2

    .line 3184
    :pswitch_e
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    move-result-wide p0

    cmp-long p0, p0, v4

    if-eqz p0, :cond_10

    return v3

    :cond_10
    return v2

    .line 3185
    :pswitch_f
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    move-result-wide p0

    cmp-long p0, p0, v4

    if-eqz p0, :cond_11

    return v3

    :cond_11
    return v2

    .line 3186
    :pswitch_10
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzm(Ljava/lang/Object;J)F

    move-result p0

    const/4 p1, 0x0

    cmpl-float p0, p0, p1

    if-eqz p0, :cond_12

    return v3

    :cond_12
    return v2

    .line 3187
    :pswitch_11
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzn(Ljava/lang/Object;J)D

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmpl-double p0, p0, v0

    if-eqz p0, :cond_13

    return v3

    :cond_13
    return v2

    .line 3188
    :cond_14
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/drive/zzlu;->zzat(I)I

    move-result p0

    ushr-int/lit8 p2, p0, 0x14

    shl-int p2, v3, p2

    and-int/2addr p0, v1

    int-to-long v0, p0

    .line 3189
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    move-result p0

    and-int/2addr p0, p2

    if-eqz p0, :cond_15

    return v3

    :cond_15
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final zza(Ljava/lang/Object;II)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;II)Z"
        }
    .end annotation

    .line 3190
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/drive/zzlu;->zzat(I)I

    move-result p0

    const p3, 0xfffff

    and-int/2addr p0, p3

    int-to-long v0, p0

    .line 3191
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    move-result p0

    if-ne p0, p2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private final zza(Ljava/lang/Object;III)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;III)Z"
        }
    .end annotation

    .line 3160
    iget-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzuk:Z

    if-eqz v0, :cond_0

    .line 3161
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    move-result p0

    return p0

    :cond_0
    and-int p0, p3, p4

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private static zza(Ljava/lang/Object;ILcom/google/android/gms/internal/drive/zzmf;)Z
    .locals 2

    const v0, 0xfffff

    and-int/2addr p1, v0

    int-to-long v0, p1

    .line 3155
    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    .line 3156
    invoke-interface {p2, p0}, Lcom/google/android/gms/internal/drive/zzmf;->zzp(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private final zzap(I)Lcom/google/android/gms/internal/drive/zzmf;
    .locals 3

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    shl-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzue:[Ljava/lang/Object;

    .line 6
    .line 7
    aget-object v0, v0, p1

    .line 8
    .line 9
    check-cast v0, Lcom/google/android/gms/internal/drive/zzmf;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzmd;->zzej()Lcom/google/android/gms/internal/drive/zzmd;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzue:[Ljava/lang/Object;

    .line 19
    .line 20
    add-int/lit8 v2, p1, 0x1

    .line 21
    .line 22
    aget-object v1, v1, v2

    .line 23
    .line 24
    check-cast v1, Ljava/lang/Class;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/drive/zzmd;->zzf(Ljava/lang/Class;)Lcom/google/android/gms/internal/drive/zzmf;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzue:[Ljava/lang/Object;

    .line 31
    .line 32
    aput-object v0, p0, p1

    .line 33
    .line 34
    return-object v0
.end method

.method private final zzaq(I)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzue:[Ljava/lang/Object;

    .line 2
    .line 3
    div-int/lit8 p1, p1, 0x3

    .line 4
    .line 5
    shl-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    aget-object p0, p0, p1

    .line 8
    .line 9
    return-object p0
.end method

.method private final zzar(I)Lcom/google/android/gms/internal/drive/zzko;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzue:[Ljava/lang/Object;

    .line 2
    .line 3
    div-int/lit8 p1, p1, 0x3

    .line 4
    .line 5
    shl-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    add-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    aget-object p0, p0, p1

    .line 10
    .line 11
    check-cast p0, Lcom/google/android/gms/internal/drive/zzko;

    .line 12
    .line 13
    return-object p0
.end method

.method private final zzas(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    aget p0, p0, p1

    .line 6
    .line 7
    return p0
.end method

.method private final zzat(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    aget p0, p0, p1

    .line 6
    .line 7
    return p0
.end method

.method private final zzau(I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzuf:I

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzug:I

    .line 6
    .line 7
    if-gt p1, v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzq(II)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, -0x1

    .line 16
    return p0
.end method

.method private final zzb(Ljava/lang/Object;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation

    .line 1219
    iget-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzuk:Z

    if-eqz v0, :cond_0

    return-void

    .line 1220
    :cond_0
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/drive/zzlu;->zzat(I)I

    move-result p0

    ushr-int/lit8 p2, p0, 0x14

    const/4 v0, 0x1

    shl-int p2, v0, p2

    const v0, 0xfffff

    and-int/2addr p0, v0

    int-to-long v0, p0

    .line 1221
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    move-result p0

    or-int/2addr p0, p2

    .line 1222
    invoke-static {p1, v0, v1, p0}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JI)V

    return-void
.end method

.method private final zzb(Ljava/lang/Object;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;II)V"
        }
    .end annotation

    .line 1223
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/drive/zzlu;->zzat(I)I

    move-result p0

    const p3, 0xfffff

    and-int/2addr p0, p3

    int-to-long v0, p0

    .line 1224
    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JI)V

    return-void
.end method

.method private final zzb(Ljava/lang/Object;Lcom/google/android/gms/internal/drive/zzns;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/android/gms/internal/drive/zzns;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-boolean v3, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzui:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    iget-object v3, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 12
    .line 13
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/drive/zzjy;->zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzkb;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-object v5, v3, Lcom/google/android/gms/internal/drive/zzkb;->zzos:Lcom/google/android/gms/internal/drive/zzmi;

    .line 18
    .line 19
    invoke-virtual {v5}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-nez v5, :cond_0

    .line 24
    .line 25
    invoke-virtual {v3}, Lcom/google/android/gms/internal/drive/zzkb;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    check-cast v5, Ljava/util/Map$Entry;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v3, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    :goto_0
    iget-object v6, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 39
    .line 40
    array-length v6, v6

    .line 41
    sget-object v7, Lcom/google/android/gms/internal/drive/zzlu;->zzuc:Lsun/misc/Unsafe;

    .line 42
    .line 43
    const/4 v9, -0x1

    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v11, 0x0

    .line 46
    :goto_1
    if-ge v10, v6, :cond_7

    .line 47
    .line 48
    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zzas(I)I

    .line 49
    .line 50
    .line 51
    move-result v12

    .line 52
    iget-object v13, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 53
    .line 54
    aget v14, v13, v10

    .line 55
    .line 56
    const/high16 v15, 0xff00000

    .line 57
    .line 58
    and-int/2addr v15, v12

    .line 59
    ushr-int/lit8 v15, v15, 0x14

    .line 60
    .line 61
    iget-boolean v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzuk:Z

    .line 62
    .line 63
    const v16, 0xfffff

    .line 64
    .line 65
    .line 66
    if-nez v4, :cond_2

    .line 67
    .line 68
    const/16 v4, 0x11

    .line 69
    .line 70
    if-gt v15, v4, :cond_2

    .line 71
    .line 72
    add-int/lit8 v4, v10, 0x2

    .line 73
    .line 74
    aget v4, v13, v4

    .line 75
    .line 76
    and-int v13, v4, v16

    .line 77
    .line 78
    const/16 v17, 0x1

    .line 79
    .line 80
    if-eq v13, v9, :cond_1

    .line 81
    .line 82
    int-to-long v8, v13

    .line 83
    invoke-virtual {v7, v1, v8, v9}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    move v9, v13

    .line 88
    :cond_1
    ushr-int/lit8 v4, v4, 0x14

    .line 89
    .line 90
    shl-int v4, v17, v4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    const/16 v17, 0x1

    .line 94
    .line 95
    const/4 v4, 0x0

    .line 96
    :goto_2
    if-eqz v5, :cond_4

    .line 97
    .line 98
    iget-object v8, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 99
    .line 100
    invoke-virtual {v8, v5}, Lcom/google/android/gms/internal/drive/zzjy;->zza(Ljava/util/Map$Entry;)I

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-gt v8, v14, :cond_4

    .line 105
    .line 106
    iget-object v8, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 107
    .line 108
    invoke-virtual {v8, v2, v5}, Lcom/google/android/gms/internal/drive/zzjy;->zza(Lcom/google/android/gms/internal/drive/zzns;Ljava/util/Map$Entry;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-eqz v5, :cond_3

    .line 116
    .line 117
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    check-cast v5, Ljava/util/Map$Entry;

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_3
    const/4 v5, 0x0

    .line 125
    goto :goto_2

    .line 126
    :cond_4
    and-int v8, v12, v16

    .line 127
    .line 128
    int-to-long v12, v8

    .line 129
    packed-switch v15, :pswitch_data_0

    .line 130
    .line 131
    .line 132
    :cond_5
    :goto_3
    const/4 v15, 0x0

    .line 133
    goto/16 :goto_5

    .line 134
    .line 135
    :pswitch_0
    invoke-direct {v0, v1, v14, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-eqz v4, :cond_5

    .line 140
    .line 141
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    invoke-interface {v2, v14, v4, v8}, Lcom/google/android/gms/internal/drive/zzns;->zzb(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzmf;)V

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :pswitch_1
    invoke-direct {v0, v1, v14, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-eqz v4, :cond_5

    .line 158
    .line 159
    invoke-static {v1, v12, v13}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 160
    .line 161
    .line 162
    move-result-wide v12

    .line 163
    invoke-interface {v2, v14, v12, v13}, Lcom/google/android/gms/internal/drive/zzns;->zzb(IJ)V

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :pswitch_2
    invoke-direct {v0, v1, v14, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-eqz v4, :cond_5

    .line 172
    .line 173
    invoke-static {v1, v12, v13}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    invoke-interface {v2, v14, v4}, Lcom/google/android/gms/internal/drive/zzns;->zze(II)V

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :pswitch_3
    invoke-direct {v0, v1, v14, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-eqz v4, :cond_5

    .line 186
    .line 187
    invoke-static {v1, v12, v13}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 188
    .line 189
    .line 190
    move-result-wide v12

    .line 191
    invoke-interface {v2, v14, v12, v13}, Lcom/google/android/gms/internal/drive/zzns;->zzj(IJ)V

    .line 192
    .line 193
    .line 194
    goto :goto_3

    .line 195
    :pswitch_4
    invoke-direct {v0, v1, v14, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-eqz v4, :cond_5

    .line 200
    .line 201
    invoke-static {v1, v12, v13}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    invoke-interface {v2, v14, v4}, Lcom/google/android/gms/internal/drive/zzns;->zzm(II)V

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :pswitch_5
    invoke-direct {v0, v1, v14, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-eqz v4, :cond_5

    .line 214
    .line 215
    invoke-static {v1, v12, v13}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    invoke-interface {v2, v14, v4}, Lcom/google/android/gms/internal/drive/zzns;->zzn(II)V

    .line 220
    .line 221
    .line 222
    goto :goto_3

    .line 223
    :pswitch_6
    invoke-direct {v0, v1, v14, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    if-eqz v4, :cond_5

    .line 228
    .line 229
    invoke-static {v1, v12, v13}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    invoke-interface {v2, v14, v4}, Lcom/google/android/gms/internal/drive/zzns;->zzd(II)V

    .line 234
    .line 235
    .line 236
    goto :goto_3

    .line 237
    :pswitch_7
    invoke-direct {v0, v1, v14, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-eqz v4, :cond_5

    .line 242
    .line 243
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    check-cast v4, Lcom/google/android/gms/internal/drive/zzjc;

    .line 248
    .line 249
    invoke-interface {v2, v14, v4}, Lcom/google/android/gms/internal/drive/zzns;->zza(ILcom/google/android/gms/internal/drive/zzjc;)V

    .line 250
    .line 251
    .line 252
    goto :goto_3

    .line 253
    :pswitch_8
    invoke-direct {v0, v1, v14, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    if-eqz v4, :cond_5

    .line 258
    .line 259
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    invoke-interface {v2, v14, v4, v8}, Lcom/google/android/gms/internal/drive/zzns;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzmf;)V

    .line 268
    .line 269
    .line 270
    goto/16 :goto_3

    .line 271
    .line 272
    :pswitch_9
    invoke-direct {v0, v1, v14, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 273
    .line 274
    .line 275
    move-result v4

    .line 276
    if-eqz v4, :cond_5

    .line 277
    .line 278
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    invoke-static {v14, v4, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzns;)V

    .line 283
    .line 284
    .line 285
    goto/16 :goto_3

    .line 286
    .line 287
    :pswitch_a
    invoke-direct {v0, v1, v14, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    if-eqz v4, :cond_5

    .line 292
    .line 293
    invoke-static {v1, v12, v13}, Lcom/google/android/gms/internal/drive/zzlu;->zzi(Ljava/lang/Object;J)Z

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    invoke-interface {v2, v14, v4}, Lcom/google/android/gms/internal/drive/zzns;->zzb(IZ)V

    .line 298
    .line 299
    .line 300
    goto/16 :goto_3

    .line 301
    .line 302
    :pswitch_b
    invoke-direct {v0, v1, v14, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    if-eqz v4, :cond_5

    .line 307
    .line 308
    invoke-static {v1, v12, v13}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    invoke-interface {v2, v14, v4}, Lcom/google/android/gms/internal/drive/zzns;->zzf(II)V

    .line 313
    .line 314
    .line 315
    goto/16 :goto_3

    .line 316
    .line 317
    :pswitch_c
    invoke-direct {v0, v1, v14, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    if-eqz v4, :cond_5

    .line 322
    .line 323
    invoke-static {v1, v12, v13}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 324
    .line 325
    .line 326
    move-result-wide v12

    .line 327
    invoke-interface {v2, v14, v12, v13}, Lcom/google/android/gms/internal/drive/zzns;->zzc(IJ)V

    .line 328
    .line 329
    .line 330
    goto/16 :goto_3

    .line 331
    .line 332
    :pswitch_d
    invoke-direct {v0, v1, v14, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    if-eqz v4, :cond_5

    .line 337
    .line 338
    invoke-static {v1, v12, v13}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 339
    .line 340
    .line 341
    move-result v4

    .line 342
    invoke-interface {v2, v14, v4}, Lcom/google/android/gms/internal/drive/zzns;->zzc(II)V

    .line 343
    .line 344
    .line 345
    goto/16 :goto_3

    .line 346
    .line 347
    :pswitch_e
    invoke-direct {v0, v1, v14, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 348
    .line 349
    .line 350
    move-result v4

    .line 351
    if-eqz v4, :cond_5

    .line 352
    .line 353
    invoke-static {v1, v12, v13}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 354
    .line 355
    .line 356
    move-result-wide v12

    .line 357
    invoke-interface {v2, v14, v12, v13}, Lcom/google/android/gms/internal/drive/zzns;->zza(IJ)V

    .line 358
    .line 359
    .line 360
    goto/16 :goto_3

    .line 361
    .line 362
    :pswitch_f
    invoke-direct {v0, v1, v14, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    if-eqz v4, :cond_5

    .line 367
    .line 368
    invoke-static {v1, v12, v13}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 369
    .line 370
    .line 371
    move-result-wide v12

    .line 372
    invoke-interface {v2, v14, v12, v13}, Lcom/google/android/gms/internal/drive/zzns;->zzi(IJ)V

    .line 373
    .line 374
    .line 375
    goto/16 :goto_3

    .line 376
    .line 377
    :pswitch_10
    invoke-direct {v0, v1, v14, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    if-eqz v4, :cond_5

    .line 382
    .line 383
    invoke-static {v1, v12, v13}, Lcom/google/android/gms/internal/drive/zzlu;->zzf(Ljava/lang/Object;J)F

    .line 384
    .line 385
    .line 386
    move-result v4

    .line 387
    invoke-interface {v2, v14, v4}, Lcom/google/android/gms/internal/drive/zzns;->zza(IF)V

    .line 388
    .line 389
    .line 390
    goto/16 :goto_3

    .line 391
    .line 392
    :pswitch_11
    invoke-direct {v0, v1, v14, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 393
    .line 394
    .line 395
    move-result v4

    .line 396
    if-eqz v4, :cond_5

    .line 397
    .line 398
    invoke-static {v1, v12, v13}, Lcom/google/android/gms/internal/drive/zzlu;->zze(Ljava/lang/Object;J)D

    .line 399
    .line 400
    .line 401
    move-result-wide v12

    .line 402
    invoke-interface {v2, v14, v12, v13}, Lcom/google/android/gms/internal/drive/zzns;->zza(ID)V

    .line 403
    .line 404
    .line 405
    goto/16 :goto_3

    .line 406
    .line 407
    :pswitch_12
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v4

    .line 411
    invoke-direct {v0, v2, v14, v4, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Lcom/google/android/gms/internal/drive/zzns;ILjava/lang/Object;I)V

    .line 412
    .line 413
    .line 414
    goto/16 :goto_3

    .line 415
    .line 416
    :pswitch_13
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 417
    .line 418
    aget v4, v4, v10

    .line 419
    .line 420
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v8

    .line 424
    check-cast v8, Ljava/util/List;

    .line 425
    .line 426
    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 427
    .line 428
    .line 429
    move-result-object v12

    .line 430
    invoke-static {v4, v8, v2, v12}, Lcom/google/android/gms/internal/drive/zzmh;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Lcom/google/android/gms/internal/drive/zzmf;)V

    .line 431
    .line 432
    .line 433
    goto/16 :goto_3

    .line 434
    .line 435
    :pswitch_14
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 436
    .line 437
    aget v4, v4, v10

    .line 438
    .line 439
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v8

    .line 443
    check-cast v8, Ljava/util/List;

    .line 444
    .line 445
    move/from16 v14, v17

    .line 446
    .line 447
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zze(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 448
    .line 449
    .line 450
    goto/16 :goto_3

    .line 451
    .line 452
    :pswitch_15
    move/from16 v14, v17

    .line 453
    .line 454
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 455
    .line 456
    aget v4, v4, v10

    .line 457
    .line 458
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v8

    .line 462
    check-cast v8, Ljava/util/List;

    .line 463
    .line 464
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zzj(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 465
    .line 466
    .line 467
    goto/16 :goto_3

    .line 468
    .line 469
    :pswitch_16
    move/from16 v14, v17

    .line 470
    .line 471
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 472
    .line 473
    aget v4, v4, v10

    .line 474
    .line 475
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v8

    .line 479
    check-cast v8, Ljava/util/List;

    .line 480
    .line 481
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zzg(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 482
    .line 483
    .line 484
    goto/16 :goto_3

    .line 485
    .line 486
    :pswitch_17
    move/from16 v14, v17

    .line 487
    .line 488
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 489
    .line 490
    aget v4, v4, v10

    .line 491
    .line 492
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v8

    .line 496
    check-cast v8, Ljava/util/List;

    .line 497
    .line 498
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zzl(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 499
    .line 500
    .line 501
    goto/16 :goto_3

    .line 502
    .line 503
    :pswitch_18
    move/from16 v14, v17

    .line 504
    .line 505
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 506
    .line 507
    aget v4, v4, v10

    .line 508
    .line 509
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v8

    .line 513
    check-cast v8, Ljava/util/List;

    .line 514
    .line 515
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zzm(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 516
    .line 517
    .line 518
    goto/16 :goto_3

    .line 519
    .line 520
    :pswitch_19
    move/from16 v14, v17

    .line 521
    .line 522
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 523
    .line 524
    aget v4, v4, v10

    .line 525
    .line 526
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v8

    .line 530
    check-cast v8, Ljava/util/List;

    .line 531
    .line 532
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zzi(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 533
    .line 534
    .line 535
    goto/16 :goto_3

    .line 536
    .line 537
    :pswitch_1a
    move/from16 v14, v17

    .line 538
    .line 539
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 540
    .line 541
    aget v4, v4, v10

    .line 542
    .line 543
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v8

    .line 547
    check-cast v8, Ljava/util/List;

    .line 548
    .line 549
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zzn(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 550
    .line 551
    .line 552
    goto/16 :goto_3

    .line 553
    .line 554
    :pswitch_1b
    move/from16 v14, v17

    .line 555
    .line 556
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 557
    .line 558
    aget v4, v4, v10

    .line 559
    .line 560
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v8

    .line 564
    check-cast v8, Ljava/util/List;

    .line 565
    .line 566
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zzk(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 567
    .line 568
    .line 569
    goto/16 :goto_3

    .line 570
    .line 571
    :pswitch_1c
    move/from16 v14, v17

    .line 572
    .line 573
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 574
    .line 575
    aget v4, v4, v10

    .line 576
    .line 577
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v8

    .line 581
    check-cast v8, Ljava/util/List;

    .line 582
    .line 583
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zzf(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 584
    .line 585
    .line 586
    goto/16 :goto_3

    .line 587
    .line 588
    :pswitch_1d
    move/from16 v14, v17

    .line 589
    .line 590
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 591
    .line 592
    aget v4, v4, v10

    .line 593
    .line 594
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v8

    .line 598
    check-cast v8, Ljava/util/List;

    .line 599
    .line 600
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zzh(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 601
    .line 602
    .line 603
    goto/16 :goto_3

    .line 604
    .line 605
    :pswitch_1e
    move/from16 v14, v17

    .line 606
    .line 607
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 608
    .line 609
    aget v4, v4, v10

    .line 610
    .line 611
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v8

    .line 615
    check-cast v8, Ljava/util/List;

    .line 616
    .line 617
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zzd(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 618
    .line 619
    .line 620
    goto/16 :goto_3

    .line 621
    .line 622
    :pswitch_1f
    move/from16 v14, v17

    .line 623
    .line 624
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 625
    .line 626
    aget v4, v4, v10

    .line 627
    .line 628
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v8

    .line 632
    check-cast v8, Ljava/util/List;

    .line 633
    .line 634
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zzc(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 635
    .line 636
    .line 637
    goto/16 :goto_3

    .line 638
    .line 639
    :pswitch_20
    move/from16 v14, v17

    .line 640
    .line 641
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 642
    .line 643
    aget v4, v4, v10

    .line 644
    .line 645
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v8

    .line 649
    check-cast v8, Ljava/util/List;

    .line 650
    .line 651
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 652
    .line 653
    .line 654
    goto/16 :goto_3

    .line 655
    .line 656
    :pswitch_21
    move/from16 v14, v17

    .line 657
    .line 658
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 659
    .line 660
    aget v4, v4, v10

    .line 661
    .line 662
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v8

    .line 666
    check-cast v8, Ljava/util/List;

    .line 667
    .line 668
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zza(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 669
    .line 670
    .line 671
    goto/16 :goto_3

    .line 672
    .line 673
    :pswitch_22
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 674
    .line 675
    aget v4, v4, v10

    .line 676
    .line 677
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v8

    .line 681
    check-cast v8, Ljava/util/List;

    .line 682
    .line 683
    const/4 v14, 0x0

    .line 684
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zze(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 685
    .line 686
    .line 687
    :goto_4
    move v15, v14

    .line 688
    goto/16 :goto_5

    .line 689
    .line 690
    :pswitch_23
    const/4 v14, 0x0

    .line 691
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 692
    .line 693
    aget v4, v4, v10

    .line 694
    .line 695
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v8

    .line 699
    check-cast v8, Ljava/util/List;

    .line 700
    .line 701
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zzj(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 702
    .line 703
    .line 704
    goto :goto_4

    .line 705
    :pswitch_24
    const/4 v14, 0x0

    .line 706
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 707
    .line 708
    aget v4, v4, v10

    .line 709
    .line 710
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v8

    .line 714
    check-cast v8, Ljava/util/List;

    .line 715
    .line 716
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zzg(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 717
    .line 718
    .line 719
    goto :goto_4

    .line 720
    :pswitch_25
    const/4 v14, 0x0

    .line 721
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 722
    .line 723
    aget v4, v4, v10

    .line 724
    .line 725
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v8

    .line 729
    check-cast v8, Ljava/util/List;

    .line 730
    .line 731
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zzl(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 732
    .line 733
    .line 734
    goto :goto_4

    .line 735
    :pswitch_26
    const/4 v14, 0x0

    .line 736
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 737
    .line 738
    aget v4, v4, v10

    .line 739
    .line 740
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v8

    .line 744
    check-cast v8, Ljava/util/List;

    .line 745
    .line 746
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zzm(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 747
    .line 748
    .line 749
    goto :goto_4

    .line 750
    :pswitch_27
    const/4 v14, 0x0

    .line 751
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 752
    .line 753
    aget v4, v4, v10

    .line 754
    .line 755
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v8

    .line 759
    check-cast v8, Ljava/util/List;

    .line 760
    .line 761
    invoke-static {v4, v8, v2, v14}, Lcom/google/android/gms/internal/drive/zzmh;->zzi(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 762
    .line 763
    .line 764
    goto :goto_4

    .line 765
    :pswitch_28
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 766
    .line 767
    aget v4, v4, v10

    .line 768
    .line 769
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v8

    .line 773
    check-cast v8, Ljava/util/List;

    .line 774
    .line 775
    invoke-static {v4, v8, v2}, Lcom/google/android/gms/internal/drive/zzmh;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;)V

    .line 776
    .line 777
    .line 778
    goto/16 :goto_3

    .line 779
    .line 780
    :pswitch_29
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 781
    .line 782
    aget v4, v4, v10

    .line 783
    .line 784
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v8

    .line 788
    check-cast v8, Ljava/util/List;

    .line 789
    .line 790
    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 791
    .line 792
    .line 793
    move-result-object v12

    .line 794
    invoke-static {v4, v8, v2, v12}, Lcom/google/android/gms/internal/drive/zzmh;->zza(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Lcom/google/android/gms/internal/drive/zzmf;)V

    .line 795
    .line 796
    .line 797
    goto/16 :goto_3

    .line 798
    .line 799
    :pswitch_2a
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 800
    .line 801
    aget v4, v4, v10

    .line 802
    .line 803
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v8

    .line 807
    check-cast v8, Ljava/util/List;

    .line 808
    .line 809
    invoke-static {v4, v8, v2}, Lcom/google/android/gms/internal/drive/zzmh;->zza(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;)V

    .line 810
    .line 811
    .line 812
    goto/16 :goto_3

    .line 813
    .line 814
    :pswitch_2b
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 815
    .line 816
    aget v4, v4, v10

    .line 817
    .line 818
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v8

    .line 822
    check-cast v8, Ljava/util/List;

    .line 823
    .line 824
    const/4 v15, 0x0

    .line 825
    invoke-static {v4, v8, v2, v15}, Lcom/google/android/gms/internal/drive/zzmh;->zzn(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 826
    .line 827
    .line 828
    goto/16 :goto_5

    .line 829
    .line 830
    :pswitch_2c
    const/4 v15, 0x0

    .line 831
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 832
    .line 833
    aget v4, v4, v10

    .line 834
    .line 835
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v8

    .line 839
    check-cast v8, Ljava/util/List;

    .line 840
    .line 841
    invoke-static {v4, v8, v2, v15}, Lcom/google/android/gms/internal/drive/zzmh;->zzk(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 842
    .line 843
    .line 844
    goto/16 :goto_5

    .line 845
    .line 846
    :pswitch_2d
    const/4 v15, 0x0

    .line 847
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 848
    .line 849
    aget v4, v4, v10

    .line 850
    .line 851
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v8

    .line 855
    check-cast v8, Ljava/util/List;

    .line 856
    .line 857
    invoke-static {v4, v8, v2, v15}, Lcom/google/android/gms/internal/drive/zzmh;->zzf(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 858
    .line 859
    .line 860
    goto/16 :goto_5

    .line 861
    .line 862
    :pswitch_2e
    const/4 v15, 0x0

    .line 863
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 864
    .line 865
    aget v4, v4, v10

    .line 866
    .line 867
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v8

    .line 871
    check-cast v8, Ljava/util/List;

    .line 872
    .line 873
    invoke-static {v4, v8, v2, v15}, Lcom/google/android/gms/internal/drive/zzmh;->zzh(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 874
    .line 875
    .line 876
    goto/16 :goto_5

    .line 877
    .line 878
    :pswitch_2f
    const/4 v15, 0x0

    .line 879
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 880
    .line 881
    aget v4, v4, v10

    .line 882
    .line 883
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 884
    .line 885
    .line 886
    move-result-object v8

    .line 887
    check-cast v8, Ljava/util/List;

    .line 888
    .line 889
    invoke-static {v4, v8, v2, v15}, Lcom/google/android/gms/internal/drive/zzmh;->zzd(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 890
    .line 891
    .line 892
    goto/16 :goto_5

    .line 893
    .line 894
    :pswitch_30
    const/4 v15, 0x0

    .line 895
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 896
    .line 897
    aget v4, v4, v10

    .line 898
    .line 899
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v8

    .line 903
    check-cast v8, Ljava/util/List;

    .line 904
    .line 905
    invoke-static {v4, v8, v2, v15}, Lcom/google/android/gms/internal/drive/zzmh;->zzc(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 906
    .line 907
    .line 908
    goto/16 :goto_5

    .line 909
    .line 910
    :pswitch_31
    const/4 v15, 0x0

    .line 911
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 912
    .line 913
    aget v4, v4, v10

    .line 914
    .line 915
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v8

    .line 919
    check-cast v8, Ljava/util/List;

    .line 920
    .line 921
    invoke-static {v4, v8, v2, v15}, Lcom/google/android/gms/internal/drive/zzmh;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 922
    .line 923
    .line 924
    goto/16 :goto_5

    .line 925
    .line 926
    :pswitch_32
    const/4 v15, 0x0

    .line 927
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 928
    .line 929
    aget v4, v4, v10

    .line 930
    .line 931
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    move-result-object v8

    .line 935
    check-cast v8, Ljava/util/List;

    .line 936
    .line 937
    invoke-static {v4, v8, v2, v15}, Lcom/google/android/gms/internal/drive/zzmh;->zza(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 938
    .line 939
    .line 940
    goto/16 :goto_5

    .line 941
    .line 942
    :pswitch_33
    const/4 v15, 0x0

    .line 943
    and-int/2addr v4, v11

    .line 944
    if-eqz v4, :cond_6

    .line 945
    .line 946
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 947
    .line 948
    .line 949
    move-result-object v4

    .line 950
    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 951
    .line 952
    .line 953
    move-result-object v8

    .line 954
    invoke-interface {v2, v14, v4, v8}, Lcom/google/android/gms/internal/drive/zzns;->zzb(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzmf;)V

    .line 955
    .line 956
    .line 957
    goto/16 :goto_5

    .line 958
    .line 959
    :pswitch_34
    const/4 v15, 0x0

    .line 960
    and-int/2addr v4, v11

    .line 961
    if-eqz v4, :cond_6

    .line 962
    .line 963
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 964
    .line 965
    .line 966
    move-result-wide v12

    .line 967
    invoke-interface {v2, v14, v12, v13}, Lcom/google/android/gms/internal/drive/zzns;->zzb(IJ)V

    .line 968
    .line 969
    .line 970
    goto/16 :goto_5

    .line 971
    .line 972
    :pswitch_35
    const/4 v15, 0x0

    .line 973
    and-int/2addr v4, v11

    .line 974
    if-eqz v4, :cond_6

    .line 975
    .line 976
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 977
    .line 978
    .line 979
    move-result v4

    .line 980
    invoke-interface {v2, v14, v4}, Lcom/google/android/gms/internal/drive/zzns;->zze(II)V

    .line 981
    .line 982
    .line 983
    goto/16 :goto_5

    .line 984
    .line 985
    :pswitch_36
    const/4 v15, 0x0

    .line 986
    and-int/2addr v4, v11

    .line 987
    if-eqz v4, :cond_6

    .line 988
    .line 989
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 990
    .line 991
    .line 992
    move-result-wide v12

    .line 993
    invoke-interface {v2, v14, v12, v13}, Lcom/google/android/gms/internal/drive/zzns;->zzj(IJ)V

    .line 994
    .line 995
    .line 996
    goto/16 :goto_5

    .line 997
    .line 998
    :pswitch_37
    const/4 v15, 0x0

    .line 999
    and-int/2addr v4, v11

    .line 1000
    if-eqz v4, :cond_6

    .line 1001
    .line 1002
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1003
    .line 1004
    .line 1005
    move-result v4

    .line 1006
    invoke-interface {v2, v14, v4}, Lcom/google/android/gms/internal/drive/zzns;->zzm(II)V

    .line 1007
    .line 1008
    .line 1009
    goto/16 :goto_5

    .line 1010
    .line 1011
    :pswitch_38
    const/4 v15, 0x0

    .line 1012
    and-int/2addr v4, v11

    .line 1013
    if-eqz v4, :cond_6

    .line 1014
    .line 1015
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1016
    .line 1017
    .line 1018
    move-result v4

    .line 1019
    invoke-interface {v2, v14, v4}, Lcom/google/android/gms/internal/drive/zzns;->zzn(II)V

    .line 1020
    .line 1021
    .line 1022
    goto/16 :goto_5

    .line 1023
    .line 1024
    :pswitch_39
    const/4 v15, 0x0

    .line 1025
    and-int/2addr v4, v11

    .line 1026
    if-eqz v4, :cond_6

    .line 1027
    .line 1028
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1029
    .line 1030
    .line 1031
    move-result v4

    .line 1032
    invoke-interface {v2, v14, v4}, Lcom/google/android/gms/internal/drive/zzns;->zzd(II)V

    .line 1033
    .line 1034
    .line 1035
    goto/16 :goto_5

    .line 1036
    .line 1037
    :pswitch_3a
    const/4 v15, 0x0

    .line 1038
    and-int/2addr v4, v11

    .line 1039
    if-eqz v4, :cond_6

    .line 1040
    .line 1041
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v4

    .line 1045
    check-cast v4, Lcom/google/android/gms/internal/drive/zzjc;

    .line 1046
    .line 1047
    invoke-interface {v2, v14, v4}, Lcom/google/android/gms/internal/drive/zzns;->zza(ILcom/google/android/gms/internal/drive/zzjc;)V

    .line 1048
    .line 1049
    .line 1050
    goto/16 :goto_5

    .line 1051
    .line 1052
    :pswitch_3b
    const/4 v15, 0x0

    .line 1053
    and-int/2addr v4, v11

    .line 1054
    if-eqz v4, :cond_6

    .line 1055
    .line 1056
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v4

    .line 1060
    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v8

    .line 1064
    invoke-interface {v2, v14, v4, v8}, Lcom/google/android/gms/internal/drive/zzns;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzmf;)V

    .line 1065
    .line 1066
    .line 1067
    goto/16 :goto_5

    .line 1068
    .line 1069
    :pswitch_3c
    const/4 v15, 0x0

    .line 1070
    and-int/2addr v4, v11

    .line 1071
    if-eqz v4, :cond_6

    .line 1072
    .line 1073
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v4

    .line 1077
    invoke-static {v14, v4, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzns;)V

    .line 1078
    .line 1079
    .line 1080
    goto :goto_5

    .line 1081
    :pswitch_3d
    const/4 v15, 0x0

    .line 1082
    and-int/2addr v4, v11

    .line 1083
    if-eqz v4, :cond_6

    .line 1084
    .line 1085
    invoke-static {v1, v12, v13}, Lcom/google/android/gms/internal/drive/zznd;->zzl(Ljava/lang/Object;J)Z

    .line 1086
    .line 1087
    .line 1088
    move-result v4

    .line 1089
    invoke-interface {v2, v14, v4}, Lcom/google/android/gms/internal/drive/zzns;->zzb(IZ)V

    .line 1090
    .line 1091
    .line 1092
    goto :goto_5

    .line 1093
    :pswitch_3e
    const/4 v15, 0x0

    .line 1094
    and-int/2addr v4, v11

    .line 1095
    if-eqz v4, :cond_6

    .line 1096
    .line 1097
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1098
    .line 1099
    .line 1100
    move-result v4

    .line 1101
    invoke-interface {v2, v14, v4}, Lcom/google/android/gms/internal/drive/zzns;->zzf(II)V

    .line 1102
    .line 1103
    .line 1104
    goto :goto_5

    .line 1105
    :pswitch_3f
    const/4 v15, 0x0

    .line 1106
    and-int/2addr v4, v11

    .line 1107
    if-eqz v4, :cond_6

    .line 1108
    .line 1109
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1110
    .line 1111
    .line 1112
    move-result-wide v12

    .line 1113
    invoke-interface {v2, v14, v12, v13}, Lcom/google/android/gms/internal/drive/zzns;->zzc(IJ)V

    .line 1114
    .line 1115
    .line 1116
    goto :goto_5

    .line 1117
    :pswitch_40
    const/4 v15, 0x0

    .line 1118
    and-int/2addr v4, v11

    .line 1119
    if-eqz v4, :cond_6

    .line 1120
    .line 1121
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1122
    .line 1123
    .line 1124
    move-result v4

    .line 1125
    invoke-interface {v2, v14, v4}, Lcom/google/android/gms/internal/drive/zzns;->zzc(II)V

    .line 1126
    .line 1127
    .line 1128
    goto :goto_5

    .line 1129
    :pswitch_41
    const/4 v15, 0x0

    .line 1130
    and-int/2addr v4, v11

    .line 1131
    if-eqz v4, :cond_6

    .line 1132
    .line 1133
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1134
    .line 1135
    .line 1136
    move-result-wide v12

    .line 1137
    invoke-interface {v2, v14, v12, v13}, Lcom/google/android/gms/internal/drive/zzns;->zza(IJ)V

    .line 1138
    .line 1139
    .line 1140
    goto :goto_5

    .line 1141
    :pswitch_42
    const/4 v15, 0x0

    .line 1142
    and-int/2addr v4, v11

    .line 1143
    if-eqz v4, :cond_6

    .line 1144
    .line 1145
    invoke-virtual {v7, v1, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1146
    .line 1147
    .line 1148
    move-result-wide v12

    .line 1149
    invoke-interface {v2, v14, v12, v13}, Lcom/google/android/gms/internal/drive/zzns;->zzi(IJ)V

    .line 1150
    .line 1151
    .line 1152
    goto :goto_5

    .line 1153
    :pswitch_43
    const/4 v15, 0x0

    .line 1154
    and-int/2addr v4, v11

    .line 1155
    if-eqz v4, :cond_6

    .line 1156
    .line 1157
    invoke-static {v1, v12, v13}, Lcom/google/android/gms/internal/drive/zznd;->zzm(Ljava/lang/Object;J)F

    .line 1158
    .line 1159
    .line 1160
    move-result v4

    .line 1161
    invoke-interface {v2, v14, v4}, Lcom/google/android/gms/internal/drive/zzns;->zza(IF)V

    .line 1162
    .line 1163
    .line 1164
    goto :goto_5

    .line 1165
    :pswitch_44
    const/4 v15, 0x0

    .line 1166
    and-int/2addr v4, v11

    .line 1167
    if-eqz v4, :cond_6

    .line 1168
    .line 1169
    invoke-static {v1, v12, v13}, Lcom/google/android/gms/internal/drive/zznd;->zzn(Ljava/lang/Object;J)D

    .line 1170
    .line 1171
    .line 1172
    move-result-wide v12

    .line 1173
    invoke-interface {v2, v14, v12, v13}, Lcom/google/android/gms/internal/drive/zzns;->zza(ID)V

    .line 1174
    .line 1175
    .line 1176
    :cond_6
    :goto_5
    add-int/lit8 v10, v10, 0x3

    .line 1177
    .line 1178
    goto/16 :goto_1

    .line 1179
    .line 1180
    :cond_7
    :goto_6
    if-eqz v5, :cond_9

    .line 1181
    .line 1182
    iget-object v4, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 1183
    .line 1184
    invoke-virtual {v4, v2, v5}, Lcom/google/android/gms/internal/drive/zzjy;->zza(Lcom/google/android/gms/internal/drive/zzns;Ljava/util/Map$Entry;)V

    .line 1185
    .line 1186
    .line 1187
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1188
    .line 1189
    .line 1190
    move-result v4

    .line 1191
    if-eqz v4, :cond_8

    .line 1192
    .line 1193
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v4

    .line 1197
    check-cast v4, Ljava/util/Map$Entry;

    .line 1198
    .line 1199
    move-object v5, v4

    .line 1200
    goto :goto_6

    .line 1201
    :cond_8
    const/4 v5, 0x0

    .line 1202
    goto :goto_6

    .line 1203
    :cond_9
    iget-object v0, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzur:Lcom/google/android/gms/internal/drive/zzmx;

    .line 1204
    .line 1205
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Lcom/google/android/gms/internal/drive/zzmx;Ljava/lang/Object;Lcom/google/android/gms/internal/drive/zzns;)V

    .line 1206
    .line 1207
    .line 1208
    return-void

    .line 1209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final zzb(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)V"
        }
    .end annotation

    .line 1209
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/drive/zzlu;->zzas(I)I

    move-result v0

    .line 1210
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    aget v1, v1, p3

    const v2, 0xfffff

    and-int/2addr v0, v2

    int-to-long v2, v0

    .line 1211
    invoke-direct {p0, p2, v1, p3}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1212
    :cond_0
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    .line 1213
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    .line 1214
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/drive/zzkm;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 1215
    invoke-static {p1, v2, v3, p2}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 1216
    invoke-direct {p0, p1, v1, p3}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;II)V

    return-void

    :cond_1
    if-eqz p2, :cond_2

    .line 1217
    invoke-static {p1, v2, v3, p2}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 1218
    invoke-direct {p0, p1, v1, p3}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;II)V

    :cond_2
    :goto_0
    return-void
.end method

.method private final zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)Z"
        }
    .end annotation

    .line 407
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    move-result p1

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    move-result p0

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static zzd(Ljava/lang/Object;J)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "J)",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation

    .line 69
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static zze(Ljava/lang/Object;J)D
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)D"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Double;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method private static zzf(Ljava/lang/Object;J)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)F"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Float;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static zzg(Ljava/lang/Object;J)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)I"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static zzh(Ljava/lang/Object;J)J
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)J"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Long;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method private static zzi(Ljava/lang/Object;J)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)Z"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static zzo(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzmy;
    .locals 2

    .line 1
    check-cast p0, Lcom/google/android/gms/internal/drive/zzkk;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzkk;->zzrq:Lcom/google/android/gms/internal/drive/zzmy;

    .line 4
    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzmy;->zzfa()Lcom/google/android/gms/internal/drive/zzmy;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzmy;->zzfb()Lcom/google/android/gms/internal/drive/zzmy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/google/android/gms/internal/drive/zzkk;->zzrq:Lcom/google/android/gms/internal/drive/zzmy;

    .line 16
    .line 17
    :cond_0
    return-object v0
.end method

.method private final zzp(II)I
    .locals 1

    .line 274
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzuf:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzug:I

    if-gt p1, v0, :cond_0

    .line 275
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzlu;->zzq(II)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method private final zzq(II)I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    div-int/lit8 v0, v0, 0x3

    .line 5
    .line 6
    add-int/lit8 v0, v0, -0x1

    .line 7
    .line 8
    :goto_0
    if-gt p2, v0, :cond_2

    .line 9
    .line 10
    add-int v1, v0, p2

    .line 11
    .line 12
    ushr-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    mul-int/lit8 v2, v1, 0x3

    .line 15
    .line 16
    iget-object v3, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 17
    .line 18
    aget v3, v3, v2

    .line 19
    .line 20
    if-ne p1, v3, :cond_0

    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    if-ge p1, v3, :cond_1

    .line 24
    .line 25
    add-int/lit8 v0, v1, -0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    add-int/lit8 p2, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const/4 p0, -0x1

    .line 32
    return p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    const/4 v3, 0x1

    .line 7
    if-ge v2, v0, :cond_3

    .line 8
    .line 9
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzas(I)I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    const v5, 0xfffff

    .line 14
    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    int-to-long v6, v6

    .line 19
    const/high16 v8, 0xff00000

    .line 20
    .line 21
    and-int/2addr v4, v8

    .line 22
    ushr-int/lit8 v4, v4, 0x14

    .line 23
    .line 24
    packed-switch v4, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :pswitch_0
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzat(I)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    and-int/2addr v4, v5

    .line 34
    int-to-long v4, v4

    .line 35
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-ne v8, v4, :cond_0

    .line 44
    .line 45
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzd(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_1

    .line 58
    .line 59
    :cond_0
    :goto_1
    move v3, v1

    .line 60
    goto/16 :goto_2

    .line 61
    .line 62
    :pswitch_1
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzd(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    goto/16 :goto_2

    .line 75
    .line 76
    :pswitch_2
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzd(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    goto/16 :goto_2

    .line 89
    .line 90
    :pswitch_3
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_0

    .line 95
    .line 96
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzd(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-nez v4, :cond_1

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :pswitch_4
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_0

    .line 116
    .line 117
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 118
    .line 119
    .line 120
    move-result-wide v4

    .line 121
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 122
    .line 123
    .line 124
    move-result-wide v6

    .line 125
    cmp-long v4, v4, v6

    .line 126
    .line 127
    if-eqz v4, :cond_1

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :pswitch_5
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-eqz v4, :cond_0

    .line 135
    .line 136
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-eq v4, v5, :cond_1

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :pswitch_6
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-eqz v4, :cond_0

    .line 152
    .line 153
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 154
    .line 155
    .line 156
    move-result-wide v4

    .line 157
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 158
    .line 159
    .line 160
    move-result-wide v6

    .line 161
    cmp-long v4, v4, v6

    .line 162
    .line 163
    if-eqz v4, :cond_1

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :pswitch_7
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    if-eqz v4, :cond_0

    .line 171
    .line 172
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-eq v4, v5, :cond_1

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :pswitch_8
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    if-eqz v4, :cond_0

    .line 188
    .line 189
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    if-eq v4, v5, :cond_1

    .line 198
    .line 199
    goto/16 :goto_1

    .line 200
    .line 201
    :pswitch_9
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    if-eqz v4, :cond_0

    .line 206
    .line 207
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    if-eq v4, v5, :cond_1

    .line 216
    .line 217
    goto/16 :goto_1

    .line 218
    .line 219
    :pswitch_a
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-eqz v4, :cond_0

    .line 224
    .line 225
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzd(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    if-nez v4, :cond_1

    .line 238
    .line 239
    goto/16 :goto_1

    .line 240
    .line 241
    :pswitch_b
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    if-eqz v4, :cond_0

    .line 246
    .line 247
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzd(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    if-nez v4, :cond_1

    .line 260
    .line 261
    goto/16 :goto_1

    .line 262
    .line 263
    :pswitch_c
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    if-eqz v4, :cond_0

    .line 268
    .line 269
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzd(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    if-nez v4, :cond_1

    .line 282
    .line 283
    goto/16 :goto_1

    .line 284
    .line 285
    :pswitch_d
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    if-eqz v4, :cond_0

    .line 290
    .line 291
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzl(Ljava/lang/Object;J)Z

    .line 292
    .line 293
    .line 294
    move-result v4

    .line 295
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzl(Ljava/lang/Object;J)Z

    .line 296
    .line 297
    .line 298
    move-result v5

    .line 299
    if-eq v4, v5, :cond_1

    .line 300
    .line 301
    goto/16 :goto_1

    .line 302
    .line 303
    :pswitch_e
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    if-eqz v4, :cond_0

    .line 308
    .line 309
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 310
    .line 311
    .line 312
    move-result v4

    .line 313
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 314
    .line 315
    .line 316
    move-result v5

    .line 317
    if-eq v4, v5, :cond_1

    .line 318
    .line 319
    goto/16 :goto_1

    .line 320
    .line 321
    :pswitch_f
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 322
    .line 323
    .line 324
    move-result v4

    .line 325
    if-eqz v4, :cond_0

    .line 326
    .line 327
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 328
    .line 329
    .line 330
    move-result-wide v4

    .line 331
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 332
    .line 333
    .line 334
    move-result-wide v6

    .line 335
    cmp-long v4, v4, v6

    .line 336
    .line 337
    if-eqz v4, :cond_1

    .line 338
    .line 339
    goto/16 :goto_1

    .line 340
    .line 341
    :pswitch_10
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 342
    .line 343
    .line 344
    move-result v4

    .line 345
    if-eqz v4, :cond_0

    .line 346
    .line 347
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 348
    .line 349
    .line 350
    move-result v4

    .line 351
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 352
    .line 353
    .line 354
    move-result v5

    .line 355
    if-eq v4, v5, :cond_1

    .line 356
    .line 357
    goto/16 :goto_1

    .line 358
    .line 359
    :pswitch_11
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    if-eqz v4, :cond_0

    .line 364
    .line 365
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 366
    .line 367
    .line 368
    move-result-wide v4

    .line 369
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 370
    .line 371
    .line 372
    move-result-wide v6

    .line 373
    cmp-long v4, v4, v6

    .line 374
    .line 375
    if-eqz v4, :cond_1

    .line 376
    .line 377
    goto/16 :goto_1

    .line 378
    .line 379
    :pswitch_12
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 380
    .line 381
    .line 382
    move-result v4

    .line 383
    if-eqz v4, :cond_0

    .line 384
    .line 385
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 386
    .line 387
    .line 388
    move-result-wide v4

    .line 389
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 390
    .line 391
    .line 392
    move-result-wide v6

    .line 393
    cmp-long v4, v4, v6

    .line 394
    .line 395
    if-eqz v4, :cond_1

    .line 396
    .line 397
    goto/16 :goto_1

    .line 398
    .line 399
    :pswitch_13
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    if-eqz v4, :cond_0

    .line 404
    .line 405
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzm(Ljava/lang/Object;J)F

    .line 406
    .line 407
    .line 408
    move-result v4

    .line 409
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 410
    .line 411
    .line 412
    move-result v4

    .line 413
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzm(Ljava/lang/Object;J)F

    .line 414
    .line 415
    .line 416
    move-result v5

    .line 417
    invoke-static {v5}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 418
    .line 419
    .line 420
    move-result v5

    .line 421
    if-eq v4, v5, :cond_1

    .line 422
    .line 423
    goto/16 :goto_1

    .line 424
    .line 425
    :pswitch_14
    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/drive/zzlu;->zzc(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 426
    .line 427
    .line 428
    move-result v4

    .line 429
    if-eqz v4, :cond_0

    .line 430
    .line 431
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzn(Ljava/lang/Object;J)D

    .line 432
    .line 433
    .line 434
    move-result-wide v4

    .line 435
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 436
    .line 437
    .line 438
    move-result-wide v4

    .line 439
    invoke-static {p2, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzn(Ljava/lang/Object;J)D

    .line 440
    .line 441
    .line 442
    move-result-wide v6

    .line 443
    invoke-static {v6, v7}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 444
    .line 445
    .line 446
    move-result-wide v6

    .line 447
    cmp-long v4, v4, v6

    .line 448
    .line 449
    if-eqz v4, :cond_1

    .line 450
    .line 451
    goto/16 :goto_1

    .line 452
    .line 453
    :cond_1
    :goto_2
    if-nez v3, :cond_2

    .line 454
    .line 455
    return v1

    .line 456
    :cond_2
    add-int/lit8 v2, v2, 0x3

    .line 457
    .line 458
    goto/16 :goto_0

    .line 459
    .line 460
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzur:Lcom/google/android/gms/internal/drive/zzmx;

    .line 461
    .line 462
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/drive/zzmx;->zzr(Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzur:Lcom/google/android/gms/internal/drive/zzmx;

    .line 467
    .line 468
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/drive/zzmx;->zzr(Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    if-nez v0, :cond_4

    .line 477
    .line 478
    return v1

    .line 479
    :cond_4
    iget-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzui:Z

    .line 480
    .line 481
    if-eqz v0, :cond_5

    .line 482
    .line 483
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 484
    .line 485
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/drive/zzjy;->zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzkb;

    .line 486
    .line 487
    .line 488
    move-result-object p1

    .line 489
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 490
    .line 491
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/drive/zzjy;->zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzkb;

    .line 492
    .line 493
    .line 494
    move-result-object p0

    .line 495
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/drive/zzkb;->equals(Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    move-result p0

    .line 499
    return p0

    .line 500
    :cond_5
    return v3

    .line 501
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final hashCode(Ljava/lang/Object;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zzas(I)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    iget-object v4, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 13
    .line 14
    aget v4, v4, v1

    .line 15
    .line 16
    const v5, 0xfffff

    .line 17
    .line 18
    .line 19
    and-int/2addr v5, v3

    .line 20
    int-to-long v5, v5

    .line 21
    const/high16 v7, 0xff00000

    .line 22
    .line 23
    and-int/2addr v3, v7

    .line 24
    ushr-int/lit8 v3, v3, 0x14

    .line 25
    .line 26
    const/16 v7, 0x25

    .line 27
    .line 28
    packed-switch v3, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    goto/16 :goto_4

    .line 32
    .line 33
    :pswitch_0
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    mul-int/lit8 v2, v2, 0x35

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    :goto_1
    add-int/2addr v3, v2

    .line 50
    move v2, v3

    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :pswitch_1
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    mul-int/lit8 v2, v2, 0x35

    .line 60
    .line 61
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v3

    .line 65
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzkm;->zzu(J)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    goto :goto_1

    .line 70
    :pswitch_2
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_1

    .line 75
    .line 76
    mul-int/lit8 v2, v2, 0x35

    .line 77
    .line 78
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    :goto_2
    add-int/2addr v2, v3

    .line 83
    goto/16 :goto_4

    .line 84
    .line 85
    :pswitch_3
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_1

    .line 90
    .line 91
    mul-int/lit8 v2, v2, 0x35

    .line 92
    .line 93
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzkm;->zzu(J)I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    goto :goto_1

    .line 102
    :pswitch_4
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_1

    .line 107
    .line 108
    mul-int/lit8 v2, v2, 0x35

    .line 109
    .line 110
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    goto :goto_2

    .line 115
    :pswitch_5
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-eqz v3, :cond_1

    .line 120
    .line 121
    mul-int/lit8 v2, v2, 0x35

    .line 122
    .line 123
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    goto :goto_2

    .line 128
    :pswitch_6
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_1

    .line 133
    .line 134
    mul-int/lit8 v2, v2, 0x35

    .line 135
    .line 136
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    goto :goto_2

    .line 141
    :pswitch_7
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-eqz v3, :cond_1

    .line 146
    .line 147
    mul-int/lit8 v2, v2, 0x35

    .line 148
    .line 149
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    goto :goto_1

    .line 158
    :pswitch_8
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-eqz v3, :cond_1

    .line 163
    .line 164
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    mul-int/lit8 v2, v2, 0x35

    .line 169
    .line 170
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    goto :goto_1

    .line 175
    :pswitch_9
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_1

    .line 180
    .line 181
    mul-int/lit8 v2, v2, 0x35

    .line 182
    .line 183
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    check-cast v3, Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    goto/16 :goto_1

    .line 194
    .line 195
    :pswitch_a
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    if-eqz v3, :cond_1

    .line 200
    .line 201
    mul-int/lit8 v2, v2, 0x35

    .line 202
    .line 203
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zzlu;->zzi(Ljava/lang/Object;J)Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    invoke-static {v3}, Lcom/google/android/gms/internal/drive/zzkm;->zze(Z)I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    goto/16 :goto_1

    .line 212
    .line 213
    :pswitch_b
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-eqz v3, :cond_1

    .line 218
    .line 219
    mul-int/lit8 v2, v2, 0x35

    .line 220
    .line 221
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    goto/16 :goto_2

    .line 226
    .line 227
    :pswitch_c
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    if-eqz v3, :cond_1

    .line 232
    .line 233
    mul-int/lit8 v2, v2, 0x35

    .line 234
    .line 235
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 236
    .line 237
    .line 238
    move-result-wide v3

    .line 239
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzkm;->zzu(J)I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    goto/16 :goto_1

    .line 244
    .line 245
    :pswitch_d
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    if-eqz v3, :cond_1

    .line 250
    .line 251
    mul-int/lit8 v2, v2, 0x35

    .line 252
    .line 253
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    goto/16 :goto_2

    .line 258
    .line 259
    :pswitch_e
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    if-eqz v3, :cond_1

    .line 264
    .line 265
    mul-int/lit8 v2, v2, 0x35

    .line 266
    .line 267
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 268
    .line 269
    .line 270
    move-result-wide v3

    .line 271
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzkm;->zzu(J)I

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    goto/16 :goto_1

    .line 276
    .line 277
    :pswitch_f
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    if-eqz v3, :cond_1

    .line 282
    .line 283
    mul-int/lit8 v2, v2, 0x35

    .line 284
    .line 285
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 286
    .line 287
    .line 288
    move-result-wide v3

    .line 289
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzkm;->zzu(J)I

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    goto/16 :goto_1

    .line 294
    .line 295
    :pswitch_10
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    if-eqz v3, :cond_1

    .line 300
    .line 301
    mul-int/lit8 v2, v2, 0x35

    .line 302
    .line 303
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zzlu;->zzf(Ljava/lang/Object;J)F

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    goto/16 :goto_1

    .line 312
    .line 313
    :pswitch_11
    invoke-direct {p0, p1, v4, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    if-eqz v3, :cond_1

    .line 318
    .line 319
    mul-int/lit8 v2, v2, 0x35

    .line 320
    .line 321
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zzlu;->zze(Ljava/lang/Object;J)D

    .line 322
    .line 323
    .line 324
    move-result-wide v3

    .line 325
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 326
    .line 327
    .line 328
    move-result-wide v3

    .line 329
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzkm;->zzu(J)I

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    goto/16 :goto_1

    .line 334
    .line 335
    :pswitch_12
    mul-int/lit8 v2, v2, 0x35

    .line 336
    .line 337
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    goto/16 :goto_1

    .line 346
    .line 347
    :pswitch_13
    mul-int/lit8 v2, v2, 0x35

    .line 348
    .line 349
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    goto/16 :goto_1

    .line 358
    .line 359
    :pswitch_14
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    if-eqz v3, :cond_0

    .line 364
    .line 365
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 366
    .line 367
    .line 368
    move-result v7

    .line 369
    :cond_0
    :goto_3
    mul-int/lit8 v2, v2, 0x35

    .line 370
    .line 371
    add-int/2addr v2, v7

    .line 372
    goto/16 :goto_4

    .line 373
    .line 374
    :pswitch_15
    mul-int/lit8 v2, v2, 0x35

    .line 375
    .line 376
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 377
    .line 378
    .line 379
    move-result-wide v3

    .line 380
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzkm;->zzu(J)I

    .line 381
    .line 382
    .line 383
    move-result v3

    .line 384
    goto/16 :goto_1

    .line 385
    .line 386
    :pswitch_16
    mul-int/lit8 v2, v2, 0x35

    .line 387
    .line 388
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 389
    .line 390
    .line 391
    move-result v3

    .line 392
    goto/16 :goto_2

    .line 393
    .line 394
    :pswitch_17
    mul-int/lit8 v2, v2, 0x35

    .line 395
    .line 396
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 397
    .line 398
    .line 399
    move-result-wide v3

    .line 400
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzkm;->zzu(J)I

    .line 401
    .line 402
    .line 403
    move-result v3

    .line 404
    goto/16 :goto_1

    .line 405
    .line 406
    :pswitch_18
    mul-int/lit8 v2, v2, 0x35

    .line 407
    .line 408
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 409
    .line 410
    .line 411
    move-result v3

    .line 412
    goto/16 :goto_2

    .line 413
    .line 414
    :pswitch_19
    mul-int/lit8 v2, v2, 0x35

    .line 415
    .line 416
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    goto/16 :goto_2

    .line 421
    .line 422
    :pswitch_1a
    mul-int/lit8 v2, v2, 0x35

    .line 423
    .line 424
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 425
    .line 426
    .line 427
    move-result v3

    .line 428
    goto/16 :goto_2

    .line 429
    .line 430
    :pswitch_1b
    mul-int/lit8 v2, v2, 0x35

    .line 431
    .line 432
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v3

    .line 436
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 437
    .line 438
    .line 439
    move-result v3

    .line 440
    goto/16 :goto_1

    .line 441
    .line 442
    :pswitch_1c
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    if-eqz v3, :cond_0

    .line 447
    .line 448
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 449
    .line 450
    .line 451
    move-result v7

    .line 452
    goto :goto_3

    .line 453
    :pswitch_1d
    mul-int/lit8 v2, v2, 0x35

    .line 454
    .line 455
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v3

    .line 459
    check-cast v3, Ljava/lang/String;

    .line 460
    .line 461
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 462
    .line 463
    .line 464
    move-result v3

    .line 465
    goto/16 :goto_1

    .line 466
    .line 467
    :pswitch_1e
    mul-int/lit8 v2, v2, 0x35

    .line 468
    .line 469
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzl(Ljava/lang/Object;J)Z

    .line 470
    .line 471
    .line 472
    move-result v3

    .line 473
    invoke-static {v3}, Lcom/google/android/gms/internal/drive/zzkm;->zze(Z)I

    .line 474
    .line 475
    .line 476
    move-result v3

    .line 477
    goto/16 :goto_1

    .line 478
    .line 479
    :pswitch_1f
    mul-int/lit8 v2, v2, 0x35

    .line 480
    .line 481
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    goto/16 :goto_2

    .line 486
    .line 487
    :pswitch_20
    mul-int/lit8 v2, v2, 0x35

    .line 488
    .line 489
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 490
    .line 491
    .line 492
    move-result-wide v3

    .line 493
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzkm;->zzu(J)I

    .line 494
    .line 495
    .line 496
    move-result v3

    .line 497
    goto/16 :goto_1

    .line 498
    .line 499
    :pswitch_21
    mul-int/lit8 v2, v2, 0x35

    .line 500
    .line 501
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    goto/16 :goto_2

    .line 506
    .line 507
    :pswitch_22
    mul-int/lit8 v2, v2, 0x35

    .line 508
    .line 509
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 510
    .line 511
    .line 512
    move-result-wide v3

    .line 513
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzkm;->zzu(J)I

    .line 514
    .line 515
    .line 516
    move-result v3

    .line 517
    goto/16 :goto_1

    .line 518
    .line 519
    :pswitch_23
    mul-int/lit8 v2, v2, 0x35

    .line 520
    .line 521
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 522
    .line 523
    .line 524
    move-result-wide v3

    .line 525
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzkm;->zzu(J)I

    .line 526
    .line 527
    .line 528
    move-result v3

    .line 529
    goto/16 :goto_1

    .line 530
    .line 531
    :pswitch_24
    mul-int/lit8 v2, v2, 0x35

    .line 532
    .line 533
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzm(Ljava/lang/Object;J)F

    .line 534
    .line 535
    .line 536
    move-result v3

    .line 537
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 538
    .line 539
    .line 540
    move-result v3

    .line 541
    goto/16 :goto_1

    .line 542
    .line 543
    :pswitch_25
    mul-int/lit8 v2, v2, 0x35

    .line 544
    .line 545
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzn(Ljava/lang/Object;J)D

    .line 546
    .line 547
    .line 548
    move-result-wide v3

    .line 549
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 550
    .line 551
    .line 552
    move-result-wide v3

    .line 553
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzkm;->zzu(J)I

    .line 554
    .line 555
    .line 556
    move-result v3

    .line 557
    goto/16 :goto_1

    .line 558
    .line 559
    :cond_1
    :goto_4
    add-int/lit8 v1, v1, 0x3

    .line 560
    .line 561
    goto/16 :goto_0

    .line 562
    .line 563
    :cond_2
    mul-int/lit8 v2, v2, 0x35

    .line 564
    .line 565
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzur:Lcom/google/android/gms/internal/drive/zzmx;

    .line 566
    .line 567
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/drive/zzmx;->zzr(Ljava/lang/Object;)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 572
    .line 573
    .line 574
    move-result v0

    .line 575
    add-int/2addr v0, v2

    .line 576
    iget-boolean v1, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzui:Z

    .line 577
    .line 578
    if-eqz v1, :cond_3

    .line 579
    .line 580
    mul-int/lit8 v0, v0, 0x35

    .line 581
    .line 582
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 583
    .line 584
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/drive/zzjy;->zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzkb;

    .line 585
    .line 586
    .line 587
    move-result-object p0

    .line 588
    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzkb;->hashCode()I

    .line 589
    .line 590
    .line 591
    move-result p0

    .line 592
    add-int/2addr v0, p0

    .line 593
    :cond_3
    return v0

    .line 594
    nop

    .line 595
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final newInstance()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzup:Lcom/google/android/gms/internal/drive/zzly;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzuh:Lcom/google/android/gms/internal/drive/zzlq;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/drive/zzly;->newInstance(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final zza(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/drive/zziz;)I
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;[BIII",
            "Lcom/google/android/gms/internal/drive/zziz;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v4, p4

    move/from16 v15, p5

    move-object/from16 v5, p6

    .line 3001
    sget-object v8, Lcom/google/android/gms/internal/drive/zzlu;->zzuc:Lsun/misc/Unsafe;

    const/16 v16, 0x0

    move/from16 v3, p3

    move/from16 v7, v16

    move v11, v7

    move v12, v11

    const/4 v6, -0x1

    const/4 v10, -0x1

    :goto_0
    const v17, 0xfffff

    if-ge v3, v4, :cond_22

    add-int/lit8 v12, v3, 0x1

    .line 3002
    aget-byte v3, v2, v3

    if-gez v3, :cond_0

    .line 3003
    invoke-static {v3, v2, v12, v5}, Lcom/google/android/gms/internal/drive/zziy;->zza(I[BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v12

    .line 3004
    iget v3, v5, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    :cond_0
    move/from16 v26, v12

    move v12, v3

    move/from16 v3, v26

    ushr-int/lit8 v13, v12, 0x3

    move v14, v7

    and-int/lit8 v7, v12, 0x7

    const/4 v9, 0x3

    if-le v13, v6, :cond_1

    .line 3005
    div-int/lit8 v6, v14, 0x3

    invoke-direct {v0, v13, v6}, Lcom/google/android/gms/internal/drive/zzlu;->zzp(II)I

    move-result v6

    :goto_1
    move v14, v6

    const/4 v6, -0x1

    goto :goto_2

    .line 3006
    :cond_1
    invoke-direct {v0, v13}, Lcom/google/android/gms/internal/drive/zzlu;->zzau(I)I

    move-result v6

    goto :goto_1

    :goto_2
    if-ne v14, v6, :cond_2

    move-object v9, v1

    move v2, v3

    move-object/from16 v25, v8

    move v6, v13

    move/from16 v7, v16

    move-object v8, v0

    move v0, v12

    goto/16 :goto_17

    .line 3007
    :cond_2
    iget-object v6, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    add-int/lit8 v19, v14, 0x1

    aget v9, v6, v19

    const/high16 v19, 0xff00000

    and-int v19, v9, v19

    ushr-int/lit8 v2, v19, 0x14

    move/from16 v19, v3

    and-int v3, v9, v17

    move/from16 v20, v12

    move/from16 v21, v13

    int-to-long v12, v3

    const/16 v3, 0x11

    if-gt v2, v3, :cond_13

    add-int/lit8 v3, v14, 0x2

    .line 3008
    aget v3, v6, v3

    ushr-int/lit8 v6, v3, 0x14

    const/4 v4, 0x1

    shl-int v22, v4, v6

    and-int v3, v3, v17

    const/4 v6, -0x1

    if-eq v3, v10, :cond_4

    if-eq v10, v6, :cond_3

    int-to-long v4, v10

    .line 3009
    invoke-virtual {v8, v1, v4, v5, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_3
    int-to-long v4, v3

    .line 3010
    invoke-virtual {v8, v1, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    move v10, v3

    move v11, v4

    :cond_4
    const/4 v3, 0x5

    packed-switch v2, :pswitch_data_0

    move-object/from16 v13, p6

    move-object v4, v8

    move/from16 v9, v19

    move/from16 v12, v20

    move-object/from16 v8, p2

    move/from16 v19, v6

    goto/16 :goto_11

    :pswitch_0
    const/4 v2, 0x3

    if-ne v7, v2, :cond_6

    shl-int/lit8 v2, v21, 0x3

    or-int/lit8 v2, v2, 0x4

    move/from16 v18, v6

    move v6, v2

    .line 3011
    invoke-direct {v0, v14}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    move-result-object v2

    move-object/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v7, p6

    move/from16 v4, v19

    move/from16 v19, v18

    .line 3012
    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/drive/zziy;->zza(Lcom/google/android/gms/internal/drive/zzmf;[BIIILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    move-object v9, v3

    move-object v3, v7

    and-int v4, v11, v22

    if-nez v4, :cond_5

    .line 3013
    iget-object v4, v3, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    invoke-virtual {v8, v1, v12, v13, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_3

    .line 3014
    :cond_5
    invoke-virtual {v8, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, v3, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    .line 3015
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/drive/zzkm;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 3016
    invoke-virtual {v8, v1, v12, v13, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_3
    or-int v11, v11, v22

    move/from16 v4, p4

    move-object v5, v3

    move v7, v14

    move/from16 v12, v20

    move/from16 v6, v21

    move v3, v2

    move-object v2, v9

    goto/16 :goto_0

    :cond_6
    move/from16 v2, v19

    move/from16 v19, v6

    move-object/from16 v13, p6

    move v9, v2

    move-object v4, v8

    move/from16 v12, v20

    move-object/from16 v8, p2

    goto/16 :goto_11

    :pswitch_1
    move-object/from16 v9, p2

    move-object/from16 v3, p6

    move/from16 v2, v19

    move/from16 v19, v6

    if-nez v7, :cond_7

    .line 3017
    invoke-static {v9, v2, v3}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v7

    .line 3018
    iget-wide v4, v3, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    .line 3019
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/drive/zzjo;->zzk(J)J

    move-result-wide v5

    move-wide/from16 v26, v12

    move-object v13, v3

    move-wide/from16 v3, v26

    move-object v2, v1

    move-object v1, v8

    move/from16 v8, p4

    .line 3020
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object v4, v1

    move-object v1, v2

    or-int v11, v11, v22

    move v2, v8

    move-object v8, v4

    move v4, v2

    move v3, v7

    :goto_4
    move-object v2, v9

    move-object v5, v13

    move v7, v14

    move/from16 v12, v20

    :goto_5
    move/from16 v6, v21

    goto/16 :goto_0

    :cond_7
    move-object v13, v3

    move-object v4, v8

    move/from16 v8, p4

    :cond_8
    move-object v8, v9

    move/from16 v12, v20

    :cond_9
    :goto_6
    move v9, v2

    goto/16 :goto_11

    :pswitch_2
    move-object/from16 v9, p2

    move-object v4, v8

    move/from16 v2, v19

    move/from16 v8, p4

    move/from16 v19, v6

    move-wide v5, v12

    move-object/from16 v13, p6

    if-nez v7, :cond_8

    .line 3021
    invoke-static {v9, v2, v13}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v3

    .line 3022
    iget v2, v13, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    .line 3023
    invoke-static {v2}, Lcom/google/android/gms/internal/drive/zzjo;->zzw(I)I

    move-result v2

    .line 3024
    invoke-virtual {v4, v1, v5, v6, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    or-int v11, v11, v22

    move v2, v8

    move-object v8, v4

    move v4, v2

    goto :goto_4

    :pswitch_3
    move-object/from16 v9, p2

    move-object v4, v8

    move/from16 v2, v19

    move/from16 v8, p4

    move/from16 v19, v6

    move-wide v5, v12

    move-object/from16 v13, p6

    if-nez v7, :cond_c

    .line 3025
    invoke-static {v9, v2, v13}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v3

    .line 3026
    iget v2, v13, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    .line 3027
    invoke-direct {v0, v14}, Lcom/google/android/gms/internal/drive/zzlu;->zzar(I)Lcom/google/android/gms/internal/drive/zzko;

    move-result-object v7

    if-eqz v7, :cond_a

    .line 3028
    invoke-interface {v7, v2}, Lcom/google/android/gms/internal/drive/zzko;->zzan(I)Z

    move-result v7

    if-eqz v7, :cond_b

    :cond_a
    move/from16 v12, v20

    goto :goto_8

    .line 3029
    :cond_b
    invoke-static {v1}, Lcom/google/android/gms/internal/drive/zzlu;->zzo(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzmy;

    move-result-object v5

    int-to-long v6, v2

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move/from16 v12, v20

    invoke-virtual {v5, v12, v2}, Lcom/google/android/gms/internal/drive/zzmy;->zzb(ILjava/lang/Object;)V

    :goto_7
    move v2, v8

    move-object v8, v4

    move v4, v2

    move-object v2, v9

    move-object v5, v13

    move v7, v14

    goto :goto_5

    .line 3030
    :goto_8
    invoke-virtual {v4, v1, v5, v6, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_9
    or-int v11, v11, v22

    goto :goto_7

    :cond_c
    move/from16 v12, v20

    :cond_d
    move-object v8, v9

    goto :goto_6

    :pswitch_4
    move-object/from16 v9, p2

    move-object v4, v8

    move/from16 v2, v19

    const/4 v3, 0x2

    move/from16 v8, p4

    move/from16 v19, v6

    move-wide v5, v12

    move/from16 v12, v20

    move-object/from16 v13, p6

    if-ne v7, v3, :cond_d

    .line 3031
    invoke-static {v9, v2, v13}, Lcom/google/android/gms/internal/drive/zziy;->zze([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v3

    .line 3032
    iget-object v2, v13, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    invoke-virtual {v4, v1, v5, v6, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_9

    :pswitch_5
    move-object/from16 v9, p2

    move-object v4, v8

    move/from16 v2, v19

    const/4 v3, 0x2

    move/from16 v8, p4

    move/from16 v19, v6

    move-wide v5, v12

    move/from16 v12, v20

    move-object/from16 v13, p6

    if-ne v7, v3, :cond_d

    .line 3033
    invoke-direct {v0, v14}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    move-result-object v3

    .line 3034
    invoke-static {v3, v9, v2, v8, v13}, Lcom/google/android/gms/internal/drive/zziy;->zza(Lcom/google/android/gms/internal/drive/zzmf;[BIILcom/google/android/gms/internal/drive/zziz;)I

    move-result v3

    and-int v2, v11, v22

    if-nez v2, :cond_e

    .line 3035
    iget-object v2, v13, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    invoke-virtual {v4, v1, v5, v6, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_9

    .line 3036
    :cond_e
    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    iget-object v7, v13, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    .line 3037
    invoke-static {v2, v7}, Lcom/google/android/gms/internal/drive/zzkm;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 3038
    invoke-virtual {v4, v1, v5, v6, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_9

    :pswitch_6
    move-object/from16 v3, p2

    move-object v4, v8

    move/from16 v2, v19

    const/4 v8, 0x2

    move/from16 v19, v6

    move-wide v5, v12

    move/from16 v12, v20

    move-object/from16 v13, p6

    if-ne v7, v8, :cond_10

    const/high16 v7, 0x20000000

    and-int/2addr v7, v9

    if-nez v7, :cond_f

    .line 3039
    invoke-static {v3, v2, v13}, Lcom/google/android/gms/internal/drive/zziy;->zzc([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    goto :goto_a

    .line 3040
    :cond_f
    invoke-static {v3, v2, v13}, Lcom/google/android/gms/internal/drive/zziy;->zzd([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    .line 3041
    :goto_a
    iget-object v7, v13, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    invoke-virtual {v4, v1, v5, v6, v7}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_b
    or-int v11, v11, v22

    move-object v5, v3

    move v3, v2

    move-object v2, v5

    move-object v8, v4

    move-object v5, v13

    move v7, v14

    move/from16 v6, v21

    :goto_c
    move/from16 v4, p4

    goto/16 :goto_0

    :cond_10
    move v9, v2

    move-object v8, v3

    goto/16 :goto_11

    :pswitch_7
    move-object/from16 v3, p2

    move-object v4, v8

    move/from16 v2, v19

    move/from16 v19, v6

    move-wide v5, v12

    move/from16 v12, v20

    move-object/from16 v13, p6

    if-nez v7, :cond_10

    .line 3042
    invoke-static {v3, v2, v13}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    .line 3043
    iget-wide v7, v13, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    const-wide/16 v23, 0x0

    cmp-long v7, v7, v23

    if-eqz v7, :cond_11

    const/4 v7, 0x1

    goto :goto_d

    :cond_11
    move/from16 v7, v16

    :goto_d
    invoke-static {v1, v5, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JZ)V

    goto :goto_b

    :pswitch_8
    move-object v4, v8

    move/from16 v2, v19

    move-object/from16 v8, p2

    move/from16 v19, v6

    move-wide v5, v12

    move/from16 v12, v20

    move-object/from16 v13, p6

    if-ne v7, v3, :cond_9

    .line 3044
    invoke-static {v8, v2}, Lcom/google/android/gms/internal/drive/zziy;->zza([BI)I

    move-result v3

    invoke-virtual {v4, v1, v5, v6, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v3, v2, 0x4

    :goto_e
    or-int v11, v11, v22

    :goto_f
    move-object v2, v8

    move-object v5, v13

    move v7, v14

    move/from16 v6, v21

    move-object v8, v4

    goto :goto_c

    :pswitch_9
    move-object v4, v8

    move/from16 v2, v19

    const/4 v3, 0x1

    move-object/from16 v8, p2

    move/from16 v19, v6

    move-wide v5, v12

    move/from16 v12, v20

    move-object/from16 v13, p6

    if-ne v7, v3, :cond_9

    move-object v1, v4

    move-wide v3, v5

    .line 3045
    invoke-static {v8, v2}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BI)J

    move-result-wide v5

    move v9, v2

    move-object/from16 v2, p1

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object v4, v1

    move-object v1, v2

    :goto_10
    add-int/lit8 v3, v9, 0x8

    goto :goto_e

    :pswitch_a
    move-object v4, v8

    move/from16 v9, v19

    move-object/from16 v8, p2

    move/from16 v19, v6

    move-wide v5, v12

    move/from16 v12, v20

    move-object/from16 v13, p6

    if-nez v7, :cond_12

    .line 3046
    invoke-static {v8, v9, v13}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v3

    .line 3047
    iget v2, v13, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    invoke-virtual {v4, v1, v5, v6, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_e

    :pswitch_b
    move-object v4, v8

    move/from16 v9, v19

    move-object/from16 v8, p2

    move/from16 v19, v6

    move-wide v5, v12

    move/from16 v12, v20

    move-object/from16 v13, p6

    if-nez v7, :cond_12

    .line 3048
    invoke-static {v8, v9, v13}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v7

    move-object v1, v4

    move-wide v3, v5

    .line 3049
    iget-wide v5, v13, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    move-object/from16 v2, p1

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object v4, v1

    move-object v1, v2

    or-int v11, v11, v22

    move v3, v7

    goto :goto_f

    :pswitch_c
    move-object v4, v8

    move/from16 v9, v19

    move-object/from16 v8, p2

    move/from16 v19, v6

    move-wide v5, v12

    move/from16 v12, v20

    move-object/from16 v13, p6

    if-ne v7, v3, :cond_12

    .line 3050
    invoke-static {v8, v9}, Lcom/google/android/gms/internal/drive/zziy;->zzd([BI)F

    move-result v2

    invoke-static {v1, v5, v6, v2}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JF)V

    add-int/lit8 v3, v9, 0x4

    goto :goto_e

    :pswitch_d
    move-object v4, v8

    move/from16 v9, v19

    const/4 v3, 0x1

    move-object/from16 v8, p2

    move/from16 v19, v6

    move-wide v5, v12

    move/from16 v12, v20

    move-object/from16 v13, p6

    if-ne v7, v3, :cond_12

    .line 3051
    invoke-static {v8, v9}, Lcom/google/android/gms/internal/drive/zziy;->zzc([BI)D

    move-result-wide v2

    invoke-static {v1, v5, v6, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JD)V

    goto :goto_10

    :cond_12
    :goto_11
    move-object v8, v0

    move-object/from16 v25, v4

    move v2, v9

    move v0, v12

    move-object v5, v13

    move v7, v14

    move/from16 v6, v21

    move-object v9, v1

    goto/16 :goto_17

    :cond_13
    move-wide/from16 v26, v12

    move-object v13, v5

    move-wide/from16 v5, v26

    move-object v4, v8

    move/from16 p3, v19

    move/from16 v12, v20

    const/16 v19, -0x1

    move-object/from16 v8, p2

    const/16 v3, 0x1b

    if-ne v2, v3, :cond_17

    const/4 v3, 0x2

    if-ne v7, v3, :cond_16

    .line 3052
    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/drive/zzkp;

    .line 3053
    invoke-interface {v2}, Lcom/google/android/gms/internal/drive/zzkp;->zzbo()Z

    move-result v3

    if-nez v3, :cond_15

    .line 3054
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_14

    const/16 v3, 0xa

    goto :goto_12

    :cond_14
    shl-int/lit8 v3, v3, 0x1

    .line 3055
    :goto_12
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/drive/zzkp;->zzr(I)Lcom/google/android/gms/internal/drive/zzkp;

    move-result-object v2

    .line 3056
    invoke-virtual {v4, v1, v5, v6, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_15
    move-object v6, v2

    .line 3057
    invoke-direct {v0, v14}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    move-result-object v1

    move/from16 v5, p4

    move-object v3, v8

    move v2, v12

    move-object v7, v13

    move-object v8, v4

    move/from16 v4, p3

    .line 3058
    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/drive/zziy;->zza(Lcom/google/android/gms/internal/drive/zzmf;I[BIILcom/google/android/gms/internal/drive/zzkp;Lcom/google/android/gms/internal/drive/zziz;)I

    move-result v1

    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v5, p6

    move v3, v1

    move v7, v14

    move/from16 v6, v21

    move-object/from16 v1, p1

    goto/16 :goto_0

    :cond_16
    move/from16 v3, p3

    move-object/from16 v25, v4

    move/from16 v18, v10

    move/from16 v19, v11

    move/from16 v20, v12

    move v12, v14

    goto/16 :goto_16

    :cond_17
    move/from16 v3, p3

    move-object v8, v4

    const/16 v1, 0x31

    if-gt v2, v1, :cond_19

    move v1, v10

    int-to-long v9, v9

    move-wide/from16 v18, v5

    move v5, v12

    move-wide/from16 v12, v18

    move/from16 v4, p4

    move/from16 v18, v1

    move-object/from16 v25, v8

    move/from16 v19, v11

    move v8, v14

    move/from16 v6, v21

    move-object/from16 v1, p1

    move-object/from16 v14, p6

    move v11, v2

    move-object/from16 v2, p2

    .line 3059
    invoke-direct/range {v0 .. v14}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;[BIIIIIIJIJLcom/google/android/gms/internal/drive/zziz;)I

    move-result v7

    move/from16 v20, v5

    move v12, v8

    if-ne v7, v3, :cond_18

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    move-object/from16 v5, p6

    move v2, v7

    :goto_13
    move v7, v12

    move/from16 v10, v18

    move/from16 v11, v19

    move/from16 v0, v20

    move/from16 v6, v21

    goto/16 :goto_17

    :cond_18
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v5, p6

    move v3, v7

    :goto_14
    move v7, v12

    move/from16 v10, v18

    move/from16 v11, v19

    move/from16 v12, v20

    move/from16 v6, v21

    :goto_15
    move-object/from16 v8, v25

    goto/16 :goto_0

    :cond_19
    move-object/from16 v25, v8

    move/from16 v18, v10

    move/from16 v19, v11

    move/from16 v20, v12

    move v12, v14

    move v11, v2

    const/16 v0, 0x32

    if-ne v11, v0, :cond_1c

    const/4 v8, 0x2

    if-ne v7, v8, :cond_1b

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v8, p6

    move-wide v6, v5

    move v5, v12

    .line 3060
    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;[BIIIJLcom/google/android/gms/internal/drive/zziz;)I

    move-result v6

    if-ne v6, v3, :cond_1a

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    move-object/from16 v5, p6

    move v2, v6

    goto :goto_13

    :cond_1a
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v5, p6

    move v3, v6

    goto :goto_14

    :cond_1b
    :goto_16
    move-object/from16 v8, p0

    move-object/from16 v9, p1

    move-object/from16 v5, p6

    move v2, v3

    goto :goto_13

    :cond_1c
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v13, p6

    move v8, v9

    move v9, v11

    move-wide v10, v5

    move/from16 v5, v20

    move/from16 v6, v21

    .line 3061
    invoke-direct/range {v0 .. v13}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;[BIIIIIIIJILcom/google/android/gms/internal/drive/zziz;)I

    move-result v7

    move-object v8, v0

    move-object v9, v1

    move v0, v5

    move-object v5, v13

    if-ne v7, v3, :cond_21

    move v2, v7

    move v7, v12

    move/from16 v10, v18

    move/from16 v11, v19

    :goto_17
    if-ne v0, v15, :cond_1e

    if-nez v15, :cond_1d

    goto :goto_19

    :cond_1d
    move/from16 v13, p4

    move v12, v0

    move v7, v2

    :goto_18
    const/4 v6, -0x1

    goto/16 :goto_1b

    .line 3062
    :cond_1e
    :goto_19
    iget-boolean v1, v8, Lcom/google/android/gms/internal/drive/zzlu;->zzui:Z

    if-eqz v1, :cond_20

    iget-object v1, v5, Lcom/google/android/gms/internal/drive/zziz;->zznn:Lcom/google/android/gms/internal/drive/zzjx;

    .line 3063
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzjx;->zzci()Lcom/google/android/gms/internal/drive/zzjx;

    move-result-object v3

    if-eq v1, v3, :cond_20

    .line 3064
    iget-object v1, v8, Lcom/google/android/gms/internal/drive/zzlu;->zzuh:Lcom/google/android/gms/internal/drive/zzlq;

    .line 3065
    iget-object v3, v5, Lcom/google/android/gms/internal/drive/zziz;->zznn:Lcom/google/android/gms/internal/drive/zzjx;

    .line 3066
    invoke-virtual {v3, v1, v6}, Lcom/google/android/gms/internal/drive/zzjx;->zza(Lcom/google/android/gms/internal/drive/zzlq;I)Lcom/google/android/gms/internal/drive/zzkk$zzd;

    move-result-object v1

    if-nez v1, :cond_1f

    .line 3067
    invoke-static {v9}, Lcom/google/android/gms/internal/drive/zzlu;->zzo(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzmy;

    move-result-object v4

    move-object/from16 v1, p2

    move/from16 v3, p4

    .line 3068
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/drive/zziy;->zza(I[BIILcom/google/android/gms/internal/drive/zzmy;Lcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    move/from16 v4, p4

    move-object/from16 v5, p6

    move v12, v0

    move v3, v2

    move-object v0, v8

    move-object v1, v9

    move-object/from16 v8, v25

    :goto_1a
    move-object/from16 v2, p2

    goto/16 :goto_0

    .line 3069
    :cond_1f
    move-object v0, v9

    check-cast v0, Lcom/google/android/gms/internal/drive/zzkk$zzc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/drive/zzkk$zzc;->zzdg()Lcom/google/android/gms/internal/drive/zzkb;

    .line 3070
    iget-object v0, v0, Lcom/google/android/gms/internal/drive/zzkk$zzc;->zzrw:Lcom/google/android/gms/internal/drive/zzkb;

    .line 3071
    new-instance v0, Ljava/lang/NoSuchMethodError;

    invoke-direct {v0}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw v0

    .line 3072
    :cond_20
    invoke-static {v9}, Lcom/google/android/gms/internal/drive/zzlu;->zzo(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzmy;

    move-result-object v4

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p6

    .line 3073
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/drive/zziy;->zza(I[BIILcom/google/android/gms/internal/drive/zzmy;Lcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    move v12, v0

    move v4, v3

    move-object v0, v8

    move-object v1, v9

    move-object/from16 v8, v25

    move v3, v2

    goto :goto_1a

    :cond_21
    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v5, p6

    move v3, v7

    move-object v1, v9

    move v7, v12

    move/from16 v10, v18

    move/from16 v11, v19

    move v12, v0

    move-object v0, v8

    goto/16 :goto_15

    :cond_22
    move-object v9, v1

    move v13, v4

    move-object/from16 v25, v8

    move/from16 v18, v10

    move/from16 v19, v11

    move-object v8, v0

    move v7, v3

    goto :goto_18

    :goto_1b
    if-eq v10, v6, :cond_23

    int-to-long v0, v10

    move-object/from16 v4, v25

    .line 3074
    invoke-virtual {v4, v9, v0, v1, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 3075
    :cond_23
    iget v0, v8, Lcom/google/android/gms/internal/drive/zzlu;->zzun:I

    const/4 v1, 0x0

    move v10, v0

    move-object v5, v1

    :goto_1c
    iget v0, v8, Lcom/google/android/gms/internal/drive/zzlu;->zzuo:I

    if-ge v10, v0, :cond_26

    .line 3076
    iget-object v0, v8, Lcom/google/android/gms/internal/drive/zzlu;->zzum:[I

    aget v1, v0, v10

    iget-object v6, v8, Lcom/google/android/gms/internal/drive/zzlu;->zzur:Lcom/google/android/gms/internal/drive/zzmx;

    .line 3077
    iget-object v0, v8, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    aget v2, v0, v1

    .line 3078
    invoke-direct {v8, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zzas(I)I

    move-result v0

    and-int v0, v0, v17

    int-to-long v3, v0

    .line 3079
    invoke-static {v9, v3, v4}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_24

    goto :goto_1d

    .line 3080
    :cond_24
    invoke-direct {v8, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zzar(I)Lcom/google/android/gms/internal/drive/zzko;

    move-result-object v4

    if-nez v4, :cond_25

    :goto_1d
    move-object v0, v8

    goto :goto_1e

    .line 3081
    :cond_25
    iget-object v3, v8, Lcom/google/android/gms/internal/drive/zzlu;->zzut:Lcom/google/android/gms/internal/drive/zzll;

    invoke-interface {v3, v0}, Lcom/google/android/gms/internal/drive/zzll;->zzh(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    move-object v0, v8

    .line 3082
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/drive/zzlu;->zza(IILjava/util/Map;Lcom/google/android/gms/internal/drive/zzko;Ljava/lang/Object;Lcom/google/android/gms/internal/drive/zzmx;)Ljava/lang/Object;

    move-result-object v5

    .line 3083
    :goto_1e
    check-cast v5, Lcom/google/android/gms/internal/drive/zzmy;

    add-int/lit8 v10, v10, 0x1

    move-object v8, v0

    goto :goto_1c

    :cond_26
    move-object v0, v8

    if-eqz v5, :cond_27

    .line 3084
    iget-object v0, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzur:Lcom/google/android/gms/internal/drive/zzmx;

    .line 3085
    invoke-virtual {v0, v9, v5}, Lcom/google/android/gms/internal/drive/zzmx;->zzf(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_27
    if-nez v15, :cond_29

    if-ne v7, v13, :cond_28

    goto :goto_1f

    .line 3086
    :cond_28
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdm()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object v0

    throw v0

    :cond_29
    if-gt v7, v13, :cond_2a

    if-ne v12, v15, :cond_2a

    :goto_1f
    return v7

    .line 3087
    :cond_2a
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdm()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object v0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zza(Ljava/lang/Object;Lcom/google/android/gms/internal/drive/zzns;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/android/gms/internal/drive/zzns;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Lcom/google/android/gms/internal/drive/zzns;->zzcd()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget v1, Lcom/google/android/gms/internal/drive/zzkk$zze;->zzsj:I

    .line 6
    .line 7
    const/high16 v2, 0xff00000

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x0

    .line 12
    const v6, 0xfffff

    .line 13
    .line 14
    .line 15
    if-ne v0, v1, :cond_7

    .line 16
    .line 17
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzur:Lcom/google/android/gms/internal/drive/zzmx;

    .line 18
    .line 19
    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Lcom/google/android/gms/internal/drive/zzmx;Ljava/lang/Object;Lcom/google/android/gms/internal/drive/zzns;)V

    .line 20
    .line 21
    .line 22
    iget-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzui:Z

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/drive/zzjy;->zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzkb;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, v0, Lcom/google/android/gms/internal/drive/zzkb;->zzos:Lcom/google/android/gms/internal/drive/zzmi;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/google/android/gms/internal/drive/zzkb;->descendingIterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ljava/util/Map$Entry;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v0, v3

    .line 52
    move-object v1, v0

    .line 53
    :goto_0
    iget-object v7, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 54
    .line 55
    array-length v7, v7

    .line 56
    add-int/lit8 v7, v7, -0x3

    .line 57
    .line 58
    :goto_1
    if-ltz v7, :cond_4

    .line 59
    .line 60
    invoke-direct {p0, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zzas(I)I

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 65
    .line 66
    aget v9, v9, v7

    .line 67
    .line 68
    :goto_2
    if-eqz v1, :cond_2

    .line 69
    .line 70
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 71
    .line 72
    invoke-virtual {v10, v1}, Lcom/google/android/gms/internal/drive/zzjy;->zza(Ljava/util/Map$Entry;)I

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    if-le v10, v9, :cond_2

    .line 77
    .line 78
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 79
    .line 80
    invoke-virtual {v10, p2, v1}, Lcom/google/android/gms/internal/drive/zzjy;->zza(Lcom/google/android/gms/internal/drive/zzns;Ljava/util/Map$Entry;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_1

    .line 88
    .line 89
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, Ljava/util/Map$Entry;

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_1
    move-object v1, v3

    .line 97
    goto :goto_2

    .line 98
    :cond_2
    and-int v10, v8, v2

    .line 99
    .line 100
    ushr-int/lit8 v10, v10, 0x14

    .line 101
    .line 102
    packed-switch v10, :pswitch_data_0

    .line 103
    .line 104
    .line 105
    goto/16 :goto_3

    .line 106
    .line 107
    :pswitch_0
    invoke-direct {p0, p1, v9, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    if-eqz v10, :cond_3

    .line 112
    .line 113
    and-int/2addr v8, v6

    .line 114
    int-to-long v10, v8

    .line 115
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    invoke-direct {p0, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    invoke-interface {p2, v9, v8, v10}, Lcom/google/android/gms/internal/drive/zzns;->zzb(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzmf;)V

    .line 124
    .line 125
    .line 126
    goto/16 :goto_3

    .line 127
    .line 128
    :pswitch_1
    invoke-direct {p0, p1, v9, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    if-eqz v10, :cond_3

    .line 133
    .line 134
    and-int/2addr v8, v6

    .line 135
    int-to-long v10, v8

    .line 136
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 137
    .line 138
    .line 139
    move-result-wide v10

    .line 140
    invoke-interface {p2, v9, v10, v11}, Lcom/google/android/gms/internal/drive/zzns;->zzb(IJ)V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_3

    .line 144
    .line 145
    :pswitch_2
    invoke-direct {p0, p1, v9, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    if-eqz v10, :cond_3

    .line 150
    .line 151
    and-int/2addr v8, v6

    .line 152
    int-to-long v10, v8

    .line 153
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    invoke-interface {p2, v9, v8}, Lcom/google/android/gms/internal/drive/zzns;->zze(II)V

    .line 158
    .line 159
    .line 160
    goto/16 :goto_3

    .line 161
    .line 162
    :pswitch_3
    invoke-direct {p0, p1, v9, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 163
    .line 164
    .line 165
    move-result v10

    .line 166
    if-eqz v10, :cond_3

    .line 167
    .line 168
    and-int/2addr v8, v6

    .line 169
    int-to-long v10, v8

    .line 170
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 171
    .line 172
    .line 173
    move-result-wide v10

    .line 174
    invoke-interface {p2, v9, v10, v11}, Lcom/google/android/gms/internal/drive/zzns;->zzj(IJ)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_3

    .line 178
    .line 179
    :pswitch_4
    invoke-direct {p0, p1, v9, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 180
    .line 181
    .line 182
    move-result v10

    .line 183
    if-eqz v10, :cond_3

    .line 184
    .line 185
    and-int/2addr v8, v6

    .line 186
    int-to-long v10, v8

    .line 187
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 188
    .line 189
    .line 190
    move-result v8

    .line 191
    invoke-interface {p2, v9, v8}, Lcom/google/android/gms/internal/drive/zzns;->zzm(II)V

    .line 192
    .line 193
    .line 194
    goto/16 :goto_3

    .line 195
    .line 196
    :pswitch_5
    invoke-direct {p0, p1, v9, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 197
    .line 198
    .line 199
    move-result v10

    .line 200
    if-eqz v10, :cond_3

    .line 201
    .line 202
    and-int/2addr v8, v6

    .line 203
    int-to-long v10, v8

    .line 204
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    invoke-interface {p2, v9, v8}, Lcom/google/android/gms/internal/drive/zzns;->zzn(II)V

    .line 209
    .line 210
    .line 211
    goto/16 :goto_3

    .line 212
    .line 213
    :pswitch_6
    invoke-direct {p0, p1, v9, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    if-eqz v10, :cond_3

    .line 218
    .line 219
    and-int/2addr v8, v6

    .line 220
    int-to-long v10, v8

    .line 221
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 222
    .line 223
    .line 224
    move-result v8

    .line 225
    invoke-interface {p2, v9, v8}, Lcom/google/android/gms/internal/drive/zzns;->zzd(II)V

    .line 226
    .line 227
    .line 228
    goto/16 :goto_3

    .line 229
    .line 230
    :pswitch_7
    invoke-direct {p0, p1, v9, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 231
    .line 232
    .line 233
    move-result v10

    .line 234
    if-eqz v10, :cond_3

    .line 235
    .line 236
    and-int/2addr v8, v6

    .line 237
    int-to-long v10, v8

    .line 238
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    check-cast v8, Lcom/google/android/gms/internal/drive/zzjc;

    .line 243
    .line 244
    invoke-interface {p2, v9, v8}, Lcom/google/android/gms/internal/drive/zzns;->zza(ILcom/google/android/gms/internal/drive/zzjc;)V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_3

    .line 248
    .line 249
    :pswitch_8
    invoke-direct {p0, p1, v9, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 250
    .line 251
    .line 252
    move-result v10

    .line 253
    if-eqz v10, :cond_3

    .line 254
    .line 255
    and-int/2addr v8, v6

    .line 256
    int-to-long v10, v8

    .line 257
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    invoke-direct {p0, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 262
    .line 263
    .line 264
    move-result-object v10

    .line 265
    invoke-interface {p2, v9, v8, v10}, Lcom/google/android/gms/internal/drive/zzns;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzmf;)V

    .line 266
    .line 267
    .line 268
    goto/16 :goto_3

    .line 269
    .line 270
    :pswitch_9
    invoke-direct {p0, p1, v9, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 271
    .line 272
    .line 273
    move-result v10

    .line 274
    if-eqz v10, :cond_3

    .line 275
    .line 276
    and-int/2addr v8, v6

    .line 277
    int-to-long v10, v8

    .line 278
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    invoke-static {v9, v8, p2}, Lcom/google/android/gms/internal/drive/zzlu;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzns;)V

    .line 283
    .line 284
    .line 285
    goto/16 :goto_3

    .line 286
    .line 287
    :pswitch_a
    invoke-direct {p0, p1, v9, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 288
    .line 289
    .line 290
    move-result v10

    .line 291
    if-eqz v10, :cond_3

    .line 292
    .line 293
    and-int/2addr v8, v6

    .line 294
    int-to-long v10, v8

    .line 295
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zzlu;->zzi(Ljava/lang/Object;J)Z

    .line 296
    .line 297
    .line 298
    move-result v8

    .line 299
    invoke-interface {p2, v9, v8}, Lcom/google/android/gms/internal/drive/zzns;->zzb(IZ)V

    .line 300
    .line 301
    .line 302
    goto/16 :goto_3

    .line 303
    .line 304
    :pswitch_b
    invoke-direct {p0, p1, v9, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 305
    .line 306
    .line 307
    move-result v10

    .line 308
    if-eqz v10, :cond_3

    .line 309
    .line 310
    and-int/2addr v8, v6

    .line 311
    int-to-long v10, v8

    .line 312
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 313
    .line 314
    .line 315
    move-result v8

    .line 316
    invoke-interface {p2, v9, v8}, Lcom/google/android/gms/internal/drive/zzns;->zzf(II)V

    .line 317
    .line 318
    .line 319
    goto/16 :goto_3

    .line 320
    .line 321
    :pswitch_c
    invoke-direct {p0, p1, v9, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 322
    .line 323
    .line 324
    move-result v10

    .line 325
    if-eqz v10, :cond_3

    .line 326
    .line 327
    and-int/2addr v8, v6

    .line 328
    int-to-long v10, v8

    .line 329
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 330
    .line 331
    .line 332
    move-result-wide v10

    .line 333
    invoke-interface {p2, v9, v10, v11}, Lcom/google/android/gms/internal/drive/zzns;->zzc(IJ)V

    .line 334
    .line 335
    .line 336
    goto/16 :goto_3

    .line 337
    .line 338
    :pswitch_d
    invoke-direct {p0, p1, v9, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 339
    .line 340
    .line 341
    move-result v10

    .line 342
    if-eqz v10, :cond_3

    .line 343
    .line 344
    and-int/2addr v8, v6

    .line 345
    int-to-long v10, v8

    .line 346
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 347
    .line 348
    .line 349
    move-result v8

    .line 350
    invoke-interface {p2, v9, v8}, Lcom/google/android/gms/internal/drive/zzns;->zzc(II)V

    .line 351
    .line 352
    .line 353
    goto/16 :goto_3

    .line 354
    .line 355
    :pswitch_e
    invoke-direct {p0, p1, v9, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 356
    .line 357
    .line 358
    move-result v10

    .line 359
    if-eqz v10, :cond_3

    .line 360
    .line 361
    and-int/2addr v8, v6

    .line 362
    int-to-long v10, v8

    .line 363
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 364
    .line 365
    .line 366
    move-result-wide v10

    .line 367
    invoke-interface {p2, v9, v10, v11}, Lcom/google/android/gms/internal/drive/zzns;->zza(IJ)V

    .line 368
    .line 369
    .line 370
    goto/16 :goto_3

    .line 371
    .line 372
    :pswitch_f
    invoke-direct {p0, p1, v9, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 373
    .line 374
    .line 375
    move-result v10

    .line 376
    if-eqz v10, :cond_3

    .line 377
    .line 378
    and-int/2addr v8, v6

    .line 379
    int-to-long v10, v8

    .line 380
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 381
    .line 382
    .line 383
    move-result-wide v10

    .line 384
    invoke-interface {p2, v9, v10, v11}, Lcom/google/android/gms/internal/drive/zzns;->zzi(IJ)V

    .line 385
    .line 386
    .line 387
    goto/16 :goto_3

    .line 388
    .line 389
    :pswitch_10
    invoke-direct {p0, p1, v9, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 390
    .line 391
    .line 392
    move-result v10

    .line 393
    if-eqz v10, :cond_3

    .line 394
    .line 395
    and-int/2addr v8, v6

    .line 396
    int-to-long v10, v8

    .line 397
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zzlu;->zzf(Ljava/lang/Object;J)F

    .line 398
    .line 399
    .line 400
    move-result v8

    .line 401
    invoke-interface {p2, v9, v8}, Lcom/google/android/gms/internal/drive/zzns;->zza(IF)V

    .line 402
    .line 403
    .line 404
    goto/16 :goto_3

    .line 405
    .line 406
    :pswitch_11
    invoke-direct {p0, p1, v9, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 407
    .line 408
    .line 409
    move-result v10

    .line 410
    if-eqz v10, :cond_3

    .line 411
    .line 412
    and-int/2addr v8, v6

    .line 413
    int-to-long v10, v8

    .line 414
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zzlu;->zze(Ljava/lang/Object;J)D

    .line 415
    .line 416
    .line 417
    move-result-wide v10

    .line 418
    invoke-interface {p2, v9, v10, v11}, Lcom/google/android/gms/internal/drive/zzns;->zza(ID)V

    .line 419
    .line 420
    .line 421
    goto/16 :goto_3

    .line 422
    .line 423
    :pswitch_12
    and-int/2addr v8, v6

    .line 424
    int-to-long v10, v8

    .line 425
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v8

    .line 429
    invoke-direct {p0, p2, v9, v8, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Lcom/google/android/gms/internal/drive/zzns;ILjava/lang/Object;I)V

    .line 430
    .line 431
    .line 432
    goto/16 :goto_3

    .line 433
    .line 434
    :pswitch_13
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 435
    .line 436
    aget v9, v9, v7

    .line 437
    .line 438
    and-int/2addr v8, v6

    .line 439
    int-to-long v10, v8

    .line 440
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v8

    .line 444
    check-cast v8, Ljava/util/List;

    .line 445
    .line 446
    invoke-direct {p0, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 447
    .line 448
    .line 449
    move-result-object v10

    .line 450
    invoke-static {v9, v8, p2, v10}, Lcom/google/android/gms/internal/drive/zzmh;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Lcom/google/android/gms/internal/drive/zzmf;)V

    .line 451
    .line 452
    .line 453
    goto/16 :goto_3

    .line 454
    .line 455
    :pswitch_14
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 456
    .line 457
    aget v9, v9, v7

    .line 458
    .line 459
    and-int/2addr v8, v6

    .line 460
    int-to-long v10, v8

    .line 461
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v8

    .line 465
    check-cast v8, Ljava/util/List;

    .line 466
    .line 467
    invoke-static {v9, v8, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zze(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 468
    .line 469
    .line 470
    goto/16 :goto_3

    .line 471
    .line 472
    :pswitch_15
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 473
    .line 474
    aget v9, v9, v7

    .line 475
    .line 476
    and-int/2addr v8, v6

    .line 477
    int-to-long v10, v8

    .line 478
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v8

    .line 482
    check-cast v8, Ljava/util/List;

    .line 483
    .line 484
    invoke-static {v9, v8, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzj(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 485
    .line 486
    .line 487
    goto/16 :goto_3

    .line 488
    .line 489
    :pswitch_16
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 490
    .line 491
    aget v9, v9, v7

    .line 492
    .line 493
    and-int/2addr v8, v6

    .line 494
    int-to-long v10, v8

    .line 495
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v8

    .line 499
    check-cast v8, Ljava/util/List;

    .line 500
    .line 501
    invoke-static {v9, v8, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzg(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 502
    .line 503
    .line 504
    goto/16 :goto_3

    .line 505
    .line 506
    :pswitch_17
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 507
    .line 508
    aget v9, v9, v7

    .line 509
    .line 510
    and-int/2addr v8, v6

    .line 511
    int-to-long v10, v8

    .line 512
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v8

    .line 516
    check-cast v8, Ljava/util/List;

    .line 517
    .line 518
    invoke-static {v9, v8, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzl(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 519
    .line 520
    .line 521
    goto/16 :goto_3

    .line 522
    .line 523
    :pswitch_18
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 524
    .line 525
    aget v9, v9, v7

    .line 526
    .line 527
    and-int/2addr v8, v6

    .line 528
    int-to-long v10, v8

    .line 529
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v8

    .line 533
    check-cast v8, Ljava/util/List;

    .line 534
    .line 535
    invoke-static {v9, v8, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzm(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 536
    .line 537
    .line 538
    goto/16 :goto_3

    .line 539
    .line 540
    :pswitch_19
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 541
    .line 542
    aget v9, v9, v7

    .line 543
    .line 544
    and-int/2addr v8, v6

    .line 545
    int-to-long v10, v8

    .line 546
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v8

    .line 550
    check-cast v8, Ljava/util/List;

    .line 551
    .line 552
    invoke-static {v9, v8, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzi(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 553
    .line 554
    .line 555
    goto/16 :goto_3

    .line 556
    .line 557
    :pswitch_1a
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 558
    .line 559
    aget v9, v9, v7

    .line 560
    .line 561
    and-int/2addr v8, v6

    .line 562
    int-to-long v10, v8

    .line 563
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v8

    .line 567
    check-cast v8, Ljava/util/List;

    .line 568
    .line 569
    invoke-static {v9, v8, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzn(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 570
    .line 571
    .line 572
    goto/16 :goto_3

    .line 573
    .line 574
    :pswitch_1b
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 575
    .line 576
    aget v9, v9, v7

    .line 577
    .line 578
    and-int/2addr v8, v6

    .line 579
    int-to-long v10, v8

    .line 580
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v8

    .line 584
    check-cast v8, Ljava/util/List;

    .line 585
    .line 586
    invoke-static {v9, v8, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzk(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 587
    .line 588
    .line 589
    goto/16 :goto_3

    .line 590
    .line 591
    :pswitch_1c
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 592
    .line 593
    aget v9, v9, v7

    .line 594
    .line 595
    and-int/2addr v8, v6

    .line 596
    int-to-long v10, v8

    .line 597
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v8

    .line 601
    check-cast v8, Ljava/util/List;

    .line 602
    .line 603
    invoke-static {v9, v8, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzf(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 604
    .line 605
    .line 606
    goto/16 :goto_3

    .line 607
    .line 608
    :pswitch_1d
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 609
    .line 610
    aget v9, v9, v7

    .line 611
    .line 612
    and-int/2addr v8, v6

    .line 613
    int-to-long v10, v8

    .line 614
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v8

    .line 618
    check-cast v8, Ljava/util/List;

    .line 619
    .line 620
    invoke-static {v9, v8, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzh(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 621
    .line 622
    .line 623
    goto/16 :goto_3

    .line 624
    .line 625
    :pswitch_1e
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 626
    .line 627
    aget v9, v9, v7

    .line 628
    .line 629
    and-int/2addr v8, v6

    .line 630
    int-to-long v10, v8

    .line 631
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v8

    .line 635
    check-cast v8, Ljava/util/List;

    .line 636
    .line 637
    invoke-static {v9, v8, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzd(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 638
    .line 639
    .line 640
    goto/16 :goto_3

    .line 641
    .line 642
    :pswitch_1f
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 643
    .line 644
    aget v9, v9, v7

    .line 645
    .line 646
    and-int/2addr v8, v6

    .line 647
    int-to-long v10, v8

    .line 648
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v8

    .line 652
    check-cast v8, Ljava/util/List;

    .line 653
    .line 654
    invoke-static {v9, v8, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzc(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 655
    .line 656
    .line 657
    goto/16 :goto_3

    .line 658
    .line 659
    :pswitch_20
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 660
    .line 661
    aget v9, v9, v7

    .line 662
    .line 663
    and-int/2addr v8, v6

    .line 664
    int-to-long v10, v8

    .line 665
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v8

    .line 669
    check-cast v8, Ljava/util/List;

    .line 670
    .line 671
    invoke-static {v9, v8, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 672
    .line 673
    .line 674
    goto/16 :goto_3

    .line 675
    .line 676
    :pswitch_21
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 677
    .line 678
    aget v9, v9, v7

    .line 679
    .line 680
    and-int/2addr v8, v6

    .line 681
    int-to-long v10, v8

    .line 682
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v8

    .line 686
    check-cast v8, Ljava/util/List;

    .line 687
    .line 688
    invoke-static {v9, v8, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zza(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 689
    .line 690
    .line 691
    goto/16 :goto_3

    .line 692
    .line 693
    :pswitch_22
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 694
    .line 695
    aget v9, v9, v7

    .line 696
    .line 697
    and-int/2addr v8, v6

    .line 698
    int-to-long v10, v8

    .line 699
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v8

    .line 703
    check-cast v8, Ljava/util/List;

    .line 704
    .line 705
    invoke-static {v9, v8, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zze(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 706
    .line 707
    .line 708
    goto/16 :goto_3

    .line 709
    .line 710
    :pswitch_23
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 711
    .line 712
    aget v9, v9, v7

    .line 713
    .line 714
    and-int/2addr v8, v6

    .line 715
    int-to-long v10, v8

    .line 716
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v8

    .line 720
    check-cast v8, Ljava/util/List;

    .line 721
    .line 722
    invoke-static {v9, v8, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzj(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 723
    .line 724
    .line 725
    goto/16 :goto_3

    .line 726
    .line 727
    :pswitch_24
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 728
    .line 729
    aget v9, v9, v7

    .line 730
    .line 731
    and-int/2addr v8, v6

    .line 732
    int-to-long v10, v8

    .line 733
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v8

    .line 737
    check-cast v8, Ljava/util/List;

    .line 738
    .line 739
    invoke-static {v9, v8, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzg(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 740
    .line 741
    .line 742
    goto/16 :goto_3

    .line 743
    .line 744
    :pswitch_25
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 745
    .line 746
    aget v9, v9, v7

    .line 747
    .line 748
    and-int/2addr v8, v6

    .line 749
    int-to-long v10, v8

    .line 750
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v8

    .line 754
    check-cast v8, Ljava/util/List;

    .line 755
    .line 756
    invoke-static {v9, v8, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzl(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 757
    .line 758
    .line 759
    goto/16 :goto_3

    .line 760
    .line 761
    :pswitch_26
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 762
    .line 763
    aget v9, v9, v7

    .line 764
    .line 765
    and-int/2addr v8, v6

    .line 766
    int-to-long v10, v8

    .line 767
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v8

    .line 771
    check-cast v8, Ljava/util/List;

    .line 772
    .line 773
    invoke-static {v9, v8, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzm(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 774
    .line 775
    .line 776
    goto/16 :goto_3

    .line 777
    .line 778
    :pswitch_27
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 779
    .line 780
    aget v9, v9, v7

    .line 781
    .line 782
    and-int/2addr v8, v6

    .line 783
    int-to-long v10, v8

    .line 784
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v8

    .line 788
    check-cast v8, Ljava/util/List;

    .line 789
    .line 790
    invoke-static {v9, v8, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzi(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 791
    .line 792
    .line 793
    goto/16 :goto_3

    .line 794
    .line 795
    :pswitch_28
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 796
    .line 797
    aget v9, v9, v7

    .line 798
    .line 799
    and-int/2addr v8, v6

    .line 800
    int-to-long v10, v8

    .line 801
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v8

    .line 805
    check-cast v8, Ljava/util/List;

    .line 806
    .line 807
    invoke-static {v9, v8, p2}, Lcom/google/android/gms/internal/drive/zzmh;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;)V

    .line 808
    .line 809
    .line 810
    goto/16 :goto_3

    .line 811
    .line 812
    :pswitch_29
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 813
    .line 814
    aget v9, v9, v7

    .line 815
    .line 816
    and-int/2addr v8, v6

    .line 817
    int-to-long v10, v8

    .line 818
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v8

    .line 822
    check-cast v8, Ljava/util/List;

    .line 823
    .line 824
    invoke-direct {p0, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 825
    .line 826
    .line 827
    move-result-object v10

    .line 828
    invoke-static {v9, v8, p2, v10}, Lcom/google/android/gms/internal/drive/zzmh;->zza(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Lcom/google/android/gms/internal/drive/zzmf;)V

    .line 829
    .line 830
    .line 831
    goto/16 :goto_3

    .line 832
    .line 833
    :pswitch_2a
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 834
    .line 835
    aget v9, v9, v7

    .line 836
    .line 837
    and-int/2addr v8, v6

    .line 838
    int-to-long v10, v8

    .line 839
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v8

    .line 843
    check-cast v8, Ljava/util/List;

    .line 844
    .line 845
    invoke-static {v9, v8, p2}, Lcom/google/android/gms/internal/drive/zzmh;->zza(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;)V

    .line 846
    .line 847
    .line 848
    goto/16 :goto_3

    .line 849
    .line 850
    :pswitch_2b
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 851
    .line 852
    aget v9, v9, v7

    .line 853
    .line 854
    and-int/2addr v8, v6

    .line 855
    int-to-long v10, v8

    .line 856
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    move-result-object v8

    .line 860
    check-cast v8, Ljava/util/List;

    .line 861
    .line 862
    invoke-static {v9, v8, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzn(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 863
    .line 864
    .line 865
    goto/16 :goto_3

    .line 866
    .line 867
    :pswitch_2c
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 868
    .line 869
    aget v9, v9, v7

    .line 870
    .line 871
    and-int/2addr v8, v6

    .line 872
    int-to-long v10, v8

    .line 873
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object v8

    .line 877
    check-cast v8, Ljava/util/List;

    .line 878
    .line 879
    invoke-static {v9, v8, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzk(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 880
    .line 881
    .line 882
    goto/16 :goto_3

    .line 883
    .line 884
    :pswitch_2d
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 885
    .line 886
    aget v9, v9, v7

    .line 887
    .line 888
    and-int/2addr v8, v6

    .line 889
    int-to-long v10, v8

    .line 890
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v8

    .line 894
    check-cast v8, Ljava/util/List;

    .line 895
    .line 896
    invoke-static {v9, v8, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzf(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 897
    .line 898
    .line 899
    goto/16 :goto_3

    .line 900
    .line 901
    :pswitch_2e
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 902
    .line 903
    aget v9, v9, v7

    .line 904
    .line 905
    and-int/2addr v8, v6

    .line 906
    int-to-long v10, v8

    .line 907
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v8

    .line 911
    check-cast v8, Ljava/util/List;

    .line 912
    .line 913
    invoke-static {v9, v8, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzh(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 914
    .line 915
    .line 916
    goto/16 :goto_3

    .line 917
    .line 918
    :pswitch_2f
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 919
    .line 920
    aget v9, v9, v7

    .line 921
    .line 922
    and-int/2addr v8, v6

    .line 923
    int-to-long v10, v8

    .line 924
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 925
    .line 926
    .line 927
    move-result-object v8

    .line 928
    check-cast v8, Ljava/util/List;

    .line 929
    .line 930
    invoke-static {v9, v8, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzd(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 931
    .line 932
    .line 933
    goto/16 :goto_3

    .line 934
    .line 935
    :pswitch_30
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 936
    .line 937
    aget v9, v9, v7

    .line 938
    .line 939
    and-int/2addr v8, v6

    .line 940
    int-to-long v10, v8

    .line 941
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 942
    .line 943
    .line 944
    move-result-object v8

    .line 945
    check-cast v8, Ljava/util/List;

    .line 946
    .line 947
    invoke-static {v9, v8, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzc(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 948
    .line 949
    .line 950
    goto/16 :goto_3

    .line 951
    .line 952
    :pswitch_31
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 953
    .line 954
    aget v9, v9, v7

    .line 955
    .line 956
    and-int/2addr v8, v6

    .line 957
    int-to-long v10, v8

    .line 958
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v8

    .line 962
    check-cast v8, Ljava/util/List;

    .line 963
    .line 964
    invoke-static {v9, v8, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 965
    .line 966
    .line 967
    goto/16 :goto_3

    .line 968
    .line 969
    :pswitch_32
    iget-object v9, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 970
    .line 971
    aget v9, v9, v7

    .line 972
    .line 973
    and-int/2addr v8, v6

    .line 974
    int-to-long v10, v8

    .line 975
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    move-result-object v8

    .line 979
    check-cast v8, Ljava/util/List;

    .line 980
    .line 981
    invoke-static {v9, v8, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zza(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 982
    .line 983
    .line 984
    goto/16 :goto_3

    .line 985
    .line 986
    :pswitch_33
    invoke-direct {p0, p1, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 987
    .line 988
    .line 989
    move-result v10

    .line 990
    if-eqz v10, :cond_3

    .line 991
    .line 992
    and-int/2addr v8, v6

    .line 993
    int-to-long v10, v8

    .line 994
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 995
    .line 996
    .line 997
    move-result-object v8

    .line 998
    invoke-direct {p0, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 999
    .line 1000
    .line 1001
    move-result-object v10

    .line 1002
    invoke-interface {p2, v9, v8, v10}, Lcom/google/android/gms/internal/drive/zzns;->zzb(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzmf;)V

    .line 1003
    .line 1004
    .line 1005
    goto/16 :goto_3

    .line 1006
    .line 1007
    :pswitch_34
    invoke-direct {p0, p1, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1008
    .line 1009
    .line 1010
    move-result v10

    .line 1011
    if-eqz v10, :cond_3

    .line 1012
    .line 1013
    and-int/2addr v8, v6

    .line 1014
    int-to-long v10, v8

    .line 1015
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 1016
    .line 1017
    .line 1018
    move-result-wide v10

    .line 1019
    invoke-interface {p2, v9, v10, v11}, Lcom/google/android/gms/internal/drive/zzns;->zzb(IJ)V

    .line 1020
    .line 1021
    .line 1022
    goto/16 :goto_3

    .line 1023
    .line 1024
    :pswitch_35
    invoke-direct {p0, p1, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1025
    .line 1026
    .line 1027
    move-result v10

    .line 1028
    if-eqz v10, :cond_3

    .line 1029
    .line 1030
    and-int/2addr v8, v6

    .line 1031
    int-to-long v10, v8

    .line 1032
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 1033
    .line 1034
    .line 1035
    move-result v8

    .line 1036
    invoke-interface {p2, v9, v8}, Lcom/google/android/gms/internal/drive/zzns;->zze(II)V

    .line 1037
    .line 1038
    .line 1039
    goto/16 :goto_3

    .line 1040
    .line 1041
    :pswitch_36
    invoke-direct {p0, p1, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v10

    .line 1045
    if-eqz v10, :cond_3

    .line 1046
    .line 1047
    and-int/2addr v8, v6

    .line 1048
    int-to-long v10, v8

    .line 1049
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 1050
    .line 1051
    .line 1052
    move-result-wide v10

    .line 1053
    invoke-interface {p2, v9, v10, v11}, Lcom/google/android/gms/internal/drive/zzns;->zzj(IJ)V

    .line 1054
    .line 1055
    .line 1056
    goto/16 :goto_3

    .line 1057
    .line 1058
    :pswitch_37
    invoke-direct {p0, p1, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1059
    .line 1060
    .line 1061
    move-result v10

    .line 1062
    if-eqz v10, :cond_3

    .line 1063
    .line 1064
    and-int/2addr v8, v6

    .line 1065
    int-to-long v10, v8

    .line 1066
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 1067
    .line 1068
    .line 1069
    move-result v8

    .line 1070
    invoke-interface {p2, v9, v8}, Lcom/google/android/gms/internal/drive/zzns;->zzm(II)V

    .line 1071
    .line 1072
    .line 1073
    goto/16 :goto_3

    .line 1074
    .line 1075
    :pswitch_38
    invoke-direct {p0, p1, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1076
    .line 1077
    .line 1078
    move-result v10

    .line 1079
    if-eqz v10, :cond_3

    .line 1080
    .line 1081
    and-int/2addr v8, v6

    .line 1082
    int-to-long v10, v8

    .line 1083
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 1084
    .line 1085
    .line 1086
    move-result v8

    .line 1087
    invoke-interface {p2, v9, v8}, Lcom/google/android/gms/internal/drive/zzns;->zzn(II)V

    .line 1088
    .line 1089
    .line 1090
    goto/16 :goto_3

    .line 1091
    .line 1092
    :pswitch_39
    invoke-direct {p0, p1, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1093
    .line 1094
    .line 1095
    move-result v10

    .line 1096
    if-eqz v10, :cond_3

    .line 1097
    .line 1098
    and-int/2addr v8, v6

    .line 1099
    int-to-long v10, v8

    .line 1100
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 1101
    .line 1102
    .line 1103
    move-result v8

    .line 1104
    invoke-interface {p2, v9, v8}, Lcom/google/android/gms/internal/drive/zzns;->zzd(II)V

    .line 1105
    .line 1106
    .line 1107
    goto/16 :goto_3

    .line 1108
    .line 1109
    :pswitch_3a
    invoke-direct {p0, p1, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1110
    .line 1111
    .line 1112
    move-result v10

    .line 1113
    if-eqz v10, :cond_3

    .line 1114
    .line 1115
    and-int/2addr v8, v6

    .line 1116
    int-to-long v10, v8

    .line 1117
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v8

    .line 1121
    check-cast v8, Lcom/google/android/gms/internal/drive/zzjc;

    .line 1122
    .line 1123
    invoke-interface {p2, v9, v8}, Lcom/google/android/gms/internal/drive/zzns;->zza(ILcom/google/android/gms/internal/drive/zzjc;)V

    .line 1124
    .line 1125
    .line 1126
    goto/16 :goto_3

    .line 1127
    .line 1128
    :pswitch_3b
    invoke-direct {p0, p1, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1129
    .line 1130
    .line 1131
    move-result v10

    .line 1132
    if-eqz v10, :cond_3

    .line 1133
    .line 1134
    and-int/2addr v8, v6

    .line 1135
    int-to-long v10, v8

    .line 1136
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v8

    .line 1140
    invoke-direct {p0, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v10

    .line 1144
    invoke-interface {p2, v9, v8, v10}, Lcom/google/android/gms/internal/drive/zzns;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzmf;)V

    .line 1145
    .line 1146
    .line 1147
    goto/16 :goto_3

    .line 1148
    .line 1149
    :pswitch_3c
    invoke-direct {p0, p1, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1150
    .line 1151
    .line 1152
    move-result v10

    .line 1153
    if-eqz v10, :cond_3

    .line 1154
    .line 1155
    and-int/2addr v8, v6

    .line 1156
    int-to-long v10, v8

    .line 1157
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v8

    .line 1161
    invoke-static {v9, v8, p2}, Lcom/google/android/gms/internal/drive/zzlu;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzns;)V

    .line 1162
    .line 1163
    .line 1164
    goto/16 :goto_3

    .line 1165
    .line 1166
    :pswitch_3d
    invoke-direct {p0, p1, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1167
    .line 1168
    .line 1169
    move-result v10

    .line 1170
    if-eqz v10, :cond_3

    .line 1171
    .line 1172
    and-int/2addr v8, v6

    .line 1173
    int-to-long v10, v8

    .line 1174
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzl(Ljava/lang/Object;J)Z

    .line 1175
    .line 1176
    .line 1177
    move-result v8

    .line 1178
    invoke-interface {p2, v9, v8}, Lcom/google/android/gms/internal/drive/zzns;->zzb(IZ)V

    .line 1179
    .line 1180
    .line 1181
    goto/16 :goto_3

    .line 1182
    .line 1183
    :pswitch_3e
    invoke-direct {p0, p1, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1184
    .line 1185
    .line 1186
    move-result v10

    .line 1187
    if-eqz v10, :cond_3

    .line 1188
    .line 1189
    and-int/2addr v8, v6

    .line 1190
    int-to-long v10, v8

    .line 1191
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 1192
    .line 1193
    .line 1194
    move-result v8

    .line 1195
    invoke-interface {p2, v9, v8}, Lcom/google/android/gms/internal/drive/zzns;->zzf(II)V

    .line 1196
    .line 1197
    .line 1198
    goto :goto_3

    .line 1199
    :pswitch_3f
    invoke-direct {p0, p1, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1200
    .line 1201
    .line 1202
    move-result v10

    .line 1203
    if-eqz v10, :cond_3

    .line 1204
    .line 1205
    and-int/2addr v8, v6

    .line 1206
    int-to-long v10, v8

    .line 1207
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 1208
    .line 1209
    .line 1210
    move-result-wide v10

    .line 1211
    invoke-interface {p2, v9, v10, v11}, Lcom/google/android/gms/internal/drive/zzns;->zzc(IJ)V

    .line 1212
    .line 1213
    .line 1214
    goto :goto_3

    .line 1215
    :pswitch_40
    invoke-direct {p0, p1, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1216
    .line 1217
    .line 1218
    move-result v10

    .line 1219
    if-eqz v10, :cond_3

    .line 1220
    .line 1221
    and-int/2addr v8, v6

    .line 1222
    int-to-long v10, v8

    .line 1223
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 1224
    .line 1225
    .line 1226
    move-result v8

    .line 1227
    invoke-interface {p2, v9, v8}, Lcom/google/android/gms/internal/drive/zzns;->zzc(II)V

    .line 1228
    .line 1229
    .line 1230
    goto :goto_3

    .line 1231
    :pswitch_41
    invoke-direct {p0, p1, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1232
    .line 1233
    .line 1234
    move-result v10

    .line 1235
    if-eqz v10, :cond_3

    .line 1236
    .line 1237
    and-int/2addr v8, v6

    .line 1238
    int-to-long v10, v8

    .line 1239
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 1240
    .line 1241
    .line 1242
    move-result-wide v10

    .line 1243
    invoke-interface {p2, v9, v10, v11}, Lcom/google/android/gms/internal/drive/zzns;->zza(IJ)V

    .line 1244
    .line 1245
    .line 1246
    goto :goto_3

    .line 1247
    :pswitch_42
    invoke-direct {p0, p1, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1248
    .line 1249
    .line 1250
    move-result v10

    .line 1251
    if-eqz v10, :cond_3

    .line 1252
    .line 1253
    and-int/2addr v8, v6

    .line 1254
    int-to-long v10, v8

    .line 1255
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 1256
    .line 1257
    .line 1258
    move-result-wide v10

    .line 1259
    invoke-interface {p2, v9, v10, v11}, Lcom/google/android/gms/internal/drive/zzns;->zzi(IJ)V

    .line 1260
    .line 1261
    .line 1262
    goto :goto_3

    .line 1263
    :pswitch_43
    invoke-direct {p0, p1, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1264
    .line 1265
    .line 1266
    move-result v10

    .line 1267
    if-eqz v10, :cond_3

    .line 1268
    .line 1269
    and-int/2addr v8, v6

    .line 1270
    int-to-long v10, v8

    .line 1271
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzm(Ljava/lang/Object;J)F

    .line 1272
    .line 1273
    .line 1274
    move-result v8

    .line 1275
    invoke-interface {p2, v9, v8}, Lcom/google/android/gms/internal/drive/zzns;->zza(IF)V

    .line 1276
    .line 1277
    .line 1278
    goto :goto_3

    .line 1279
    :pswitch_44
    invoke-direct {p0, p1, v7}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1280
    .line 1281
    .line 1282
    move-result v10

    .line 1283
    if-eqz v10, :cond_3

    .line 1284
    .line 1285
    and-int/2addr v8, v6

    .line 1286
    int-to-long v10, v8

    .line 1287
    invoke-static {p1, v10, v11}, Lcom/google/android/gms/internal/drive/zznd;->zzn(Ljava/lang/Object;J)D

    .line 1288
    .line 1289
    .line 1290
    move-result-wide v10

    .line 1291
    invoke-interface {p2, v9, v10, v11}, Lcom/google/android/gms/internal/drive/zzns;->zza(ID)V

    .line 1292
    .line 1293
    .line 1294
    :cond_3
    :goto_3
    add-int/lit8 v7, v7, -0x3

    .line 1295
    .line 1296
    goto/16 :goto_1

    .line 1297
    .line 1298
    :cond_4
    :goto_4
    if-eqz v1, :cond_6

    .line 1299
    .line 1300
    iget-object p1, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 1301
    .line 1302
    invoke-virtual {p1, p2, v1}, Lcom/google/android/gms/internal/drive/zzjy;->zza(Lcom/google/android/gms/internal/drive/zzns;Ljava/util/Map$Entry;)V

    .line 1303
    .line 1304
    .line 1305
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1306
    .line 1307
    .line 1308
    move-result p1

    .line 1309
    if-eqz p1, :cond_5

    .line 1310
    .line 1311
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1312
    .line 1313
    .line 1314
    move-result-object p1

    .line 1315
    check-cast p1, Ljava/util/Map$Entry;

    .line 1316
    .line 1317
    move-object v1, p1

    .line 1318
    goto :goto_4

    .line 1319
    :cond_5
    move-object v1, v3

    .line 1320
    goto :goto_4

    .line 1321
    :cond_6
    return-void

    .line 1322
    :cond_7
    iget-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzuk:Z

    .line 1323
    .line 1324
    if-eqz v0, :cond_f

    .line 1325
    .line 1326
    iget-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzui:Z

    .line 1327
    .line 1328
    if-eqz v0, :cond_8

    .line 1329
    .line 1330
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 1331
    .line 1332
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/drive/zzjy;->zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzkb;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v0

    .line 1336
    iget-object v1, v0, Lcom/google/android/gms/internal/drive/zzkb;->zzos:Lcom/google/android/gms/internal/drive/zzmi;

    .line 1337
    .line 1338
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 1339
    .line 1340
    .line 1341
    move-result v1

    .line 1342
    if-nez v1, :cond_8

    .line 1343
    .line 1344
    invoke-virtual {v0}, Lcom/google/android/gms/internal/drive/zzkb;->iterator()Ljava/util/Iterator;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v0

    .line 1348
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v1

    .line 1352
    check-cast v1, Ljava/util/Map$Entry;

    .line 1353
    .line 1354
    goto :goto_5

    .line 1355
    :cond_8
    move-object v0, v3

    .line 1356
    move-object v1, v0

    .line 1357
    :goto_5
    iget-object v7, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1358
    .line 1359
    array-length v7, v7

    .line 1360
    move v8, v5

    .line 1361
    :goto_6
    if-ge v8, v7, :cond_c

    .line 1362
    .line 1363
    invoke-direct {p0, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zzas(I)I

    .line 1364
    .line 1365
    .line 1366
    move-result v9

    .line 1367
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1368
    .line 1369
    aget v10, v10, v8

    .line 1370
    .line 1371
    :goto_7
    if-eqz v1, :cond_a

    .line 1372
    .line 1373
    iget-object v11, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 1374
    .line 1375
    invoke-virtual {v11, v1}, Lcom/google/android/gms/internal/drive/zzjy;->zza(Ljava/util/Map$Entry;)I

    .line 1376
    .line 1377
    .line 1378
    move-result v11

    .line 1379
    if-gt v11, v10, :cond_a

    .line 1380
    .line 1381
    iget-object v11, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 1382
    .line 1383
    invoke-virtual {v11, p2, v1}, Lcom/google/android/gms/internal/drive/zzjy;->zza(Lcom/google/android/gms/internal/drive/zzns;Ljava/util/Map$Entry;)V

    .line 1384
    .line 1385
    .line 1386
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1387
    .line 1388
    .line 1389
    move-result v1

    .line 1390
    if-eqz v1, :cond_9

    .line 1391
    .line 1392
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v1

    .line 1396
    check-cast v1, Ljava/util/Map$Entry;

    .line 1397
    .line 1398
    goto :goto_7

    .line 1399
    :cond_9
    move-object v1, v3

    .line 1400
    goto :goto_7

    .line 1401
    :cond_a
    and-int v11, v9, v2

    .line 1402
    .line 1403
    ushr-int/lit8 v11, v11, 0x14

    .line 1404
    .line 1405
    packed-switch v11, :pswitch_data_1

    .line 1406
    .line 1407
    .line 1408
    goto/16 :goto_8

    .line 1409
    .line 1410
    :pswitch_45
    invoke-direct {p0, p1, v10, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1411
    .line 1412
    .line 1413
    move-result v11

    .line 1414
    if-eqz v11, :cond_b

    .line 1415
    .line 1416
    and-int/2addr v9, v6

    .line 1417
    int-to-long v11, v9

    .line 1418
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v9

    .line 1422
    invoke-direct {p0, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v11

    .line 1426
    invoke-interface {p2, v10, v9, v11}, Lcom/google/android/gms/internal/drive/zzns;->zzb(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzmf;)V

    .line 1427
    .line 1428
    .line 1429
    goto/16 :goto_8

    .line 1430
    .line 1431
    :pswitch_46
    invoke-direct {p0, p1, v10, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1432
    .line 1433
    .line 1434
    move-result v11

    .line 1435
    if-eqz v11, :cond_b

    .line 1436
    .line 1437
    and-int/2addr v9, v6

    .line 1438
    int-to-long v11, v9

    .line 1439
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 1440
    .line 1441
    .line 1442
    move-result-wide v11

    .line 1443
    invoke-interface {p2, v10, v11, v12}, Lcom/google/android/gms/internal/drive/zzns;->zzb(IJ)V

    .line 1444
    .line 1445
    .line 1446
    goto/16 :goto_8

    .line 1447
    .line 1448
    :pswitch_47
    invoke-direct {p0, p1, v10, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1449
    .line 1450
    .line 1451
    move-result v11

    .line 1452
    if-eqz v11, :cond_b

    .line 1453
    .line 1454
    and-int/2addr v9, v6

    .line 1455
    int-to-long v11, v9

    .line 1456
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 1457
    .line 1458
    .line 1459
    move-result v9

    .line 1460
    invoke-interface {p2, v10, v9}, Lcom/google/android/gms/internal/drive/zzns;->zze(II)V

    .line 1461
    .line 1462
    .line 1463
    goto/16 :goto_8

    .line 1464
    .line 1465
    :pswitch_48
    invoke-direct {p0, p1, v10, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1466
    .line 1467
    .line 1468
    move-result v11

    .line 1469
    if-eqz v11, :cond_b

    .line 1470
    .line 1471
    and-int/2addr v9, v6

    .line 1472
    int-to-long v11, v9

    .line 1473
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 1474
    .line 1475
    .line 1476
    move-result-wide v11

    .line 1477
    invoke-interface {p2, v10, v11, v12}, Lcom/google/android/gms/internal/drive/zzns;->zzj(IJ)V

    .line 1478
    .line 1479
    .line 1480
    goto/16 :goto_8

    .line 1481
    .line 1482
    :pswitch_49
    invoke-direct {p0, p1, v10, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1483
    .line 1484
    .line 1485
    move-result v11

    .line 1486
    if-eqz v11, :cond_b

    .line 1487
    .line 1488
    and-int/2addr v9, v6

    .line 1489
    int-to-long v11, v9

    .line 1490
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 1491
    .line 1492
    .line 1493
    move-result v9

    .line 1494
    invoke-interface {p2, v10, v9}, Lcom/google/android/gms/internal/drive/zzns;->zzm(II)V

    .line 1495
    .line 1496
    .line 1497
    goto/16 :goto_8

    .line 1498
    .line 1499
    :pswitch_4a
    invoke-direct {p0, p1, v10, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1500
    .line 1501
    .line 1502
    move-result v11

    .line 1503
    if-eqz v11, :cond_b

    .line 1504
    .line 1505
    and-int/2addr v9, v6

    .line 1506
    int-to-long v11, v9

    .line 1507
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 1508
    .line 1509
    .line 1510
    move-result v9

    .line 1511
    invoke-interface {p2, v10, v9}, Lcom/google/android/gms/internal/drive/zzns;->zzn(II)V

    .line 1512
    .line 1513
    .line 1514
    goto/16 :goto_8

    .line 1515
    .line 1516
    :pswitch_4b
    invoke-direct {p0, p1, v10, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1517
    .line 1518
    .line 1519
    move-result v11

    .line 1520
    if-eqz v11, :cond_b

    .line 1521
    .line 1522
    and-int/2addr v9, v6

    .line 1523
    int-to-long v11, v9

    .line 1524
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 1525
    .line 1526
    .line 1527
    move-result v9

    .line 1528
    invoke-interface {p2, v10, v9}, Lcom/google/android/gms/internal/drive/zzns;->zzd(II)V

    .line 1529
    .line 1530
    .line 1531
    goto/16 :goto_8

    .line 1532
    .line 1533
    :pswitch_4c
    invoke-direct {p0, p1, v10, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1534
    .line 1535
    .line 1536
    move-result v11

    .line 1537
    if-eqz v11, :cond_b

    .line 1538
    .line 1539
    and-int/2addr v9, v6

    .line 1540
    int-to-long v11, v9

    .line 1541
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v9

    .line 1545
    check-cast v9, Lcom/google/android/gms/internal/drive/zzjc;

    .line 1546
    .line 1547
    invoke-interface {p2, v10, v9}, Lcom/google/android/gms/internal/drive/zzns;->zza(ILcom/google/android/gms/internal/drive/zzjc;)V

    .line 1548
    .line 1549
    .line 1550
    goto/16 :goto_8

    .line 1551
    .line 1552
    :pswitch_4d
    invoke-direct {p0, p1, v10, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1553
    .line 1554
    .line 1555
    move-result v11

    .line 1556
    if-eqz v11, :cond_b

    .line 1557
    .line 1558
    and-int/2addr v9, v6

    .line 1559
    int-to-long v11, v9

    .line 1560
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v9

    .line 1564
    invoke-direct {p0, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v11

    .line 1568
    invoke-interface {p2, v10, v9, v11}, Lcom/google/android/gms/internal/drive/zzns;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzmf;)V

    .line 1569
    .line 1570
    .line 1571
    goto/16 :goto_8

    .line 1572
    .line 1573
    :pswitch_4e
    invoke-direct {p0, p1, v10, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1574
    .line 1575
    .line 1576
    move-result v11

    .line 1577
    if-eqz v11, :cond_b

    .line 1578
    .line 1579
    and-int/2addr v9, v6

    .line 1580
    int-to-long v11, v9

    .line 1581
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v9

    .line 1585
    invoke-static {v10, v9, p2}, Lcom/google/android/gms/internal/drive/zzlu;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzns;)V

    .line 1586
    .line 1587
    .line 1588
    goto/16 :goto_8

    .line 1589
    .line 1590
    :pswitch_4f
    invoke-direct {p0, p1, v10, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1591
    .line 1592
    .line 1593
    move-result v11

    .line 1594
    if-eqz v11, :cond_b

    .line 1595
    .line 1596
    and-int/2addr v9, v6

    .line 1597
    int-to-long v11, v9

    .line 1598
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzi(Ljava/lang/Object;J)Z

    .line 1599
    .line 1600
    .line 1601
    move-result v9

    .line 1602
    invoke-interface {p2, v10, v9}, Lcom/google/android/gms/internal/drive/zzns;->zzb(IZ)V

    .line 1603
    .line 1604
    .line 1605
    goto/16 :goto_8

    .line 1606
    .line 1607
    :pswitch_50
    invoke-direct {p0, p1, v10, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1608
    .line 1609
    .line 1610
    move-result v11

    .line 1611
    if-eqz v11, :cond_b

    .line 1612
    .line 1613
    and-int/2addr v9, v6

    .line 1614
    int-to-long v11, v9

    .line 1615
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 1616
    .line 1617
    .line 1618
    move-result v9

    .line 1619
    invoke-interface {p2, v10, v9}, Lcom/google/android/gms/internal/drive/zzns;->zzf(II)V

    .line 1620
    .line 1621
    .line 1622
    goto/16 :goto_8

    .line 1623
    .line 1624
    :pswitch_51
    invoke-direct {p0, p1, v10, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1625
    .line 1626
    .line 1627
    move-result v11

    .line 1628
    if-eqz v11, :cond_b

    .line 1629
    .line 1630
    and-int/2addr v9, v6

    .line 1631
    int-to-long v11, v9

    .line 1632
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 1633
    .line 1634
    .line 1635
    move-result-wide v11

    .line 1636
    invoke-interface {p2, v10, v11, v12}, Lcom/google/android/gms/internal/drive/zzns;->zzc(IJ)V

    .line 1637
    .line 1638
    .line 1639
    goto/16 :goto_8

    .line 1640
    .line 1641
    :pswitch_52
    invoke-direct {p0, p1, v10, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1642
    .line 1643
    .line 1644
    move-result v11

    .line 1645
    if-eqz v11, :cond_b

    .line 1646
    .line 1647
    and-int/2addr v9, v6

    .line 1648
    int-to-long v11, v9

    .line 1649
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 1650
    .line 1651
    .line 1652
    move-result v9

    .line 1653
    invoke-interface {p2, v10, v9}, Lcom/google/android/gms/internal/drive/zzns;->zzc(II)V

    .line 1654
    .line 1655
    .line 1656
    goto/16 :goto_8

    .line 1657
    .line 1658
    :pswitch_53
    invoke-direct {p0, p1, v10, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1659
    .line 1660
    .line 1661
    move-result v11

    .line 1662
    if-eqz v11, :cond_b

    .line 1663
    .line 1664
    and-int/2addr v9, v6

    .line 1665
    int-to-long v11, v9

    .line 1666
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 1667
    .line 1668
    .line 1669
    move-result-wide v11

    .line 1670
    invoke-interface {p2, v10, v11, v12}, Lcom/google/android/gms/internal/drive/zzns;->zza(IJ)V

    .line 1671
    .line 1672
    .line 1673
    goto/16 :goto_8

    .line 1674
    .line 1675
    :pswitch_54
    invoke-direct {p0, p1, v10, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1676
    .line 1677
    .line 1678
    move-result v11

    .line 1679
    if-eqz v11, :cond_b

    .line 1680
    .line 1681
    and-int/2addr v9, v6

    .line 1682
    int-to-long v11, v9

    .line 1683
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 1684
    .line 1685
    .line 1686
    move-result-wide v11

    .line 1687
    invoke-interface {p2, v10, v11, v12}, Lcom/google/android/gms/internal/drive/zzns;->zzi(IJ)V

    .line 1688
    .line 1689
    .line 1690
    goto/16 :goto_8

    .line 1691
    .line 1692
    :pswitch_55
    invoke-direct {p0, p1, v10, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1693
    .line 1694
    .line 1695
    move-result v11

    .line 1696
    if-eqz v11, :cond_b

    .line 1697
    .line 1698
    and-int/2addr v9, v6

    .line 1699
    int-to-long v11, v9

    .line 1700
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzf(Ljava/lang/Object;J)F

    .line 1701
    .line 1702
    .line 1703
    move-result v9

    .line 1704
    invoke-interface {p2, v10, v9}, Lcom/google/android/gms/internal/drive/zzns;->zza(IF)V

    .line 1705
    .line 1706
    .line 1707
    goto/16 :goto_8

    .line 1708
    .line 1709
    :pswitch_56
    invoke-direct {p0, p1, v10, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1710
    .line 1711
    .line 1712
    move-result v11

    .line 1713
    if-eqz v11, :cond_b

    .line 1714
    .line 1715
    and-int/2addr v9, v6

    .line 1716
    int-to-long v11, v9

    .line 1717
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zze(Ljava/lang/Object;J)D

    .line 1718
    .line 1719
    .line 1720
    move-result-wide v11

    .line 1721
    invoke-interface {p2, v10, v11, v12}, Lcom/google/android/gms/internal/drive/zzns;->zza(ID)V

    .line 1722
    .line 1723
    .line 1724
    goto/16 :goto_8

    .line 1725
    .line 1726
    :pswitch_57
    and-int/2addr v9, v6

    .line 1727
    int-to-long v11, v9

    .line 1728
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v9

    .line 1732
    invoke-direct {p0, p2, v10, v9, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Lcom/google/android/gms/internal/drive/zzns;ILjava/lang/Object;I)V

    .line 1733
    .line 1734
    .line 1735
    goto/16 :goto_8

    .line 1736
    .line 1737
    :pswitch_58
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1738
    .line 1739
    aget v10, v10, v8

    .line 1740
    .line 1741
    and-int/2addr v9, v6

    .line 1742
    int-to-long v11, v9

    .line 1743
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1744
    .line 1745
    .line 1746
    move-result-object v9

    .line 1747
    check-cast v9, Ljava/util/List;

    .line 1748
    .line 1749
    invoke-direct {p0, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v11

    .line 1753
    invoke-static {v10, v9, p2, v11}, Lcom/google/android/gms/internal/drive/zzmh;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Lcom/google/android/gms/internal/drive/zzmf;)V

    .line 1754
    .line 1755
    .line 1756
    goto/16 :goto_8

    .line 1757
    .line 1758
    :pswitch_59
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1759
    .line 1760
    aget v10, v10, v8

    .line 1761
    .line 1762
    and-int/2addr v9, v6

    .line 1763
    int-to-long v11, v9

    .line 1764
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v9

    .line 1768
    check-cast v9, Ljava/util/List;

    .line 1769
    .line 1770
    invoke-static {v10, v9, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zze(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 1771
    .line 1772
    .line 1773
    goto/16 :goto_8

    .line 1774
    .line 1775
    :pswitch_5a
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1776
    .line 1777
    aget v10, v10, v8

    .line 1778
    .line 1779
    and-int/2addr v9, v6

    .line 1780
    int-to-long v11, v9

    .line 1781
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v9

    .line 1785
    check-cast v9, Ljava/util/List;

    .line 1786
    .line 1787
    invoke-static {v10, v9, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzj(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 1788
    .line 1789
    .line 1790
    goto/16 :goto_8

    .line 1791
    .line 1792
    :pswitch_5b
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1793
    .line 1794
    aget v10, v10, v8

    .line 1795
    .line 1796
    and-int/2addr v9, v6

    .line 1797
    int-to-long v11, v9

    .line 1798
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v9

    .line 1802
    check-cast v9, Ljava/util/List;

    .line 1803
    .line 1804
    invoke-static {v10, v9, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzg(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 1805
    .line 1806
    .line 1807
    goto/16 :goto_8

    .line 1808
    .line 1809
    :pswitch_5c
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1810
    .line 1811
    aget v10, v10, v8

    .line 1812
    .line 1813
    and-int/2addr v9, v6

    .line 1814
    int-to-long v11, v9

    .line 1815
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1816
    .line 1817
    .line 1818
    move-result-object v9

    .line 1819
    check-cast v9, Ljava/util/List;

    .line 1820
    .line 1821
    invoke-static {v10, v9, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzl(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 1822
    .line 1823
    .line 1824
    goto/16 :goto_8

    .line 1825
    .line 1826
    :pswitch_5d
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1827
    .line 1828
    aget v10, v10, v8

    .line 1829
    .line 1830
    and-int/2addr v9, v6

    .line 1831
    int-to-long v11, v9

    .line 1832
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v9

    .line 1836
    check-cast v9, Ljava/util/List;

    .line 1837
    .line 1838
    invoke-static {v10, v9, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzm(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 1839
    .line 1840
    .line 1841
    goto/16 :goto_8

    .line 1842
    .line 1843
    :pswitch_5e
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1844
    .line 1845
    aget v10, v10, v8

    .line 1846
    .line 1847
    and-int/2addr v9, v6

    .line 1848
    int-to-long v11, v9

    .line 1849
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v9

    .line 1853
    check-cast v9, Ljava/util/List;

    .line 1854
    .line 1855
    invoke-static {v10, v9, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzi(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 1856
    .line 1857
    .line 1858
    goto/16 :goto_8

    .line 1859
    .line 1860
    :pswitch_5f
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1861
    .line 1862
    aget v10, v10, v8

    .line 1863
    .line 1864
    and-int/2addr v9, v6

    .line 1865
    int-to-long v11, v9

    .line 1866
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v9

    .line 1870
    check-cast v9, Ljava/util/List;

    .line 1871
    .line 1872
    invoke-static {v10, v9, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzn(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 1873
    .line 1874
    .line 1875
    goto/16 :goto_8

    .line 1876
    .line 1877
    :pswitch_60
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1878
    .line 1879
    aget v10, v10, v8

    .line 1880
    .line 1881
    and-int/2addr v9, v6

    .line 1882
    int-to-long v11, v9

    .line 1883
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v9

    .line 1887
    check-cast v9, Ljava/util/List;

    .line 1888
    .line 1889
    invoke-static {v10, v9, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzk(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 1890
    .line 1891
    .line 1892
    goto/16 :goto_8

    .line 1893
    .line 1894
    :pswitch_61
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1895
    .line 1896
    aget v10, v10, v8

    .line 1897
    .line 1898
    and-int/2addr v9, v6

    .line 1899
    int-to-long v11, v9

    .line 1900
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1901
    .line 1902
    .line 1903
    move-result-object v9

    .line 1904
    check-cast v9, Ljava/util/List;

    .line 1905
    .line 1906
    invoke-static {v10, v9, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzf(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 1907
    .line 1908
    .line 1909
    goto/16 :goto_8

    .line 1910
    .line 1911
    :pswitch_62
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1912
    .line 1913
    aget v10, v10, v8

    .line 1914
    .line 1915
    and-int/2addr v9, v6

    .line 1916
    int-to-long v11, v9

    .line 1917
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1918
    .line 1919
    .line 1920
    move-result-object v9

    .line 1921
    check-cast v9, Ljava/util/List;

    .line 1922
    .line 1923
    invoke-static {v10, v9, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzh(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 1924
    .line 1925
    .line 1926
    goto/16 :goto_8

    .line 1927
    .line 1928
    :pswitch_63
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1929
    .line 1930
    aget v10, v10, v8

    .line 1931
    .line 1932
    and-int/2addr v9, v6

    .line 1933
    int-to-long v11, v9

    .line 1934
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1935
    .line 1936
    .line 1937
    move-result-object v9

    .line 1938
    check-cast v9, Ljava/util/List;

    .line 1939
    .line 1940
    invoke-static {v10, v9, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzd(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 1941
    .line 1942
    .line 1943
    goto/16 :goto_8

    .line 1944
    .line 1945
    :pswitch_64
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1946
    .line 1947
    aget v10, v10, v8

    .line 1948
    .line 1949
    and-int/2addr v9, v6

    .line 1950
    int-to-long v11, v9

    .line 1951
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1952
    .line 1953
    .line 1954
    move-result-object v9

    .line 1955
    check-cast v9, Ljava/util/List;

    .line 1956
    .line 1957
    invoke-static {v10, v9, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzc(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 1958
    .line 1959
    .line 1960
    goto/16 :goto_8

    .line 1961
    .line 1962
    :pswitch_65
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1963
    .line 1964
    aget v10, v10, v8

    .line 1965
    .line 1966
    and-int/2addr v9, v6

    .line 1967
    int-to-long v11, v9

    .line 1968
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1969
    .line 1970
    .line 1971
    move-result-object v9

    .line 1972
    check-cast v9, Ljava/util/List;

    .line 1973
    .line 1974
    invoke-static {v10, v9, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 1975
    .line 1976
    .line 1977
    goto/16 :goto_8

    .line 1978
    .line 1979
    :pswitch_66
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1980
    .line 1981
    aget v10, v10, v8

    .line 1982
    .line 1983
    and-int/2addr v9, v6

    .line 1984
    int-to-long v11, v9

    .line 1985
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1986
    .line 1987
    .line 1988
    move-result-object v9

    .line 1989
    check-cast v9, Ljava/util/List;

    .line 1990
    .line 1991
    invoke-static {v10, v9, p2, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zza(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 1992
    .line 1993
    .line 1994
    goto/16 :goto_8

    .line 1995
    .line 1996
    :pswitch_67
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1997
    .line 1998
    aget v10, v10, v8

    .line 1999
    .line 2000
    and-int/2addr v9, v6

    .line 2001
    int-to-long v11, v9

    .line 2002
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2003
    .line 2004
    .line 2005
    move-result-object v9

    .line 2006
    check-cast v9, Ljava/util/List;

    .line 2007
    .line 2008
    invoke-static {v10, v9, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zze(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 2009
    .line 2010
    .line 2011
    goto/16 :goto_8

    .line 2012
    .line 2013
    :pswitch_68
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2014
    .line 2015
    aget v10, v10, v8

    .line 2016
    .line 2017
    and-int/2addr v9, v6

    .line 2018
    int-to-long v11, v9

    .line 2019
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2020
    .line 2021
    .line 2022
    move-result-object v9

    .line 2023
    check-cast v9, Ljava/util/List;

    .line 2024
    .line 2025
    invoke-static {v10, v9, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzj(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 2026
    .line 2027
    .line 2028
    goto/16 :goto_8

    .line 2029
    .line 2030
    :pswitch_69
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2031
    .line 2032
    aget v10, v10, v8

    .line 2033
    .line 2034
    and-int/2addr v9, v6

    .line 2035
    int-to-long v11, v9

    .line 2036
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2037
    .line 2038
    .line 2039
    move-result-object v9

    .line 2040
    check-cast v9, Ljava/util/List;

    .line 2041
    .line 2042
    invoke-static {v10, v9, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzg(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 2043
    .line 2044
    .line 2045
    goto/16 :goto_8

    .line 2046
    .line 2047
    :pswitch_6a
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2048
    .line 2049
    aget v10, v10, v8

    .line 2050
    .line 2051
    and-int/2addr v9, v6

    .line 2052
    int-to-long v11, v9

    .line 2053
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2054
    .line 2055
    .line 2056
    move-result-object v9

    .line 2057
    check-cast v9, Ljava/util/List;

    .line 2058
    .line 2059
    invoke-static {v10, v9, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzl(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 2060
    .line 2061
    .line 2062
    goto/16 :goto_8

    .line 2063
    .line 2064
    :pswitch_6b
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2065
    .line 2066
    aget v10, v10, v8

    .line 2067
    .line 2068
    and-int/2addr v9, v6

    .line 2069
    int-to-long v11, v9

    .line 2070
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2071
    .line 2072
    .line 2073
    move-result-object v9

    .line 2074
    check-cast v9, Ljava/util/List;

    .line 2075
    .line 2076
    invoke-static {v10, v9, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzm(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 2077
    .line 2078
    .line 2079
    goto/16 :goto_8

    .line 2080
    .line 2081
    :pswitch_6c
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2082
    .line 2083
    aget v10, v10, v8

    .line 2084
    .line 2085
    and-int/2addr v9, v6

    .line 2086
    int-to-long v11, v9

    .line 2087
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2088
    .line 2089
    .line 2090
    move-result-object v9

    .line 2091
    check-cast v9, Ljava/util/List;

    .line 2092
    .line 2093
    invoke-static {v10, v9, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzi(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 2094
    .line 2095
    .line 2096
    goto/16 :goto_8

    .line 2097
    .line 2098
    :pswitch_6d
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2099
    .line 2100
    aget v10, v10, v8

    .line 2101
    .line 2102
    and-int/2addr v9, v6

    .line 2103
    int-to-long v11, v9

    .line 2104
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2105
    .line 2106
    .line 2107
    move-result-object v9

    .line 2108
    check-cast v9, Ljava/util/List;

    .line 2109
    .line 2110
    invoke-static {v10, v9, p2}, Lcom/google/android/gms/internal/drive/zzmh;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;)V

    .line 2111
    .line 2112
    .line 2113
    goto/16 :goto_8

    .line 2114
    .line 2115
    :pswitch_6e
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2116
    .line 2117
    aget v10, v10, v8

    .line 2118
    .line 2119
    and-int/2addr v9, v6

    .line 2120
    int-to-long v11, v9

    .line 2121
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2122
    .line 2123
    .line 2124
    move-result-object v9

    .line 2125
    check-cast v9, Ljava/util/List;

    .line 2126
    .line 2127
    invoke-direct {p0, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 2128
    .line 2129
    .line 2130
    move-result-object v11

    .line 2131
    invoke-static {v10, v9, p2, v11}, Lcom/google/android/gms/internal/drive/zzmh;->zza(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Lcom/google/android/gms/internal/drive/zzmf;)V

    .line 2132
    .line 2133
    .line 2134
    goto/16 :goto_8

    .line 2135
    .line 2136
    :pswitch_6f
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2137
    .line 2138
    aget v10, v10, v8

    .line 2139
    .line 2140
    and-int/2addr v9, v6

    .line 2141
    int-to-long v11, v9

    .line 2142
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2143
    .line 2144
    .line 2145
    move-result-object v9

    .line 2146
    check-cast v9, Ljava/util/List;

    .line 2147
    .line 2148
    invoke-static {v10, v9, p2}, Lcom/google/android/gms/internal/drive/zzmh;->zza(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;)V

    .line 2149
    .line 2150
    .line 2151
    goto/16 :goto_8

    .line 2152
    .line 2153
    :pswitch_70
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2154
    .line 2155
    aget v10, v10, v8

    .line 2156
    .line 2157
    and-int/2addr v9, v6

    .line 2158
    int-to-long v11, v9

    .line 2159
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2160
    .line 2161
    .line 2162
    move-result-object v9

    .line 2163
    check-cast v9, Ljava/util/List;

    .line 2164
    .line 2165
    invoke-static {v10, v9, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzn(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 2166
    .line 2167
    .line 2168
    goto/16 :goto_8

    .line 2169
    .line 2170
    :pswitch_71
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2171
    .line 2172
    aget v10, v10, v8

    .line 2173
    .line 2174
    and-int/2addr v9, v6

    .line 2175
    int-to-long v11, v9

    .line 2176
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2177
    .line 2178
    .line 2179
    move-result-object v9

    .line 2180
    check-cast v9, Ljava/util/List;

    .line 2181
    .line 2182
    invoke-static {v10, v9, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzk(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 2183
    .line 2184
    .line 2185
    goto/16 :goto_8

    .line 2186
    .line 2187
    :pswitch_72
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2188
    .line 2189
    aget v10, v10, v8

    .line 2190
    .line 2191
    and-int/2addr v9, v6

    .line 2192
    int-to-long v11, v9

    .line 2193
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2194
    .line 2195
    .line 2196
    move-result-object v9

    .line 2197
    check-cast v9, Ljava/util/List;

    .line 2198
    .line 2199
    invoke-static {v10, v9, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzf(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 2200
    .line 2201
    .line 2202
    goto/16 :goto_8

    .line 2203
    .line 2204
    :pswitch_73
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2205
    .line 2206
    aget v10, v10, v8

    .line 2207
    .line 2208
    and-int/2addr v9, v6

    .line 2209
    int-to-long v11, v9

    .line 2210
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2211
    .line 2212
    .line 2213
    move-result-object v9

    .line 2214
    check-cast v9, Ljava/util/List;

    .line 2215
    .line 2216
    invoke-static {v10, v9, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzh(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 2217
    .line 2218
    .line 2219
    goto/16 :goto_8

    .line 2220
    .line 2221
    :pswitch_74
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2222
    .line 2223
    aget v10, v10, v8

    .line 2224
    .line 2225
    and-int/2addr v9, v6

    .line 2226
    int-to-long v11, v9

    .line 2227
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2228
    .line 2229
    .line 2230
    move-result-object v9

    .line 2231
    check-cast v9, Ljava/util/List;

    .line 2232
    .line 2233
    invoke-static {v10, v9, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzd(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 2234
    .line 2235
    .line 2236
    goto/16 :goto_8

    .line 2237
    .line 2238
    :pswitch_75
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2239
    .line 2240
    aget v10, v10, v8

    .line 2241
    .line 2242
    and-int/2addr v9, v6

    .line 2243
    int-to-long v11, v9

    .line 2244
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2245
    .line 2246
    .line 2247
    move-result-object v9

    .line 2248
    check-cast v9, Ljava/util/List;

    .line 2249
    .line 2250
    invoke-static {v10, v9, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzc(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 2251
    .line 2252
    .line 2253
    goto/16 :goto_8

    .line 2254
    .line 2255
    :pswitch_76
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2256
    .line 2257
    aget v10, v10, v8

    .line 2258
    .line 2259
    and-int/2addr v9, v6

    .line 2260
    int-to-long v11, v9

    .line 2261
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2262
    .line 2263
    .line 2264
    move-result-object v9

    .line 2265
    check-cast v9, Ljava/util/List;

    .line 2266
    .line 2267
    invoke-static {v10, v9, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 2268
    .line 2269
    .line 2270
    goto/16 :goto_8

    .line 2271
    .line 2272
    :pswitch_77
    iget-object v10, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 2273
    .line 2274
    aget v10, v10, v8

    .line 2275
    .line 2276
    and-int/2addr v9, v6

    .line 2277
    int-to-long v11, v9

    .line 2278
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2279
    .line 2280
    .line 2281
    move-result-object v9

    .line 2282
    check-cast v9, Ljava/util/List;

    .line 2283
    .line 2284
    invoke-static {v10, v9, p2, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zza(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzns;Z)V

    .line 2285
    .line 2286
    .line 2287
    goto/16 :goto_8

    .line 2288
    .line 2289
    :pswitch_78
    invoke-direct {p0, p1, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 2290
    .line 2291
    .line 2292
    move-result v11

    .line 2293
    if-eqz v11, :cond_b

    .line 2294
    .line 2295
    and-int/2addr v9, v6

    .line 2296
    int-to-long v11, v9

    .line 2297
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2298
    .line 2299
    .line 2300
    move-result-object v9

    .line 2301
    invoke-direct {p0, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 2302
    .line 2303
    .line 2304
    move-result-object v11

    .line 2305
    invoke-interface {p2, v10, v9, v11}, Lcom/google/android/gms/internal/drive/zzns;->zzb(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzmf;)V

    .line 2306
    .line 2307
    .line 2308
    goto/16 :goto_8

    .line 2309
    .line 2310
    :pswitch_79
    invoke-direct {p0, p1, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 2311
    .line 2312
    .line 2313
    move-result v11

    .line 2314
    if-eqz v11, :cond_b

    .line 2315
    .line 2316
    and-int/2addr v9, v6

    .line 2317
    int-to-long v11, v9

    .line 2318
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 2319
    .line 2320
    .line 2321
    move-result-wide v11

    .line 2322
    invoke-interface {p2, v10, v11, v12}, Lcom/google/android/gms/internal/drive/zzns;->zzb(IJ)V

    .line 2323
    .line 2324
    .line 2325
    goto/16 :goto_8

    .line 2326
    .line 2327
    :pswitch_7a
    invoke-direct {p0, p1, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 2328
    .line 2329
    .line 2330
    move-result v11

    .line 2331
    if-eqz v11, :cond_b

    .line 2332
    .line 2333
    and-int/2addr v9, v6

    .line 2334
    int-to-long v11, v9

    .line 2335
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 2336
    .line 2337
    .line 2338
    move-result v9

    .line 2339
    invoke-interface {p2, v10, v9}, Lcom/google/android/gms/internal/drive/zzns;->zze(II)V

    .line 2340
    .line 2341
    .line 2342
    goto/16 :goto_8

    .line 2343
    .line 2344
    :pswitch_7b
    invoke-direct {p0, p1, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 2345
    .line 2346
    .line 2347
    move-result v11

    .line 2348
    if-eqz v11, :cond_b

    .line 2349
    .line 2350
    and-int/2addr v9, v6

    .line 2351
    int-to-long v11, v9

    .line 2352
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 2353
    .line 2354
    .line 2355
    move-result-wide v11

    .line 2356
    invoke-interface {p2, v10, v11, v12}, Lcom/google/android/gms/internal/drive/zzns;->zzj(IJ)V

    .line 2357
    .line 2358
    .line 2359
    goto/16 :goto_8

    .line 2360
    .line 2361
    :pswitch_7c
    invoke-direct {p0, p1, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 2362
    .line 2363
    .line 2364
    move-result v11

    .line 2365
    if-eqz v11, :cond_b

    .line 2366
    .line 2367
    and-int/2addr v9, v6

    .line 2368
    int-to-long v11, v9

    .line 2369
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 2370
    .line 2371
    .line 2372
    move-result v9

    .line 2373
    invoke-interface {p2, v10, v9}, Lcom/google/android/gms/internal/drive/zzns;->zzm(II)V

    .line 2374
    .line 2375
    .line 2376
    goto/16 :goto_8

    .line 2377
    .line 2378
    :pswitch_7d
    invoke-direct {p0, p1, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 2379
    .line 2380
    .line 2381
    move-result v11

    .line 2382
    if-eqz v11, :cond_b

    .line 2383
    .line 2384
    and-int/2addr v9, v6

    .line 2385
    int-to-long v11, v9

    .line 2386
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 2387
    .line 2388
    .line 2389
    move-result v9

    .line 2390
    invoke-interface {p2, v10, v9}, Lcom/google/android/gms/internal/drive/zzns;->zzn(II)V

    .line 2391
    .line 2392
    .line 2393
    goto/16 :goto_8

    .line 2394
    .line 2395
    :pswitch_7e
    invoke-direct {p0, p1, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 2396
    .line 2397
    .line 2398
    move-result v11

    .line 2399
    if-eqz v11, :cond_b

    .line 2400
    .line 2401
    and-int/2addr v9, v6

    .line 2402
    int-to-long v11, v9

    .line 2403
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 2404
    .line 2405
    .line 2406
    move-result v9

    .line 2407
    invoke-interface {p2, v10, v9}, Lcom/google/android/gms/internal/drive/zzns;->zzd(II)V

    .line 2408
    .line 2409
    .line 2410
    goto/16 :goto_8

    .line 2411
    .line 2412
    :pswitch_7f
    invoke-direct {p0, p1, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 2413
    .line 2414
    .line 2415
    move-result v11

    .line 2416
    if-eqz v11, :cond_b

    .line 2417
    .line 2418
    and-int/2addr v9, v6

    .line 2419
    int-to-long v11, v9

    .line 2420
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2421
    .line 2422
    .line 2423
    move-result-object v9

    .line 2424
    check-cast v9, Lcom/google/android/gms/internal/drive/zzjc;

    .line 2425
    .line 2426
    invoke-interface {p2, v10, v9}, Lcom/google/android/gms/internal/drive/zzns;->zza(ILcom/google/android/gms/internal/drive/zzjc;)V

    .line 2427
    .line 2428
    .line 2429
    goto/16 :goto_8

    .line 2430
    .line 2431
    :pswitch_80
    invoke-direct {p0, p1, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 2432
    .line 2433
    .line 2434
    move-result v11

    .line 2435
    if-eqz v11, :cond_b

    .line 2436
    .line 2437
    and-int/2addr v9, v6

    .line 2438
    int-to-long v11, v9

    .line 2439
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2440
    .line 2441
    .line 2442
    move-result-object v9

    .line 2443
    invoke-direct {p0, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 2444
    .line 2445
    .line 2446
    move-result-object v11

    .line 2447
    invoke-interface {p2, v10, v9, v11}, Lcom/google/android/gms/internal/drive/zzns;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzmf;)V

    .line 2448
    .line 2449
    .line 2450
    goto/16 :goto_8

    .line 2451
    .line 2452
    :pswitch_81
    invoke-direct {p0, p1, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 2453
    .line 2454
    .line 2455
    move-result v11

    .line 2456
    if-eqz v11, :cond_b

    .line 2457
    .line 2458
    and-int/2addr v9, v6

    .line 2459
    int-to-long v11, v9

    .line 2460
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2461
    .line 2462
    .line 2463
    move-result-object v9

    .line 2464
    invoke-static {v10, v9, p2}, Lcom/google/android/gms/internal/drive/zzlu;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzns;)V

    .line 2465
    .line 2466
    .line 2467
    goto/16 :goto_8

    .line 2468
    .line 2469
    :pswitch_82
    invoke-direct {p0, p1, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 2470
    .line 2471
    .line 2472
    move-result v11

    .line 2473
    if-eqz v11, :cond_b

    .line 2474
    .line 2475
    and-int/2addr v9, v6

    .line 2476
    int-to-long v11, v9

    .line 2477
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzl(Ljava/lang/Object;J)Z

    .line 2478
    .line 2479
    .line 2480
    move-result v9

    .line 2481
    invoke-interface {p2, v10, v9}, Lcom/google/android/gms/internal/drive/zzns;->zzb(IZ)V

    .line 2482
    .line 2483
    .line 2484
    goto/16 :goto_8

    .line 2485
    .line 2486
    :pswitch_83
    invoke-direct {p0, p1, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 2487
    .line 2488
    .line 2489
    move-result v11

    .line 2490
    if-eqz v11, :cond_b

    .line 2491
    .line 2492
    and-int/2addr v9, v6

    .line 2493
    int-to-long v11, v9

    .line 2494
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 2495
    .line 2496
    .line 2497
    move-result v9

    .line 2498
    invoke-interface {p2, v10, v9}, Lcom/google/android/gms/internal/drive/zzns;->zzf(II)V

    .line 2499
    .line 2500
    .line 2501
    goto :goto_8

    .line 2502
    :pswitch_84
    invoke-direct {p0, p1, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 2503
    .line 2504
    .line 2505
    move-result v11

    .line 2506
    if-eqz v11, :cond_b

    .line 2507
    .line 2508
    and-int/2addr v9, v6

    .line 2509
    int-to-long v11, v9

    .line 2510
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 2511
    .line 2512
    .line 2513
    move-result-wide v11

    .line 2514
    invoke-interface {p2, v10, v11, v12}, Lcom/google/android/gms/internal/drive/zzns;->zzc(IJ)V

    .line 2515
    .line 2516
    .line 2517
    goto :goto_8

    .line 2518
    :pswitch_85
    invoke-direct {p0, p1, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 2519
    .line 2520
    .line 2521
    move-result v11

    .line 2522
    if-eqz v11, :cond_b

    .line 2523
    .line 2524
    and-int/2addr v9, v6

    .line 2525
    int-to-long v11, v9

    .line 2526
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 2527
    .line 2528
    .line 2529
    move-result v9

    .line 2530
    invoke-interface {p2, v10, v9}, Lcom/google/android/gms/internal/drive/zzns;->zzc(II)V

    .line 2531
    .line 2532
    .line 2533
    goto :goto_8

    .line 2534
    :pswitch_86
    invoke-direct {p0, p1, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 2535
    .line 2536
    .line 2537
    move-result v11

    .line 2538
    if-eqz v11, :cond_b

    .line 2539
    .line 2540
    and-int/2addr v9, v6

    .line 2541
    int-to-long v11, v9

    .line 2542
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 2543
    .line 2544
    .line 2545
    move-result-wide v11

    .line 2546
    invoke-interface {p2, v10, v11, v12}, Lcom/google/android/gms/internal/drive/zzns;->zza(IJ)V

    .line 2547
    .line 2548
    .line 2549
    goto :goto_8

    .line 2550
    :pswitch_87
    invoke-direct {p0, p1, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 2551
    .line 2552
    .line 2553
    move-result v11

    .line 2554
    if-eqz v11, :cond_b

    .line 2555
    .line 2556
    and-int/2addr v9, v6

    .line 2557
    int-to-long v11, v9

    .line 2558
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 2559
    .line 2560
    .line 2561
    move-result-wide v11

    .line 2562
    invoke-interface {p2, v10, v11, v12}, Lcom/google/android/gms/internal/drive/zzns;->zzi(IJ)V

    .line 2563
    .line 2564
    .line 2565
    goto :goto_8

    .line 2566
    :pswitch_88
    invoke-direct {p0, p1, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 2567
    .line 2568
    .line 2569
    move-result v11

    .line 2570
    if-eqz v11, :cond_b

    .line 2571
    .line 2572
    and-int/2addr v9, v6

    .line 2573
    int-to-long v11, v9

    .line 2574
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzm(Ljava/lang/Object;J)F

    .line 2575
    .line 2576
    .line 2577
    move-result v9

    .line 2578
    invoke-interface {p2, v10, v9}, Lcom/google/android/gms/internal/drive/zzns;->zza(IF)V

    .line 2579
    .line 2580
    .line 2581
    goto :goto_8

    .line 2582
    :pswitch_89
    invoke-direct {p0, p1, v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 2583
    .line 2584
    .line 2585
    move-result v11

    .line 2586
    if-eqz v11, :cond_b

    .line 2587
    .line 2588
    and-int/2addr v9, v6

    .line 2589
    int-to-long v11, v9

    .line 2590
    invoke-static {p1, v11, v12}, Lcom/google/android/gms/internal/drive/zznd;->zzn(Ljava/lang/Object;J)D

    .line 2591
    .line 2592
    .line 2593
    move-result-wide v11

    .line 2594
    invoke-interface {p2, v10, v11, v12}, Lcom/google/android/gms/internal/drive/zzns;->zza(ID)V

    .line 2595
    .line 2596
    .line 2597
    :cond_b
    :goto_8
    add-int/lit8 v8, v8, 0x3

    .line 2598
    .line 2599
    goto/16 :goto_6

    .line 2600
    .line 2601
    :cond_c
    :goto_9
    if-eqz v1, :cond_e

    .line 2602
    .line 2603
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 2604
    .line 2605
    invoke-virtual {v2, p2, v1}, Lcom/google/android/gms/internal/drive/zzjy;->zza(Lcom/google/android/gms/internal/drive/zzns;Ljava/util/Map$Entry;)V

    .line 2606
    .line 2607
    .line 2608
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2609
    .line 2610
    .line 2611
    move-result v1

    .line 2612
    if-eqz v1, :cond_d

    .line 2613
    .line 2614
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2615
    .line 2616
    .line 2617
    move-result-object v1

    .line 2618
    check-cast v1, Ljava/util/Map$Entry;

    .line 2619
    .line 2620
    goto :goto_9

    .line 2621
    :cond_d
    move-object v1, v3

    .line 2622
    goto :goto_9

    .line 2623
    :cond_e
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzur:Lcom/google/android/gms/internal/drive/zzmx;

    .line 2624
    .line 2625
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Lcom/google/android/gms/internal/drive/zzmx;Ljava/lang/Object;Lcom/google/android/gms/internal/drive/zzns;)V

    .line 2626
    .line 2627
    .line 2628
    return-void

    .line 2629
    :cond_f
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;Lcom/google/android/gms/internal/drive/zzns;)V

    .line 2630
    .line 2631
    .line 2632
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_89
        :pswitch_88
        :pswitch_87
        :pswitch_86
        :pswitch_85
        :pswitch_84
        :pswitch_83
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_7f
        :pswitch_7e
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_79
        :pswitch_78
        :pswitch_77
        :pswitch_76
        :pswitch_75
        :pswitch_74
        :pswitch_73
        :pswitch_72
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
    .end packed-switch
.end method

.method public final zza(Ljava/lang/Object;[BIILcom/google/android/gms/internal/drive/zziz;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;[BII",
            "Lcom/google/android/gms/internal/drive/zziz;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v7, p2

    move/from16 v8, p4

    move-object/from16 v13, p5

    .line 3088
    iget-boolean v1, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzuk:Z

    if-eqz v1, :cond_14

    .line 3089
    sget-object v1, Lcom/google/android/gms/internal/drive/zzlu;->zzuc:Lsun/misc/Unsafe;

    const/4 v15, -0x1

    const/16 v16, 0x0

    move/from16 v2, p3

    move v3, v15

    move/from16 v4, v16

    :goto_0
    if-ge v2, v8, :cond_12

    add-int/lit8 v5, v2, 0x1

    .line 3090
    aget-byte v2, v7, v2

    if-gez v2, :cond_0

    .line 3091
    invoke-static {v2, v7, v5, v13}, Lcom/google/android/gms/internal/drive/zziy;->zza(I[BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v5

    .line 3092
    iget v2, v13, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    :cond_0
    move v9, v5

    move v5, v2

    ushr-int/lit8 v10, v5, 0x3

    and-int/lit8 v2, v5, 0x7

    if-le v10, v3, :cond_1

    .line 3093
    div-int/lit8 v4, v4, 0x3

    invoke-direct {v0, v10, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zzp(II)I

    move-result v3

    :goto_1
    move v12, v3

    goto :goto_2

    .line 3094
    :cond_1
    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/drive/zzlu;->zzau(I)I

    move-result v3

    goto :goto_1

    :goto_2
    if-ne v12, v15, :cond_2

    move-object v15, v1

    move v2, v9

    move v6, v10

    move/from16 v7, v16

    move v10, v5

    goto/16 :goto_12

    .line 3095
    :cond_2
    iget-object v3, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    add-int/lit8 v4, v12, 0x1

    aget v3, v3, v4

    const/high16 v4, 0xff00000

    and-int/2addr v4, v3

    ushr-int/lit8 v11, v4, 0x14

    const v4, 0xfffff

    and-int/2addr v4, v3

    move/from16 p3, v5

    int-to-long v4, v4

    const/16 v6, 0x11

    const/4 v14, 0x2

    if-gt v11, v6, :cond_8

    const/4 v6, 0x5

    const/4 v15, 0x1

    packed-switch v11, :pswitch_data_0

    move-object v15, v1

    :goto_3
    move v3, v9

    move v9, v10

    move v5, v12

    move/from16 v10, p3

    goto/16 :goto_11

    :pswitch_0
    if-nez v2, :cond_3

    .line 3096
    invoke-static {v7, v9, v13}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v9

    .line 3097
    iget-wide v2, v13, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    .line 3098
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/drive/zzjo;->zzk(J)J

    move-result-wide v2

    move-wide/from16 v19, v4

    move-wide v5, v2

    move-wide/from16 v3, v19

    move-object/from16 v2, p1

    .line 3099
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    :goto_4
    move-object v4, v1

    move-object v1, v2

    move-object v1, v4

    move v2, v9

    :goto_5
    move v3, v10

    move v4, v12

    :goto_6
    const/4 v15, -0x1

    goto :goto_0

    :cond_3
    move-object v4, v1

    move-object/from16 v1, p1

    :cond_4
    move-object v15, v4

    goto :goto_3

    :pswitch_1
    move-wide v5, v4

    move-object v4, v1

    move-object/from16 v1, p1

    if-nez v2, :cond_4

    .line 3100
    invoke-static {v7, v9, v13}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    .line 3101
    iget v3, v13, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    .line 3102
    invoke-static {v3}, Lcom/google/android/gms/internal/drive/zzjo;->zzw(I)I

    move-result v3

    .line 3103
    invoke-virtual {v4, v1, v5, v6, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_7
    move-object v1, v4

    goto :goto_5

    :pswitch_2
    move-wide v5, v4

    move-object v4, v1

    move-object/from16 v1, p1

    if-nez v2, :cond_4

    .line 3104
    invoke-static {v7, v9, v13}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    .line 3105
    iget v3, v13, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    invoke-virtual {v4, v1, v5, v6, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_7

    :pswitch_3
    move-wide v5, v4

    move-object v4, v1

    move-object/from16 v1, p1

    if-ne v2, v14, :cond_4

    .line 3106
    invoke-static {v7, v9, v13}, Lcom/google/android/gms/internal/drive/zziy;->zze([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    .line 3107
    iget-object v3, v13, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    invoke-virtual {v4, v1, v5, v6, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_7

    :pswitch_4
    move-wide v5, v4

    move-object v4, v1

    move-object/from16 v1, p1

    if-ne v2, v14, :cond_4

    .line 3108
    invoke-direct {v0, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    move-result-object v2

    .line 3109
    invoke-static {v2, v7, v9, v8, v13}, Lcom/google/android/gms/internal/drive/zziy;->zza(Lcom/google/android/gms/internal/drive/zzmf;[BIILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    .line 3110
    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_5

    .line 3111
    iget-object v3, v13, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    invoke-virtual {v4, v1, v5, v6, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_7

    .line 3112
    :cond_5
    iget-object v9, v13, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    .line 3113
    invoke-static {v3, v9}, Lcom/google/android/gms/internal/drive/zzkm;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 3114
    invoke-virtual {v4, v1, v5, v6, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_7

    :pswitch_5
    move-wide v5, v4

    move-object v4, v1

    move-object/from16 v1, p1

    if-ne v2, v14, :cond_4

    const/high16 v2, 0x20000000

    and-int/2addr v2, v3

    if-nez v2, :cond_6

    .line 3115
    invoke-static {v7, v9, v13}, Lcom/google/android/gms/internal/drive/zziy;->zzc([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    goto :goto_8

    .line 3116
    :cond_6
    invoke-static {v7, v9, v13}, Lcom/google/android/gms/internal/drive/zziy;->zzd([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    .line 3117
    :goto_8
    iget-object v3, v13, Lcom/google/android/gms/internal/drive/zziz;->zznm:Ljava/lang/Object;

    invoke-virtual {v4, v1, v5, v6, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_7

    :pswitch_6
    move-wide v5, v4

    move-object v4, v1

    move-object/from16 v1, p1

    if-nez v2, :cond_4

    .line 3118
    invoke-static {v7, v9, v13}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    move/from16 p3, v2

    .line 3119
    iget-wide v2, v13, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    const-wide/16 v17, 0x0

    cmp-long v2, v2, v17

    if-eqz v2, :cond_7

    goto :goto_9

    :cond_7
    move/from16 v15, v16

    :goto_9
    invoke-static {v1, v5, v6, v15}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JZ)V

    move/from16 v2, p3

    goto :goto_7

    :pswitch_7
    move-wide v14, v4

    move-object v4, v1

    move-object/from16 v1, p1

    if-ne v2, v6, :cond_4

    .line 3120
    invoke-static {v7, v9}, Lcom/google/android/gms/internal/drive/zziy;->zza([BI)I

    move-result v2

    invoke-virtual {v4, v1, v14, v15, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_a
    add-int/lit8 v2, v9, 0x4

    goto/16 :goto_7

    :pswitch_8
    move-wide v5, v4

    move-object v4, v1

    move-object/from16 v1, p1

    if-ne v2, v15, :cond_4

    move-wide v14, v5

    .line 3121
    invoke-static {v7, v9}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BI)J

    move-result-wide v5

    move-object v2, v1

    move-object v1, v4

    move-wide v3, v14

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object v4, v1

    move-object v1, v2

    :goto_b
    add-int/lit8 v2, v9, 0x8

    goto/16 :goto_7

    :pswitch_9
    move-wide v14, v4

    move-object v4, v1

    move-object/from16 v1, p1

    if-nez v2, :cond_4

    .line 3122
    invoke-static {v7, v9, v13}, Lcom/google/android/gms/internal/drive/zziy;->zza([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    .line 3123
    iget v3, v13, Lcom/google/android/gms/internal/drive/zziz;->zznk:I

    invoke-virtual {v4, v1, v14, v15, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_7

    :pswitch_a
    move-wide v14, v4

    move-object v4, v1

    move-object/from16 v1, p1

    if-nez v2, :cond_4

    .line 3124
    invoke-static {v7, v9, v13}, Lcom/google/android/gms/internal/drive/zziy;->zzb([BILcom/google/android/gms/internal/drive/zziz;)I

    move-result v9

    .line 3125
    iget-wide v5, v13, Lcom/google/android/gms/internal/drive/zziz;->zznl:J

    move-object v2, v1

    move-object v1, v4

    move-wide v3, v14

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    goto/16 :goto_4

    :pswitch_b
    move-wide v14, v4

    move-object v4, v1

    move-object/from16 v1, p1

    if-ne v2, v6, :cond_4

    .line 3126
    invoke-static {v7, v9}, Lcom/google/android/gms/internal/drive/zziy;->zzd([BI)F

    move-result v2

    invoke-static {v1, v14, v15, v2}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JF)V

    goto :goto_a

    :pswitch_c
    move-wide v5, v4

    move-object v4, v1

    move-object/from16 v1, p1

    if-ne v2, v15, :cond_4

    .line 3127
    invoke-static {v7, v9}, Lcom/google/android/gms/internal/drive/zziy;->zzc([BI)D

    move-result-wide v2

    invoke-static {v1, v5, v6, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JD)V

    goto :goto_b

    :cond_8
    move-wide v5, v4

    move-object v4, v1

    move-object/from16 v1, p1

    const/16 v15, 0x1b

    if-ne v11, v15, :cond_b

    if-ne v2, v14, :cond_4

    .line 3128
    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/drive/zzkp;

    .line 3129
    invoke-interface {v2}, Lcom/google/android/gms/internal/drive/zzkp;->zzbo()Z

    move-result v3

    if-nez v3, :cond_a

    .line 3130
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_9

    const/16 v3, 0xa

    goto :goto_c

    :cond_9
    shl-int/lit8 v3, v3, 0x1

    .line 3131
    :goto_c
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/drive/zzkp;->zzr(I)Lcom/google/android/gms/internal/drive/zzkp;

    move-result-object v2

    .line 3132
    invoke-virtual {v4, v1, v5, v6, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_a
    move-object v6, v2

    .line 3133
    invoke-direct {v0, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    move-result-object v1

    move/from16 v2, p3

    move-object v15, v4

    move-object v3, v7

    move v5, v8

    move v4, v9

    move-object v7, v13

    .line 3134
    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/drive/zziy;->zza(Lcom/google/android/gms/internal/drive/zzmf;I[BIILcom/google/android/gms/internal/drive/zzkp;Lcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    move-object/from16 v7, p2

    move/from16 v8, p4

    move-object/from16 v13, p5

    move v3, v10

    move v4, v12

    :goto_d
    move-object v1, v15

    goto/16 :goto_6

    :cond_b
    move/from16 v1, p3

    move-object v15, v4

    move v4, v9

    const/16 v7, 0x31

    if-gt v11, v7, :cond_d

    move-wide/from16 v19, v5

    move v5, v12

    move-wide/from16 v12, v19

    move v6, v10

    int-to-long v9, v3

    move-object/from16 v14, p5

    move v7, v2

    move v3, v4

    move v8, v5

    move-object/from16 v2, p2

    move/from16 v4, p4

    move v5, v1

    move-object/from16 v1, p1

    .line 3135
    invoke-direct/range {v0 .. v14}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;[BIIIIIIJIJLcom/google/android/gms/internal/drive/zziz;)I

    move-result v7

    move v4, v3

    move v10, v5

    move v9, v6

    move v5, v8

    if-ne v7, v4, :cond_c

    move v2, v7

    move v6, v9

    :goto_e
    move v7, v5

    goto/16 :goto_12

    :cond_c
    move-object/from16 v0, p0

    move/from16 v8, p4

    move-object/from16 v13, p5

    move v4, v5

    move v2, v7

    move v3, v9

    :goto_f
    move-object v1, v15

    const/4 v15, -0x1

    move-object/from16 v7, p2

    goto/16 :goto_0

    :cond_d
    move-wide/from16 v19, v5

    move v5, v12

    move-wide/from16 v12, v19

    move v7, v2

    move v9, v10

    move v10, v1

    const/16 v0, 0x32

    if-ne v11, v0, :cond_10

    if-ne v7, v14, :cond_f

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v8, p5

    move v3, v4

    move-wide v6, v12

    move/from16 v4, p4

    .line 3136
    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;[BIIIJLcom/google/android/gms/internal/drive/zziz;)I

    move-result v6

    if-ne v6, v3, :cond_e

    move v7, v5

    move v2, v6

    :goto_10
    move v6, v9

    goto :goto_12

    :cond_e
    move-object/from16 v0, p0

    move-object/from16 v7, p2

    move/from16 v8, p4

    move-object/from16 v13, p5

    move v4, v5

    move v2, v6

    move v3, v9

    goto :goto_d

    :cond_f
    move v3, v4

    :goto_11
    move v2, v3

    move v7, v5

    goto :goto_10

    :cond_10
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v8, v3

    move v3, v4

    move v6, v9

    move v9, v11

    move/from16 v4, p4

    move-wide/from16 v19, v12

    move-object/from16 v13, p5

    move v12, v5

    move v5, v10

    move-wide/from16 v10, v19

    .line 3137
    invoke-direct/range {v0 .. v13}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;[BIIIIIIIJILcom/google/android/gms/internal/drive/zziz;)I

    move-result v7

    move v10, v5

    move v5, v12

    if-ne v7, v3, :cond_11

    move v2, v7

    goto :goto_e

    .line 3138
    :goto_12
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/drive/zzlu;->zzo(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzmy;

    move-result-object v4

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p5

    move v0, v10

    .line 3139
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/drive/zziy;->zza(I[BIILcom/google/android/gms/internal/drive/zzmy;Lcom/google/android/gms/internal/drive/zziz;)I

    move-result v2

    move-object/from16 v0, p0

    move-object/from16 v13, p5

    move v8, v3

    move v3, v6

    move v4, v7

    goto :goto_f

    :cond_11
    move-object/from16 v0, p0

    move/from16 v8, p4

    move-object/from16 v13, p5

    move v4, v5

    move v3, v6

    move v2, v7

    goto :goto_f

    :cond_12
    move v4, v8

    if-ne v2, v4, :cond_13

    return-void

    .line 3140
    :cond_13
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdm()Lcom/google/android/gms/internal/drive/zzkq;

    move-result-object v0

    throw v0

    :cond_14
    move v4, v8

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v6, p5

    .line 3141
    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/drive/zziz;)I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzc(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 6
    .line 7
    array-length v1, v1

    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzas(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const v2, 0xfffff

    .line 15
    .line 16
    .line 17
    and-int/2addr v2, v1

    .line 18
    int-to-long v2, v2

    .line 19
    iget-object v4, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 20
    .line 21
    aget v4, v4, v0

    .line 22
    .line 23
    const/high16 v5, 0xff00000

    .line 24
    .line 25
    and-int/2addr v1, v5

    .line 26
    ushr-int/lit8 v1, v1, 0x14

    .line 27
    .line 28
    packed-switch v1, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    goto/16 :goto_1

    .line 32
    .line 33
    :pswitch_0
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_1

    .line 37
    .line 38
    :pswitch_1
    invoke-direct {p0, p2, v4, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, p1, v4, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;II)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_1

    .line 55
    .line 56
    :pswitch_2
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_1

    .line 60
    .line 61
    :pswitch_3
    invoke-direct {p0, p2, v4, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_0

    .line 66
    .line 67
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p0, p1, v4, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;II)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_1

    .line 78
    .line 79
    :pswitch_4
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzut:Lcom/google/android/gms/internal/drive/zzll;

    .line 80
    .line 81
    invoke-static {v1, p1, p2, v2, v3}, Lcom/google/android/gms/internal/drive/zzmh;->zza(Lcom/google/android/gms/internal/drive/zzll;Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_1

    .line 85
    .line 86
    :pswitch_5
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzuq:Lcom/google/android/gms/internal/drive/zzla;

    .line 87
    .line 88
    invoke-virtual {v1, p1, p2, v2, v3}, Lcom/google/android/gms/internal/drive/zzla;->zza(Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_1

    .line 92
    .line 93
    :pswitch_6
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_1

    .line 97
    .line 98
    :pswitch_7
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_0

    .line 103
    .line 104
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 105
    .line 106
    .line 107
    move-result-wide v4

    .line 108
    invoke-static {p1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JJ)V

    .line 109
    .line 110
    .line 111
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;I)V

    .line 112
    .line 113
    .line 114
    goto/16 :goto_1

    .line 115
    .line 116
    :pswitch_8
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_0

    .line 121
    .line 122
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JI)V

    .line 127
    .line 128
    .line 129
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;I)V

    .line 130
    .line 131
    .line 132
    goto/16 :goto_1

    .line 133
    .line 134
    :pswitch_9
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_0

    .line 139
    .line 140
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 141
    .line 142
    .line 143
    move-result-wide v4

    .line 144
    invoke-static {p1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JJ)V

    .line 145
    .line 146
    .line 147
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;I)V

    .line 148
    .line 149
    .line 150
    goto/16 :goto_1

    .line 151
    .line 152
    :pswitch_a
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_0

    .line 157
    .line 158
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JI)V

    .line 163
    .line 164
    .line 165
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;I)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_1

    .line 169
    .line 170
    :pswitch_b
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-eqz v1, :cond_0

    .line 175
    .line 176
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JI)V

    .line 181
    .line 182
    .line 183
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;I)V

    .line 184
    .line 185
    .line 186
    goto/16 :goto_1

    .line 187
    .line 188
    :pswitch_c
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_0

    .line 193
    .line 194
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JI)V

    .line 199
    .line 200
    .line 201
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;I)V

    .line 202
    .line 203
    .line 204
    goto/16 :goto_1

    .line 205
    .line 206
    :pswitch_d
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_0

    .line 211
    .line 212
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;I)V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_1

    .line 223
    .line 224
    :pswitch_e
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 225
    .line 226
    .line 227
    goto/16 :goto_1

    .line 228
    .line 229
    :pswitch_f
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    if-eqz v1, :cond_0

    .line 234
    .line 235
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;I)V

    .line 243
    .line 244
    .line 245
    goto/16 :goto_1

    .line 246
    .line 247
    :pswitch_10
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-eqz v1, :cond_0

    .line 252
    .line 253
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzl(Ljava/lang/Object;J)Z

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JZ)V

    .line 258
    .line 259
    .line 260
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;I)V

    .line 261
    .line 262
    .line 263
    goto/16 :goto_1

    .line 264
    .line 265
    :pswitch_11
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    if-eqz v1, :cond_0

    .line 270
    .line 271
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JI)V

    .line 276
    .line 277
    .line 278
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;I)V

    .line 279
    .line 280
    .line 281
    goto :goto_1

    .line 282
    :pswitch_12
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    if-eqz v1, :cond_0

    .line 287
    .line 288
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 289
    .line 290
    .line 291
    move-result-wide v4

    .line 292
    invoke-static {p1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JJ)V

    .line 293
    .line 294
    .line 295
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;I)V

    .line 296
    .line 297
    .line 298
    goto :goto_1

    .line 299
    :pswitch_13
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    if-eqz v1, :cond_0

    .line 304
    .line 305
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JI)V

    .line 310
    .line 311
    .line 312
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;I)V

    .line 313
    .line 314
    .line 315
    goto :goto_1

    .line 316
    :pswitch_14
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    if-eqz v1, :cond_0

    .line 321
    .line 322
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 323
    .line 324
    .line 325
    move-result-wide v4

    .line 326
    invoke-static {p1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JJ)V

    .line 327
    .line 328
    .line 329
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;I)V

    .line 330
    .line 331
    .line 332
    goto :goto_1

    .line 333
    :pswitch_15
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    if-eqz v1, :cond_0

    .line 338
    .line 339
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 340
    .line 341
    .line 342
    move-result-wide v4

    .line 343
    invoke-static {p1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JJ)V

    .line 344
    .line 345
    .line 346
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;I)V

    .line 347
    .line 348
    .line 349
    goto :goto_1

    .line 350
    :pswitch_16
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-eqz v1, :cond_0

    .line 355
    .line 356
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzm(Ljava/lang/Object;J)F

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JF)V

    .line 361
    .line 362
    .line 363
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;I)V

    .line 364
    .line 365
    .line 366
    goto :goto_1

    .line 367
    :pswitch_17
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    if-eqz v1, :cond_0

    .line 372
    .line 373
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zzn(Ljava/lang/Object;J)D

    .line 374
    .line 375
    .line 376
    move-result-wide v4

    .line 377
    invoke-static {p1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JD)V

    .line 378
    .line 379
    .line 380
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzlu;->zzb(Ljava/lang/Object;I)V

    .line 381
    .line 382
    .line 383
    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x3

    .line 384
    .line 385
    goto/16 :goto_0

    .line 386
    .line 387
    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzuk:Z

    .line 388
    .line 389
    if-nez v0, :cond_2

    .line 390
    .line 391
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzur:Lcom/google/android/gms/internal/drive/zzmx;

    .line 392
    .line 393
    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/drive/zzmh;->zza(Lcom/google/android/gms/internal/drive/zzmx;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    iget-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzui:Z

    .line 397
    .line 398
    if-eqz v0, :cond_2

    .line 399
    .line 400
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 401
    .line 402
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzmh;->zza(Lcom/google/android/gms/internal/drive/zzjy;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    :cond_2
    return-void

    .line 406
    nop

    .line 407
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzd(Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzun:I

    .line 2
    .line 3
    :goto_0
    iget v1, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzuo:I

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzum:[I

    .line 6
    .line 7
    if-ge v0, v1, :cond_1

    .line 8
    .line 9
    aget v1, v2, v0

    .line 10
    .line 11
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zzas(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const v2, 0xfffff

    .line 16
    .line 17
    .line 18
    and-int/2addr v1, v2

    .line 19
    int-to-long v1, v1

    .line 20
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    iget-object v4, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzut:Lcom/google/android/gms/internal/drive/zzll;

    .line 27
    .line 28
    invoke-interface {v4, v3}, Lcom/google/android/gms/internal/drive/zzll;->zzk(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zza(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    array-length v0, v2

    .line 39
    :goto_1
    if-ge v1, v0, :cond_2

    .line 40
    .line 41
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzuq:Lcom/google/android/gms/internal/drive/zzla;

    .line 42
    .line 43
    iget-object v3, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzum:[I

    .line 44
    .line 45
    aget v3, v3, v1

    .line 46
    .line 47
    int-to-long v3, v3

    .line 48
    invoke-virtual {v2, p1, v3, v4}, Lcom/google/android/gms/internal/drive/zzla;->zza(Ljava/lang/Object;J)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzur:Lcom/google/android/gms/internal/drive/zzmx;

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/drive/zzmx;->zzd(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzui:Z

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/drive/zzjy;->zzd(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    return-void
.end method

.method public final zzn(Ljava/lang/Object;)I
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzuk:Z

    .line 6
    .line 7
    const/high16 v3, 0xff00000

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    const v7, 0xfffff

    .line 11
    .line 12
    .line 13
    const/4 v8, 0x1

    .line 14
    const-wide/16 v9, 0x0

    .line 15
    .line 16
    const/4 v11, 0x0

    .line 17
    if-eqz v2, :cond_13

    .line 18
    .line 19
    sget-object v2, Lcom/google/android/gms/internal/drive/zzlu;->zzuc:Lsun/misc/Unsafe;

    .line 20
    .line 21
    move v12, v11

    .line 22
    move v13, v12

    .line 23
    :goto_0
    iget-object v14, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 24
    .line 25
    array-length v14, v14

    .line 26
    if-ge v12, v14, :cond_12

    .line 27
    .line 28
    invoke-direct {v0, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzas(I)I

    .line 29
    .line 30
    .line 31
    move-result v14

    .line 32
    and-int v15, v14, v3

    .line 33
    .line 34
    ushr-int/lit8 v15, v15, 0x14

    .line 35
    .line 36
    move/from16 v16, v3

    .line 37
    .line 38
    iget-object v3, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 39
    .line 40
    aget v3, v3, v12

    .line 41
    .line 42
    and-int/2addr v14, v7

    .line 43
    int-to-long v4, v14

    .line 44
    sget-object v14, Lcom/google/android/gms/internal/drive/zzke;->zzqh:Lcom/google/android/gms/internal/drive/zzke;

    .line 45
    .line 46
    invoke-virtual {v14}, Lcom/google/android/gms/internal/drive/zzke;->id()I

    .line 47
    .line 48
    .line 49
    move-result v14

    .line 50
    if-lt v15, v14, :cond_0

    .line 51
    .line 52
    sget-object v14, Lcom/google/android/gms/internal/drive/zzke;->zzqu:Lcom/google/android/gms/internal/drive/zzke;

    .line 53
    .line 54
    invoke-virtual {v14}, Lcom/google/android/gms/internal/drive/zzke;->id()I

    .line 55
    .line 56
    .line 57
    move-result v14

    .line 58
    if-gt v15, v14, :cond_0

    .line 59
    .line 60
    iget-object v14, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 61
    .line 62
    add-int/lit8 v17, v12, 0x2

    .line 63
    .line 64
    aget v14, v14, v17

    .line 65
    .line 66
    and-int/2addr v14, v7

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    move v14, v11

    .line 69
    :goto_1
    packed-switch v15, :pswitch_data_0

    .line 70
    .line 71
    .line 72
    goto/16 :goto_4

    .line 73
    .line 74
    :pswitch_0
    invoke-direct {v0, v1, v3, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 75
    .line 76
    .line 77
    move-result v14

    .line 78
    if-eqz v14, :cond_11

    .line 79
    .line 80
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Lcom/google/android/gms/internal/drive/zzlq;

    .line 85
    .line 86
    invoke-direct {v0, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/drive/zzjr;->zzc(ILcom/google/android/gms/internal/drive/zzlq;Lcom/google/android/gms/internal/drive/zzmf;)I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    :goto_2
    add-int/2addr v13, v3

    .line 95
    goto/16 :goto_4

    .line 96
    .line 97
    :pswitch_1
    invoke-direct {v0, v1, v3, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 98
    .line 99
    .line 100
    move-result v14

    .line 101
    if-eqz v14, :cond_11

    .line 102
    .line 103
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 104
    .line 105
    .line 106
    move-result-wide v4

    .line 107
    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/drive/zzjr;->zzf(IJ)I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    goto :goto_2

    .line 112
    :pswitch_2
    invoke-direct {v0, v1, v3, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 113
    .line 114
    .line 115
    move-result v14

    .line 116
    if-eqz v14, :cond_11

    .line 117
    .line 118
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzjr;->zzi(II)I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    goto :goto_2

    .line 127
    :pswitch_3
    invoke-direct {v0, v1, v3, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    if-eqz v4, :cond_11

    .line 132
    .line 133
    invoke-static {v3, v9, v10}, Lcom/google/android/gms/internal/drive/zzjr;->zzh(IJ)I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    goto :goto_2

    .line 138
    :pswitch_4
    invoke-direct {v0, v1, v3, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-eqz v4, :cond_11

    .line 143
    .line 144
    invoke-static {v3, v11}, Lcom/google/android/gms/internal/drive/zzjr;->zzk(II)I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    goto :goto_2

    .line 149
    :pswitch_5
    invoke-direct {v0, v1, v3, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 150
    .line 151
    .line 152
    move-result v14

    .line 153
    if-eqz v14, :cond_11

    .line 154
    .line 155
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzjr;->zzl(II)I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    goto :goto_2

    .line 164
    :pswitch_6
    invoke-direct {v0, v1, v3, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 165
    .line 166
    .line 167
    move-result v14

    .line 168
    if-eqz v14, :cond_11

    .line 169
    .line 170
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzjr;->zzh(II)I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    goto :goto_2

    .line 179
    :pswitch_7
    invoke-direct {v0, v1, v3, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 180
    .line 181
    .line 182
    move-result v14

    .line 183
    if-eqz v14, :cond_11

    .line 184
    .line 185
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    check-cast v4, Lcom/google/android/gms/internal/drive/zzjc;

    .line 190
    .line 191
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzjr;->zzc(ILcom/google/android/gms/internal/drive/zzjc;)I

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    goto :goto_2

    .line 196
    :pswitch_8
    invoke-direct {v0, v1, v3, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 197
    .line 198
    .line 199
    move-result v14

    .line 200
    if-eqz v14, :cond_11

    .line 201
    .line 202
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-direct {v0, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzc(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzmf;)I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    :goto_3
    add-int/2addr v13, v3

    .line 215
    goto/16 :goto_4

    .line 216
    .line 217
    :pswitch_9
    invoke-direct {v0, v1, v3, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 218
    .line 219
    .line 220
    move-result v14

    .line 221
    if-eqz v14, :cond_11

    .line 222
    .line 223
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    instance-of v5, v4, Lcom/google/android/gms/internal/drive/zzjc;

    .line 228
    .line 229
    if-eqz v5, :cond_1

    .line 230
    .line 231
    check-cast v4, Lcom/google/android/gms/internal/drive/zzjc;

    .line 232
    .line 233
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzjr;->zzc(ILcom/google/android/gms/internal/drive/zzjc;)I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    goto/16 :goto_2

    .line 238
    .line 239
    :cond_1
    check-cast v4, Ljava/lang/String;

    .line 240
    .line 241
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzjr;->zzb(ILjava/lang/String;)I

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    goto/16 :goto_2

    .line 246
    .line 247
    :pswitch_a
    invoke-direct {v0, v1, v3, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    if-eqz v4, :cond_11

    .line 252
    .line 253
    invoke-static {v3, v8}, Lcom/google/android/gms/internal/drive/zzjr;->zzc(IZ)I

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    goto/16 :goto_2

    .line 258
    .line 259
    :pswitch_b
    invoke-direct {v0, v1, v3, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-eqz v4, :cond_11

    .line 264
    .line 265
    invoke-static {v3, v11}, Lcom/google/android/gms/internal/drive/zzjr;->zzj(II)I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    goto/16 :goto_2

    .line 270
    .line 271
    :pswitch_c
    invoke-direct {v0, v1, v3, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    if-eqz v4, :cond_11

    .line 276
    .line 277
    invoke-static {v3, v9, v10}, Lcom/google/android/gms/internal/drive/zzjr;->zzg(IJ)I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    goto/16 :goto_2

    .line 282
    .line 283
    :pswitch_d
    invoke-direct {v0, v1, v3, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 284
    .line 285
    .line 286
    move-result v14

    .line 287
    if-eqz v14, :cond_11

    .line 288
    .line 289
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzjr;->zzg(II)I

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    goto/16 :goto_2

    .line 298
    .line 299
    :pswitch_e
    invoke-direct {v0, v1, v3, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 300
    .line 301
    .line 302
    move-result v14

    .line 303
    if-eqz v14, :cond_11

    .line 304
    .line 305
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 306
    .line 307
    .line 308
    move-result-wide v4

    .line 309
    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/drive/zzjr;->zze(IJ)I

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    goto/16 :goto_2

    .line 314
    .line 315
    :pswitch_f
    invoke-direct {v0, v1, v3, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 316
    .line 317
    .line 318
    move-result v14

    .line 319
    if-eqz v14, :cond_11

    .line 320
    .line 321
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 322
    .line 323
    .line 324
    move-result-wide v4

    .line 325
    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/drive/zzjr;->zzd(IJ)I

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    goto/16 :goto_2

    .line 330
    .line 331
    :pswitch_10
    invoke-direct {v0, v1, v3, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 332
    .line 333
    .line 334
    move-result v4

    .line 335
    if-eqz v4, :cond_11

    .line 336
    .line 337
    invoke-static {v3, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzb(IF)I

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    goto/16 :goto_2

    .line 342
    .line 343
    :pswitch_11
    invoke-direct {v0, v1, v3, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    if-eqz v4, :cond_11

    .line 348
    .line 349
    const-wide/16 v4, 0x0

    .line 350
    .line 351
    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/drive/zzjr;->zzb(ID)I

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    goto/16 :goto_2

    .line 356
    .line 357
    :pswitch_12
    iget-object v14, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzut:Lcom/google/android/gms/internal/drive/zzll;

    .line 358
    .line 359
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    invoke-direct {v0, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzaq(I)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    invoke-interface {v14, v3, v4, v5}, Lcom/google/android/gms/internal/drive/zzll;->zzb(ILjava/lang/Object;Ljava/lang/Object;)I

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    goto/16 :goto_3

    .line 372
    .line 373
    :pswitch_13
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzd(Ljava/lang/Object;J)Ljava/util/List;

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    invoke-direct {v0, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 378
    .line 379
    .line 380
    move-result-object v5

    .line 381
    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzd(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzmf;)I

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    goto/16 :goto_3

    .line 386
    .line 387
    :pswitch_14
    invoke-virtual {v2, v1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    check-cast v4, Ljava/util/List;

    .line 392
    .line 393
    invoke-static {v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzc(Ljava/util/List;)I

    .line 394
    .line 395
    .line 396
    move-result v4

    .line 397
    if-lez v4, :cond_11

    .line 398
    .line 399
    iget-boolean v5, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 400
    .line 401
    if-eqz v5, :cond_2

    .line 402
    .line 403
    int-to-long v14, v14

    .line 404
    invoke-virtual {v2, v1, v14, v15, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 405
    .line 406
    .line 407
    :cond_2
    invoke-static {v3}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 408
    .line 409
    .line 410
    move-result v3

    .line 411
    invoke-static {v4, v3, v4, v13}, Lpm2;->g(IIII)I

    .line 412
    .line 413
    .line 414
    move-result v13

    .line 415
    goto/16 :goto_4

    .line 416
    .line 417
    :pswitch_15
    invoke-virtual {v2, v1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    check-cast v4, Ljava/util/List;

    .line 422
    .line 423
    invoke-static {v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzg(Ljava/util/List;)I

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    if-lez v4, :cond_11

    .line 428
    .line 429
    iget-boolean v5, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 430
    .line 431
    if-eqz v5, :cond_3

    .line 432
    .line 433
    int-to-long v14, v14

    .line 434
    invoke-virtual {v2, v1, v14, v15, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 435
    .line 436
    .line 437
    :cond_3
    invoke-static {v3}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 438
    .line 439
    .line 440
    move-result v3

    .line 441
    invoke-static {v4, v3, v4, v13}, Lpm2;->g(IIII)I

    .line 442
    .line 443
    .line 444
    move-result v13

    .line 445
    goto/16 :goto_4

    .line 446
    .line 447
    :pswitch_16
    invoke-virtual {v2, v1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    check-cast v4, Ljava/util/List;

    .line 452
    .line 453
    invoke-static {v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzi(Ljava/util/List;)I

    .line 454
    .line 455
    .line 456
    move-result v4

    .line 457
    if-lez v4, :cond_11

    .line 458
    .line 459
    iget-boolean v5, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 460
    .line 461
    if-eqz v5, :cond_4

    .line 462
    .line 463
    int-to-long v14, v14

    .line 464
    invoke-virtual {v2, v1, v14, v15, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 465
    .line 466
    .line 467
    :cond_4
    invoke-static {v3}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    invoke-static {v4, v3, v4, v13}, Lpm2;->g(IIII)I

    .line 472
    .line 473
    .line 474
    move-result v13

    .line 475
    goto/16 :goto_4

    .line 476
    .line 477
    :pswitch_17
    invoke-virtual {v2, v1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v4

    .line 481
    check-cast v4, Ljava/util/List;

    .line 482
    .line 483
    invoke-static {v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzh(Ljava/util/List;)I

    .line 484
    .line 485
    .line 486
    move-result v4

    .line 487
    if-lez v4, :cond_11

    .line 488
    .line 489
    iget-boolean v5, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 490
    .line 491
    if-eqz v5, :cond_5

    .line 492
    .line 493
    int-to-long v14, v14

    .line 494
    invoke-virtual {v2, v1, v14, v15, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 495
    .line 496
    .line 497
    :cond_5
    invoke-static {v3}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 498
    .line 499
    .line 500
    move-result v3

    .line 501
    invoke-static {v4, v3, v4, v13}, Lpm2;->g(IIII)I

    .line 502
    .line 503
    .line 504
    move-result v13

    .line 505
    goto/16 :goto_4

    .line 506
    .line 507
    :pswitch_18
    invoke-virtual {v2, v1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v4

    .line 511
    check-cast v4, Ljava/util/List;

    .line 512
    .line 513
    invoke-static {v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzd(Ljava/util/List;)I

    .line 514
    .line 515
    .line 516
    move-result v4

    .line 517
    if-lez v4, :cond_11

    .line 518
    .line 519
    iget-boolean v5, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 520
    .line 521
    if-eqz v5, :cond_6

    .line 522
    .line 523
    int-to-long v14, v14

    .line 524
    invoke-virtual {v2, v1, v14, v15, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 525
    .line 526
    .line 527
    :cond_6
    invoke-static {v3}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 528
    .line 529
    .line 530
    move-result v3

    .line 531
    invoke-static {v4, v3, v4, v13}, Lpm2;->g(IIII)I

    .line 532
    .line 533
    .line 534
    move-result v13

    .line 535
    goto/16 :goto_4

    .line 536
    .line 537
    :pswitch_19
    invoke-virtual {v2, v1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v4

    .line 541
    check-cast v4, Ljava/util/List;

    .line 542
    .line 543
    invoke-static {v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzf(Ljava/util/List;)I

    .line 544
    .line 545
    .line 546
    move-result v4

    .line 547
    if-lez v4, :cond_11

    .line 548
    .line 549
    iget-boolean v5, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 550
    .line 551
    if-eqz v5, :cond_7

    .line 552
    .line 553
    int-to-long v14, v14

    .line 554
    invoke-virtual {v2, v1, v14, v15, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 555
    .line 556
    .line 557
    :cond_7
    invoke-static {v3}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 558
    .line 559
    .line 560
    move-result v3

    .line 561
    invoke-static {v4, v3, v4, v13}, Lpm2;->g(IIII)I

    .line 562
    .line 563
    .line 564
    move-result v13

    .line 565
    goto/16 :goto_4

    .line 566
    .line 567
    :pswitch_1a
    invoke-virtual {v2, v1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v4

    .line 571
    check-cast v4, Ljava/util/List;

    .line 572
    .line 573
    invoke-static {v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzj(Ljava/util/List;)I

    .line 574
    .line 575
    .line 576
    move-result v4

    .line 577
    if-lez v4, :cond_11

    .line 578
    .line 579
    iget-boolean v5, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 580
    .line 581
    if-eqz v5, :cond_8

    .line 582
    .line 583
    int-to-long v14, v14

    .line 584
    invoke-virtual {v2, v1, v14, v15, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 585
    .line 586
    .line 587
    :cond_8
    invoke-static {v3}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 588
    .line 589
    .line 590
    move-result v3

    .line 591
    invoke-static {v4, v3, v4, v13}, Lpm2;->g(IIII)I

    .line 592
    .line 593
    .line 594
    move-result v13

    .line 595
    goto/16 :goto_4

    .line 596
    .line 597
    :pswitch_1b
    invoke-virtual {v2, v1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v4

    .line 601
    check-cast v4, Ljava/util/List;

    .line 602
    .line 603
    invoke-static {v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzh(Ljava/util/List;)I

    .line 604
    .line 605
    .line 606
    move-result v4

    .line 607
    if-lez v4, :cond_11

    .line 608
    .line 609
    iget-boolean v5, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 610
    .line 611
    if-eqz v5, :cond_9

    .line 612
    .line 613
    int-to-long v14, v14

    .line 614
    invoke-virtual {v2, v1, v14, v15, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 615
    .line 616
    .line 617
    :cond_9
    invoke-static {v3}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 618
    .line 619
    .line 620
    move-result v3

    .line 621
    invoke-static {v4, v3, v4, v13}, Lpm2;->g(IIII)I

    .line 622
    .line 623
    .line 624
    move-result v13

    .line 625
    goto/16 :goto_4

    .line 626
    .line 627
    :pswitch_1c
    invoke-virtual {v2, v1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v4

    .line 631
    check-cast v4, Ljava/util/List;

    .line 632
    .line 633
    invoke-static {v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzi(Ljava/util/List;)I

    .line 634
    .line 635
    .line 636
    move-result v4

    .line 637
    if-lez v4, :cond_11

    .line 638
    .line 639
    iget-boolean v5, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 640
    .line 641
    if-eqz v5, :cond_a

    .line 642
    .line 643
    int-to-long v14, v14

    .line 644
    invoke-virtual {v2, v1, v14, v15, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 645
    .line 646
    .line 647
    :cond_a
    invoke-static {v3}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 648
    .line 649
    .line 650
    move-result v3

    .line 651
    invoke-static {v4, v3, v4, v13}, Lpm2;->g(IIII)I

    .line 652
    .line 653
    .line 654
    move-result v13

    .line 655
    goto/16 :goto_4

    .line 656
    .line 657
    :pswitch_1d
    invoke-virtual {v2, v1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v4

    .line 661
    check-cast v4, Ljava/util/List;

    .line 662
    .line 663
    invoke-static {v4}, Lcom/google/android/gms/internal/drive/zzmh;->zze(Ljava/util/List;)I

    .line 664
    .line 665
    .line 666
    move-result v4

    .line 667
    if-lez v4, :cond_11

    .line 668
    .line 669
    iget-boolean v5, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 670
    .line 671
    if-eqz v5, :cond_b

    .line 672
    .line 673
    int-to-long v14, v14

    .line 674
    invoke-virtual {v2, v1, v14, v15, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 675
    .line 676
    .line 677
    :cond_b
    invoke-static {v3}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 678
    .line 679
    .line 680
    move-result v3

    .line 681
    invoke-static {v4, v3, v4, v13}, Lpm2;->g(IIII)I

    .line 682
    .line 683
    .line 684
    move-result v13

    .line 685
    goto/16 :goto_4

    .line 686
    .line 687
    :pswitch_1e
    invoke-virtual {v2, v1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v4

    .line 691
    check-cast v4, Ljava/util/List;

    .line 692
    .line 693
    invoke-static {v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzb(Ljava/util/List;)I

    .line 694
    .line 695
    .line 696
    move-result v4

    .line 697
    if-lez v4, :cond_11

    .line 698
    .line 699
    iget-boolean v5, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 700
    .line 701
    if-eqz v5, :cond_c

    .line 702
    .line 703
    int-to-long v14, v14

    .line 704
    invoke-virtual {v2, v1, v14, v15, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 705
    .line 706
    .line 707
    :cond_c
    invoke-static {v3}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 708
    .line 709
    .line 710
    move-result v3

    .line 711
    invoke-static {v4, v3, v4, v13}, Lpm2;->g(IIII)I

    .line 712
    .line 713
    .line 714
    move-result v13

    .line 715
    goto/16 :goto_4

    .line 716
    .line 717
    :pswitch_1f
    invoke-virtual {v2, v1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v4

    .line 721
    check-cast v4, Ljava/util/List;

    .line 722
    .line 723
    invoke-static {v4}, Lcom/google/android/gms/internal/drive/zzmh;->zza(Ljava/util/List;)I

    .line 724
    .line 725
    .line 726
    move-result v4

    .line 727
    if-lez v4, :cond_11

    .line 728
    .line 729
    iget-boolean v5, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 730
    .line 731
    if-eqz v5, :cond_d

    .line 732
    .line 733
    int-to-long v14, v14

    .line 734
    invoke-virtual {v2, v1, v14, v15, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 735
    .line 736
    .line 737
    :cond_d
    invoke-static {v3}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 738
    .line 739
    .line 740
    move-result v3

    .line 741
    invoke-static {v4, v3, v4, v13}, Lpm2;->g(IIII)I

    .line 742
    .line 743
    .line 744
    move-result v13

    .line 745
    goto/16 :goto_4

    .line 746
    .line 747
    :pswitch_20
    invoke-virtual {v2, v1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v4

    .line 751
    check-cast v4, Ljava/util/List;

    .line 752
    .line 753
    invoke-static {v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzh(Ljava/util/List;)I

    .line 754
    .line 755
    .line 756
    move-result v4

    .line 757
    if-lez v4, :cond_11

    .line 758
    .line 759
    iget-boolean v5, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 760
    .line 761
    if-eqz v5, :cond_e

    .line 762
    .line 763
    int-to-long v14, v14

    .line 764
    invoke-virtual {v2, v1, v14, v15, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 765
    .line 766
    .line 767
    :cond_e
    invoke-static {v3}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 768
    .line 769
    .line 770
    move-result v3

    .line 771
    invoke-static {v4, v3, v4, v13}, Lpm2;->g(IIII)I

    .line 772
    .line 773
    .line 774
    move-result v13

    .line 775
    goto/16 :goto_4

    .line 776
    .line 777
    :pswitch_21
    invoke-virtual {v2, v1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    move-result-object v4

    .line 781
    check-cast v4, Ljava/util/List;

    .line 782
    .line 783
    invoke-static {v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzi(Ljava/util/List;)I

    .line 784
    .line 785
    .line 786
    move-result v4

    .line 787
    if-lez v4, :cond_11

    .line 788
    .line 789
    iget-boolean v5, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 790
    .line 791
    if-eqz v5, :cond_f

    .line 792
    .line 793
    int-to-long v14, v14

    .line 794
    invoke-virtual {v2, v1, v14, v15, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 795
    .line 796
    .line 797
    :cond_f
    invoke-static {v3}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 798
    .line 799
    .line 800
    move-result v3

    .line 801
    invoke-static {v4, v3, v4, v13}, Lpm2;->g(IIII)I

    .line 802
    .line 803
    .line 804
    move-result v13

    .line 805
    goto/16 :goto_4

    .line 806
    .line 807
    :pswitch_22
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzd(Ljava/lang/Object;J)Ljava/util/List;

    .line 808
    .line 809
    .line 810
    move-result-object v4

    .line 811
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/drive/zzmh;->zzq(ILjava/util/List;Z)I

    .line 812
    .line 813
    .line 814
    move-result v3

    .line 815
    goto/16 :goto_3

    .line 816
    .line 817
    :pswitch_23
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzd(Ljava/lang/Object;J)Ljava/util/List;

    .line 818
    .line 819
    .line 820
    move-result-object v4

    .line 821
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/drive/zzmh;->zzu(ILjava/util/List;Z)I

    .line 822
    .line 823
    .line 824
    move-result v3

    .line 825
    goto/16 :goto_3

    .line 826
    .line 827
    :pswitch_24
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzd(Ljava/lang/Object;J)Ljava/util/List;

    .line 828
    .line 829
    .line 830
    move-result-object v4

    .line 831
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/drive/zzmh;->zzw(ILjava/util/List;Z)I

    .line 832
    .line 833
    .line 834
    move-result v3

    .line 835
    goto/16 :goto_3

    .line 836
    .line 837
    :pswitch_25
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzd(Ljava/lang/Object;J)Ljava/util/List;

    .line 838
    .line 839
    .line 840
    move-result-object v4

    .line 841
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/drive/zzmh;->zzv(ILjava/util/List;Z)I

    .line 842
    .line 843
    .line 844
    move-result v3

    .line 845
    goto/16 :goto_3

    .line 846
    .line 847
    :pswitch_26
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzd(Ljava/lang/Object;J)Ljava/util/List;

    .line 848
    .line 849
    .line 850
    move-result-object v4

    .line 851
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/drive/zzmh;->zzr(ILjava/util/List;Z)I

    .line 852
    .line 853
    .line 854
    move-result v3

    .line 855
    goto/16 :goto_3

    .line 856
    .line 857
    :pswitch_27
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzd(Ljava/lang/Object;J)Ljava/util/List;

    .line 858
    .line 859
    .line 860
    move-result-object v4

    .line 861
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/drive/zzmh;->zzt(ILjava/util/List;Z)I

    .line 862
    .line 863
    .line 864
    move-result v3

    .line 865
    goto/16 :goto_3

    .line 866
    .line 867
    :pswitch_28
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzd(Ljava/lang/Object;J)Ljava/util/List;

    .line 868
    .line 869
    .line 870
    move-result-object v4

    .line 871
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzd(ILjava/util/List;)I

    .line 872
    .line 873
    .line 874
    move-result v3

    .line 875
    goto/16 :goto_3

    .line 876
    .line 877
    :pswitch_29
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzd(Ljava/lang/Object;J)Ljava/util/List;

    .line 878
    .line 879
    .line 880
    move-result-object v4

    .line 881
    invoke-direct {v0, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 882
    .line 883
    .line 884
    move-result-object v5

    .line 885
    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzc(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzmf;)I

    .line 886
    .line 887
    .line 888
    move-result v3

    .line 889
    goto/16 :goto_3

    .line 890
    .line 891
    :pswitch_2a
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzd(Ljava/lang/Object;J)Ljava/util/List;

    .line 892
    .line 893
    .line 894
    move-result-object v4

    .line 895
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzmh;->zzc(ILjava/util/List;)I

    .line 896
    .line 897
    .line 898
    move-result v3

    .line 899
    goto/16 :goto_3

    .line 900
    .line 901
    :pswitch_2b
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzd(Ljava/lang/Object;J)Ljava/util/List;

    .line 902
    .line 903
    .line 904
    move-result-object v4

    .line 905
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/drive/zzmh;->zzx(ILjava/util/List;Z)I

    .line 906
    .line 907
    .line 908
    move-result v3

    .line 909
    goto/16 :goto_3

    .line 910
    .line 911
    :pswitch_2c
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzd(Ljava/lang/Object;J)Ljava/util/List;

    .line 912
    .line 913
    .line 914
    move-result-object v4

    .line 915
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/drive/zzmh;->zzv(ILjava/util/List;Z)I

    .line 916
    .line 917
    .line 918
    move-result v3

    .line 919
    goto/16 :goto_3

    .line 920
    .line 921
    :pswitch_2d
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzd(Ljava/lang/Object;J)Ljava/util/List;

    .line 922
    .line 923
    .line 924
    move-result-object v4

    .line 925
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/drive/zzmh;->zzw(ILjava/util/List;Z)I

    .line 926
    .line 927
    .line 928
    move-result v3

    .line 929
    goto/16 :goto_3

    .line 930
    .line 931
    :pswitch_2e
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzd(Ljava/lang/Object;J)Ljava/util/List;

    .line 932
    .line 933
    .line 934
    move-result-object v4

    .line 935
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/drive/zzmh;->zzs(ILjava/util/List;Z)I

    .line 936
    .line 937
    .line 938
    move-result v3

    .line 939
    goto/16 :goto_3

    .line 940
    .line 941
    :pswitch_2f
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzd(Ljava/lang/Object;J)Ljava/util/List;

    .line 942
    .line 943
    .line 944
    move-result-object v4

    .line 945
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/drive/zzmh;->zzp(ILjava/util/List;Z)I

    .line 946
    .line 947
    .line 948
    move-result v3

    .line 949
    goto/16 :goto_3

    .line 950
    .line 951
    :pswitch_30
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzd(Ljava/lang/Object;J)Ljava/util/List;

    .line 952
    .line 953
    .line 954
    move-result-object v4

    .line 955
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/drive/zzmh;->zzo(ILjava/util/List;Z)I

    .line 956
    .line 957
    .line 958
    move-result v3

    .line 959
    goto/16 :goto_3

    .line 960
    .line 961
    :pswitch_31
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzd(Ljava/lang/Object;J)Ljava/util/List;

    .line 962
    .line 963
    .line 964
    move-result-object v4

    .line 965
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/drive/zzmh;->zzv(ILjava/util/List;Z)I

    .line 966
    .line 967
    .line 968
    move-result v3

    .line 969
    goto/16 :goto_3

    .line 970
    .line 971
    :pswitch_32
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zzd(Ljava/lang/Object;J)Ljava/util/List;

    .line 972
    .line 973
    .line 974
    move-result-object v4

    .line 975
    invoke-static {v3, v4, v11}, Lcom/google/android/gms/internal/drive/zzmh;->zzw(ILjava/util/List;Z)I

    .line 976
    .line 977
    .line 978
    move-result v3

    .line 979
    goto/16 :goto_3

    .line 980
    .line 981
    :pswitch_33
    invoke-direct {v0, v1, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 982
    .line 983
    .line 984
    move-result v14

    .line 985
    if-eqz v14, :cond_11

    .line 986
    .line 987
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 988
    .line 989
    .line 990
    move-result-object v4

    .line 991
    check-cast v4, Lcom/google/android/gms/internal/drive/zzlq;

    .line 992
    .line 993
    invoke-direct {v0, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 994
    .line 995
    .line 996
    move-result-object v5

    .line 997
    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/drive/zzjr;->zzc(ILcom/google/android/gms/internal/drive/zzlq;Lcom/google/android/gms/internal/drive/zzmf;)I

    .line 998
    .line 999
    .line 1000
    move-result v3

    .line 1001
    goto/16 :goto_2

    .line 1002
    .line 1003
    :pswitch_34
    invoke-direct {v0, v1, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v14

    .line 1007
    if-eqz v14, :cond_11

    .line 1008
    .line 1009
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 1010
    .line 1011
    .line 1012
    move-result-wide v4

    .line 1013
    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/drive/zzjr;->zzf(IJ)I

    .line 1014
    .line 1015
    .line 1016
    move-result v3

    .line 1017
    goto/16 :goto_2

    .line 1018
    .line 1019
    :pswitch_35
    invoke-direct {v0, v1, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1020
    .line 1021
    .line 1022
    move-result v14

    .line 1023
    if-eqz v14, :cond_11

    .line 1024
    .line 1025
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 1026
    .line 1027
    .line 1028
    move-result v4

    .line 1029
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzjr;->zzi(II)I

    .line 1030
    .line 1031
    .line 1032
    move-result v3

    .line 1033
    goto/16 :goto_2

    .line 1034
    .line 1035
    :pswitch_36
    invoke-direct {v0, v1, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1036
    .line 1037
    .line 1038
    move-result v4

    .line 1039
    if-eqz v4, :cond_11

    .line 1040
    .line 1041
    invoke-static {v3, v9, v10}, Lcom/google/android/gms/internal/drive/zzjr;->zzh(IJ)I

    .line 1042
    .line 1043
    .line 1044
    move-result v3

    .line 1045
    goto/16 :goto_2

    .line 1046
    .line 1047
    :pswitch_37
    invoke-direct {v0, v1, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1048
    .line 1049
    .line 1050
    move-result v4

    .line 1051
    if-eqz v4, :cond_11

    .line 1052
    .line 1053
    invoke-static {v3, v11}, Lcom/google/android/gms/internal/drive/zzjr;->zzk(II)I

    .line 1054
    .line 1055
    .line 1056
    move-result v3

    .line 1057
    goto/16 :goto_2

    .line 1058
    .line 1059
    :pswitch_38
    invoke-direct {v0, v1, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1060
    .line 1061
    .line 1062
    move-result v14

    .line 1063
    if-eqz v14, :cond_11

    .line 1064
    .line 1065
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 1066
    .line 1067
    .line 1068
    move-result v4

    .line 1069
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzjr;->zzl(II)I

    .line 1070
    .line 1071
    .line 1072
    move-result v3

    .line 1073
    goto/16 :goto_2

    .line 1074
    .line 1075
    :pswitch_39
    invoke-direct {v0, v1, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1076
    .line 1077
    .line 1078
    move-result v14

    .line 1079
    if-eqz v14, :cond_11

    .line 1080
    .line 1081
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 1082
    .line 1083
    .line 1084
    move-result v4

    .line 1085
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzjr;->zzh(II)I

    .line 1086
    .line 1087
    .line 1088
    move-result v3

    .line 1089
    goto/16 :goto_2

    .line 1090
    .line 1091
    :pswitch_3a
    invoke-direct {v0, v1, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1092
    .line 1093
    .line 1094
    move-result v14

    .line 1095
    if-eqz v14, :cond_11

    .line 1096
    .line 1097
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v4

    .line 1101
    check-cast v4, Lcom/google/android/gms/internal/drive/zzjc;

    .line 1102
    .line 1103
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzjr;->zzc(ILcom/google/android/gms/internal/drive/zzjc;)I

    .line 1104
    .line 1105
    .line 1106
    move-result v3

    .line 1107
    goto/16 :goto_2

    .line 1108
    .line 1109
    :pswitch_3b
    invoke-direct {v0, v1, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1110
    .line 1111
    .line 1112
    move-result v14

    .line 1113
    if-eqz v14, :cond_11

    .line 1114
    .line 1115
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v4

    .line 1119
    invoke-direct {v0, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v5

    .line 1123
    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/drive/zzmh;->zzc(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzmf;)I

    .line 1124
    .line 1125
    .line 1126
    move-result v3

    .line 1127
    goto/16 :goto_3

    .line 1128
    .line 1129
    :pswitch_3c
    invoke-direct {v0, v1, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1130
    .line 1131
    .line 1132
    move-result v14

    .line 1133
    if-eqz v14, :cond_11

    .line 1134
    .line 1135
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v4

    .line 1139
    instance-of v5, v4, Lcom/google/android/gms/internal/drive/zzjc;

    .line 1140
    .line 1141
    if-eqz v5, :cond_10

    .line 1142
    .line 1143
    check-cast v4, Lcom/google/android/gms/internal/drive/zzjc;

    .line 1144
    .line 1145
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzjr;->zzc(ILcom/google/android/gms/internal/drive/zzjc;)I

    .line 1146
    .line 1147
    .line 1148
    move-result v3

    .line 1149
    goto/16 :goto_2

    .line 1150
    .line 1151
    :cond_10
    check-cast v4, Ljava/lang/String;

    .line 1152
    .line 1153
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzjr;->zzb(ILjava/lang/String;)I

    .line 1154
    .line 1155
    .line 1156
    move-result v3

    .line 1157
    goto/16 :goto_2

    .line 1158
    .line 1159
    :pswitch_3d
    invoke-direct {v0, v1, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1160
    .line 1161
    .line 1162
    move-result v4

    .line 1163
    if-eqz v4, :cond_11

    .line 1164
    .line 1165
    invoke-static {v3, v8}, Lcom/google/android/gms/internal/drive/zzjr;->zzc(IZ)I

    .line 1166
    .line 1167
    .line 1168
    move-result v3

    .line 1169
    goto/16 :goto_2

    .line 1170
    .line 1171
    :pswitch_3e
    invoke-direct {v0, v1, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1172
    .line 1173
    .line 1174
    move-result v4

    .line 1175
    if-eqz v4, :cond_11

    .line 1176
    .line 1177
    invoke-static {v3, v11}, Lcom/google/android/gms/internal/drive/zzjr;->zzj(II)I

    .line 1178
    .line 1179
    .line 1180
    move-result v3

    .line 1181
    goto/16 :goto_2

    .line 1182
    .line 1183
    :pswitch_3f
    invoke-direct {v0, v1, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1184
    .line 1185
    .line 1186
    move-result v4

    .line 1187
    if-eqz v4, :cond_11

    .line 1188
    .line 1189
    invoke-static {v3, v9, v10}, Lcom/google/android/gms/internal/drive/zzjr;->zzg(IJ)I

    .line 1190
    .line 1191
    .line 1192
    move-result v3

    .line 1193
    goto/16 :goto_2

    .line 1194
    .line 1195
    :pswitch_40
    invoke-direct {v0, v1, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1196
    .line 1197
    .line 1198
    move-result v14

    .line 1199
    if-eqz v14, :cond_11

    .line 1200
    .line 1201
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zzj(Ljava/lang/Object;J)I

    .line 1202
    .line 1203
    .line 1204
    move-result v4

    .line 1205
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/drive/zzjr;->zzg(II)I

    .line 1206
    .line 1207
    .line 1208
    move-result v3

    .line 1209
    goto/16 :goto_2

    .line 1210
    .line 1211
    :pswitch_41
    invoke-direct {v0, v1, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1212
    .line 1213
    .line 1214
    move-result v14

    .line 1215
    if-eqz v14, :cond_11

    .line 1216
    .line 1217
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 1218
    .line 1219
    .line 1220
    move-result-wide v4

    .line 1221
    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/drive/zzjr;->zze(IJ)I

    .line 1222
    .line 1223
    .line 1224
    move-result v3

    .line 1225
    goto/16 :goto_2

    .line 1226
    .line 1227
    :pswitch_42
    invoke-direct {v0, v1, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1228
    .line 1229
    .line 1230
    move-result v14

    .line 1231
    if-eqz v14, :cond_11

    .line 1232
    .line 1233
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zznd;->zzk(Ljava/lang/Object;J)J

    .line 1234
    .line 1235
    .line 1236
    move-result-wide v4

    .line 1237
    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/drive/zzjr;->zzd(IJ)I

    .line 1238
    .line 1239
    .line 1240
    move-result v3

    .line 1241
    goto/16 :goto_2

    .line 1242
    .line 1243
    :pswitch_43
    invoke-direct {v0, v1, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1244
    .line 1245
    .line 1246
    move-result v4

    .line 1247
    if-eqz v4, :cond_11

    .line 1248
    .line 1249
    invoke-static {v3, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzb(IF)I

    .line 1250
    .line 1251
    .line 1252
    move-result v3

    .line 1253
    goto/16 :goto_2

    .line 1254
    .line 1255
    :pswitch_44
    invoke-direct {v0, v1, v12}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;I)Z

    .line 1256
    .line 1257
    .line 1258
    move-result v4

    .line 1259
    if-eqz v4, :cond_11

    .line 1260
    .line 1261
    const-wide/16 v4, 0x0

    .line 1262
    .line 1263
    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/drive/zzjr;->zzb(ID)I

    .line 1264
    .line 1265
    .line 1266
    move-result v3

    .line 1267
    goto/16 :goto_2

    .line 1268
    .line 1269
    :cond_11
    :goto_4
    add-int/lit8 v12, v12, 0x3

    .line 1270
    .line 1271
    move/from16 v3, v16

    .line 1272
    .line 1273
    goto/16 :goto_0

    .line 1274
    .line 1275
    :cond_12
    iget-object v0, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzur:Lcom/google/android/gms/internal/drive/zzmx;

    .line 1276
    .line 1277
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Lcom/google/android/gms/internal/drive/zzmx;Ljava/lang/Object;)I

    .line 1278
    .line 1279
    .line 1280
    move-result v0

    .line 1281
    add-int/2addr v13, v0

    .line 1282
    return v13

    .line 1283
    :cond_13
    move/from16 v16, v3

    .line 1284
    .line 1285
    sget-object v2, Lcom/google/android/gms/internal/drive/zzlu;->zzuc:Lsun/misc/Unsafe;

    .line 1286
    .line 1287
    const/4 v3, -0x1

    .line 1288
    move v4, v11

    .line 1289
    move v5, v4

    .line 1290
    move v12, v5

    .line 1291
    :goto_5
    iget-object v13, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1292
    .line 1293
    array-length v13, v13

    .line 1294
    if-ge v4, v13, :cond_2a

    .line 1295
    .line 1296
    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zzas(I)I

    .line 1297
    .line 1298
    .line 1299
    move-result v13

    .line 1300
    iget-object v14, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1301
    .line 1302
    aget v15, v14, v4

    .line 1303
    .line 1304
    and-int v17, v13, v16

    .line 1305
    .line 1306
    move/from16 v18, v7

    .line 1307
    .line 1308
    ushr-int/lit8 v7, v17, 0x14

    .line 1309
    .line 1310
    const/16 v6, 0x11

    .line 1311
    .line 1312
    if-gt v7, v6, :cond_14

    .line 1313
    .line 1314
    add-int/lit8 v6, v4, 0x2

    .line 1315
    .line 1316
    aget v6, v14, v6

    .line 1317
    .line 1318
    and-int v14, v6, v18

    .line 1319
    .line 1320
    ushr-int/lit8 v19, v6, 0x14

    .line 1321
    .line 1322
    shl-int v19, v8, v19

    .line 1323
    .line 1324
    if-eq v14, v3, :cond_16

    .line 1325
    .line 1326
    int-to-long v11, v14

    .line 1327
    invoke-virtual {v2, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1328
    .line 1329
    .line 1330
    move-result v12

    .line 1331
    move v3, v14

    .line 1332
    goto :goto_7

    .line 1333
    :cond_14
    iget-boolean v6, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 1334
    .line 1335
    if-eqz v6, :cond_15

    .line 1336
    .line 1337
    sget-object v6, Lcom/google/android/gms/internal/drive/zzke;->zzqh:Lcom/google/android/gms/internal/drive/zzke;

    .line 1338
    .line 1339
    invoke-virtual {v6}, Lcom/google/android/gms/internal/drive/zzke;->id()I

    .line 1340
    .line 1341
    .line 1342
    move-result v6

    .line 1343
    if-lt v7, v6, :cond_15

    .line 1344
    .line 1345
    sget-object v6, Lcom/google/android/gms/internal/drive/zzke;->zzqu:Lcom/google/android/gms/internal/drive/zzke;

    .line 1346
    .line 1347
    invoke-virtual {v6}, Lcom/google/android/gms/internal/drive/zzke;->id()I

    .line 1348
    .line 1349
    .line 1350
    move-result v6

    .line 1351
    if-gt v7, v6, :cond_15

    .line 1352
    .line 1353
    iget-object v6, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 1354
    .line 1355
    add-int/lit8 v11, v4, 0x2

    .line 1356
    .line 1357
    aget v6, v6, v11

    .line 1358
    .line 1359
    and-int v6, v6, v18

    .line 1360
    .line 1361
    :goto_6
    const/16 v19, 0x0

    .line 1362
    .line 1363
    goto :goto_7

    .line 1364
    :cond_15
    const/4 v6, 0x0

    .line 1365
    goto :goto_6

    .line 1366
    :cond_16
    :goto_7
    and-int v11, v13, v18

    .line 1367
    .line 1368
    int-to-long v13, v11

    .line 1369
    packed-switch v7, :pswitch_data_1

    .line 1370
    .line 1371
    .line 1372
    goto :goto_9

    .line 1373
    :pswitch_45
    invoke-direct {v0, v1, v15, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1374
    .line 1375
    .line 1376
    move-result v6

    .line 1377
    if-eqz v6, :cond_17

    .line 1378
    .line 1379
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v6

    .line 1383
    check-cast v6, Lcom/google/android/gms/internal/drive/zzlq;

    .line 1384
    .line 1385
    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v7

    .line 1389
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzjr;->zzc(ILcom/google/android/gms/internal/drive/zzlq;Lcom/google/android/gms/internal/drive/zzmf;)I

    .line 1390
    .line 1391
    .line 1392
    move-result v6

    .line 1393
    :goto_8
    add-int/2addr v5, v6

    .line 1394
    :cond_17
    :goto_9
    const/4 v6, 0x0

    .line 1395
    :cond_18
    :goto_a
    const/4 v7, 0x0

    .line 1396
    :goto_b
    const-wide/16 v13, 0x0

    .line 1397
    .line 1398
    goto/16 :goto_10

    .line 1399
    .line 1400
    :pswitch_46
    invoke-direct {v0, v1, v15, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1401
    .line 1402
    .line 1403
    move-result v6

    .line 1404
    if-eqz v6, :cond_17

    .line 1405
    .line 1406
    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 1407
    .line 1408
    .line 1409
    move-result-wide v6

    .line 1410
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzjr;->zzf(IJ)I

    .line 1411
    .line 1412
    .line 1413
    move-result v6

    .line 1414
    goto :goto_8

    .line 1415
    :pswitch_47
    invoke-direct {v0, v1, v15, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1416
    .line 1417
    .line 1418
    move-result v6

    .line 1419
    if-eqz v6, :cond_17

    .line 1420
    .line 1421
    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 1422
    .line 1423
    .line 1424
    move-result v6

    .line 1425
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzi(II)I

    .line 1426
    .line 1427
    .line 1428
    move-result v6

    .line 1429
    goto :goto_8

    .line 1430
    :pswitch_48
    invoke-direct {v0, v1, v15, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1431
    .line 1432
    .line 1433
    move-result v6

    .line 1434
    if-eqz v6, :cond_17

    .line 1435
    .line 1436
    invoke-static {v15, v9, v10}, Lcom/google/android/gms/internal/drive/zzjr;->zzh(IJ)I

    .line 1437
    .line 1438
    .line 1439
    move-result v6

    .line 1440
    goto :goto_8

    .line 1441
    :pswitch_49
    invoke-direct {v0, v1, v15, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1442
    .line 1443
    .line 1444
    move-result v6

    .line 1445
    if-eqz v6, :cond_17

    .line 1446
    .line 1447
    const/4 v6, 0x0

    .line 1448
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzk(II)I

    .line 1449
    .line 1450
    .line 1451
    move-result v7

    .line 1452
    :goto_c
    add-int/2addr v5, v7

    .line 1453
    goto :goto_9

    .line 1454
    :pswitch_4a
    invoke-direct {v0, v1, v15, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1455
    .line 1456
    .line 1457
    move-result v6

    .line 1458
    if-eqz v6, :cond_17

    .line 1459
    .line 1460
    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 1461
    .line 1462
    .line 1463
    move-result v6

    .line 1464
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzl(II)I

    .line 1465
    .line 1466
    .line 1467
    move-result v6

    .line 1468
    goto :goto_8

    .line 1469
    :pswitch_4b
    invoke-direct {v0, v1, v15, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1470
    .line 1471
    .line 1472
    move-result v6

    .line 1473
    if-eqz v6, :cond_17

    .line 1474
    .line 1475
    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 1476
    .line 1477
    .line 1478
    move-result v6

    .line 1479
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzh(II)I

    .line 1480
    .line 1481
    .line 1482
    move-result v6

    .line 1483
    goto :goto_8

    .line 1484
    :pswitch_4c
    invoke-direct {v0, v1, v15, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1485
    .line 1486
    .line 1487
    move-result v6

    .line 1488
    if-eqz v6, :cond_17

    .line 1489
    .line 1490
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v6

    .line 1494
    check-cast v6, Lcom/google/android/gms/internal/drive/zzjc;

    .line 1495
    .line 1496
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzc(ILcom/google/android/gms/internal/drive/zzjc;)I

    .line 1497
    .line 1498
    .line 1499
    move-result v6

    .line 1500
    goto :goto_8

    .line 1501
    :pswitch_4d
    invoke-direct {v0, v1, v15, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1502
    .line 1503
    .line 1504
    move-result v6

    .line 1505
    if-eqz v6, :cond_17

    .line 1506
    .line 1507
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v6

    .line 1511
    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v7

    .line 1515
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzc(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzmf;)I

    .line 1516
    .line 1517
    .line 1518
    move-result v6

    .line 1519
    :goto_d
    add-int/2addr v5, v6

    .line 1520
    goto :goto_9

    .line 1521
    :pswitch_4e
    invoke-direct {v0, v1, v15, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1522
    .line 1523
    .line 1524
    move-result v6

    .line 1525
    if-eqz v6, :cond_17

    .line 1526
    .line 1527
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v6

    .line 1531
    instance-of v7, v6, Lcom/google/android/gms/internal/drive/zzjc;

    .line 1532
    .line 1533
    if-eqz v7, :cond_19

    .line 1534
    .line 1535
    check-cast v6, Lcom/google/android/gms/internal/drive/zzjc;

    .line 1536
    .line 1537
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzc(ILcom/google/android/gms/internal/drive/zzjc;)I

    .line 1538
    .line 1539
    .line 1540
    move-result v6

    .line 1541
    goto/16 :goto_8

    .line 1542
    .line 1543
    :cond_19
    check-cast v6, Ljava/lang/String;

    .line 1544
    .line 1545
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzb(ILjava/lang/String;)I

    .line 1546
    .line 1547
    .line 1548
    move-result v6

    .line 1549
    goto/16 :goto_8

    .line 1550
    .line 1551
    :pswitch_4f
    invoke-direct {v0, v1, v15, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1552
    .line 1553
    .line 1554
    move-result v6

    .line 1555
    if-eqz v6, :cond_17

    .line 1556
    .line 1557
    invoke-static {v15, v8}, Lcom/google/android/gms/internal/drive/zzjr;->zzc(IZ)I

    .line 1558
    .line 1559
    .line 1560
    move-result v6

    .line 1561
    goto/16 :goto_8

    .line 1562
    .line 1563
    :pswitch_50
    invoke-direct {v0, v1, v15, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1564
    .line 1565
    .line 1566
    move-result v6

    .line 1567
    if-eqz v6, :cond_17

    .line 1568
    .line 1569
    const/4 v6, 0x0

    .line 1570
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzj(II)I

    .line 1571
    .line 1572
    .line 1573
    move-result v7

    .line 1574
    goto :goto_c

    .line 1575
    :pswitch_51
    invoke-direct {v0, v1, v15, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1576
    .line 1577
    .line 1578
    move-result v6

    .line 1579
    if-eqz v6, :cond_17

    .line 1580
    .line 1581
    invoke-static {v15, v9, v10}, Lcom/google/android/gms/internal/drive/zzjr;->zzg(IJ)I

    .line 1582
    .line 1583
    .line 1584
    move-result v6

    .line 1585
    goto/16 :goto_8

    .line 1586
    .line 1587
    :pswitch_52
    invoke-direct {v0, v1, v15, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1588
    .line 1589
    .line 1590
    move-result v6

    .line 1591
    if-eqz v6, :cond_17

    .line 1592
    .line 1593
    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/drive/zzlu;->zzg(Ljava/lang/Object;J)I

    .line 1594
    .line 1595
    .line 1596
    move-result v6

    .line 1597
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzg(II)I

    .line 1598
    .line 1599
    .line 1600
    move-result v6

    .line 1601
    goto/16 :goto_8

    .line 1602
    .line 1603
    :pswitch_53
    invoke-direct {v0, v1, v15, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1604
    .line 1605
    .line 1606
    move-result v6

    .line 1607
    if-eqz v6, :cond_17

    .line 1608
    .line 1609
    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 1610
    .line 1611
    .line 1612
    move-result-wide v6

    .line 1613
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzjr;->zze(IJ)I

    .line 1614
    .line 1615
    .line 1616
    move-result v6

    .line 1617
    goto/16 :goto_8

    .line 1618
    .line 1619
    :pswitch_54
    invoke-direct {v0, v1, v15, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1620
    .line 1621
    .line 1622
    move-result v6

    .line 1623
    if-eqz v6, :cond_17

    .line 1624
    .line 1625
    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/drive/zzlu;->zzh(Ljava/lang/Object;J)J

    .line 1626
    .line 1627
    .line 1628
    move-result-wide v6

    .line 1629
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzjr;->zzd(IJ)I

    .line 1630
    .line 1631
    .line 1632
    move-result v6

    .line 1633
    goto/16 :goto_8

    .line 1634
    .line 1635
    :pswitch_55
    invoke-direct {v0, v1, v15, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1636
    .line 1637
    .line 1638
    move-result v6

    .line 1639
    if-eqz v6, :cond_17

    .line 1640
    .line 1641
    const/4 v6, 0x0

    .line 1642
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzb(IF)I

    .line 1643
    .line 1644
    .line 1645
    move-result v7

    .line 1646
    goto/16 :goto_c

    .line 1647
    .line 1648
    :pswitch_56
    invoke-direct {v0, v1, v15, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 1649
    .line 1650
    .line 1651
    move-result v6

    .line 1652
    if-eqz v6, :cond_17

    .line 1653
    .line 1654
    const-wide/16 v6, 0x0

    .line 1655
    .line 1656
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzjr;->zzb(ID)I

    .line 1657
    .line 1658
    .line 1659
    move-result v11

    .line 1660
    add-int/2addr v5, v11

    .line 1661
    goto/16 :goto_9

    .line 1662
    .line 1663
    :pswitch_57
    iget-object v6, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzut:Lcom/google/android/gms/internal/drive/zzll;

    .line 1664
    .line 1665
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v7

    .line 1669
    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zzaq(I)Ljava/lang/Object;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v11

    .line 1673
    invoke-interface {v6, v15, v7, v11}, Lcom/google/android/gms/internal/drive/zzll;->zzb(ILjava/lang/Object;Ljava/lang/Object;)I

    .line 1674
    .line 1675
    .line 1676
    move-result v6

    .line 1677
    goto/16 :goto_d

    .line 1678
    .line 1679
    :pswitch_58
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v6

    .line 1683
    check-cast v6, Ljava/util/List;

    .line 1684
    .line 1685
    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v7

    .line 1689
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzd(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzmf;)I

    .line 1690
    .line 1691
    .line 1692
    move-result v6

    .line 1693
    goto/16 :goto_d

    .line 1694
    .line 1695
    :pswitch_59
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v7

    .line 1699
    check-cast v7, Ljava/util/List;

    .line 1700
    .line 1701
    invoke-static {v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzc(Ljava/util/List;)I

    .line 1702
    .line 1703
    .line 1704
    move-result v7

    .line 1705
    if-lez v7, :cond_17

    .line 1706
    .line 1707
    iget-boolean v11, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 1708
    .line 1709
    if-eqz v11, :cond_1a

    .line 1710
    .line 1711
    int-to-long v13, v6

    .line 1712
    invoke-virtual {v2, v1, v13, v14, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1713
    .line 1714
    .line 1715
    :cond_1a
    invoke-static {v15}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 1716
    .line 1717
    .line 1718
    move-result v6

    .line 1719
    invoke-static {v7, v6, v7, v5}, Lpm2;->g(IIII)I

    .line 1720
    .line 1721
    .line 1722
    move-result v5

    .line 1723
    goto/16 :goto_9

    .line 1724
    .line 1725
    :pswitch_5a
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1726
    .line 1727
    .line 1728
    move-result-object v7

    .line 1729
    check-cast v7, Ljava/util/List;

    .line 1730
    .line 1731
    invoke-static {v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzg(Ljava/util/List;)I

    .line 1732
    .line 1733
    .line 1734
    move-result v7

    .line 1735
    if-lez v7, :cond_17

    .line 1736
    .line 1737
    iget-boolean v11, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 1738
    .line 1739
    if-eqz v11, :cond_1b

    .line 1740
    .line 1741
    int-to-long v13, v6

    .line 1742
    invoke-virtual {v2, v1, v13, v14, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1743
    .line 1744
    .line 1745
    :cond_1b
    invoke-static {v15}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 1746
    .line 1747
    .line 1748
    move-result v6

    .line 1749
    invoke-static {v7, v6, v7, v5}, Lpm2;->g(IIII)I

    .line 1750
    .line 1751
    .line 1752
    move-result v5

    .line 1753
    goto/16 :goto_9

    .line 1754
    .line 1755
    :pswitch_5b
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v7

    .line 1759
    check-cast v7, Ljava/util/List;

    .line 1760
    .line 1761
    invoke-static {v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzi(Ljava/util/List;)I

    .line 1762
    .line 1763
    .line 1764
    move-result v7

    .line 1765
    if-lez v7, :cond_17

    .line 1766
    .line 1767
    iget-boolean v11, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 1768
    .line 1769
    if-eqz v11, :cond_1c

    .line 1770
    .line 1771
    int-to-long v13, v6

    .line 1772
    invoke-virtual {v2, v1, v13, v14, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1773
    .line 1774
    .line 1775
    :cond_1c
    invoke-static {v15}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 1776
    .line 1777
    .line 1778
    move-result v6

    .line 1779
    invoke-static {v7, v6, v7, v5}, Lpm2;->g(IIII)I

    .line 1780
    .line 1781
    .line 1782
    move-result v5

    .line 1783
    goto/16 :goto_9

    .line 1784
    .line 1785
    :pswitch_5c
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v7

    .line 1789
    check-cast v7, Ljava/util/List;

    .line 1790
    .line 1791
    invoke-static {v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzh(Ljava/util/List;)I

    .line 1792
    .line 1793
    .line 1794
    move-result v7

    .line 1795
    if-lez v7, :cond_17

    .line 1796
    .line 1797
    iget-boolean v11, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 1798
    .line 1799
    if-eqz v11, :cond_1d

    .line 1800
    .line 1801
    int-to-long v13, v6

    .line 1802
    invoke-virtual {v2, v1, v13, v14, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1803
    .line 1804
    .line 1805
    :cond_1d
    invoke-static {v15}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 1806
    .line 1807
    .line 1808
    move-result v6

    .line 1809
    invoke-static {v7, v6, v7, v5}, Lpm2;->g(IIII)I

    .line 1810
    .line 1811
    .line 1812
    move-result v5

    .line 1813
    goto/16 :goto_9

    .line 1814
    .line 1815
    :pswitch_5d
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1816
    .line 1817
    .line 1818
    move-result-object v7

    .line 1819
    check-cast v7, Ljava/util/List;

    .line 1820
    .line 1821
    invoke-static {v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzd(Ljava/util/List;)I

    .line 1822
    .line 1823
    .line 1824
    move-result v7

    .line 1825
    if-lez v7, :cond_17

    .line 1826
    .line 1827
    iget-boolean v11, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 1828
    .line 1829
    if-eqz v11, :cond_1e

    .line 1830
    .line 1831
    int-to-long v13, v6

    .line 1832
    invoke-virtual {v2, v1, v13, v14, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1833
    .line 1834
    .line 1835
    :cond_1e
    invoke-static {v15}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 1836
    .line 1837
    .line 1838
    move-result v6

    .line 1839
    invoke-static {v7, v6, v7, v5}, Lpm2;->g(IIII)I

    .line 1840
    .line 1841
    .line 1842
    move-result v5

    .line 1843
    goto/16 :goto_9

    .line 1844
    .line 1845
    :pswitch_5e
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v7

    .line 1849
    check-cast v7, Ljava/util/List;

    .line 1850
    .line 1851
    invoke-static {v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzf(Ljava/util/List;)I

    .line 1852
    .line 1853
    .line 1854
    move-result v7

    .line 1855
    if-lez v7, :cond_17

    .line 1856
    .line 1857
    iget-boolean v11, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 1858
    .line 1859
    if-eqz v11, :cond_1f

    .line 1860
    .line 1861
    int-to-long v13, v6

    .line 1862
    invoke-virtual {v2, v1, v13, v14, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1863
    .line 1864
    .line 1865
    :cond_1f
    invoke-static {v15}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 1866
    .line 1867
    .line 1868
    move-result v6

    .line 1869
    invoke-static {v7, v6, v7, v5}, Lpm2;->g(IIII)I

    .line 1870
    .line 1871
    .line 1872
    move-result v5

    .line 1873
    goto/16 :goto_9

    .line 1874
    .line 1875
    :pswitch_5f
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v7

    .line 1879
    check-cast v7, Ljava/util/List;

    .line 1880
    .line 1881
    invoke-static {v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzj(Ljava/util/List;)I

    .line 1882
    .line 1883
    .line 1884
    move-result v7

    .line 1885
    if-lez v7, :cond_17

    .line 1886
    .line 1887
    iget-boolean v11, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 1888
    .line 1889
    if-eqz v11, :cond_20

    .line 1890
    .line 1891
    int-to-long v13, v6

    .line 1892
    invoke-virtual {v2, v1, v13, v14, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1893
    .line 1894
    .line 1895
    :cond_20
    invoke-static {v15}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 1896
    .line 1897
    .line 1898
    move-result v6

    .line 1899
    invoke-static {v7, v6, v7, v5}, Lpm2;->g(IIII)I

    .line 1900
    .line 1901
    .line 1902
    move-result v5

    .line 1903
    goto/16 :goto_9

    .line 1904
    .line 1905
    :pswitch_60
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1906
    .line 1907
    .line 1908
    move-result-object v7

    .line 1909
    check-cast v7, Ljava/util/List;

    .line 1910
    .line 1911
    invoke-static {v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzh(Ljava/util/List;)I

    .line 1912
    .line 1913
    .line 1914
    move-result v7

    .line 1915
    if-lez v7, :cond_17

    .line 1916
    .line 1917
    iget-boolean v11, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 1918
    .line 1919
    if-eqz v11, :cond_21

    .line 1920
    .line 1921
    int-to-long v13, v6

    .line 1922
    invoke-virtual {v2, v1, v13, v14, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1923
    .line 1924
    .line 1925
    :cond_21
    invoke-static {v15}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 1926
    .line 1927
    .line 1928
    move-result v6

    .line 1929
    invoke-static {v7, v6, v7, v5}, Lpm2;->g(IIII)I

    .line 1930
    .line 1931
    .line 1932
    move-result v5

    .line 1933
    goto/16 :goto_9

    .line 1934
    .line 1935
    :pswitch_61
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1936
    .line 1937
    .line 1938
    move-result-object v7

    .line 1939
    check-cast v7, Ljava/util/List;

    .line 1940
    .line 1941
    invoke-static {v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzi(Ljava/util/List;)I

    .line 1942
    .line 1943
    .line 1944
    move-result v7

    .line 1945
    if-lez v7, :cond_17

    .line 1946
    .line 1947
    iget-boolean v11, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 1948
    .line 1949
    if-eqz v11, :cond_22

    .line 1950
    .line 1951
    int-to-long v13, v6

    .line 1952
    invoke-virtual {v2, v1, v13, v14, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1953
    .line 1954
    .line 1955
    :cond_22
    invoke-static {v15}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 1956
    .line 1957
    .line 1958
    move-result v6

    .line 1959
    invoke-static {v7, v6, v7, v5}, Lpm2;->g(IIII)I

    .line 1960
    .line 1961
    .line 1962
    move-result v5

    .line 1963
    goto/16 :goto_9

    .line 1964
    .line 1965
    :pswitch_62
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1966
    .line 1967
    .line 1968
    move-result-object v7

    .line 1969
    check-cast v7, Ljava/util/List;

    .line 1970
    .line 1971
    invoke-static {v7}, Lcom/google/android/gms/internal/drive/zzmh;->zze(Ljava/util/List;)I

    .line 1972
    .line 1973
    .line 1974
    move-result v7

    .line 1975
    if-lez v7, :cond_17

    .line 1976
    .line 1977
    iget-boolean v11, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 1978
    .line 1979
    if-eqz v11, :cond_23

    .line 1980
    .line 1981
    int-to-long v13, v6

    .line 1982
    invoke-virtual {v2, v1, v13, v14, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 1983
    .line 1984
    .line 1985
    :cond_23
    invoke-static {v15}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 1986
    .line 1987
    .line 1988
    move-result v6

    .line 1989
    invoke-static {v7, v6, v7, v5}, Lpm2;->g(IIII)I

    .line 1990
    .line 1991
    .line 1992
    move-result v5

    .line 1993
    goto/16 :goto_9

    .line 1994
    .line 1995
    :pswitch_63
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1996
    .line 1997
    .line 1998
    move-result-object v7

    .line 1999
    check-cast v7, Ljava/util/List;

    .line 2000
    .line 2001
    invoke-static {v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzb(Ljava/util/List;)I

    .line 2002
    .line 2003
    .line 2004
    move-result v7

    .line 2005
    if-lez v7, :cond_17

    .line 2006
    .line 2007
    iget-boolean v11, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 2008
    .line 2009
    if-eqz v11, :cond_24

    .line 2010
    .line 2011
    int-to-long v13, v6

    .line 2012
    invoke-virtual {v2, v1, v13, v14, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 2013
    .line 2014
    .line 2015
    :cond_24
    invoke-static {v15}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 2016
    .line 2017
    .line 2018
    move-result v6

    .line 2019
    invoke-static {v7, v6, v7, v5}, Lpm2;->g(IIII)I

    .line 2020
    .line 2021
    .line 2022
    move-result v5

    .line 2023
    goto/16 :goto_9

    .line 2024
    .line 2025
    :pswitch_64
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v7

    .line 2029
    check-cast v7, Ljava/util/List;

    .line 2030
    .line 2031
    invoke-static {v7}, Lcom/google/android/gms/internal/drive/zzmh;->zza(Ljava/util/List;)I

    .line 2032
    .line 2033
    .line 2034
    move-result v7

    .line 2035
    if-lez v7, :cond_17

    .line 2036
    .line 2037
    iget-boolean v11, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 2038
    .line 2039
    if-eqz v11, :cond_25

    .line 2040
    .line 2041
    int-to-long v13, v6

    .line 2042
    invoke-virtual {v2, v1, v13, v14, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 2043
    .line 2044
    .line 2045
    :cond_25
    invoke-static {v15}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 2046
    .line 2047
    .line 2048
    move-result v6

    .line 2049
    invoke-static {v7, v6, v7, v5}, Lpm2;->g(IIII)I

    .line 2050
    .line 2051
    .line 2052
    move-result v5

    .line 2053
    goto/16 :goto_9

    .line 2054
    .line 2055
    :pswitch_65
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2056
    .line 2057
    .line 2058
    move-result-object v7

    .line 2059
    check-cast v7, Ljava/util/List;

    .line 2060
    .line 2061
    invoke-static {v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzh(Ljava/util/List;)I

    .line 2062
    .line 2063
    .line 2064
    move-result v7

    .line 2065
    if-lez v7, :cond_17

    .line 2066
    .line 2067
    iget-boolean v11, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 2068
    .line 2069
    if-eqz v11, :cond_26

    .line 2070
    .line 2071
    int-to-long v13, v6

    .line 2072
    invoke-virtual {v2, v1, v13, v14, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 2073
    .line 2074
    .line 2075
    :cond_26
    invoke-static {v15}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 2076
    .line 2077
    .line 2078
    move-result v6

    .line 2079
    invoke-static {v7, v6, v7, v5}, Lpm2;->g(IIII)I

    .line 2080
    .line 2081
    .line 2082
    move-result v5

    .line 2083
    goto/16 :goto_9

    .line 2084
    .line 2085
    :pswitch_66
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2086
    .line 2087
    .line 2088
    move-result-object v7

    .line 2089
    check-cast v7, Ljava/util/List;

    .line 2090
    .line 2091
    invoke-static {v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzi(Ljava/util/List;)I

    .line 2092
    .line 2093
    .line 2094
    move-result v7

    .line 2095
    if-lez v7, :cond_17

    .line 2096
    .line 2097
    iget-boolean v11, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzul:Z

    .line 2098
    .line 2099
    if-eqz v11, :cond_27

    .line 2100
    .line 2101
    int-to-long v13, v6

    .line 2102
    invoke-virtual {v2, v1, v13, v14, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 2103
    .line 2104
    .line 2105
    :cond_27
    invoke-static {v15}, Lcom/google/android/gms/internal/drive/zzjr;->zzab(I)I

    .line 2106
    .line 2107
    .line 2108
    move-result v6

    .line 2109
    invoke-static {v7, v6, v7, v5}, Lpm2;->g(IIII)I

    .line 2110
    .line 2111
    .line 2112
    move-result v5

    .line 2113
    goto/16 :goto_9

    .line 2114
    .line 2115
    :pswitch_67
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2116
    .line 2117
    .line 2118
    move-result-object v6

    .line 2119
    check-cast v6, Ljava/util/List;

    .line 2120
    .line 2121
    const/4 v7, 0x0

    .line 2122
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzq(ILjava/util/List;Z)I

    .line 2123
    .line 2124
    .line 2125
    move-result v6

    .line 2126
    :goto_e
    add-int/2addr v5, v6

    .line 2127
    move v6, v7

    .line 2128
    goto/16 :goto_a

    .line 2129
    .line 2130
    :pswitch_68
    const/4 v7, 0x0

    .line 2131
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v6

    .line 2135
    check-cast v6, Ljava/util/List;

    .line 2136
    .line 2137
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzu(ILjava/util/List;Z)I

    .line 2138
    .line 2139
    .line 2140
    move-result v6

    .line 2141
    goto :goto_e

    .line 2142
    :pswitch_69
    const/4 v7, 0x0

    .line 2143
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2144
    .line 2145
    .line 2146
    move-result-object v6

    .line 2147
    check-cast v6, Ljava/util/List;

    .line 2148
    .line 2149
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzw(ILjava/util/List;Z)I

    .line 2150
    .line 2151
    .line 2152
    move-result v6

    .line 2153
    goto :goto_e

    .line 2154
    :pswitch_6a
    const/4 v7, 0x0

    .line 2155
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2156
    .line 2157
    .line 2158
    move-result-object v6

    .line 2159
    check-cast v6, Ljava/util/List;

    .line 2160
    .line 2161
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzv(ILjava/util/List;Z)I

    .line 2162
    .line 2163
    .line 2164
    move-result v6

    .line 2165
    goto :goto_e

    .line 2166
    :pswitch_6b
    const/4 v7, 0x0

    .line 2167
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2168
    .line 2169
    .line 2170
    move-result-object v6

    .line 2171
    check-cast v6, Ljava/util/List;

    .line 2172
    .line 2173
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzr(ILjava/util/List;Z)I

    .line 2174
    .line 2175
    .line 2176
    move-result v6

    .line 2177
    goto :goto_e

    .line 2178
    :pswitch_6c
    const/4 v7, 0x0

    .line 2179
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2180
    .line 2181
    .line 2182
    move-result-object v6

    .line 2183
    check-cast v6, Ljava/util/List;

    .line 2184
    .line 2185
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzt(ILjava/util/List;Z)I

    .line 2186
    .line 2187
    .line 2188
    move-result v6

    .line 2189
    goto/16 :goto_d

    .line 2190
    .line 2191
    :pswitch_6d
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2192
    .line 2193
    .line 2194
    move-result-object v6

    .line 2195
    check-cast v6, Ljava/util/List;

    .line 2196
    .line 2197
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzmh;->zzd(ILjava/util/List;)I

    .line 2198
    .line 2199
    .line 2200
    move-result v6

    .line 2201
    goto/16 :goto_d

    .line 2202
    .line 2203
    :pswitch_6e
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2204
    .line 2205
    .line 2206
    move-result-object v6

    .line 2207
    check-cast v6, Ljava/util/List;

    .line 2208
    .line 2209
    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 2210
    .line 2211
    .line 2212
    move-result-object v7

    .line 2213
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzc(ILjava/util/List;Lcom/google/android/gms/internal/drive/zzmf;)I

    .line 2214
    .line 2215
    .line 2216
    move-result v6

    .line 2217
    goto/16 :goto_d

    .line 2218
    .line 2219
    :pswitch_6f
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2220
    .line 2221
    .line 2222
    move-result-object v6

    .line 2223
    check-cast v6, Ljava/util/List;

    .line 2224
    .line 2225
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzmh;->zzc(ILjava/util/List;)I

    .line 2226
    .line 2227
    .line 2228
    move-result v6

    .line 2229
    goto/16 :goto_d

    .line 2230
    .line 2231
    :pswitch_70
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2232
    .line 2233
    .line 2234
    move-result-object v6

    .line 2235
    check-cast v6, Ljava/util/List;

    .line 2236
    .line 2237
    const/4 v7, 0x0

    .line 2238
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzx(ILjava/util/List;Z)I

    .line 2239
    .line 2240
    .line 2241
    move-result v6

    .line 2242
    goto :goto_e

    .line 2243
    :pswitch_71
    const/4 v7, 0x0

    .line 2244
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2245
    .line 2246
    .line 2247
    move-result-object v6

    .line 2248
    check-cast v6, Ljava/util/List;

    .line 2249
    .line 2250
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzv(ILjava/util/List;Z)I

    .line 2251
    .line 2252
    .line 2253
    move-result v6

    .line 2254
    goto/16 :goto_e

    .line 2255
    .line 2256
    :pswitch_72
    const/4 v7, 0x0

    .line 2257
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2258
    .line 2259
    .line 2260
    move-result-object v6

    .line 2261
    check-cast v6, Ljava/util/List;

    .line 2262
    .line 2263
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzw(ILjava/util/List;Z)I

    .line 2264
    .line 2265
    .line 2266
    move-result v6

    .line 2267
    goto/16 :goto_e

    .line 2268
    .line 2269
    :pswitch_73
    const/4 v7, 0x0

    .line 2270
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2271
    .line 2272
    .line 2273
    move-result-object v6

    .line 2274
    check-cast v6, Ljava/util/List;

    .line 2275
    .line 2276
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzs(ILjava/util/List;Z)I

    .line 2277
    .line 2278
    .line 2279
    move-result v6

    .line 2280
    goto/16 :goto_e

    .line 2281
    .line 2282
    :pswitch_74
    const/4 v7, 0x0

    .line 2283
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2284
    .line 2285
    .line 2286
    move-result-object v6

    .line 2287
    check-cast v6, Ljava/util/List;

    .line 2288
    .line 2289
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzp(ILjava/util/List;Z)I

    .line 2290
    .line 2291
    .line 2292
    move-result v6

    .line 2293
    goto/16 :goto_e

    .line 2294
    .line 2295
    :pswitch_75
    const/4 v7, 0x0

    .line 2296
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2297
    .line 2298
    .line 2299
    move-result-object v6

    .line 2300
    check-cast v6, Ljava/util/List;

    .line 2301
    .line 2302
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzo(ILjava/util/List;Z)I

    .line 2303
    .line 2304
    .line 2305
    move-result v6

    .line 2306
    goto/16 :goto_e

    .line 2307
    .line 2308
    :pswitch_76
    const/4 v7, 0x0

    .line 2309
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2310
    .line 2311
    .line 2312
    move-result-object v6

    .line 2313
    check-cast v6, Ljava/util/List;

    .line 2314
    .line 2315
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzv(ILjava/util/List;Z)I

    .line 2316
    .line 2317
    .line 2318
    move-result v6

    .line 2319
    goto/16 :goto_e

    .line 2320
    .line 2321
    :pswitch_77
    const/4 v7, 0x0

    .line 2322
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2323
    .line 2324
    .line 2325
    move-result-object v6

    .line 2326
    check-cast v6, Ljava/util/List;

    .line 2327
    .line 2328
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzw(ILjava/util/List;Z)I

    .line 2329
    .line 2330
    .line 2331
    move-result v6

    .line 2332
    goto/16 :goto_d

    .line 2333
    .line 2334
    :pswitch_78
    and-int v6, v12, v19

    .line 2335
    .line 2336
    if-eqz v6, :cond_17

    .line 2337
    .line 2338
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2339
    .line 2340
    .line 2341
    move-result-object v6

    .line 2342
    check-cast v6, Lcom/google/android/gms/internal/drive/zzlq;

    .line 2343
    .line 2344
    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 2345
    .line 2346
    .line 2347
    move-result-object v7

    .line 2348
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzjr;->zzc(ILcom/google/android/gms/internal/drive/zzlq;Lcom/google/android/gms/internal/drive/zzmf;)I

    .line 2349
    .line 2350
    .line 2351
    move-result v6

    .line 2352
    goto/16 :goto_8

    .line 2353
    .line 2354
    :pswitch_79
    and-int v6, v12, v19

    .line 2355
    .line 2356
    if-eqz v6, :cond_17

    .line 2357
    .line 2358
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2359
    .line 2360
    .line 2361
    move-result-wide v6

    .line 2362
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzjr;->zzf(IJ)I

    .line 2363
    .line 2364
    .line 2365
    move-result v6

    .line 2366
    goto/16 :goto_8

    .line 2367
    .line 2368
    :pswitch_7a
    and-int v6, v12, v19

    .line 2369
    .line 2370
    if-eqz v6, :cond_17

    .line 2371
    .line 2372
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2373
    .line 2374
    .line 2375
    move-result v6

    .line 2376
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzi(II)I

    .line 2377
    .line 2378
    .line 2379
    move-result v6

    .line 2380
    goto/16 :goto_8

    .line 2381
    .line 2382
    :pswitch_7b
    and-int v6, v12, v19

    .line 2383
    .line 2384
    if-eqz v6, :cond_17

    .line 2385
    .line 2386
    invoke-static {v15, v9, v10}, Lcom/google/android/gms/internal/drive/zzjr;->zzh(IJ)I

    .line 2387
    .line 2388
    .line 2389
    move-result v6

    .line 2390
    goto/16 :goto_8

    .line 2391
    .line 2392
    :pswitch_7c
    and-int v6, v12, v19

    .line 2393
    .line 2394
    if-eqz v6, :cond_17

    .line 2395
    .line 2396
    const/4 v6, 0x0

    .line 2397
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzk(II)I

    .line 2398
    .line 2399
    .line 2400
    move-result v7

    .line 2401
    goto/16 :goto_c

    .line 2402
    .line 2403
    :pswitch_7d
    and-int v6, v12, v19

    .line 2404
    .line 2405
    if-eqz v6, :cond_17

    .line 2406
    .line 2407
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2408
    .line 2409
    .line 2410
    move-result v6

    .line 2411
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzl(II)I

    .line 2412
    .line 2413
    .line 2414
    move-result v6

    .line 2415
    goto/16 :goto_8

    .line 2416
    .line 2417
    :pswitch_7e
    and-int v6, v12, v19

    .line 2418
    .line 2419
    if-eqz v6, :cond_17

    .line 2420
    .line 2421
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2422
    .line 2423
    .line 2424
    move-result v6

    .line 2425
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzh(II)I

    .line 2426
    .line 2427
    .line 2428
    move-result v6

    .line 2429
    goto/16 :goto_8

    .line 2430
    .line 2431
    :pswitch_7f
    and-int v6, v12, v19

    .line 2432
    .line 2433
    if-eqz v6, :cond_17

    .line 2434
    .line 2435
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2436
    .line 2437
    .line 2438
    move-result-object v6

    .line 2439
    check-cast v6, Lcom/google/android/gms/internal/drive/zzjc;

    .line 2440
    .line 2441
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzc(ILcom/google/android/gms/internal/drive/zzjc;)I

    .line 2442
    .line 2443
    .line 2444
    move-result v6

    .line 2445
    goto/16 :goto_8

    .line 2446
    .line 2447
    :pswitch_80
    and-int v6, v12, v19

    .line 2448
    .line 2449
    if-eqz v6, :cond_17

    .line 2450
    .line 2451
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2452
    .line 2453
    .line 2454
    move-result-object v6

    .line 2455
    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 2456
    .line 2457
    .line 2458
    move-result-object v7

    .line 2459
    invoke-static {v15, v6, v7}, Lcom/google/android/gms/internal/drive/zzmh;->zzc(ILjava/lang/Object;Lcom/google/android/gms/internal/drive/zzmf;)I

    .line 2460
    .line 2461
    .line 2462
    move-result v6

    .line 2463
    goto/16 :goto_d

    .line 2464
    .line 2465
    :pswitch_81
    and-int v6, v12, v19

    .line 2466
    .line 2467
    if-eqz v6, :cond_17

    .line 2468
    .line 2469
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2470
    .line 2471
    .line 2472
    move-result-object v6

    .line 2473
    instance-of v7, v6, Lcom/google/android/gms/internal/drive/zzjc;

    .line 2474
    .line 2475
    if-eqz v7, :cond_28

    .line 2476
    .line 2477
    check-cast v6, Lcom/google/android/gms/internal/drive/zzjc;

    .line 2478
    .line 2479
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzc(ILcom/google/android/gms/internal/drive/zzjc;)I

    .line 2480
    .line 2481
    .line 2482
    move-result v6

    .line 2483
    goto/16 :goto_8

    .line 2484
    .line 2485
    :cond_28
    check-cast v6, Ljava/lang/String;

    .line 2486
    .line 2487
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzb(ILjava/lang/String;)I

    .line 2488
    .line 2489
    .line 2490
    move-result v6

    .line 2491
    goto/16 :goto_8

    .line 2492
    .line 2493
    :pswitch_82
    and-int v6, v12, v19

    .line 2494
    .line 2495
    if-eqz v6, :cond_17

    .line 2496
    .line 2497
    invoke-static {v15, v8}, Lcom/google/android/gms/internal/drive/zzjr;->zzc(IZ)I

    .line 2498
    .line 2499
    .line 2500
    move-result v6

    .line 2501
    goto/16 :goto_8

    .line 2502
    .line 2503
    :pswitch_83
    and-int v6, v12, v19

    .line 2504
    .line 2505
    if-eqz v6, :cond_17

    .line 2506
    .line 2507
    const/4 v6, 0x0

    .line 2508
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/drive/zzjr;->zzj(II)I

    .line 2509
    .line 2510
    .line 2511
    move-result v7

    .line 2512
    :goto_f
    add-int/2addr v5, v7

    .line 2513
    goto/16 :goto_a

    .line 2514
    .line 2515
    :pswitch_84
    const/4 v6, 0x0

    .line 2516
    and-int v7, v12, v19

    .line 2517
    .line 2518
    if-eqz v7, :cond_18

    .line 2519
    .line 2520
    invoke-static {v15, v9, v10}, Lcom/google/android/gms/internal/drive/zzjr;->zzg(IJ)I

    .line 2521
    .line 2522
    .line 2523
    move-result v7

    .line 2524
    goto :goto_f

    .line 2525
    :pswitch_85
    const/4 v6, 0x0

    .line 2526
    and-int v7, v12, v19

    .line 2527
    .line 2528
    if-eqz v7, :cond_18

    .line 2529
    .line 2530
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2531
    .line 2532
    .line 2533
    move-result v7

    .line 2534
    invoke-static {v15, v7}, Lcom/google/android/gms/internal/drive/zzjr;->zzg(II)I

    .line 2535
    .line 2536
    .line 2537
    move-result v7

    .line 2538
    goto :goto_f

    .line 2539
    :pswitch_86
    const/4 v6, 0x0

    .line 2540
    and-int v7, v12, v19

    .line 2541
    .line 2542
    if-eqz v7, :cond_18

    .line 2543
    .line 2544
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2545
    .line 2546
    .line 2547
    move-result-wide v13

    .line 2548
    invoke-static {v15, v13, v14}, Lcom/google/android/gms/internal/drive/zzjr;->zze(IJ)I

    .line 2549
    .line 2550
    .line 2551
    move-result v7

    .line 2552
    goto :goto_f

    .line 2553
    :pswitch_87
    const/4 v6, 0x0

    .line 2554
    and-int v7, v12, v19

    .line 2555
    .line 2556
    if-eqz v7, :cond_18

    .line 2557
    .line 2558
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2559
    .line 2560
    .line 2561
    move-result-wide v13

    .line 2562
    invoke-static {v15, v13, v14}, Lcom/google/android/gms/internal/drive/zzjr;->zzd(IJ)I

    .line 2563
    .line 2564
    .line 2565
    move-result v7

    .line 2566
    goto :goto_f

    .line 2567
    :pswitch_88
    const/4 v6, 0x0

    .line 2568
    and-int v7, v12, v19

    .line 2569
    .line 2570
    if-eqz v7, :cond_18

    .line 2571
    .line 2572
    const/4 v7, 0x0

    .line 2573
    invoke-static {v15, v7}, Lcom/google/android/gms/internal/drive/zzjr;->zzb(IF)I

    .line 2574
    .line 2575
    .line 2576
    move-result v11

    .line 2577
    add-int/2addr v5, v11

    .line 2578
    goto/16 :goto_b

    .line 2579
    .line 2580
    :pswitch_89
    const/4 v6, 0x0

    .line 2581
    const/4 v7, 0x0

    .line 2582
    and-int v11, v12, v19

    .line 2583
    .line 2584
    const-wide/16 v13, 0x0

    .line 2585
    .line 2586
    if-eqz v11, :cond_29

    .line 2587
    .line 2588
    invoke-static {v15, v13, v14}, Lcom/google/android/gms/internal/drive/zzjr;->zzb(ID)I

    .line 2589
    .line 2590
    .line 2591
    move-result v11

    .line 2592
    add-int/2addr v5, v11

    .line 2593
    :cond_29
    :goto_10
    add-int/lit8 v4, v4, 0x3

    .line 2594
    .line 2595
    move v11, v6

    .line 2596
    move v6, v7

    .line 2597
    move/from16 v7, v18

    .line 2598
    .line 2599
    goto/16 :goto_5

    .line 2600
    .line 2601
    :cond_2a
    move v6, v11

    .line 2602
    iget-object v2, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzur:Lcom/google/android/gms/internal/drive/zzmx;

    .line 2603
    .line 2604
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Lcom/google/android/gms/internal/drive/zzmx;Ljava/lang/Object;)I

    .line 2605
    .line 2606
    .line 2607
    move-result v2

    .line 2608
    add-int/2addr v5, v2

    .line 2609
    iget-boolean v2, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzui:Z

    .line 2610
    .line 2611
    if-eqz v2, :cond_2d

    .line 2612
    .line 2613
    iget-object v0, v0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 2614
    .line 2615
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/drive/zzjy;->zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzkb;

    .line 2616
    .line 2617
    .line 2618
    move-result-object v0

    .line 2619
    move v11, v6

    .line 2620
    :goto_11
    iget-object v1, v0, Lcom/google/android/gms/internal/drive/zzkb;->zzos:Lcom/google/android/gms/internal/drive/zzmi;

    .line 2621
    .line 2622
    invoke-virtual {v1}, Lcom/google/android/gms/internal/drive/zzmi;->zzer()I

    .line 2623
    .line 2624
    .line 2625
    move-result v1

    .line 2626
    iget-object v2, v0, Lcom/google/android/gms/internal/drive/zzkb;->zzos:Lcom/google/android/gms/internal/drive/zzmi;

    .line 2627
    .line 2628
    if-ge v11, v1, :cond_2b

    .line 2629
    .line 2630
    invoke-virtual {v2, v11}, Lcom/google/android/gms/internal/drive/zzmi;->zzaw(I)Ljava/util/Map$Entry;

    .line 2631
    .line 2632
    .line 2633
    move-result-object v1

    .line 2634
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2635
    .line 2636
    .line 2637
    move-result-object v2

    .line 2638
    check-cast v2, Lcom/google/android/gms/internal/drive/zzkd;

    .line 2639
    .line 2640
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2641
    .line 2642
    .line 2643
    move-result-object v1

    .line 2644
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/drive/zzkb;->zzb(Lcom/google/android/gms/internal/drive/zzkd;Ljava/lang/Object;)I

    .line 2645
    .line 2646
    .line 2647
    move-result v1

    .line 2648
    add-int/2addr v6, v1

    .line 2649
    add-int/lit8 v11, v11, 0x1

    .line 2650
    .line 2651
    goto :goto_11

    .line 2652
    :cond_2b
    invoke-virtual {v2}, Lcom/google/android/gms/internal/drive/zzmi;->zzes()Ljava/lang/Iterable;

    .line 2653
    .line 2654
    .line 2655
    move-result-object v0

    .line 2656
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2657
    .line 2658
    .line 2659
    move-result-object v0

    .line 2660
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2661
    .line 2662
    .line 2663
    move-result v1

    .line 2664
    if-eqz v1, :cond_2c

    .line 2665
    .line 2666
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2667
    .line 2668
    .line 2669
    move-result-object v1

    .line 2670
    check-cast v1, Ljava/util/Map$Entry;

    .line 2671
    .line 2672
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2673
    .line 2674
    .line 2675
    move-result-object v2

    .line 2676
    check-cast v2, Lcom/google/android/gms/internal/drive/zzkd;

    .line 2677
    .line 2678
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2679
    .line 2680
    .line 2681
    move-result-object v1

    .line 2682
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/drive/zzkb;->zzb(Lcom/google/android/gms/internal/drive/zzkd;Ljava/lang/Object;)I

    .line 2683
    .line 2684
    .line 2685
    move-result v1

    .line 2686
    add-int/2addr v6, v1

    .line 2687
    goto :goto_12

    .line 2688
    :cond_2c
    add-int/2addr v5, v6

    .line 2689
    :cond_2d
    return v5

    .line 2690
    nop

    .line 2691
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_89
        :pswitch_88
        :pswitch_87
        :pswitch_86
        :pswitch_85
        :pswitch_84
        :pswitch_83
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_7f
        :pswitch_7e
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_79
        :pswitch_78
        :pswitch_77
        :pswitch_76
        :pswitch_75
        :pswitch_74
        :pswitch_73
        :pswitch_72
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
    .end packed-switch
.end method

.method public final zzp(Ljava/lang/Object;)Z
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    :goto_0
    iget v4, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzun:I

    .line 6
    .line 7
    const/4 v5, 0x1

    .line 8
    if-ge v2, v4, :cond_b

    .line 9
    .line 10
    iget-object v4, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzum:[I

    .line 11
    .line 12
    aget v4, v4, v2

    .line 13
    .line 14
    iget-object v6, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 15
    .line 16
    aget v6, v6, v4

    .line 17
    .line 18
    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zzas(I)I

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    iget-boolean v8, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzuk:Z

    .line 23
    .line 24
    const v9, 0xfffff

    .line 25
    .line 26
    .line 27
    if-nez v8, :cond_0

    .line 28
    .line 29
    iget-object v8, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzud:[I

    .line 30
    .line 31
    add-int/lit8 v10, v4, 0x2

    .line 32
    .line 33
    aget v8, v8, v10

    .line 34
    .line 35
    and-int v10, v8, v9

    .line 36
    .line 37
    ushr-int/lit8 v8, v8, 0x14

    .line 38
    .line 39
    shl-int/2addr v5, v8

    .line 40
    if-eq v10, v0, :cond_1

    .line 41
    .line 42
    sget-object v0, Lcom/google/android/gms/internal/drive/zzlu;->zzuc:Lsun/misc/Unsafe;

    .line 43
    .line 44
    int-to-long v11, v10

    .line 45
    invoke-virtual {v0, p1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    move v0, v10

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    move v5, v1

    .line 52
    :cond_1
    :goto_1
    const/high16 v8, 0x10000000

    .line 53
    .line 54
    and-int/2addr v8, v7

    .line 55
    if-eqz v8, :cond_2

    .line 56
    .line 57
    invoke-direct {p0, p1, v4, v3, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;III)Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-nez v8, :cond_2

    .line 62
    .line 63
    return v1

    .line 64
    :cond_2
    const/high16 v8, 0xff00000

    .line 65
    .line 66
    and-int/2addr v8, v7

    .line 67
    ushr-int/lit8 v8, v8, 0x14

    .line 68
    .line 69
    const/16 v10, 0x9

    .line 70
    .line 71
    if-eq v8, v10, :cond_9

    .line 72
    .line 73
    const/16 v10, 0x11

    .line 74
    .line 75
    if-eq v8, v10, :cond_9

    .line 76
    .line 77
    const/16 v5, 0x1b

    .line 78
    .line 79
    if-eq v8, v5, :cond_7

    .line 80
    .line 81
    const/16 v5, 0x3c

    .line 82
    .line 83
    if-eq v8, v5, :cond_6

    .line 84
    .line 85
    const/16 v5, 0x44

    .line 86
    .line 87
    if-eq v8, v5, :cond_6

    .line 88
    .line 89
    const/16 v5, 0x31

    .line 90
    .line 91
    if-eq v8, v5, :cond_7

    .line 92
    .line 93
    const/16 v5, 0x32

    .line 94
    .line 95
    if-eq v8, v5, :cond_3

    .line 96
    .line 97
    goto/16 :goto_3

    .line 98
    .line 99
    :cond_3
    iget-object v5, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzut:Lcom/google/android/gms/internal/drive/zzll;

    .line 100
    .line 101
    and-int v6, v7, v9

    .line 102
    .line 103
    int-to-long v6, v6

    .line 104
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-interface {v5, v6}, Lcom/google/android/gms/internal/drive/zzll;->zzi(Ljava/lang/Object;)Ljava/util/Map;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-nez v6, :cond_a

    .line 117
    .line 118
    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zzaq(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    iget-object v6, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzut:Lcom/google/android/gms/internal/drive/zzll;

    .line 123
    .line 124
    invoke-interface {v6, v4}, Lcom/google/android/gms/internal/drive/zzll;->zzm(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzlj;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    iget-object v4, v4, Lcom/google/android/gms/internal/drive/zzlj;->zztw:Lcom/google/android/gms/internal/drive/zznm;

    .line 129
    .line 130
    invoke-virtual {v4}, Lcom/google/android/gms/internal/drive/zznm;->zzfj()Lcom/google/android/gms/internal/drive/zznr;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    sget-object v6, Lcom/google/android/gms/internal/drive/zznr;->zzxx:Lcom/google/android/gms/internal/drive/zznr;

    .line 135
    .line 136
    if-ne v4, v6, :cond_a

    .line 137
    .line 138
    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    const/4 v5, 0x0

    .line 147
    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-eqz v6, :cond_a

    .line 152
    .line 153
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    if-nez v5, :cond_5

    .line 158
    .line 159
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzmd;->zzej()Lcom/google/android/gms/internal/drive/zzmd;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/drive/zzmd;->zzf(Ljava/lang/Class;)Lcom/google/android/gms/internal/drive/zzmf;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    :cond_5
    invoke-interface {v5, v6}, Lcom/google/android/gms/internal/drive/zzmf;->zzp(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    if-nez v6, :cond_4

    .line 176
    .line 177
    return v1

    .line 178
    :cond_6
    invoke-direct {p0, p1, v6, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;II)Z

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    if-eqz v5, :cond_a

    .line 183
    .line 184
    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-static {p1, v7, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;ILcom/google/android/gms/internal/drive/zzmf;)Z

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    if-nez v4, :cond_a

    .line 193
    .line 194
    return v1

    .line 195
    :cond_7
    and-int v5, v7, v9

    .line 196
    .line 197
    int-to-long v5, v5

    .line 198
    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zzo(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    check-cast v5, Ljava/util/List;

    .line 203
    .line 204
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    if-nez v6, :cond_a

    .line 209
    .line 210
    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    move v6, v1

    .line 215
    :goto_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    if-ge v6, v7, :cond_a

    .line 220
    .line 221
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    invoke-interface {v4, v7}, Lcom/google/android/gms/internal/drive/zzmf;->zzp(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v7

    .line 229
    if-nez v7, :cond_8

    .line 230
    .line 231
    return v1

    .line 232
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_9
    invoke-direct {p0, p1, v4, v3, v5}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;III)Z

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    if-eqz v5, :cond_a

    .line 240
    .line 241
    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zzap(I)Lcom/google/android/gms/internal/drive/zzmf;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    invoke-static {p1, v7, v4}, Lcom/google/android/gms/internal/drive/zzlu;->zza(Ljava/lang/Object;ILcom/google/android/gms/internal/drive/zzmf;)Z

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    if-nez v4, :cond_a

    .line 250
    .line 251
    return v1

    .line 252
    :cond_a
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 253
    .line 254
    goto/16 :goto_0

    .line 255
    .line 256
    :cond_b
    iget-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzui:Z

    .line 257
    .line 258
    if-eqz v0, :cond_c

    .line 259
    .line 260
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzlu;->zzus:Lcom/google/android/gms/internal/drive/zzjy;

    .line 261
    .line 262
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/drive/zzjy;->zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzkb;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzkb;->isInitialized()Z

    .line 267
    .line 268
    .line 269
    move-result p0

    .line 270
    if-nez p0, :cond_c

    .line 271
    .line 272
    return v1

    .line 273
    :cond_c
    return v5
.end method
