/*
 * Copyright 2011-2013, by Vladimir Kostyukov and Contributors.
 * 
 * This file is part of la4j project (http://la4j.org)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Contributor(s): -
 * 
 */

package org.la4j.decomposition;

import org.la4j.matrix.Matrices;

public class EigenDecompositorTest extends AbstractDecompositorTest {

    public void testDecompose_2x2_symmetric_1() {
        double[][] input = new double[][] {
                { -5.0, 12.0 },
                { 12.0,  9.0 }
        };

        double[][][] output = new double[][][] { 
                { 
                    {  0.867, 0.498 },
                    { -0.498, 0.867 }
                },
                { 
                    { -11.892, 0.0 },
                    { 0.0, 15.892 },
                }
        };

        performTest(Matrices.EIGEN_DECOMPOSITOR, input, output);
    }

    public void testDecompose_2x2_symmetric_2() {
        double[][] input = new double[][] {
                { 25.0, 0 },
                { 0.0, 9.0 }
        };

        double[][][] output = new double[][][] { 
                { 
                    { 1.0, 0.0 },
                    { 0.0, 1.0 }
                },
                { 
                    { 25.0, 0.0 },
                    { 0.0, 9.0 },
                }
        };

        performTest(Matrices.EIGEN_DECOMPOSITOR, input, output);
    }

    public void testDecompose_3x3_symmetric_1() {
        double[][] input = new double[][] {
                {  1.5, 13.0, 9.4 },
                { 13.0,  2.8, 3.6 },
                {  9.4,  3.6, 4.4 }
        };

        double[][][] output = new double[][][] { 
                { 
                    { 0.1199,-0.7559, 0.6435 },
                    { 0.5753,  0.5812, 0.5754 },
                    {-0.8090,  0.3012, 0.5046 }
                },
                { 
                    { 0.447, 0.0, 0.0 },
                    { 0.0, -12.242, 0.0 },
                    { 0.0, 0.0, 20.495 } 
                }
        };

        performTest(Matrices.EIGEN_DECOMPOSITOR, input, output);
    }

    public void testDecompose_3x3_symmetric_2() {
        double[][] input = new double[][] {
                { 1.0, 0.0, 0.0 },
                { 0.0, 2.0, 0.0 },
                { 0.0, 0.0, 4.0 }
        };

        double[][][] output = new double[][][] { 
                { 
                    { 1.0, 0.0, 0.0 },
                    { 0.0, 1.0, 0.0 },
                    { 0.0, 0.0, 1.0 }
                },
                { 
                    { 1.0, 0.0, 0.0 },
                    { 0.0, 2.0, 0.0 },
                    { 0.0, 0.0, 4.0 }
                }
        };

        performTest(Matrices.EIGEN_DECOMPOSITOR, input, output);
    }

    public void testDecompose_4x4_symmetric() {
        double[][] input = new double[][] {
                { 1.0, 5.0, 7.0, 9.0 },
                { 5.0, 2.0, 8.0, 4.0 },
                { 7.0, 8.0, 4.0, 1.0 },
                { 9.0, 4.0, 1.0, 5.0 }
        };

        double[][][] output = new double[][][] { 
                { 
                    { -0.192, -0.444, -0.537, -0.691 },
                    { 0.318,  0.788, -0.478, -0.223 },
                    { 0.590, -0.404, -0.502,  0.486 },
                    { -0.717,  0.135,-0.481,  0.486 }
                },
                { 
                    { 4.814, 0.0, 0.0, 0.0 },
                    { 0.0, -4.237, 0.0, 0.0 },
                    { 0.0, 0.0, 20.058, 0.0 },
                    { 0.0, 0.0, 0.0, -8.635 }
                }
        };

        performTest(Matrices.EIGEN_DECOMPOSITOR, input, output);
    }

    public void testDecompose_5x5_symmetric_1() {
        double[][] input = new double[][] {
                { 1.0, 0.0, 0.0, 0.0, 0.0 },
                { 0.0, 2.0, 0.0, 0.0, 0.0 },
                { 0.0, 0.0, 3.0, 0.0, 0.0 },
                { 0.0, 0.0, 0.0, 4.0, 0.0 },
                { 0.0, 0.0, 0.0, 0.0, 5.0 }
        };

        double[][][] output = new double[][][] { 
                { 
                    { 1.0, 0.0, 0.0, 0.0, 0.0 },
                    { 0.0, 1.0, 0.0, 0.0, 0.0 },
                    { 0.0, 0.0, 1.0, 0.0, 0.0 },
                    { 0.0, 0.0, 0.0, 1.0, 0.0 },
                    { 0.0, 0.0, 0.0, 0.0, 1.0 }
                },
                { 
                    { 1.0, 0.0, 0.0, 0.0, 0.0 },
                    { 0.0, 2.0, 0.0, 0.0, 0.0 },
                    { 0.0, 0.0, 3.0, 0.0, 0.0 },
                    { 0.0, 0.0, 0.0, 4.0, 0.0 },
                    { 0.0, 0.0, 0.0, 0.0, 5.0 }
                }
        };

        performTest(Matrices.EIGEN_DECOMPOSITOR, input, output);
    }
}
