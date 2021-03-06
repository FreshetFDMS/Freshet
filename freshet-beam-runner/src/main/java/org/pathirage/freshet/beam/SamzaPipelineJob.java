/**
 * Copyright 2016 Milinda Pathirage
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.pathirage.freshet.beam;

import org.apache.beam.sdk.PipelineResult;
import org.apache.beam.sdk.runners.AggregatorRetrievalException;
import org.apache.beam.sdk.runners.AggregatorValues;
import org.apache.beam.sdk.transforms.Aggregator;
import org.joda.time.Duration;

import java.io.IOException;

/**
 * A SamzaPipelineJob represents a job submitted to Samza using {@link SamzaRunner}.
 */
public class SamzaPipelineJob implements PipelineResult {
  @Override
  public State getState() {
    return null;
  }

  @Override
  public State cancel() throws IOException {
    return null;
  }

  @Override
  public State waitUntilFinish(Duration duration) throws IOException, InterruptedException {
    return null;
  }

  @Override
  public State waitUntilFinish() throws IOException, InterruptedException {
    return null;
  }

  @Override
  public <T> AggregatorValues<T> getAggregatorValues(Aggregator<?, T> aggregator) throws AggregatorRetrievalException {
    return null;
  }
}
